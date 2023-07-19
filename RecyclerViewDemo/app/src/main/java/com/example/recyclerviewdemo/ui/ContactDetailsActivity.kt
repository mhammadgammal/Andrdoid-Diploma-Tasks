package com.example.recyclerviewdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.recyclerviewdemo.R

class ContactDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        val intent = intent
        val contactTextView = findViewById<TextView>(R.id.contactDetailTV)
        val phoneTextView = findViewById<TextView>(R.id.phoneDetailTV)

        contactTextView.text = intent.extras?.getString("contactName")
        phoneTextView.text = intent.extras?.getString("contactNumber")
    }
}