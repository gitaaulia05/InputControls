package com.example.inputcontrols

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btnToast: Button = findViewById(R.id.btnToast)
        btnToast.setOnClickListener{
            Toast.makeText(this, "Tombol Ditekan!" , Toast.LENGTH_SHORT).show()
        }

        val btnAlert :Button = findViewById(R.id.btnAlert)
        btnAlert.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Halo Ini Alert Box")
            builder.setMessage("Tutup dengan Ok")
            builder.setPositiveButton("OK"){
                dialog, _ -> dialog.dismiss()
            }
            builder.show()
        }



    }
}