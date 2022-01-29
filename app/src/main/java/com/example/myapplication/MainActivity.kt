package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn_submit)
        btn.setOnClickListener(View.OnClickListener {
            val editTxt = findViewById<EditText>(R.id.editText)
            Toast.makeText(this, "hi I am ${editTxt.text.toString()} \n go! corona go!", Toast.LENGTH_SHORT).show()
        })

    }
}