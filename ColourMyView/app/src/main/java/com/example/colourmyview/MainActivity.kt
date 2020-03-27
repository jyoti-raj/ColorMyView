package com.example.colourmyview

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun makecolored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_two_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.LTGRAY)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.YELLOW)
            else -> view.setBackgroundColor(Color.RED)
        }
    }

        private fun setListener(){
           val box_one = findViewById<TextView>(R.id.box_one_text)
            val box_two = findViewById<TextView>(R.id.box_two_text)
            val box_three = findViewById<TextView>(R.id.box_three_text)
            val box_four = findViewById<TextView>(R.id.box_four_text)
            val box_five = findViewById<TextView>(R.id.box_five_text)

            val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

            val clickableViews: List<View> = listOf(box_one,box_two,box_three,box_four,box_five,rootConstraintLayout)

            for (items in clickableViews){
                items.setOnClickListener(){
                    makecolored(it)
                }
            }
        }


    }

