package com.manhlee.model;

public class Student {
    private int id;
    private String name, email, rank;
    
    public Student() {
    }

    public Student(int id, String name, String email, String rank) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
