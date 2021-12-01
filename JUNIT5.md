#**Junit5 Topics Covered**
 ##Testing java with junit5
- JUnit Assertions  
   - IndexControllerTest 
     - assertEquals​(Object expected, Object actual)
     - assertEquals​(Object expected, Object actual, String message)
     - assertEquals​(Object expected, Object actual, Supplier<String> messageSupplier)
     - assertTrue​(boolean condition)
     - assertTrue​(boolean condition, String message)
     - assertTrue​(boolean condition, Supplier<String> messageSupplier)
  
- JUnit Grouped Assertions
    - assertAll​(String heading, Collection<Executable> executables)
    - assertAll​(String heading, Stream<Executable> executables)
  
- JUnit Dependent Assertions
     - Owner extends Person 
  
- Skipping JUnit Tests
  - @Disabled("some name")
  
- JUnit Test Display Names
   - @DisplayName("some name")
   
- Testing Expected Exceptions
    - oopsHandler() throws exception
    - create exception class
    - assertThrows​(Class<T> expectedType, Executable executable)
  
- Testing Timeouts
    - assertTimeout​(Duration timeout, ThrowingSupplier<T> supplier)
    - assertTimeoutPreemptively​(Duration timeout, ThrowingSupplier<T> supplier)
   
- JUnit Assumptions
  - assumeTrue​(boolean assumption)
  - assumeTrue​(boolean assumption, String message)
    
- Conditional JUnit Test Execution
    - @EnabledOnOs(OS.WINDOWS)
    - @EnabledOnJre(JRE.JAVA_8)
    - @EnabledIfEnvironmentVariable(named = "username", matches = "Rupesh")
   
- Using AssertJ with JUnit
   - add assertj dependency
   - assertThat() -> org.assertj.core.api.Assertions.assertThat;
  
- Using Hamcrest with JUnit
   - add hamcrest dependency
   - assertThat() -> org.hamcrest.MatcherAssert.assertThat;
  
- Assignment - Write JUnit Test for Vet Controller List Vets 
   -  VetControllerTest 

##Advanced Junit Testing
- Tagging and Filtering JUnit Tests
- JUnit Nested Tests
- JUnit Test Interfaces
- Using JUnit Default Test Methods
- Repeating Tests with JUnit 5
- JUnit Test Dependency Injection
- Assignment - JUnit Dependency Injection
- JUnit Parameterized Tests - Value Source
- JUnit Parameterized Test - Display Name
- JUnit Parameterized Tests - ENUM Source
- JUnit Parameterized Tests - CSV Source
- JUnit Parameterized Tests - CSV File Source
- JUnit Parameterized Tests - Method Provider
- JUnit Parameterized Tests - Custom Provider
- Unit Tests vs Integration Tests
- JUnit Extensions