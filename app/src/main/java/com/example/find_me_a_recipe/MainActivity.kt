package com.example.find_me_a_recipe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val find_recipe: Button = findViewById(R.id.Find_rec)
        find_recipe.setOnClickListener {
            setContentView(R.layout.activity_recipes_found)
        }

        val spinner: Spinner = findViewById(R.id.meal)
        ArrayAdapter.createFromResource(
            this,
            R.array.course,
            R.layout.my_spinner_layout
        ).also { adapter ->
            adapter.setDropDownViewResource(R.layout.my_spinner_layout)
            spinner.adapter = adapter
        }
    }



}
