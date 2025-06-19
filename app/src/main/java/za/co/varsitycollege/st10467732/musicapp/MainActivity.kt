package za.co.varsitycollege.st10467732.musicapp
//ST10467732 MATTHEW FRANKLIN

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val songs = arrayOf("", "", "", "", "")
    private val artist = arrayOf("", "", "", " ", "")
    private val ratings = arrayOf(1,2,3,4,5)
    private val comments = arrayOf("leave a comment")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    //Initialising the text views and the buttons
        val songNameTextView = findViewById<TextView>(R.id.songNameTextView)
        val artistNameTextView = findViewById<TextView>(R.id.artistNameTextView)
        val songRatingTextView = findViewById<TextView>(R.id.songRatingTextView)
        val commentTextView = findViewById<TextView>(R.id.commentTextView)
        val playlistButton = findViewById<Button>(R.id.playlistButton)
        val nextPageButton = findViewById<Button>(R.id.nextPageButton)
        val exitButton = findViewById<Button>(R.id.exitButton)
        val musicAppTextView = findViewById<TextView>(R.id.musicAppTextView)

        musicAppTextView.text

        //setting up the question for the user to enter the song name.
        songNameTextView.text

        //setting up the question for the user to enter the Artist.
        artistNameTextView.text

        //setting up the question for the user to enter the rating of the song.
        songRatingTextView.text

        //setting up the question for the user to enter the comment for the song.
        commentTextView.text

        //Setting a Click button listener to the buttons
        playlistButton.setOnClickListener{
            val intent = Intent (this, DetailedViewScreen::class.java)
            intent.putExtra("songs", songs)
            intent.putExtra("artist", artist)
            intent.putExtra("ratings",ratings)
            intent.putExtra("comments",comments)
            startActivity(intent)
        }

        //Navigating the User to the second screen
        nextPageButton.setOnClickListener{
            val intent = Intent(this,DetailedViewScreen::class.java )
            startActivity(intent)
        }



        // Exiting the App
        exitButton.setOnClickListener{
            finishAffinity()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}