package com.example.recyclerviewdemo.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.contactmodel.Contact
import com.example.recyclerviewdemo.databinding.ContactItemBinding

class ContactAdapter(private val contactList: List<Contact>, private val listener: OnContactClickListener) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ContactItemBinding.inflate(
                LayoutInflater.from(parent.context)
            ),
            listener
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.contactDetailTV.text = contactList[position].name
        holder.binding.phoneDetailTV.text = contactList[position].phoneNumber
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ViewHolder(val binding: ContactItemBinding, listener: OnContactClickListener) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                listener.onContactClickListener(adapterPosition)
            }
        }

    }

    interface OnContactClickListener {
        fun onContactClickListener(position: Int)
    }
}