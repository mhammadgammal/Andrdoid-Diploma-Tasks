package com.example.recyclerviewdemo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.contactmodel.Contact
import com.example.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ContactAdapter.OnContactClickListener {
    private lateinit var contactsList: List<Contact>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        contactsList = getContactList()
        val contactAdapter = ContactAdapter(contactsList, this)
        binding.contactRV.apply {
            adapter = contactAdapter
        }
    }

    private fun getContactList(): List<Contact>{
        return listOf(
            Contact("Mohamed Gamal", "01060366026"),
            Contact("Ahmed Ali", "01234349442"),
            Contact("Mahmoud Abou El-Ela", "01046246747"),
            Contact("Mona Ali", "01558962598"),
            Contact("Gihan Alaa", "012568457"),
            Contact("hany El-Mallah", "01046246747")
        )
    }

    override fun onContactClickListener(position: Int) {
        val intent = Intent(this, ContactDetailsActivity::class.java)
        intent.putExtra("contactName",contactsList[position].name)
        intent.putExtra("contactNumber",contactsList[position].phoneNumber)
        startActivity(intent)
    }

}