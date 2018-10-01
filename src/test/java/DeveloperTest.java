import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Developer Man", "AA111111B", 50000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Developer Man", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("AA111111B", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(500.00);
        assertEquals(50500.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500.00, developer.payBonus(), 0.01);
    }

}