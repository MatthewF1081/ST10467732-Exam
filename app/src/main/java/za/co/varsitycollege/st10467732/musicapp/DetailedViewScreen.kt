package za.co.varsitycollege.st10467732.musicapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedViewScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)
        //Initialising the buttons on the second screen
        val songInfoButton = findViewById<Button>(R.id.songInfoButton)
        val homeScreenButton = findViewById<Button>(R.id.homeScreenButton)
        val averageRatingButton = findViewById<Button>(R.id.averageRatingButton)
        val averageRatingTextView = findViewById<TextView>(R.id.averageRatingTextView)
        val musicInfoTextView = findViewById<TextView>(R.id.musicInfoTextView)


        val songs = intent.getStringArrayExtra("songs") ?: arrayOf()
        val artist = intent.getStringArrayExtra("artist") ?: arrayOf()
        val ratings = intent.getIntArrayExtra("ratings") ?: arrayOf(4, 1, 2, 3)
        val comments = intent.getStringArrayExtra("comments") ?: arrayOf()

        fun calculateAverageRating(averageRatingTextView: TextView) {
            var minTotal = 1
            var maxTotal = 4
        }




        musicInfoTextView.text = ""

        //return back to previous screen
        homeScreenButton.setOnClickListener{
        finish()
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}