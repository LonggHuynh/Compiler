# Description
The project of University of Twente's Programming Paradigms module consists of the development of a complete compiler for
a G71 language. The target machine for compilation is a realistic, though non-existent processor called SPROCKELL, for which a hardware-level simulator is provided in HASKELL. The corresponding machine language is called SPRIL


# Team members:
- Long Huynh Quang 
- Jochem Groen

# PP Final Project: G71 programming language project

This folder contains a project for G71 programming language, which includes:

- JUnit integration
- ANTLR integration
- Grammar of the G71 language
- Code generation of the G71 language
- JUNIT Test of the G71 language


The rest of this document gives a brief explanation of how to run the project. For more information we refer you to the documentation of the respective tools.

## Prerequisites

Make sure you have installed:

- Maven version 3.8 or higher.
- A Java version 11 or higher.
- Haskell version 8.0.1, and cabal

To test if you have these tools set up properly, run the following two commands in the command line:

- For maven: `mvn --version`
- For java: `javac --version`

If these commands print sensible outputs (e.g. "version so and so"), this project should work fine. Otherwise, you will have to install these tools either manually or using your operating system's package manager.


## Compiling


In a terminal, run:

```
mvn compile
```

This first generates parsers for any grammars in `src/main/Anltlr`. Then it compiles code in the `src/main/java` directory.

>Note: The generated files might not be marked as "Generated Sources Root" (take a look at IntelliJ FAQ)
## Set up run file
To set up the file you want to run, you have to navigate to the `main` method of the class `Compiler`, located in the `main.java.Parse.`. You can choose to run any file provided in `src/main/java/finalproject/sample` by setting the "filename" (without.G71).


## Running


Before running, please have the Spockell files in the directory `main/resources/Spockell`. Also, make sure the `target/generated-sources/antlr4` is marked as Generated Sources Root (In our case we use IntelliJ FAQ workaround 2)
```
mvn exec:java -Dexec.mainClass="Compiler"
```
Note: `exec` does not invoke `compile`, so if changes were made to the code, `compile` needs to be invoked before `exec`. These commands can also be combined:

```
mvn compile exec:java -Dexec.mainClass="Compiler"git
```

`mvn exec:java -Dexec.mainClass="Compiler"` is part of the maven-exec plugin. For more information about e.g. passing arguments to the main class, we refer you to the plugin documentation.

## Running result

After running the file, the file will be first converted to SPRIL instructions which are located in `src/main/java/finalproject/samplespril`, then those instructions will be executed by Sprockell with the final result is located in `src/main/java/finalproject/sampleoutput`
The final result also will be printed on the console/terminal. 

## Language syntax
See `Group71Report.pdf`.