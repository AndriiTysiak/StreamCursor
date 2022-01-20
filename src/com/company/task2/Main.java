package com.company.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        LocalDate CONSTANT_DATE = LocalDate.now().minusDays(7);
        List<User> usersList = new ArrayList<>();
        usersList.add(new User("dfdfdf@gmail.com", LocalDate.of(2022, 1, 4), "IphoneTeam"));
        usersList.add(new User("asasas@gmail.com", LocalDate.of(2022, 1, 15), "LGTeam"));
        usersList.add(new User("sdfssde@.com", LocalDate.of(2022, 1, 12), "XiaomiTeam"));
        usersList.add(new User("asasas@gmail.com", LocalDate.of(2022, 1, 14), "LGTeam"));
        usersList.add(new User("gfglgfd@gmail.com", LocalDate.of(2022, 1, 17), "BravisTeam"));
        usersList.add(new User("fgidsds@gmail.com", LocalDate.of(2022, 1, 19), "XiaomiTeam"));
        usersList.add(new User("asasas@gmail.com", LocalDate.of(2022, 1, 16), "LGTeam"));
        System.out.println(usersList);
        Supplier<Stream<User>> streamOfUsers = usersList::stream;
        var userSort = streamOfUsers.get()
                .filter(it -> it.getLoginDate().isAfter(CONSTANT_DATE))
                .collect(Collectors.toList());
        System.out.println("users who logged in after week ago: " + userSort);
        var userGroup = streamOfUsers.get()
                .collect(Collectors.groupingBy(User::getTeam));
        System.out.println("Group bu team: " + userGroup);

    }
}
