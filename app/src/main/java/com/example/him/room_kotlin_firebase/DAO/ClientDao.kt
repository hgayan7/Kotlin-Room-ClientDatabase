package com.example.him.room_kotlin_firebase.DAO

import android.arch.persistence.room.*
import com.example.him.room_kotlin_firebase.Model.Client

/**
 * Created by him on 2/12/2018.
 */
@Dao interface ClientDao {

    @Query("SELECT * FROM client")
    fun getAllClients():List<Client>

    @Query("SELECT * FROM client WHERE fullName = :arg0")
    fun getClientByName(fullname:String):Client

    @Query("SELECT * FROM client WHERE id = :arg0")
    fun getClientById(ID:Int):Client

    @Insert()
    fun saveClient(client:Client)

    @Update()
    fun updateClient(client: Client)

    @Delete()
    fun deleteClient(client: Client)

}