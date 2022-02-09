package org.geeksforgeeks.disablescreenrecording

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE)

        setContentView(R.layout.activity_main)

        val mButton = findViewById<Button>(R.id.button_1)
        mButton.setOnClickListener {
            Toast.makeText(applicationContext, "Welcome Geek!", Toast.LENGTH_LONG).show()
        }
    }
}