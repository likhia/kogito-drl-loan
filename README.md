# kogito-drl-loan Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

Please refer to https://quarkus.io/guides/kogito-drl

mvn io.quarkus.platform:quarkus-maven-plugin:2.2.3.Final:create \
    -DprojectGroupId=org.acme \
    -DprojectArtifactId=kogito-drl-loan \
    -Dextensions="kogito-quarkus-rules" \
    -DnoExamples


curl -X POST http://localhost:8080/find-approved \
    -H 'Content-Type: application/json'\
    -H 'Accept: application/json' \
    -d '{"maxAmount":5000,
          "loanApplications":[
          {"id":"ABC10001","amount":2000,"deposit":1000,
            "applicant":{"age":45,"name":"John"}},
          {"id":"ABC10002","amount":5000,"deposit":100,
            "applicant":{"age":25,"name":"Paul"}},
          {"id":"ABC10015","amount":1000,"deposit":100,
            "applicant":{"age":12,"name":"George"}}
]}'

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/kogito-drl-loan-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)

## To deploy this on OpenShift

Execute the following

	oc new-build \
	  --name loan \
	  --binary \
	  -i java:11

	oc start-build loan --from-dir=. --follow

	oc new-app loan

	oc expose svc/loan

	curl \
	  -X POST \
	  "http://$(oc get route/loan -o jsonpath='{.spec.host}')/find-approved" \
	  -H  "accept: application/json" \
	  -H  "Content-Type: application/json" \
	  -d '{"maxAmount":5000,
          "loanApplications":[
          {"id":"ABC10001","amount":2000,"deposit":1000,
            "applicant":{"age":45,"name":"John"}},
          {"id":"ABC10002","amount":5000,"deposit":100,
            "applicant":{"age":25,"name":"Paul"}},
          {"id":"ABC10015","amount":1000,"deposit":100,
            "applicant":{"age":12,"name":"George"}}
]}'
