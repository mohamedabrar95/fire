package com.example.firethird

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var button: Button

    val database: FirebaseDatabase = FirebaseDatabase.getInstance()
    val reference:DatabaseReference = database.getReference("Users")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        button = findViewById(R.id.btn)

        button.setOnClickListener {
            val username: String = editText.text.toString()
            reference.child("userName").setValue(username)
        }
    }
}