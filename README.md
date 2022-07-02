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

## Ways to invoke the LifeCycle methods:
1. XML configuration

```xml
<bean class="com.javaTutoring.spring.lifecycle.xmlconfig.Patient" name="patient" p:id="123" init-method="hi" destroy-method="bye"/>
```

To enable the usage of the destroy method, use the AbstractApplicationContext interface:

```java
AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclewithxmlconfig.xml");
context.registerShutdownHook();

```

2. Spring Interfaces

The class need to implement 2 spring interfaces
```java
public class Patient implements InitializingBean, DisposableBean 
```
Te config file does not need the init and destroy methods attributes

3. Annoatations

Using the @PostConstruct and @PreDestroy annotations, in order to enable the @Predestroy annotation we have to configure the CommonAnnotationbeanPostProcessor bean:

```xml
<bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>
```

We can also enable the support all the annatations using:
```xml

<context:annotation-config/>
```


## Dependency checks methods

We can use the @Required annotation, to do this is neccesary to enable the following bean:

```xml
<bean class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor"/>
```

## Inner Beans

```xml
<bean class="com.javaTutoring.spring.innerbeans.Employee" name="employee" p:id="123">
		<property name="address">
			<bean class="com.javaTutoring.spring.innerbeans.Address" p:hno="700" p:street="Washington St" p:city="Boston"/>

		</property>

	</bean>
```


## Bean Scopes

1. Singleton: Default value
    * It will create just one object
2. Prototype
    * Container will create different instances of the object every time for each usage of the instance
3. Request
    * Only relevant for SpringMVC applications, it will create an object-par request
4. Session
    * Only relevant for SpringMVC applications, create only one object for session
5. Globalsession
    * Container only will create a global par object. SpringMVC Portlets


To change the scope of a bean you can add the property socpes in the bean tag:

```xml
<bean class="com.javaTutoring.spring.innerbeans.Employee" name="employee" p:id="123" scope="prototype">
```


## Constructor injection

```xml
<constructor-arg>
    <value> b</value>
</constructor-arg>

<constructor-arg>
    <ref bean="a"/>
</constructor-arg>


<constructor-arg>
			<value>123</value>
		</constructor-arg>
		<constructor-arg>
			<ref bean="address"/>
		</constructor-arg>


<constructor-arg value="123"/>
		<constructor-arg ref="address"/>

```

For constructor injection it can be used a tag, an attribute and the C Schema

Write the c schema:
```xml
xmlns:c="http://www.springframework.org/schema/c"
```

```xml
<bean class="com.javaTutoring.spring.constructorinjection.Employee"
		  name="employee" c:id="123" c:address-ref="address"/>
```

## Ambiguity problem can be fixed using
* type
* index
* name

## Bean Externalization 
* database.properties
    1. Create the properties file
    2. link the properties
    3. User properties in xml and inject


## Wiring and Autowiring

Autowiring 2 kinds:

1. XML
    * No()
    * Type (Setter)
    * Name (Setter)
    * AutoDetect
    * Constructor

2. Annotations
    * Autowired <br>
        Can be used at the setter level or can be used at the property level or the constructor level.

    * Qualifier <br>
        Looks for the bean with an specific name. @QUalifier("address123")
<br>

### Assigment

Setter Injection:

*   Create a ShoppigCart  and inject item into the shopping  cart 
    Item will have int id, string name, double price, int quantity.

    Using setter injection.

Constructor injection:
*   Do the task above with constructor injection.


Properties File

*   Create a property file holding:
    1.  Url
    2.  userName
    3.  password

    Create a test class where  you can identify the properties are well injected.

Autowiring

*   Hotel Management:
    1.  Customer -> Reservation
    String name        Int id, String time




## Standalone Collections

*   Util Schema

    1. Add the namespaces on the bean element:
        ```xml
        <util:CN CN-Class="" id="">
        <util>
            CN: Collection Name
        ```     


## Stereotype Annotations

1.  @Component, the application can use specific bean names in the @Component annotation:

```xml
@Component()
```

2. @Scope, set the scope of the bean

3. @Value:
    *   Primitive types:
        *   @Value("20")
        *   @Value("Core Java")
    
    *   Collection Types:
        *   util CN id="myList"
        *   @Value("#{myList}")
    
    *   Object Types:
        *   @Autowired

## Spring Expression Language
