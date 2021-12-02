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
   - @Tag("controllers")
   - @Tag("model")
   - Edit Configurations and set new junit tests tags in it.
  
- JUnit Nested Tests
    - Check out OwnerMapServiceTest 
  
- JUnit Test Interfaces
   - add interfaces ControllerTests and ModelTests 
   - add Tag to both interfaces
   
- Using JUnit Default Test Methods 
    - @BeforeAll
    - Implemented in ControllerTests
  
- Repeating Tests with JUnit 5
    - @RepeatedTest()
   
- JUnit Test Dependency Injection
   - TestInfo
   - RepetitionInfo
  
- Assignment - JUnit Dependency Injection
     - ModelRepeatedTests
     - PersonRepeatedTests
     
- JUnit Parameterized Tests - Value Source
     - @ParameterizedTest
     - @ValueSource()
  
- JUnit Parameterized Test - Display Name
      -  @DisplayName()

- JUnit Parameterized Tests - ENUM Source
      - create enum class in model
      - @ParameterizedTest
      - @EnumSource

- JUnit Parameterized Tests - CSV Source
       - @ParameterizedTest
       - @CsvSource

- JUnit Parameterized Tests - CSV File Source
     - create resources folder under test
     - @ParameterizedTest
     - @CsvFileSource
  
- JUnit Parameterized Tests - Method Provider
      - @ParameterizedTest
      - @MethodSource

- JUnit Parameterized Tests - Custom Provider
      - create class CustomArgsProvider
      - @ParameterizedTest
      - @ArgumentsSource

- Unit Tests vs Integration Tests 
     - Creat IT test PetTypeSDJpaServiceIT
  
- JUnit Extensions
    - create junitextensions package
    - create class TimingExtension
    - @ExtendWith() in IT
  
## Test Execution
     - Maven Surefire Plugin
     - Maven Failsafe Plugin
     - Maven SurefireTest Reporting
     - Tags in maven