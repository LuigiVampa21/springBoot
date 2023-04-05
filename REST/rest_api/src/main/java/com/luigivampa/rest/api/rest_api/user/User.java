package com.luigivampa.rest.api.rest_api.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
    private Integer id;

    @Size(min = 2, message = "Name should have at least 2 chars")
    private String name;

    @Past(message = "birth date can not be in the past")
    private LocalDate date;

    public User(Integer id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", date='" + getDate() + "'" +
                "}";
    }

}
