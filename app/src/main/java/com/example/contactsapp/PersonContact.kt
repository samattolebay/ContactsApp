package com.example.contactsapp

import java.time.LocalDate

data class PersonContact(
    private var name: String = "",
    private var surname: String = "",
    private var birthDate: LocalDate,
    private var gender: Char = 'U'
) : Contact() {
    override fun getFullName() = name + if (surname.isNotBlank()) " $surname" else ""
}