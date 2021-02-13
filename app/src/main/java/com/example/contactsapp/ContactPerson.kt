package com.example.contactsapp

import java.time.LocalDate

class ContactPerson(
    id: Int,
    number: String,
    var name: String = "",
    var surname: String = "",
    var birthDate: LocalDate = LocalDate.now(),
    var gender: Char = 'U'
) : Contact(id, number) {
    override fun getFullName() = name + if (surname.isNotBlank()) " $surname" else ""
}