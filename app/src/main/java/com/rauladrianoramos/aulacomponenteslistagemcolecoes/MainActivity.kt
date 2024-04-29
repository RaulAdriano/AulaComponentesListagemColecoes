package com.rauladrianoramos.aulacomponenteslistagemcolecoes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonExecutar: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonExecutar = findViewById(R.id.buttonExecutar)
        textResultado = findViewById(R.id.textResultado)

//        buttonExecutar.setOnClickListener {
//            textResultado.text = "Raul Adriano Ramos"
//        }
    }


    fun clickBotao(view: View) {
        Toast.makeText(this, "Sucesso", Toast.LENGTH_LONG).show()

        textResultado.text = "Raul Adriano Ramos"
    }
}