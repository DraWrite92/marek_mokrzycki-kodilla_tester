package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    private static List<User> filterUsernamesOlderThan40() {
        List<User> ages = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 40)
                .collect(Collectors.toList());
        return ages;
    }

    private static List<User> filterUsernamesWithPostZero() {
        List<User> postZero = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 0)
                .collect(Collectors.toList());
        return postZero;
    }

    public static String getFilteredUsernames() {
        List<String> expectedUsernames = filterChemistGroupUsernames();
        System.out.println(expectedUsernames);
        return expectedUsernames.toString();
    }

    public static List<User> getFilteredAges() {
        List<User> expectedAges = filterUsernamesOlderThan40();
        System.out.println(expectedAges);
        return expectedAges;
    }

    public static List<User> getPostZero() {
        List<User> expectedPostZeroWho = filterUsernamesWithPostZero();
        System.out.println(expectedPostZeroWho);
        return expectedPostZeroWho;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
