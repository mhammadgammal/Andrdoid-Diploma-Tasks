package com.example.viewsinteraction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class UserLogedInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_loged_in)
        val intent = intent
        val userName =  intent.extras?.getString("userName")
        Toast.makeText(this, "hello, $userName", Toast.LENGTH_LONG).show()
    }
}