package com.example.UnitTestApplication.UnitTestsApplication;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Use PER_CLASS to allow @BeforeAll and @AfterAll to be non-static // Also allow instance variable across tests
@SpringBootTest
public class SetupExampleTest {
    
    int count ;
    
    @BeforeAll
     void setupAll() {
        System.out.println("Setup method called before all tests");
    }
    
    @AfterAll
     void tearDownAll() {
        System.out.println("Tear down method called after all tests");
    }
    
    
    @BeforeEach
    void setup(){
        count =0;
        System.out.println("Setup method called before each test");
    }
    
    @AfterEach
    void tearDown(){
        System.out.println("Tear down method called after each test");
    }
    
    @Test
    @DisplayName("Test Increment Functionality") // we can use @DisplayName to give a custom name to the test
    void testIncrement() {
        count++;
        System.out.println("Count after increment: " + count);
        assertEquals(1, count, "Count should be 1 after increment");
    }
    
    
    @Disabled("Fix this test later") // This test will be skipped for now
    @Test
    void testDecrement() {
        count--;
        System.out.println("Count after decrement: " + count);
        assertEquals(-1, count, "Count should be -1 after decrement");
    }
    
    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
                    int result = 10 / 0;
                }
        );
    }
    
    @Test
    void testString(){
        String name = "Krishna";
        
        assertAll(
                () -> assertEquals(7,name.length(), "length of name should be 5"),
                () -> assertEquals("Krishna", name, "name should be Krishna"),
                () -> assertTrue(name.startsWith("K"),"name should start with K"),
                () -> assertFalse(name.isEmpty(),"name should not be empty")
        );
        // assertAll is used to group multiple assertions together
        // will execute successfully only if all assertions pass
    }
    
    @ParameterizedTest
    @CsvSource({"1,2,3","10,15,25"})
    void parameterizedAddition(int a, int b, int expectedSum) {
        assertEquals(expectedSum, a+b, "The sum should be equal to the expected value");
    }
    
}
