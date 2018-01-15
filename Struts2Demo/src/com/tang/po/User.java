package com.tang.po;

import java.util.List;

public class User {

    private String username;

    private String password;

    private String age;

    private List<User> bookList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getBookList() {
        return bookList;
    }

    public void setBookList(List<User> bookList) {
        this.bookList = bookList;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
