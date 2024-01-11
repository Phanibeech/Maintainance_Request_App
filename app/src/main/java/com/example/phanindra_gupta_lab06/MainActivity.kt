package com.example.phanindra_gupta_lab06

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.GridView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example data for the grid
        val gridData = arrayOf("Unit 101", "Unit 102", "Unit 103", "Unit 104", "Unit 105", "Unit 106", "Unit 107", "Unit 108")

        // Setting up the adapter for GridView with custom grid item layout
        val adapter = object : ArrayAdapter<String>(this, R.layout.grid_item, R.id.gridItemText, gridData) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getView(position, convertView, parent)
                val textView = view.findViewById<TextView>(R.id.gridItemText)

                // Handle item clicks
                view.setOnClickListener {
                    val selectedItem = gridData[position]
                    Toast.makeText(this@MainActivity, "Clicked: $selectedItem", Toast.LENGTH_SHORT).show()

                    // Update the selected item text
                    val selectedItemText = findViewById<TextView>(R.id.selectedItemText)
                    selectedItemText.text = "Selected Item: $selectedItem"


                    // Enable the "Next" button
                    nextButton.isEnabled = true
                }

                return view
            }
        }

        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = adapter

        // Initialize the "Next" button
        nextButton = findViewById(R.id.nextButton)
    }

    // Function to open a new empty view page
    fun openNextPage(view: View) {
        val nextButton = findViewById<Button>(R.id.nextButton) // Assuming "nextButton" is the ID of your button
        nextButton.setOnClickListener {
            val nextIntent = Intent(this, NextActivity::class.java)
            startActivity(nextIntent)
        }




    }
}
