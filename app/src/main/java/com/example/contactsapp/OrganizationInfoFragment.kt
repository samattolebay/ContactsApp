package com.example.contactsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.navArgs

class OrganizationInfoFragment : Fragment() {
    private val args: OrganizationInfoFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_organization_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val person = DataSource.contacts[args.idContact] as ContactOrganization
        view.findViewById<EditText>(R.id.etContactName).setText(person.name)
        view.findViewById<EditText>(R.id.etContactAddress).setText(person.address)
        view.findViewById<EditText>(R.id.etContactNumber).setText(person.number)
        super.onViewCreated(view, savedInstanceState)
    }
}