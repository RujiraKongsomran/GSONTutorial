package com.rujira.gsontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rujira.gsontutorial.Model.Address;
import com.rujira.gsontutorial.Model.Employee;
import com.rujira.gsontutorial.Model.FamilyMember;

import java.lang.reflect.Type;
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
//        String json = gson.toJson(family);

        String json = "[\n" +
                "  {\n" +
                "    \"age\": 30,\n" +
                "    \"role\": \"Wife\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"age\": 5,\n" +
                "    \"role\": \"Daugther\"\n" +
                "  }\n" +
                "]";
        //Employee employee = gson.fromJson(json, Employee.class);
        Type familyType = new TypeToken<ArrayList<FamilyMember>>() {
        }.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json, familyType);
    }
}
