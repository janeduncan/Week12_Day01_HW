import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Database Man", "AA111111C", 25000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Database Man", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("AA111111C", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(26000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250.00, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        databaseAdmin.raiseSalary(-1000.00);
        assertEquals(25000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Bob the builder");
        assertEquals("Bob the builder", databaseAdmin.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        databaseAdmin.setName(null);
        assertEquals("Database Man", databaseAdmin.getName());
    }

}