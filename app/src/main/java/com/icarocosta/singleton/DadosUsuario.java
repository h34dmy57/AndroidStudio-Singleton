package com.icarocosta.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DadosUsuario extends AppCompatActivity {
    Button btn;
    EditText nome;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_usuario);

        nome = findViewById(R.id.editText3);
        email = findViewById(R.id.editText);
        btn = findViewById(R.id.buttonSalvar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Singleton.getInstance().nome = nome.getText().toString();
                Singleton.getInstance().email = email.getText().toString();
                Intent i = new Intent(DadosUsuario.this, DadosSalvos.class);
                startActivity(i);
            }
        });
    }
}
