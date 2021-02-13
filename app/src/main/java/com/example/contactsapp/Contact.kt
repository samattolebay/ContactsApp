package com.example.contactsapp

import java.time.LocalDateTime

abstract class Contact(
    var id: Int,
    var number: String = ""
) {
    var timeCreated: LocalDateTime = LocalDateTime.now()
    var timeLastEdited: LocalDateTime = LocalDateTime.now()

    abstract fun getFullName(): String

    override fun equals(other: Any?) = if (other !is Contact) false else id == other.id

    override fun hashCode() = id
}