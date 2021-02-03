package com.example.contactsapp

data class OrganizationContact(
    private var name: String = "",
    private var address: String = "",
) : Contact() {
    override fun getFullName() = name
}