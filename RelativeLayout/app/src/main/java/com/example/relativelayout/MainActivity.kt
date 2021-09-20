package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editNome: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("LIFE_CYCLE", "OnCreate")

        val buttonOk = findViewById<Button>(R.id.button_ok)

        val buttonNome = findViewById<EditText>(R.id.titleNome)

        val editSenha = findViewById<EditText>(R.id.edit_senha)


        buttonOk.setOnClickListener {

        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("LIFE_CYCLE", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LIFE_CYCLE", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LIFE_CYCLE", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LIFE_CYCLE", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LIFE_CYCLE", "OnDestroy")
    }
}