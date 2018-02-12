package com.example.him.room_kotlin_firebase.Database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.him.room_kotlin_firebase.DAO.ClientDao
import com.example.him.room_kotlin_firebase.Model.Client

/**
 * Created by him on 2/12/2018.
 */
@Database(entities = arrayOf(Client::class),version = 1,exportSchema = false)
abstract class ClientDB : RoomDatabase() {

    abstract fun clientdao():ClientDao

    companion object {

        fun getClientDB(context: Context):ClientDB{

            var instance:ClientDB?=null
            if(instance==null){
                instance= Room.databaseBuilder(context,ClientDB::class.java,"my-clients-db")
                        .allowMainThreadQueries()
                        .build()
            }
            return instance

        }
    }


}