package com.example.fancy_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput = editText.getText().toString();

                String output = "";
                for(int i = 0; i < userInput.length(); i++){
                    char letter;

                    if(i % 2 == 0){
                        letter = userInput.toUpperCase().charAt(i);
                    }else{
                        letter = userInput.toLowerCase().charAt(i);
                    }
                    output += letter;
                }
                System.out.println(output);
                textView.setText(output);
            }
        });


    }
}