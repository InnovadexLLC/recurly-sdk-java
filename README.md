Recurly-sdk-java
============

__Open source java library for Recurly.__

__Note:: In progress__


__Maven Dependency:__

```
<dependency>
    <groupId>com.sciul</groupId>
    <artifactId>recurly-sdk-java</artifactId>
    <version>1.0.39-SNAPSHOT</version>
</dependency>
```

__Gradle Dependency:__
```
compile 'com.sciul:recurly-sdk-java:1.0.39-SNAPSHOT'
```


__Example:__
```
public RecurlyProxyFactory recurly() {
    RecurlyConfiguration rc = new RecurlyConfiguration(apiKey, recurlyServerURL);
    RecurlyProxyFactory recurlyClient = new RecurlyProxyFactory(rc);
    return recurlyClient;
}
```

apiKey:           API Credentials (Recurly private API key)

recurlyServerURL: Recurly custom API url. (Site Settings under company name).

__Optional:__

You can also implement Notifier interface publish method. Code will call publish method if any error occurred.

Example with NotifierImpl class:

```
public RecurlyProxyFactory recurly() {
    NotifierImpl notifier = new NotifierImpl();
    RecurlyConfiguration rc = new RecurlyConfiguration(apiKey, recurlyServerURL, notifier);
    RecurlyProxyFactory recurlyClient = new RecurlyProxyFactory(rc);
    return recurlyClient;
}
```
__Build__

Maven:
```
mvn clean install
```

Gradle:
```
gradle clean build
```


