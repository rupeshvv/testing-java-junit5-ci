package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {
    //given
    Person person=new Person(1L,"John","Cena");
    @Test
    void groupedAssertions() {
        //then
        assertAll("Test Pros Set",
                ()->assertEquals("John",person.getFirstName()),
                ()->assertEquals("Cena",person.getLastName())

        );

    }

    @Test
    void groupedAssertionMsgs() {
        //given
        Person person = new Person(1l, "John", "Cena");

        //then
        assertAll("Test Props Set",
                () -> assertEquals( "John",person.getFirstName(), "First Name Failed"),
                () -> assertEquals( "Cena",person.getLastName(), "Last Name Failed"));
    }

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        //todo - impl
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());

    }
}