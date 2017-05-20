package com.example.logonpf.aula02;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout txtNome;
    private TextInputLayout txtIdade;
    private Spinner spnTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = (TextInputLayout) findViewById(R.id.tilNome);
        txtIdade = (TextInputLayout) findViewById(R.id.tilIdade);
        spnTimes = (Spinner) findViewById(R.id.spnTimes);
    }

    public void cadastrar(View v) {
        String nome = txtNome.getEditText().getText().toString();
        String idade = txtIdade.getEditText().getText().toString();
        String timeSelecionado = spnTimes.getSelectedItem().toString();

        Intent iConfirmar = new Intent(this, ConfirmacaoActivity.class);

        iConfirmar.putExtra("NOME", nome);
        iConfirmar.putExtra("IDADE", idade);
        iConfirmar.putExtra("TIME", timeSelecionado);

        startActivity(iConfirmar);
    }
}