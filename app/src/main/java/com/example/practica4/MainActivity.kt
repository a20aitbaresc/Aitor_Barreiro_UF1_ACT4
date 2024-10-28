package com.example.practica4

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"  // Etiqueta para el Logcat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botón para hacer el Logcat
        val botonLogcat = findViewById<Button>(R.id.boton_logcat)
        botonLogcat.setOnClickListener {
            Log.d(TAG, "boto apretat")  // Mensaje que aparecerá en Logcat
        }

        // Botón para hacer el Toast
        val botonToast = findViewById<Button>(R.id.boton_toast)
        botonToast.setOnClickListener {
            Toast.makeText(this, "boto apretat", Toast.LENGTH_SHORT).show()  // Mensaje Toast en pantalla
        }
    }
}
