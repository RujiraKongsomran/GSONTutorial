package com.rujira.gsontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.rujira.gsontutorial.Model.Address;
import com.rujira.gsontutorial.Model.Employee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

//        Address address = new Address("Germany", "Berlin");
//
//        Employee employee = new Employee("John", 30, "john@gmail.com", address);
//        String json = gson.toJson(employee);

        String json = "{\n" +
                "  \"address\": {\n" +
                "    \"city\": \"Berlin\",\n" +
                "    \"country\": \"Germany\"\n" +
                "  },\n" +
                "  \"age\": 30,\n" +
                "  \"first_name\": \"John\",\n" +
                "  \"mail\": \"john@gmail.com\"\n" +
                "}";
        Employee employee = gson.fromJson(json, Employee.class);
    }
}
