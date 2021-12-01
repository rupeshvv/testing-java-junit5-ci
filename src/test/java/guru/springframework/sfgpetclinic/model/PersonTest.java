package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
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
}