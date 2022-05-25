package dev.nyakuar.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity() {
    lateinit var btnfour: Button
    lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        btnfour = findViewById(R.id.btnfour)
        btnfour.setOnClickListener {
            val intent = Intent(this, FourActivity ::class.java )
            startActivity(intent)
    }
        button2 = findViewById(R.id .button2)
        button2.setOnClickListener{
            val intent = Intent (this,thirdActivity::class.java )
            startActivity(intent)
        }
}
}