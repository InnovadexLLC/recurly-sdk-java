recurly-sdk-java
================

Open source java library for [Recurly https://recurly.com/] API (version 2). 

## status ##

Still under development. `read as NOT READY!`

using
=====

## maven dependency

```
<dependency>
    <groupId>com.sciul</groupId>
    <artifactId>recurly-sdk-java</artifactId>
    <version>1.0.39-SNAPSHOT</version>
</dependency>
```

## gradle dependency

```
compile 'com.sciul:recurly-sdk-java:1.0.39-SNAPSHOT'
```

code snippet
============

    public RecurlyProxyFactory recurly() {
      RecurlyConfiguration rc = new RecurlyConfiguration(apiKey, recurlyServerURL);
      RecurlyProxyFactory recurlyClient = new RecurlyProxyFactory(rc);
      return recurlyClient;
    }
    // apiKey:           API Credentials (Recurly private API key)
    // recurlyServerURL: Recurly custom API url. (Site Settings under company name).

Optionally, you can also implement a *Notifier* interface for publishing errors. 

Updated example with NotifierImpl class:

```
public RecurlyProxyFactory recurly() {
    Notifier notifier = new NotifierImpl();
    RecurlyConfiguration rc = new RecurlyConfiguration(apiKey, recurlyServerURL, notifier);
    RecurlyProxyFactory recurlyClient = new RecurlyProxyFactory(rc);
    return recurlyClient;
}
```

development
===========

## maven

```
mvn clean install
```

## gradle:

```
gradle clean build
```


