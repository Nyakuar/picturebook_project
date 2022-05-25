package dev.nyakuar.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourActivity : AppCompatActivity() {
    lateinit var btnback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
        btnback=findViewById(R.id.btnback)
        btnback.setOnClickListener{
            val intent = Intent(this,FourthActivity::class.java )
            startActivity(intent)

        }


    }
}