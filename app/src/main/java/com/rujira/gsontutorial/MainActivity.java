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

        Address address = new Address("Germany", "Berlin");

        Employee employee = new Employee("John", 30, "john@gmail.com", address);
        String json = gson.toJson(employee);

//        String json = "{\"age\":30,\"first_name\":\"John\",\"mail\":\"john@gmail.com\"}";
//        Employee employee = gson.fromJson(json, Employee.class);
    }
}
