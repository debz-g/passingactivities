package com.debz.passingactivities

import java.io.Serializable

data class Person(
    val name: String,
    val age: Int,
    val country: String
) : Serializable
// Serializable is used to tell that this class can be parsed to an object that can be transferred between Activities
// and can be passed to an Intent
//    Data class specifies kotlin that this class is used to store data only