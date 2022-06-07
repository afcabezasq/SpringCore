# Spring
## What is a framework?

Set of tools that helps to increase the speed of the development

## Inversion of control:

Don't call us, we'll call you. Way to change the workflow of the code.

## Features

* Open source
* Comprehensive Tool
* Light Weight
* Solves Problems
* A framework of frameworks
* Avails array of resources

## Why use it?
* Simplicity
* Testability
* Loose coupling

## Modules
* Data/Access
* Web
* Aspect Oriented Programming
* Core 
* Testing

## What is Spring 

* Dependency injection framework
    Delegate all the calling of the different dependencies to the framework. This with the purpose to focus on the bussiness logic. Based on the patter of IoC(Inversion of Control)

* Provide easy methods to use all the different frameworks in a simple emvironment. 


## Spring Container 

* Bean
    Object
* XML Configuration
    Configuration

* Application Context
    * ClasspathXMLApplicationContext
        Seach for XML configurations in the java classpath
    * AnnotationConfigApplicationContext
        Used when the beans are configured using annotations
    * FileSystemXMLApplicationContext
        Search for the XML configuration file in the file system instead of the javaClasspath

## Dependency Injecttion (Two Types)

Inject what the app requires dynamically

* Setter injection: Provided the setter and getter methods, the spring container will use the setter methods to inject the properties.

```xml
<property>
```

* Contructor injection: The spring container will use the parametherized constructor to inject the dependencies

```xml
<contructor-arg>
```