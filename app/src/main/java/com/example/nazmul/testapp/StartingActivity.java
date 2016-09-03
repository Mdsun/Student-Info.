package com.example.nazmul.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StartingActivity extends AppCompatActivity {

    EditText searchET;
    String text;
    StudentProfileManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        searchET = (EditText)findViewById(R.id.searchText);
        manager=new StudentProfileManager(this);
    }

    public void addStudent(View view) {
        Intent intent = new Intent(StartingActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void showList(View view) {
        Intent intent = new Intent(StartingActivity.this, ListActivity.class);
        startActivity(intent);
    }

    public void searchStudent(View view) {
        text = searchET.getText().toString();
        StudentInfo studentInfo=manager.getStudentInfo(text);

    }


}
