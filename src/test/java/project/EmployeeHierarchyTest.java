package project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class EmployeeHierarchyTest {

    EmployeeHierarchy employeeHierarchy;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        employeeHierarchy = new EmployeeHierarchy();
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testHasEmployees() {
        assertEquals(6, employeeHierarchy.getEmployeeNodes().size() );
    }

    @Test
    public void testOutputChildren() {
        // This is actually unit testing console out, I don't recommend solution!
        employeeHierarchy.outputChildren(150, 0);
        assertEquals("Jamie\r\n" +
                "    Alan\r\n" +
                "        Martin\r\n" +
                "        Alex\r\n" +
                "    Steve\r\n" +
                "        David\r\n", outContent.toString());
    }
}