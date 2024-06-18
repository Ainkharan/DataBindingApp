package com.example.databindingapp;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import com.example.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // Declare  binding variable
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Person object
        //Person person = new Person("Nada" , "23", "abc@Gmail.com");
        Person person = new Person("","","");

        // Get  TextViews
//        TextView tvName = findViewById(R.id.displayName);
//        TextView tvAge = findViewById(R.id.displayAge);
//        TextView tvEmailAddress = findViewById(R.id.displayEmailAddress);
//
//        // Set TextView text from Person object
//        tvName.setText("Name: " + person.getName());
//        tvAge.setText("Age: " + person.getAge());
//        tvEmailAddress.setText("Email: " + person.getEmailAddress());

        // Initialize the binding variable
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.setPerson(person);
    }
}