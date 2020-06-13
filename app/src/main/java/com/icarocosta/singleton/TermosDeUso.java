package com.icarocosta.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TermosDeUso extends AppCompatActivity {

    Button btn;
    Button btn2;

    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termos_de_uso);


        SharedPreferences prefs = getSharedPreferences("config", MODE_PRIVATE);

        btn = findViewById(R.id.buttonAceito);
        btn2 = findViewById(R.id.buttonNaoAceito);

        if (!prefs.getBoolean("Aceito", false)) {
            editor = prefs.edit();

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editor.putBoolean("Aceito", true);
                    editor.apply();

                    Intent i = new Intent(TermosDeUso.this, DadosUsuario.class);
                    startActivity(i);
                }
            });
        }else{
            Intent i = new Intent(TermosDeUso.this, DadosUsuario.class);
            startActivity(i);
        }

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}
