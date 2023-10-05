import HW3.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class HW3Test {

    @Test
    public void testOddNumber() {
        assertTrue(Main.evenOddNumber(2));
    }

    @Test
    public void testEvenNumber() {
        assertFalse(Main.evenOddNumber(1));
    }

    @Test
    public void testLowNumberInInterval() {
        assertFalse(Main.numberInInterval(20));
    }

    @Test
    public void testNormalNumberInInterval() {
        assertTrue(Main.numberInInterval(56));
    }

    @Test
    public void testBigNumberInInterval() {
        assertFalse(Main.numberInInterval(201));
    }

    @Test
    public void testUsersLogout() {
        User user = new User("Ivan", "pass", false);
        User user1 = new User("Ivan1", "pass1", true);
        User user2 = new User("Ivan2", "pass2", false);

        UserRepository repository = new UserRepository();

        repository.addUser(user);
        repository.addUser(user1);
        repository.addUser(user2);

        repository.logoutUsers();

        assertThat(repository.getData().size()).isEqualTo(1);
        assertThat(repository.getData().get(0)).isEqualTo(user1);
    }

}