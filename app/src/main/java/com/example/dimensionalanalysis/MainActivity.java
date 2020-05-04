package com.example.dimensionalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable anim;
    private Button button;

    //Initial class declarations
    EditText editText;
    TextView textView, textView2, textView3, valueininches;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //First text view
        textView = findViewById(R.id.textView);
        //Second text view
        textView2 = findViewById(R.id.textView2);
        //Third text view
        textView3 = findViewById(R.id.textView3);
        //Fourth text view
        valueininches = findViewById(R.id.valueOfInches);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        //Adding a new activity
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertFromMMtoIn();

            }
        }));


    }

    private void convertFromMMtoIn() {
        String valueEntered = editText.getText().toString();

        double Mili = Double.parseDouble(valueEntered);

        double inches = Mili * 0.0393701;
        valueininches.setText("" + inches);
    }
}
