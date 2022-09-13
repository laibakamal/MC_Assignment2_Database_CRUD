package com.example.sqlitedatabasepostvaclec01;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class StudentListAdapter extends ArrayAdapter<StudentModel> {


    public StudentListAdapter(@NonNull Context context, @NonNull List<StudentModel> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        StudentModel s = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.view_student, parent,
                false);
        TextView name = convertView.findViewById(R.id.name);
        TextView rollNo = convertView.findViewById(R.id.rollno);
        TextView enrolled = convertView.findViewById(R.id.isActive);
        name.setText(String.valueOf(s.getName()));
        rollNo.setText(String.valueOf(s.getRollNmber()));

        if (s.isEnroll() == 0) {
            enrolled.setText("Not Enrolled");
        } else if (s.isEnroll() == 1) {
            enrolled.setText("Enrolled");
        }

        if (position % 2 == 1) {
            convertView.setBackgroundColor(Color.rgb(255, 216, 216));
        } else {
            convertView.setBackgroundColor(Color.rgb(216, 253, 255));
        }


        return convertView;
    }


}
