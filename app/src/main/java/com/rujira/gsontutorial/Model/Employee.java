package com.rujira.gsontutorial.Model;

import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("mail")
    private String mMail;

    public Employee(String firstName, int age, String mail) {
        this.mFirstName = firstName;
        this.mAge = age;
        this.mMail = mail;
    }
}
