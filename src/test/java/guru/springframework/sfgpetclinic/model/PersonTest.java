package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
}