package com.example.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val numero1:TextView;
        val enviar:Button;
        val resultados:TextView;

        numero1 = findViewById(R.id.edad);
        enviar = findViewById(R.id.Envio);
        resultados = findViewById(R.id.resultado)

        enviar.setOnClickListener {
            val num1 = numero1.text.toString().toInt()
            val result = 2024 - num1;
            resultados.text = result.toString();
        }
    }
}

