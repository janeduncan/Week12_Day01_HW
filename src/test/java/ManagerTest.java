import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Big boss", "AA111111A", 500000.00, "TopDawg");
    }

    @Test
    public void canGetName() {
        assertEquals("Big boss", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("AA111111A", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(500000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(505000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(5000.00, manager.payBonus(), 0.01);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        manager.raiseSalary(-1000.00);
        assertEquals(500000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        manager.setName("Bob the builder");
        assertEquals("Bob the builder", manager.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        manager.setName(null);
        assertEquals("Big boss", manager.getName());
    }

}
