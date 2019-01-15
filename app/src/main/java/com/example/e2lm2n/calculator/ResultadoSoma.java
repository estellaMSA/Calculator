package com.example.e2lm2n.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class ResultadoSoma extends AppCompatActivity {

    EditText valor_1;
    EditText valor_2;
    Button calcular_;
    TextView resultados_;
    ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        valor_1 = (EditText) findViewById(R.id.valor1);
        valor_2 = (EditText) findViewById(R.id.valor2);
        calcular_= (Button) findViewById(R.id.calcular);
        resultados_ = (TextView) findViewById(R.id.resultados);
        listView = (ListView) findViewById(R.id.lv);

        String[] items = {""};
        arrayList = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.list, R.id.txtitem, arrayList);
        listView.setAdapter(adapter);

        calcular_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vl_1;
                double vl_2;
                double res;

                vl_1 = Double.parseDouble(valor_1.getText().toString());
                vl_2 = Double.parseDouble(valor_2.getText().toString());

                res = vl_1 + vl_2;

                resultados_.setText("A soma é: " + res);

                String newItem = resultados_.getText().toString();
                arrayList.add(newItem);
                adapter.notifyDataSetChanged();

            }
        });
    }
}
