package com.example.him.room_kotlin_firebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.him.room_kotlin_firebase.Database.ClientDB
import com.example.him.room_kotlin_firebase.Model.Client
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        save.setOnClickListener(View.OnClickListener {
            addClient(name.text.toString(),phoneno.text.toString().toInt(),amount.text.toString().toFloat(),work.text.toString())
        })
    }

    fun addClient(name:String,mobile:Int,value:Float,work:String){

        val db:ClientDB=ClientDB.getClientDB(this)
        var clients:List<Client> = db.clientdao().getAllClients()
        db.clientdao().saveClient(Client(clients.size+1,name,mobile,value,work))
        for(cliet in clients){
            Log.d("Client",cliet.fullname1)
        }
        Toast.makeText(this,"Count is "+clients.size,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Name is "+ db.clientdao().getAllClients()[clients.size].fullname1,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Id is "+ db.clientdao().getAllClients()[clients.size-1].id1,Toast.LENGTH_SHORT).show()

        clear()
    }

    fun clear(){

        name.text.clear()
        phoneno.text.clear()
        amount.text.clear()
        work.text.clear()

    }
}
