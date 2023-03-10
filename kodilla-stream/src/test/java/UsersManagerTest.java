import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {
    @Test
    public void shouldReturnCorrectUsernamesForChemists() {
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        String expected = expectedList.toString();
        String actual = UsersManager.getFilteredUsernames();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAgeLargerThan40() {
        List<User> expectedListAge = new ArrayList<>();
        expectedListAge.add(new User("Walter White", 50, 7, "Chemists"));
        expectedListAge.add(new User("Gus Firing", 49, 0, "Board"));
        expectedListAge.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedListAge.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        List<User> expected = expectedListAge;
        List<User> actual = UsersManager.getFilteredAges();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPostEqualToZero() {
        List<User> expectedPostZero = new ArrayList<>();
        expectedPostZero.add(new User("Gus Firing", 49, 0, "Board"));
        expectedPostZero.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        List<User> expected = expectedPostZero;
        List<User> actual = UsersManager.getPostZero();
        assertEquals(expected, actual);
    }
}
