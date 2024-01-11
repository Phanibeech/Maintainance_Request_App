package com.example.phanindra_gupta_lab06

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class NextActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next2)

        val textBox = findViewById<EditText>(R.id.textBox)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val anotherTextBox = findViewById<EditText>(R.id.anotherTextBox)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            // Handle the submit button click event
            // You can implement the logic to create a maintenance request here
            // Get the selected radio button text
            val selectedOption: String = if (radioButton1.isChecked) {
                radioButton1.text.toString()
            } else {
                radioButton2.text.toString()
            }

            // Get text from text boxes
            val description = textBox.text.toString()
            val additionalInfo = anotherTextBox.text.toString()

            // TODO: Implement logic to create a maintenance request
            // You can send this data to a server or database to create the request
            // After successful submission, you can receive a maintenance request ID

            // For now, you can display a message (replace with your logic)
            val requestID = generateMaintenanceRequestID()
            val message = "Maintenance Request ID: $requestID"
            showToast(message)
        }
    }

    // Dummy function to generate a maintenance request ID (Replace with actual logic)
    private fun generateMaintenanceRequestID(): String {
        return "MR12345"
    }

    // Dummy function to show a toast message (Replace with your UI notification logic)
    private fun showToast(message: String) {
        // Implement your toast message display logic here
        // You can also display it in a TextView or handle it as needed
        // For now, let's print the message to the console
        println(message)
    }
}