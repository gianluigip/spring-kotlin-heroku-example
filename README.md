# Spring Kotlin Heroku Example
Sample service to config Heroku CI/CD

## Getting Started

* Download Spring starter from https://start.spring.io/.
* Add `system.properties` to define the java version:
```
java.runtime.version=11
```
* Add `Procfile` to define the start command:
```
web: java -jar build/libs/spring-kotlin-heroku-example-0.0.1-SNAPSHOT.jar
```
* Add `app.json` and add your app name and description:
```
{
  "name": "Spring Kotlin Heroku Example",
  "description": "Sample service to config Heroku CI/CD.",
  "image": "heroku/gradle"
}
```
* Add `.env` if you need to manage environment variables.
