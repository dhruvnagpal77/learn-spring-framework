#### Tight coupling vs loose coupling 
* Coupling refers to the degree of direct knowledge that one element has of another. In other words, how often do changes in class A force related changes in class B.
* **Tight coupling:** Means the two classes often change together. In other words, if A knows more than it should about the way in which B was implemented, then A and B are tightly coupled. It reduces the flexibility and re-usability of the code.
* **Loose coupling:** Means the two classes are mostly independent. If the only knowledge that class A has about class B, is what class B has exposed through its interface, then class A and class B are said to be loosely coupled. It increases the flexibility and re-usability of the code.

#### Dependency
* If an instance of a class requires an instance of another class i.e a class has another class object as it's data member.

#### Dependency injection
* Process of identifying beans(objects managed by spring), their dependency & wire them together.
* Types:
* 1: Constructor based: Dependencies are set by creating a bean using constructor. This is what spring recommends as dependencies are automatically set when an object is created.
* 2: Setter based: Dependencies are set by calling setter methods on ur beans.
* 3: Field based: No setter or constructor. Dependency is injected using reflection.

#### Reflection
* Link: https://www.geeksforgeeks.org/reflection-in-java/

#### Spring IoC(Inversion of control) container
* Technical component inside spring framework which implements the dependency injection logic.
* Manages the lifecycle of beans & dependencies.
* IOC means instead of programmer, it's spring responsibility to create instance of classes(which are annotated with @Component) & wiring an object to another object.
* **Types:** 
* 1: ApplicationContext(complex)
* 2: BeanFactory(simpler feature - rarely used)

#### Beans
* The objects that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application.

#### Spring Annotations
* **@Component:** Class managed by spring framework. Without having to write any explicit code, Spring will: Scan our application for classes annotated with @Component. Instantiate them and inject any specified dependencies into them.
* **@Autowired:** It allows Spring to resolve and inject collaborating beans into our bean. It internally uses setter or constructor injection.
* **@ComponentScan:** Specifies the packages that spring should scan for classes annotated with @Component. @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.
* **@Controller:** Spring Controller annotation can be applied on classes only. It’s used to mark a class as a web request handler. It’s mostly used with Spring MVC application.
* **@RestController:** Spring @RestController is a convenience annotation that is itself annotated with @Controller and @ResponseBody. This annotation is used to mark a class as request handler for RESTful web.
* **@RequestMapping:** RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. @RequestMapping can be applied to the controller class as well as methods.
* **@GetMapping:** It's a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET)

#### API, REST, REST API
* Link: https://aws.amazon.com/what-is/api/

#### Servlet & Http servlet
* A servlet is a Java programming language class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model. Although servlets can respond to any type of request, they are commonly used to extend the applications hosted by web servers.
* An HTTP servlet is a special type of servlet that handles an HTTP request and provides an HTTP response, usually in the form of an HTML page.
* Link: https://docs.oracle.com/cd/E13222_01/wls/docs81/servlet/overview.html#157016

#### MVC(Model-View-Controller) Framework/Architecture
* Link: https://www.freecodecamp.org/news/the-model-view-controller-pattern-mvc-architecture-and-frameworks-explained/

#### Maven
* Manages dependencies & transitives dependencies i.e. Downloads JARs needed by the application(Application dependencies) & JARs needed by the downloaded JARs to work.
* For eg: If u add dependency on Spring framework, Maven would download Spring framework JARs & it's dependencies.
* All this configuration is done in pom.xml
* In pom.xml each dependency is identified by groupId & artifactId. groupId is like package name, artifactId is like class name.
* Maven provides simple project setup that follows best practices.
* Makes the build process easy.
* Consistent usage across all projects - means no ramp up time for new developers coming onto a project.
* Link: https://maven.apache.org/maven-features.html

#### Spring framework is divided into modules
* Each application can choose what modules they want to make use of, they do not need to use everything.
* **Types**
* **Core:** IoC container(dependency injection), etc.
* **Testing:** Mock Objects, Spring MVC Test, etc.
* **Data access:** Transactions, JDBC, JPA, etc.
* **Web servlet:** Spring MVC, etc.
* **Web reactive:** Spring WebFlux, etc.
* **Integration:** JMS, etc.

#### Spring projects
* The architecture of application we build are changing, that's where Spring projects come into picture. Spring needs to keep evolving with the trends which are happening in the technology world. And there are number of projects which help u keep up with the evolution.
* **Various Spring projects:**
* **Spring Boot:** Most popular framework to build microservice. Modern trend is to build smaller application called microservices instead of large application containing thousands of classes called monoliths.
* **Spring Cloud:** Build cloud native application.
* **Spring Data:** Helps u talk to different types of databases: NoSQL & Relational.
* **Spring Integration:** Address challenges with integration with other application.
* **Spring Security:** Secure ur web application or REST API or microservice. Helps in building authentication & authorization into ur application.