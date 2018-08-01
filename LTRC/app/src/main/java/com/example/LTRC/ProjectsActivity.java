package com.example.LTRC;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class ProjectsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private static final String[]paths = {"Peer to Peer Streaming Simulation Tool", "Automatic Pill Dispenser", "Maze Solving Robot Car", "LRTC APP"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
       // String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        spinner = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ProjectsActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.textView);
        //textView.setText(message);
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        TextView teamSize = findViewById(R.id.textView5);
        TextView description = findViewById(R.id.textView4);
        TextView myRole = findViewById(R.id.textView7);
        TextView outcome = findViewById(R.id.textView6);
        ImageView projectPic = findViewById(R.id.imageView2);
        switch (position) {
            case 0:
                teamSize.setText(R.string.number_4);
                description.setText(R.string.project_p2p_desc);
                //description.getLayoutParams().height = 150;
                myRole.setText(R.string.project_p2p_role);
                outcome.setText(R.string.project_p2p_outcome);
                projectPic.setImageResource(R.drawable.p2p);
                break;
            case 1:
                teamSize.setText(R.string.number_4);
                description.setText(R.string.project_p2p_desc);
                myRole.setText(R.string.project_p2p_role);
                outcome.setText(R.string.project_p2p_outcome);
                projectPic.setImageResource(R.drawable.pill_dispensor);
                break;
            case 2:
                teamSize.setText(R.string.number_3);
                description.setText(R.string.project_p2p_desc);
                myRole.setText(R.string.project_p2p_role);
                outcome.setText(R.string.project_p2p_role);
                projectPic.setImageResource(R.drawable.robot_car);
                break;
            case 3:
                teamSize.setText(R.string.individual);
                description.setText(R.string.project_p2p_desc);
                myRole.setText(R.string.project_p2p_role);
                outcome.setText(R.string.project_p2p_outcome);
                projectPic.setImageResource(R.drawable.ltrc);
                break;


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
