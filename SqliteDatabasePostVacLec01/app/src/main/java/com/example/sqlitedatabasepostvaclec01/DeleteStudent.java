package com.example.sqlitedatabasepostvaclec01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DeleteStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_student);


        Button btnDelete=findViewById(R.id.deletebtn);
        EditText editRollNumber;

        editRollNumber = findViewById(R.id.editTextRollNumber);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            StudentModel studentModel;

            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(DeleteStudent.this,MainActivity.class);
                    startActivity(i);
                    studentModel = new StudentModel("", Integer.parseInt(editRollNumber.getText().toString()), true);
                    Toast.makeText(DeleteStudent.this, "Student Deleted", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(DeleteStudent.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(DeleteStudent.this);
                dbHelper.deleteStudent(studentModel.getRollNmber());
            }
        });
    }
}
