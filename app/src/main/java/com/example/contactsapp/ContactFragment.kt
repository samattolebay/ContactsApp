package com.example.contactsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class ContactFragment : Fragment() {
    private val args: ContactFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val contact = DataSource.contacts[args.idContact]
        if (contact != null) {
            view.findViewById<TextView>(R.id.tvContactFullName).text = contact.getFullName()
            view.findViewById<TextView>(R.id.tvContactNumber).text = contact.number
        }
        super.onViewCreated(view, savedInstanceState)
    }
}