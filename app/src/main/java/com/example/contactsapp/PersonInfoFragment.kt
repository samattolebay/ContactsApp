package com.example.contactsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.navArgs

class PersonInfoFragment : Fragment() {
    private val args: PersonInfoFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val person = DataSource.contacts[args.idContact] as ContactPerson
        view.findViewById<EditText>(R.id.etContactName).setText(person.name)
        view.findViewById<EditText>(R.id.etContactSurname).setText(person.surname)
        view.findViewById<EditText>(R.id.etContactBirthDate).setText(person.birthDate.toString())
        view.findViewById<EditText>(R.id.etContactGender).setText(person.gender.toString())
        view.findViewById<EditText>(R.id.etContactNumber).setText(person.number)
        super.onViewCreated(view, savedInstanceState)
    }
}