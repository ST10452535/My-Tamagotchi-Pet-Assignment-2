package com.example.mytamagotchipet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.concurrent.timer

class PlayWindow : AppCompatActivity() {

    //Background from https://www.canva.com/design/DAGDJAWwXtw/HCZkCNeoHm0-VfqN-frQkw/edit?utm_content=DAGDJAWwXtw&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton
    //retrieved on 26 April 2024

    private lateinit var dogImageView: ImageView
    private lateinit var btnFeed: Button
    private lateinit var btnClean: Button
    private lateinit var btnPlay: Button
    private lateinit var txtHunger: TextView
    private lateinit var txtCleanliness: TextView
    private lateinit var txtHealth: TextView

    private val doggyArray = arrayOf(R.drawable.homepage, R.drawable.feed, R.drawable.clean__1_, R.drawable.play  //(Bradley St John Jones, 2014)
        )

    private val initialImage = 0  // intial image in array is index 0

    private var hunger = 0  //initialize status of hunger to 0
    private var cleanliness = 0  //initialize status of cleanliness to 0
    private var health = 0  //initialize status of health to 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_window)

        dogImageView = findViewById<ImageView>(R.id.dogImageView)
        btnFeed = findViewById<Button>(R.id.btnFeed)
        btnClean = findViewById<Button>(R.id.btnClean)
        btnPlay = findViewById<Button>(R.id.btnPlay)
        txtHunger = findViewById<TextView>(R.id.txtHunger)
        txtCleanliness = findViewById<TextView>(R.id.txtCleanliness)
        txtHealth = findViewById<TextView>(R.id.txtHealth)

        dogImageView.setImageResource(doggyArray[initialImage])  //(OpenAI, 2024)

        btnFeed.setOnClickListener {
            imageDisplay_doggy(1)
            feed()
        }

        btnClean.setOnClickListener {
            imageDisplay_doggy(2)
            cleanliness()
        }

        btnPlay.setOnClickListener {
            imageDisplay_doggy(3)
            health()
        }

        timer(period = 60000){  //(OpenAI, 2024)
            decreaseByTime()
        }
    }
    private fun imageDisplay_doggy(index: Int) {  //(OpenAI, 2024)
        if (index in doggyArray.indices)  //(OpenAI, 2024)
        {
        dogImageView.setImageResource(doggyArray[index])  //(OpenAI, 2024)
        }
    }

    private fun feed() {
        if (hunger < 100)
        {
            hunger += 5   //(The Shiva, 2018)
            txtHunger.text = hunger.toString()
        }
        else
        {
            txtHunger.text = "I am full"
        }
    }

    private fun cleanliness(){
        if (cleanliness < 100)
        {
            cleanliness += 5  //(The Shiva, 2018)
            txtCleanliness.text = cleanliness.toString()
        }
        else
        {
            txtCleanliness.text = "I am clean"
        }
    }

    private fun health(){
        if (health < 100)
        {
            health += 5  //(The Shiva, 2018)
            txtHealth.text = health.toString()
        }
        else
        {
            txtHealth.text = "I am happy"
        }
    }
    private fun decreaseByTime() {
        hunger -= 5
        cleanliness -= 5
        health -= 5

        txtHunger.text = hunger.coerceAtLeast(0).toString()  //(OpenAI, 2024)
        txtCleanliness.text = cleanliness.coerceAtLeast(0).toString()  //(OpenAI, 2024)
        txtHealth.text = health.coerceAtLeast(0).toString()  //(OpenAI, 2024)
    }
}
//Reference List:
/* Bradley St John Jones. 2014. How would I make an Image Array?, Kotlin. [Online] .
Available at: https://teamtreehouse.com/community/how-would-i-make-an-image-array
[Accessed 27 April 2024]*/
/* OpenAI. 2024. Chat-GPT (Version 3.5). [Large language model] .
Available at: https://chat.openai.com/
[Accessed 27 April 2024]*/
/* The Shiva. 2018. What to do to increment by 2 instead of 1?, Java. [Online] .
Available at: https://www.sololearn.com/en/Discuss/1492044/what-to-do-to-increment-by-2-instead-of-1-
[Accessed 27 April 2024]*/
// Canva. 2024. IMAD Doggies, 26 April 2024. [Online]. Available at: https://www.canva.com/design/DAGDJjED6fc/xIH7UgC3TPpRkOyPePwvfg/edit?utm_content=DAGDJjED6fc&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton [Accessed 27 April 2024].
