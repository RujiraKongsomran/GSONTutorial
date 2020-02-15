package com.rujira.gsontutorial.Model;

import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("mail")
    private String mMail;
    @SerializedName("address")
    private Address mAddress;

    public Employee(String mFirstName, int mAge, String mMail, Address mAddress) {
        this.mFirstName = mFirstName;
        this.mAge = mAge;
        this.mMail = mMail;
        this.mAddress = mAddress;
    }
}
