package com.example.vocalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String inputText;
    public int numVocals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button mcalculateButton = findViewById(R.id.calculateButton);
        final EditText medText = findViewById(R.id.edText1);
        final TextView mtwOuput = findViewById(R.id.twTotalVocals);

        mcalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText = medText.getText().toString();
                numVocals = calculateVocals((inputText));
                mtwOuput.setText("Número de vocales: " + numVocals);
            }
        });

        }
    public int calculateVocals(String phrase){
        int vocalCounter = 0;
        char [] vocalsList=  {'a', 'e', 'i', 'o',  'u', 'A', 'E', 'I', 'O', 'U'};

        //Remember, arrays always start with a 0.
        for(int i = 0; i<phrase.length();i++){
            for(int j = 0; j < vocalsList.length; j++){
                if (phrase.charAt(i) == vocalsList[j]) {
                    vocalCounter++;
                }
            }
        }


        return vocalCounter;
    }








}
