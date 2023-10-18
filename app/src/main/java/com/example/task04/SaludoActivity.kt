package com.example.task04
import android.os.Bundle

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date

class SaludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)


        // Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)

        // Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")

        // Obtenemos la fecha actual
        val fechaActual = SimpleDateFormat("dd/MM/yyyy").format(Date())

        // Construimos el mensaje a mostrar
        val mensaje = "Hola $saludo hoy es día $fechaActual y va a ser ESPECTACULAR"

        txtSaludo.text = mensaje

    }

}