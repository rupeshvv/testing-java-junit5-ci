package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {
     IndexController indexController;
    @BeforeEach
    void setUp() {
        indexController =new IndexController();
    }

    @Test
    void index() {
        assertEquals("index",indexController.index());
        assertEquals("index",indexController.index(),"wrong view returned");
        assertEquals("index",indexController.index(),()->"Another expensive message "+
                "make me only if you have to");

    }

    @Test
    void oopsHandler() {
        assertTrue("notimplemented".equals(indexController.oopsHandler()),()->"This is some expensive "+
                                "message to build "+"for my test");
    }
}