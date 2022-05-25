package dev.nyakuar.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var btnnext: Button
    lateinit var btnsec:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnnext = findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
            val intent = Intent(this,thirdActivity ::class.java )
            startActivity(intent)
        }
        btnsec = findViewById(R.id.btnsec)
        btnsec.setOnClickListener{
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
