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



# Create project

* New project
* Maven Arquetype Quickstart
* Pom:

```pom
   <properties>
        <springframework.version>4.3.6.RELEASE</springframework.version>
    </properties>
 
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${springframework.version}</version>
        </dependency>
    </dependencies>
    <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.2</version>
                    <configuration>
                        <source>1.8</source>
                        <target>1.8</target>
                    </configuration>
                </plugin>
            </plugins>
        </pluginManagement>
    </build> 
```

## 3 Steps to DI(Dependency Ijection)

* Create the POJO
* Create the configuration file
    Tell the spring container about the POJO class
    ```config.xml
    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
        xmlns:p="http://www.springframework.org/schema/p"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">
        
    </beans>
    ```
* Create a test class



##  Using the different ways to create the values in the beans

```config.xml
    <bean name="emp" class="com.javaTutoring.spring.Employee">
        <property name="id">
            <value>20</value>
        </property>
        <property name="name">
            <value>Andres</value>
        </property>
    </bean>
```

```config.xml

    <bean name="emp" class="com.javaTutoring.spring.Employee">
        <property name="id" value="20"/>
        <property name="name" value="Andres"/>
    </bean>
```

```config.xml
    <bean name="emp" class="com.javaTutoring.spring.Employee" p:id="20" p:name="Andres"/>
```

## Injecting Collenction Types
* List
    ```xml
    <list>
        <value>10<value>
        <null/>
    ```
* Set
    ```xml
    <set>
        <value>10</value>
        <value>20</value>
    ```
* Map
    ```xml
    <map>
        <entry key="100" value="IPhone"/>
    ```
* Properties
    ```xml
    <props>
        <prop key="USA"> English</prop> 


## Injecting reference Types

```xml

<bean name="scores" class="com.javaTutoring.spring.reftypes.Scores"
		  p:maths="80" p:physics="90" p:chemistry="78"/>

	<bean name="student" class="com.javaTutoring.spring.reftypes.Student">
		<property name="scores">
			<ref bean="scores"/>
		</property>

	</bean>
```
The properties can be set as following

```xml
<property name="scores" ref="scpres"/>
```

## Injecting the reference types using the p:schema

```xml
<bean name="student" class="com.javaTutoring.spring.reftypes.Student" p:scores-ref="scores"/>
```

# Life Cycle methods

```java
public void init()
```

```java
public void destroy()
```

1. Given a srping bean
2. Intance of the object
3. Invoque the init() method
4. Read bean, use it 
5. Dispose the object with the destroy method with destroy() method

## Ways to invokw the LifeCycle methods:
1. XML configuration
2. Spring INterfaces
3. Annoatations