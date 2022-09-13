package com.example.sqlitedatabasepostvaclec01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_student);


        Button btnUpdate=findViewById(R.id.updatebtn);
        EditText editName, editRollNumber;
        Switch switchIsActive;

        editName = findViewById(R.id.editTextName);
        editRollNumber = findViewById(R.id.editTextRollNumber);
        switchIsActive = findViewById(R.id.switchStudent);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            StudentModel studentModel;

            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(UpdateStudent.this,MainActivity.class);
                    startActivity(i);
                    studentModel = new StudentModel(editName.getText().toString(), Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked());
                    Toast.makeText(UpdateStudent.this, "Student Updated", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(UpdateStudent.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(UpdateStudent.this);
                dbHelper.updateStudent(studentModel);
            }
        });

    }
}
