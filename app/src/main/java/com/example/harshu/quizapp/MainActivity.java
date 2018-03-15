package com.example.harshu.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Global Variable
    RadioGroup radioGroup_obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //RadioGroup Object
        radioGroup_obj = (RadioGroup) findViewById(R.id.group_id);
        //Button Object
        Button btnDisplay = (Button) findViewById(R.id.button);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int correctAnswer_No = 0;
                int selectedId = radioGroup_obj.getCheckedRadioButtonId();
                //RadioButton Object
                RadioButton radioButton_obj = (RadioButton) findViewById(selectedId);
                String answer = String.valueOf(radioButton_obj.getText());
                //EditText Object
                EditText editText_obj = (EditText) findViewById(R.id.question_2_answer);
                String answer2 = String.valueOf(editText_obj.getText());
                //RadioButton object for Question No 3 option True
                RadioButton radioButton_true_obj = (RadioButton) findViewById(R.id.facttrue);
                boolean answer3 = (radioButton_true_obj.isChecked());
                //CheckBox object for Question No 4 first checkbox
                CheckBox c1 = (CheckBox) findViewById(R.id.checkbox1);
                boolean c_1 = c1.isChecked();
                //CheckBox object for Question No 4 second checkbox
                CheckBox c2 = (CheckBox) findViewById(R.id.checkbox2);
                boolean c_2 = c2.isChecked();
                //CheckBox object for Question No 4 third checkbox
                CheckBox c3 = (CheckBox) findViewById(R.id.checkbox3);
                boolean c_3 = c3.isChecked();
                //CheckBox object for Question No 4 fourth checkbox
                CheckBox c4 = (CheckBox) findViewById(R.id.checkbox4);
                boolean c_4 = c4.isChecked();

                if (answer.matches("doctor")) {
                    correctAnswer_No = correctAnswer_No + 1;

                }
                if (answer2.matches("9")) {
                    correctAnswer_No = correctAnswer_No + 1;
                }
                if (answer3) {
                    correctAnswer_No = correctAnswer_No + 1;
                }
                if (c_4 && !c_1 && !c_2 && !c_3) {
                    correctAnswer_No = correctAnswer_No + 1;

                }
                Toast.makeText(MainActivity.this, "congrats Total No. of answers correct " + correctAnswer_No, Toast.LENGTH_LONG).show();

            }
        });
    }
}
