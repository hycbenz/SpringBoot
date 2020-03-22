package com.shinesun.test.entity;

import java.io.Serializable;

/**
 * 这里是类说明.
 *
 * @className: User
 * @author: 胡永持
 * @date: 2020-03-21 16:22
 */
public class User implements Serializable {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}