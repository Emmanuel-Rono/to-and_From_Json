package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.gson.Gson

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        lateinit var data : About

        val name =findViewById<TextView>(R.id.tvName)
        val myreference =findViewById<TextView>(R.id.tvId)
        val age =findViewById<TextView>(R.id.tvAge)
        val school =findViewById<TextView>(R.id.School)

        //to get the passed data
        val json=intent.getStringExtra("data")
        data=Gson().fromJson(json,About::class.java)
        name.text=data.name
        myreference.text= data.Id.toString()
        age.text=data.age.toString()
        school.text=data.School


    }
}