package com.example.signup_project2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Sign_info : AppCompatActivity() {

    private lateinit var name: TextView
    private lateinit var email: TextView
    private lateinit var age: TextView
    private lateinit var address: TextView
    private lateinit var password: TextView

    private lateinit var Back_dt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_info)

        name = findViewById(R.id.textviewname)
        email = findViewById(R.id.textemail)
        age = findViewById(R.id.textage)
        address = findViewById(R.id.textaddress)
        password = findViewById(R.id.textpass)
        Back_dt = findViewById(R.id.Back_button)


        name.text = intent.getStringExtra("name")
        email.text = intent.getStringExtra("email")
        age.text = intent.getStringExtra("age")
        address.text = intent.getStringExtra("address")
        password.text = intent.getStringExtra("password")


         Back_dt.setOnClickListener {

             val intent = Intent(this@Sign_info, MainActivity::class.java)
             startActivity(intent)
         }

    }
}