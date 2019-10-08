package com.delarue.meustestes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoX = (Button) findViewById(R.id.botaoNovo);

        botaoX.setText("JotaPe!");

        botaoX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Você Clicou No Botão Xis", Toast.LENGTH_SHORT).show();

            }
        });

}

}
