package com.rujira.gsontutorial.Model;

import com.google.gson.annotations.SerializedName;

public class Address {
    @SerializedName("country")
    private String mCountry;
    @SerializedName("city")
    private String mCity;
    @SerializedName("address")
    private Address mAddress;

    public Address(String mCountry, String mCity, Address mAddress) {
        this.mCountry = mCountry;
        this.mCity = mCity;
        this.mAddress = mAddress;
    }
}
