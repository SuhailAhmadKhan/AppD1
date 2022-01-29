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
            val name =findViewById<EditText>(R.id.editText)
            val age =findViewById<EditText>(R.id.age)
            val btn =findViewById<Button>(R.id.btn_submit)
            btn.setOnClickListener(View.OnClickListener {
                if (name.text.toString().trim().isEmpty()){
                    Toast.makeText(this, "Enter your name", Toast.LENGTH_SHORT).show()
                }
                else if (age.text.toString().trim().isEmpty()){
                    Toast.makeText(this, "Enter your age", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "hi i am ${name.text.toString()} \n go corona! go! ", Toast.LENGTH_LONG).show()
                }
        })

    }
}