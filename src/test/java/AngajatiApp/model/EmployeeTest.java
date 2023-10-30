package AngajatiApp.model;

import AngajatiApp.controller.DidacticFunction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee e;

    @BeforeEach
    void setUp() {
        e = new Employee();
        e.setEmployeeId(1);
        e.setFirstName("John");
        e.setLastName("Doe");
        e.setCnp("1234567891234");
        e.setFunction(DidacticFunction.ASISTENT);

    }

    @Test
    void testSetEmployeeId() {
    }

    @Test
    void testSetFirstName() {
    }

    @Test
    void testSetLastName() {
    }

    @Test
    void testSetCnp() {
    }

    @Test
    void testSetFunction() {
    }

    @Test
    void testSetSalary() {
    }

    @Test
    void testToString() {
    }
}