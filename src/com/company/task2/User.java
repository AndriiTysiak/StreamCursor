package com.company.task2;

import java.time.LocalDate;

public class User {
    String email;
    LocalDate loginDate;
    String team;

    public User(String email, LocalDate loginDate, String team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public String getTeam() {
        return team;
    }

}
