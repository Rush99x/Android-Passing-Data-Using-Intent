package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    Button button;
    TextView textUserName;
    TextView textUserAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button = findViewById(R.id.btnActivityTwo);
        textUserName = findViewById(R.id.txtUsername);
        textUserAge = findViewById(R.id.txtUserAge);

        Intent intent = getIntent();
        String name = intent.getStringExtra("USER_NAME");
        int age = intent.getIntExtra("USER_AGE",0);

        textUserName.setText(name);
        textUserAge.setText(String.valueOf(age));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}