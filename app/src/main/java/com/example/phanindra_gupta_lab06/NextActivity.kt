package com.example.phanindra_gupta_lab06

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import com.example.phanindra_gupta_lab06.R


class NextActivity : AppCompatActivity() {

    private lateinit var selectedposition: TextView
    private lateinit var textBoxHeading1: TextView
    private lateinit var textBox2: TextView
    private lateinit var textEntryBox1: EditText
    private lateinit var textBox3: TextView
    private lateinit var dropdownMenu: Spinner
    private lateinit var textBox4: TextView
    private lateinit var textEntryBox2: EditText
    private lateinit var doneButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        // Initialize views
        selectedposition = findViewById(R.id.selectedItemText)
        textBoxHeading1 = findViewById(R.id.textBoxHeading1)
        textBox2 = findViewById(R.id.textBox2)
        textEntryBox1 = findViewById(R.id.textEntryBox1)
        textBox3 = findViewById(R.id.textBox3)
        dropdownMenu = findViewById(R.id.dropdownMenu)
        textBox4 = findViewById(R.id.textBox4)
        textEntryBox2 = findViewById(R.id.textEntryBox2)
        doneButton = findViewById(R.id.doneButton)
        nextButton = findViewById(R.id.nextButton)

        // Get the selected item from the previous activity (replace with your actual logic)
        val selectedPosition = intent.getIntExtra("selectedPosition", -1)


        // Populate the selectedItemText TextView with the selected item
        val selectedPositionText = findViewById<TextView>(R.id.selectedItemText)

        // Populate the dropdown menu with options (replace with your data)
        val dropdownOptions = listOf("High", "Medium", "Low")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        dropdownMenu.adapter = adapter

        doneButton.setOnClickListener {

            val summaryTextView = findViewById<TextView>(R.id.summaryTextView)
            val text1 = textEntryBox1.text.toString()
            val text2 = textEntryBox2.text.toString()
            val text3 = textBox2.text.toString()
            val text4 = textBox4.text.toString()

            val summaryText = "Summary: $text3 : $text1, $text2 : $text2 "

            // Update the summary TextView with the generated summary
            summaryTextView.text = summaryText



            // Enable the "Next" button
            nextButton.isEnabled = true
        }

        // Set a click listener for the "Next" button
        nextButton.setOnClickListener {
            // Navigate to another empty view (Replace with your navigation logic)
            val nextButton = findViewById<Button>(R.id.nextButton)

            nextButton.setOnClickListener {
                // Create an Intent to go to NextActivity2
                val intent = Intent(this, NextActivity2::class.java)

                // Start NextActivity2
                startActivity(intent)
            }

        }
    }
}
