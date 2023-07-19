package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link java button with xml button
        button = findViewById(R.id.btnActivityOne);

        //Create the intent
        final Intent intent = new Intent (this,ActivityTwo.class );
        String name = "Rush Cooper";
        int age = 22;

        intent.putExtra("USER_NAME",name);
        intent.putExtra("USER_AGE",age);


        //Set listner to the button
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Launch the activity
                startActivity(intent);
            }
        });
    }
}