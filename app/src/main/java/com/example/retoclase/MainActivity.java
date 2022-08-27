


package com.example.retoclase;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.retoclase.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    EditText edtxt1;
    int promedio = 0 , suma2=0,numeroSum,suma,numero = 0;
    int [] vector = new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conectar();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma2=0;
                for (int i=0;i<vector.length;i++){
                    vector[i] = (int) (Math.random()*90)+10;
                    suma2+= vector[i];
                }
                edtxt1.setText(Arrays.toString(vector));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arrays.sort(vector);
                numeroSum = vector[4];
                suma = (numeroSum/10 ) +(numeroSum % 10);
                btn2.setText("Numero Mayor: "+ numeroSum+ "...Total Suma: " +suma);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                promedio = suma2 / vector.length;
                btn3.setText("Promedio es : " +  Integer.toString(promedio));
            }
        });
    }

    private void conectar() {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        edtxt1=findViewById(R.id.edtxt1);
    }

}