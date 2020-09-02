import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testPass() {
        try {
            final User user = new User.UserBuilder().age(26).firstName("Rohith").lastName("Sankepally").build();
            Assert.assertEquals(26, user.getAge(), 0);
            Assert.assertEquals("Rohith", user.getFirstName());
            Assert.assertEquals("Sankepally", user.getLastName());
        } catch (Exception eX) {
            Assert.fail(eX.getMessage());
        }
    }

    @Test
    public void testFailure() {
        try {
            final User user = new User.UserBuilder().age(-1).firstName("Rohith").lastName("Sankepally").build();
            Assert.fail();
        } catch (Exception eX) {
            Assert.assertEquals("Invalid Age", eX.getMessage());
        }
    }

}
