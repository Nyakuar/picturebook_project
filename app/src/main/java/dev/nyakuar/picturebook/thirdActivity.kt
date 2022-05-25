package dev.nyakuar.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class thirdActivity : AppCompatActivity() {
    lateinit var btnthree: Button
    lateinit var btnthree2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnthree = findViewById(R.id.btnthree)
        btnthree.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java )
            startActivity(intent)
        }
        btnthree2 = findViewById(R.id.btnthree2)
        btnthree2.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java )
            startActivity(intent)
        }
    }
}