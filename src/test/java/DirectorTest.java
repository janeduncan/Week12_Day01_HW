import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Director Man", "AA111111D", 1000000.00, "TopDawg", 100000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Director Man", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("AA111111D", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1000000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBudget() {
        assertEquals(100000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(100000.00);
        assertEquals(1100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(20000.00, director.payBonus(), 0.01);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        director.raiseSalary(-1000.00);
        assertEquals(1000000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        director.setName("Bob the builder");
        assertEquals("Bob the builder", director.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        director.setName(null);
        assertEquals("Director Man", director.getName());
    }

}