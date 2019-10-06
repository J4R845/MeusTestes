package com.delarue.meustestes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoX = (Button) findViewById(R.id.botaoNovo);

        botaoX.setText("JotaPeDeEsse!");

        botaoX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Você Clicou No Botão?");

                Toast.makeText(getApplicationContext(),"Como Usar O Toast!", Toast.LENGTH_SHORT).show();

            }
        });

}

}
