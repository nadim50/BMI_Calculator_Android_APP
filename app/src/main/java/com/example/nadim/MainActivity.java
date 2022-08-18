package com.example.nadim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username = (EditText) findViewById(R.id.username);
        TextView password = (EditText) findViewById(R.id.password);

        Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if ((username.getText().toString().equals("admin")) && (password.getText().toString().equals("admin")))
                {
                    // correct
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    /// next page
                    Intent myIntent = new Intent(MainActivity.this, BMI_Calculator.class);
                    startActivity(myIntent);
                }
                else
                {
                    // incorrect
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();

                }
            }


        });
    }
}