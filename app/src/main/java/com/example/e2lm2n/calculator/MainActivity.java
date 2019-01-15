package com.example.e2lm2n.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button btn_somar;
    Button btn_subtrai;
    Button btn_multip;
    Button btn_divi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_somar = (Button) findViewById(R.id.btnsomar);
        btn_subtrai = (Button) findViewById(R.id.btnsubtrai);
        btn_multip = (Button) findViewById(R.id.btnmultip);
        btn_divi = (Button) findViewById(R.id.btndivi);

        btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultadoSoma.class);
                startActivity(intent);
            }
        });

        btn_subtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultadoSubtrai.class);
                startActivity(intent);
            }
        });

        btn_multip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultadoMultip.class);
                startActivity(intent);
            }
        });

        btn_divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultadoDivi.class);
                startActivity(intent);
            }
        });


    }

}
