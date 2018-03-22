package com.example.stud.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.ArrayAdapter.*;

public class MainActivity extends AppCompatActivity {

    RadioButton rbOpcja1;
    RadioButton rbOpcja2;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbOpcja1 = (RadioButton) findViewById(R.id.rbOpcja1);
        rbOpcja2 = (RadioButton) findViewById(R.id.rbOpcja2);
        spinner = (Spinner) findViewById(R.id.spinner);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wartosc = "";

                if (view.getId() == R.id.rbOpcja1) {

                    wartosc = "wybrano opcje 1";
                } else if (view.getId() == R.id.rbOpcja2) {

                    wartosc = "wybrano opcje 3";
                }

                RadioButton radio = (RadioButton) view;

                Toast.makeText(MainActivity.this,
                        radio.getText(),
                        Toast.LENGTH_SHORT).show();
            }

        };
        rbOpcja1.setOnClickListener(listener);
        rbOpcja2.setOnClickListener(listener);

        ArrayAdapter<CharSequence> adapter = createFromResource(this,
                R.array.planety, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String[] planety = getResources().getStringArray(R.array.planety);

            Toast.makeText(context: MainActivity.this, planety[i],
                    Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    });
        );


    }


}