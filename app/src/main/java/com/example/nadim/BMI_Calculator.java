package com.example.nadim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI_Calculator extends AppCompatActivity {


    EditText weight,feet,inch;
    Button buttonId;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);


        buttonId=findViewById(R.id.buttonId);
        weight=findViewById(R.id.weight);
        feet=findViewById(R.id.feet);
        inch=findViewById(R.id.inch);
        textView=findViewById(R.id.textView);


        buttonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float w=Float.parseFloat(weight.getText().toString());
                float f=Float.parseFloat(feet.getText().toString());
                float i=Float.parseFloat(inch.getText().toString());

                float fi= (float) ((f*0.3048)+(i*0.0254));
                float bmi= w/(fi*fi);

                if(bmi<18.5){
                    textView.setText("Your BMI is : "+bmi+"\nYou are under weight Person."+"\nYou eat much more food.");
                }

                else if( (bmi>=18.5)&&(bmi<=24.9)){
                    textView.setText("Your BMI is : "+bmi+"\nYour weight is Perfect."+"\nSo,keep it care your health.");
                }

                else if((bmi>=24.9)&&(bmi<=29.9)){
                    textView.setText("Your BMI is : "+bmi+"\nYour are over weight Person."+"\nSo,control your food habit. ");
                }

                else {
                    textView.setText("Your BMI is : "+bmi+"\nPlease,do exercise everybody."+"\nYour Condition is very bad.");
                }
            }
        });


    }
}