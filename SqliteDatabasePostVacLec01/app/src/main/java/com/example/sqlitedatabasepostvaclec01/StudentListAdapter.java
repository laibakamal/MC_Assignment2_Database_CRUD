

//public class StudentListAdapter {
//}



package com.example.sqlitedatabasepostvaclec01;

        import android.content.Context;
        import android.graphics.Color;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;

        import java.util.ArrayList;

public class StudentListAdapter extends ArrayAdapter<StudentModel>  {

    public StudentListAdapter(@NonNull Context context, ArrayList<StudentModel> surah) {
        super(context, 0, surah);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (position % 2 == 1) {
            convertView.setBackgroundColor(Color.BLUE);
        } else {
            convertView.setBackgroundColor(Color.CYAN);
        }

        StudentModel myclass = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.view_student, parent, false);
        TextView name = convertView.findViewById(R.id.name);
        //name.setText(String.valueOf( myclass.getSurahID()));

        TextView surahNameE = convertView.findViewById(R.id.rollno);
        //surahNameE.setText( myclass.getSurahNameE());

        TextView surahNameU = convertView.findViewById(R.id.isActive);
        //surahNameU.setText( myclass.getSurahNameU());

        return convertView;
    }

}