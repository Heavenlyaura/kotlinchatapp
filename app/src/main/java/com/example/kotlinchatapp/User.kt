package com.example.kotlinchatapp

class User {
    var firstname: String? = null
    var lastname: String? = null
    var email: String? = null
    var uid: String? = null

    constructor(){}

    constructor(firstName: String?, lastName: String?, email: String?, uid: String?) {
        this.firstname = firstName
        this.lastname = lastName
        this.email = email
        this.uid = uid
    }
}