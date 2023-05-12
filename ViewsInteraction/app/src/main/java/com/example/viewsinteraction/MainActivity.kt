package com.example.viewsinteraction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var sendBTN: Button
    private lateinit var emailBTN: Button
    private lateinit var helloUserTV: TextView
    private lateinit var userNameEDT: EditText
    private lateinit var intent: Intent
    private lateinit var emailIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBTN = findViewById(R.id.sendBTN)
        helloUserTV = findViewById(R.id.helloUserTV)
        userNameEDT = findViewById(R.id.nameEDT)
        emailBTN = findViewById(R.id.emailBTN)
        sendBTN.setOnClickListener {
            val userName = userNameEDT.text.toString()
            helloUserTV.text = greetUser(userName)
            intent = Intent(this, UserLogedInActivity::class.java)
            intent.putExtra("userName", userName)
            startActivity(intent)
        }

        emailBTN.setOnClickListener{
            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.type = "message/rfc822"
            startActivity(Intent.createChooser(emailIntent, "Choose email app"))
        }

    }

    private fun greetUser(userName: String): String{
        return "Hello, $userName"
    }
}