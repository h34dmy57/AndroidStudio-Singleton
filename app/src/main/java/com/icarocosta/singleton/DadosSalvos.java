package com.icarocosta.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DadosSalvos extends AppCompatActivity {

    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_salvos);


        tv1 = findViewById(R.id.textView7);
        tv2 = findViewById(R.id.textView8);

        tv1.setText(Singleton.getInstance().nome);
        tv2.setText(Singleton.getInstance().email);


    }
}
