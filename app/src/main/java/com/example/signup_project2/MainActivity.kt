package com.example.signup_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var age: EditText
    private lateinit var address: EditText
    private lateinit var password: EditText

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.et_name)
        email = findViewById(R.id.et_email)
        age = findViewById(R.id.et_age)
        address = findViewById(R.id.et_address)
        password = findViewById(R.id.et_password)

        button = findViewById(R.id.SignupBtn)


        button.setOnClickListener {

            if (name.text.toString().isEmpty()) {
                name.error = "Invalid name !"
                Toast.makeText(this@MainActivity, "Name can't be empty", Toast.LENGTH_SHORT).show()

            } else if (email.text.toString().isEmpty()) {
                email.error = "Invalid email !"
                Toast.makeText(this@MainActivity, "Email can't be empty", Toast.LENGTH_SHORT).show()

            } else if (age.text.toString().isEmpty()) {
                age.error = "Invalid age !"
                Toast.makeText(this@MainActivity, "Age can't be empty", Toast.LENGTH_SHORT).show()

            } else if (address.text.toString().isEmpty()) {
                address.error = "Invalid address !"
                Toast.makeText(this@MainActivity, "Address can't be empty", Toast.LENGTH_SHORT).show()

            } else if (password.text.toString().isEmpty()) {
                password.error = "Invalid password !"
                Toast.makeText(this@MainActivity, "Password can't be empty", Toast.LENGTH_SHORT).show()

            }


            val name = name.text.toString()
            val email = email.text.toString()
            val age = age.text.toString()
            val address = address.text.toString()
            val password = password.text.toString()

            val intent = Intent(this@MainActivity, Sign_info::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("age", age)
            intent.putExtra("address", address)
            intent.putExtra("password", password)
            startActivity(intent)


        }
    }
}