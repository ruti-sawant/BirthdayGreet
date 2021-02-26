package com.example.bitrhdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val greetButton=findViewById<View>(R.id.createBirthdayButton)
        greetButton.setOnClickListener()*/
    }
    fun createCard(view: View) {
        /*val name=nameInput.editableText.toString()
        Toast.makeText(this,"Button was clicked $name",Toast.LENGTH_LONG).show()*/
        //here we create new intent using intent Constructor
        val name=nameInput.editableText.toString()
        val intent= Intent(this,BirthdayGreetActivity::class.java)
        intent.putExtra("name",name)
        startActivity(intent) //used to start the new created intent
    }
}