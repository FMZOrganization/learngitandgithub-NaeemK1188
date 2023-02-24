package com.example.firstapplication_411_review_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    private lateinit var myButton: Button
    private lateinit var myButton1:Button

    // why we are overriding ?
    // are we overriding the mainactivity class to use super class oncreate ?
    // onCreate is a function call
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //linking the button variables to the actual button views
        this.myButton = this.findViewById(R.id.buttonPrevious)
        this.myButton1 = this.findViewById(R.id.buttonNext)
        // is setonclicklistener a memeber function of view class ?
        // using lamba function(short way to create function)
        // lambda function has one argument view and output println
        // showing message when button is clicked
        this.myButton.setOnClickListener { view:View ->

            println("previous is clicked")

        }

        // is setonclicklistener a view class memebr function ?
        // who is calling setonclicklistener ?
        // so we are sending back the println to which function ?
        this.myButton1.setOnClickListener { view:View ->

            println("next button is clicked")

        }

    }




}