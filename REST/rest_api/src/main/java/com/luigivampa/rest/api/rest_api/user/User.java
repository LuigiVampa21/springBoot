package com.luigivampa.rest.api.rest_api.user;

import java.time.LocalDate;

public class User {
    private Integer id;
    private String name;
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
