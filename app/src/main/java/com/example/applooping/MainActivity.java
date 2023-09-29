package com.example.applooping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button BtnFor, BtnWhile, BtnDoWHile;
    TextView TVHasil;
    EditText ETFirst, ETLast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVHasil = findViewById(R.id.hasil);
        BtnFor = findViewById(R.id.Bfor);
        BtnWhile = findViewById(R.id.Bwhile);
        BtnDoWHile = findViewById(R.id.BdoWhile);
        ETFirst = findViewById(R.id.First);
        ETLast = findViewById(R.id.Last);

        BtnFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input1 = Integer.parseInt(ETFirst.getText().toString());
                int input2 = Integer.parseInt(ETLast.getText().toString());
                if(input1<=input2){
                    TVHasil.setText("");
                    for(int x=input1;x<=input2;x++){
                        TVHasil.setText(TVHasil.getText().toString()+x+"\n");
                    }
                } else {
                    TVHasil.setText("");
                    for(int x=input1;x>=input2;x--){
                        TVHasil.setText(TVHasil.getText().toString()+x+"\n");
                    }
                }
            }
        });

        BtnWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input1 = Integer.parseInt(ETFirst.getText().toString());
                int input2 = Integer.parseInt(ETLast.getText().toString());
                if(input1<=input2) {
                    TVHasil.setText("");
                    int y = input1;
                    while (y <= input2) {
                        TVHasil.setText(TVHasil.getText().toString() + y + "\n");
                        y++;
                    }
                } else {
                    TVHasil.setText("");
                    int y = input1;
                    while (y >= input2) {
                        TVHasil.setText(TVHasil.getText().toString() + y + "\n");
                        y--;
                    }
                }
            }
        });

        BtnDoWHile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input1 = Integer.parseInt(ETFirst.getText().toString());
                int input2 = Integer.parseInt(ETLast.getText().toString());
                if(input1<=input2) {
                    TVHasil.setText("");
                    int z = input1;
                    do {
                        TVHasil.setText(TVHasil.getText().toString() + z + "\n");
                        z++;
                    } while (z <= input2);
                } else {
                    TVHasil.setText("");
                    int z = input1;
                    do {
                        TVHasil.setText(TVHasil.getText().toString() + z + "\n");
                        z--;
                    } while (z >= input2);
                }
            }
        });
    }
}