package com.example.contactsapp

import java.time.LocalDateTime

abstract class Contact(private var number: String = "") {
    private var timeCreated: LocalDateTime = LocalDateTime.now()
    private var timeLastEdited: LocalDateTime = LocalDateTime.now()

    abstract fun getFullName(): String
}