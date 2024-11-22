package za.ac.iie.menu

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backArrow: ImageView = findViewById(R.id.backArrow1)
        val searchBar: TextView = findViewById(R.id.searchFood)
        val menuBox: Button = findViewById(R.id.buttonMenu)
        val btnStarters: Button = findViewById(R.id.buttonStarters)
        val btnMains: Button = findViewById(R.id.buttonMains)
        val btnSalads: TextView = findViewById(R.id.buttonSalads)
        val imgBeefBurger: ImageView = findViewById(R.id.imgBeefBurger)
        val chickenImage: ImageView = findViewById(R.id.imageChickenBurger)
        val steakImage: ImageView = findViewById(R.id.imgBeefPetty)
        val pizzaImage: ImageView = findViewById(R.id.imgPizza)
        val exitButton: Button = findViewById(R.id.exitBtn)
        val paymentButton: Button = findViewById(R.id.payBtn)

        backArrow.setOnClickListener {
            onBackPressed()
        }

        btnStarters.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }


        btnSalads.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        paymentButton.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        exitButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }
}