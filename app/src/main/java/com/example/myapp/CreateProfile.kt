package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CreateProfile : AppCompatActivity() {

    lateinit var createdUserInput : EditText
    lateinit var createdPassInput : EditText
    lateinit var createBtn : Button
    lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.create_profile)

        createdUserInput = findViewById(R.id.create_username_input)
        createdPassInput = findViewById(R.id.create_password_input)
        createBtn = findViewById(R.id.create_profile_btn)
        loginBtn = findViewById(R.id.login_btn)

        createBtn.setOnClickListener {
            val username = createdUserInput.text.toString()
            val password = createdPassInput.text.toString()
            Log.i("test credentials", "Username : $username and Password : $password")
        }
        loginBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}