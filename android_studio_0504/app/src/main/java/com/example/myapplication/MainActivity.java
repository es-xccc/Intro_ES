package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity; import android.view.View; import android.widget.EditText; import android.widget.Button; import android.widget.TextView; import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView text3; EditText mheightedit, mweightedit; Button btn1; String calculation;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        text3 = findViewById(R.id.textView3); mheightedit = findViewById(R.id.heightedit); mweightedit = findViewById(R.id.weightedit); btn1 = findViewById(R.id.button); btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calulateBMI();
            }

            public void calulateBMI() {
                String heightString = mheightedit.getText().toString();
                String weightString = mweightedit.getText().toString();
                if (heightString != null && weightString != null) {
                    float heightvalue = Float.parseFloat(heightString) / 100;
                    float weightvalue = Float.parseFloat(weightString);
                    float bmi = weightvalue / (heightvalue * heightvalue);
                    displayBMI(bmi);
                }
            }

            private void displayBMI(float bmi) {
                String BMIresult = "";
                if (Float.compare(bmi, 18.5f) <= 0) {
                    BMIresult = "體重過輕";
                } else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 24f) <= 0) {
                    BMIresult = "體重適中";
                } else if (Float.compare(bmi, 24f) > 0 && Float.compare(bmi, 27f) <= 0) {
                    BMIresult = "體重過重";
                }
                calculation = "結果:\n" + bmi + "\n" + BMIresult;
                text3.setText(calculation);
            }

           });}}