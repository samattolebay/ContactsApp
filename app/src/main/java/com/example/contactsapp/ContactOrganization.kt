package com.example.contactsapp

class ContactOrganization(
    id: Int,
    number: String,
    var name: String = "",
    var address: String = "",
) : Contact(id, number) {
    override fun getFullName() = name
}