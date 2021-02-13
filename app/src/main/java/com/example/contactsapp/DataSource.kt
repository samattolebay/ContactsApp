package com.example.contactsapp

import android.util.Log

object DataSource {
    var contactIdCounter = 0

    val contacts = mutableMapOf<Int, Contact>()     // id to Contact
}