package com.rujira.gsontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.rujira.gsontutorial.Model.Address;
import com.rujira.gsontutorial.Model.Employee;
import com.rujira.gsontutorial.Model.FamilyMember;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

//        List<FamilyMember> family = new ArrayList<>();
//        family.add(new FamilyMember("Wife", 30));
//        family.add(new FamilyMember("Daugther", 5));
//
//        Address address = new Address("Germany", "Berlin");
//
//        Employee employee = new Employee("John", 30, "john@gmail.com", address, family);
//        String json = gson.toJson(employee);

        String json = "{\n" +
                "  \"address\": {\n" +
                "    \"city\": \"Berlin\",\n" +
                "    \"country\": \"Germany\"\n" +
                "  },\n" +
                "  \"age\": 30,\n" +
                "  \"family\": [\n" +
                "    {\n" +
                "      \"age\": 30,\n" +
                "      \"role\": \"Wife\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 5,\n" +
                "      \"role\": \"Daugther\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"first_name\": \"John\",\n" +
                "  \"mail\": \"john@gmail.com\"\n" +
                "}";
        Employee employee = gson.fromJson(json, Employee.class);
    }
}
