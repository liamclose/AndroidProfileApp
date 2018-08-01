package com.example.LTRC;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** Called when the user taps the Send button */
    public void goToProjects(View view) {
        Intent intent = new Intent(this, ProjectsActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the Send button */
    public void goToSkills(View view) {
        Intent intent = new Intent(this, SkillsActivity.class);
        startActivity(intent);
    }

}
