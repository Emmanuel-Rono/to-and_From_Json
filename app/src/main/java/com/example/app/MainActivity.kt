package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mydata=About("Emmanuel Rono",12924133,21,"Zetech University")
        //convert it to Json
        //Using Gson
        val json= Gson().toJson(mydata)
        val intent=Intent(this,SecondActivity::class.java)
        intent.putExtra("data",json)
        startActivity(intent)
    }
}