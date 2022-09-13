package com.example.sqlitedatabasepostvaclec01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class AddStudent extends AppCompatActivity {

    EditText editName, editRollNumber;
    Switch switchIsActive;
    ListView listViewStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_student);

    }
}
