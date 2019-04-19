# Food-Incorporated
Before rolling on to a project at the Extension Center, there are some key concepts for your project you should be familiar with (not an expert at) Food Inc. is aimed at providing you with some familiarity with these concepts. When you roll on to the project in the near future, you'll be able to look back at how you used the frameworks/tools from Food Inc. as pillars of working knowledge.

## High-Level Goal
This application mirrors one such project at the XC. You will be creating two microservices that communicate with a common database. The database will hold information about food (e.g. calories, fat, protein, carbs) along with an identifier for that food ("Pizza"). Over the course of several phases, you will step-by-step create this architecture such that one microservice will be responsible for retrieving data from the database, and the other microservice will send data TO the database to be stored.

## Getting Started
These instructions will help you get a copy of the project up and running on your local machine and install the necessary software.
* Install the jdk for Java 11 on your local machine (or whatever machine you'll be running the application from (maybe an azure VM?)
* Clone this repository in that machine
* To build the app, we use java's most popular and fasted build tool: Gradle. Use `./gradlew build`
** To learn about the differences between `./gradlew` and `gradle` see [this stackoverflow explanation](https://stackoverflow.com/a/39627421)
* To run the app, use `./gradlew bootRun`


## Phase 1
The goal of this phase is to make a REST request for a food object and have it returned with dummy data 
1. Create a get request for the "Hello World!". When the user goes to localhost:8080, "Hello World!" should be outputted
2. Create a get request for a food object. When the user goes to localhost:8080/nutrition?food=apple, nutrition information for the apple should be returned as JSON
   * Sample output: {"name":"apple","calories":95,"fat":0,"protein":0,"carbs":25}
3. Create unit tests using step verifier
   * Helpful anntoations: `@RunWith(SpringRunner.class)`, `@SpringBootTest`, `@Autowired`, `@MockBean`
  

## Phase 2

## Phase 3

## Phase 4
