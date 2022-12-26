package com.ygorod.webapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AboutTest {
    
    @BeforeAll
    public void runBeforeClass(){
        System.out.println("Run before the entire test suite...");
    }

    @BeforeEach
    public void runBeforeEachTest(){
        System.out.println("Run before each test...");
    }

    @Disabled
    public void thisTestIsSkipped(){
        System.out.println("Skipped");
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void assertDemo(){
        int expected = 10;
        int actual = -10;
        assertEquals(expected, actual, "assertDemo fails");
    }
}
