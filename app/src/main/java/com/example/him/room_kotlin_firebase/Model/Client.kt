package com.example.him.room_kotlin_firebase.Model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by him on 2/12/2018.
 */
@Entity(tableName = "client")
data class Client(var id1: Int, var fullname1: String,var contact1: Int,var amount1: Float, var work1: String) {

    constructor() : this(0,"",0,0f,"")

    @PrimaryKey(autoGenerate = true)
    var id: Int=0
    @ColumnInfo(name = "fullName")
    var fullname: String=""
    @ColumnInfo(name = "contact")
    var contact: Int=0
    @ColumnInfo(name = "amount")
    var amount: Float=0f
    @ColumnInfo(name = "work")
    var work: String=""

}