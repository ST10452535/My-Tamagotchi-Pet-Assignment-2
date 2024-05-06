package com.example.mytamagotchipet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //Background from https://www.canva.com/design/DAGDJAWwXtw/HCZkCNeoHm0-VfqN-frQkw/edit?utm_content=DAGDJAWwXtw&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton
    //retrieved on 26 April 2024

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlay = findViewById<Button>(R.id.btnPlay)

        btnPlay.setOnClickListener {
            val intent = Intent(this, PlayWindow::class.java)  //(IIE, 2024)
            startActivity(intent)  //(IIE, 2024)
        }
    }
}
//Reference List:
//IIE. 2024. Introduction to Mobile Application Development. Pretoria. IIE
//Teddy. 2024. Light pink paper texture background, design space. [Online]. Available at: https://www.rawpixel.com/image/3933832/light-pink-paper-texture-background-design-space [Accessed 26 April 2024].
//Patchakorn Phom-in. 2019. Cute background Abstract Color Pastel Dot shape Pattern. [Online]. Available at: https://www.alamy.com/cute-background-abstract-color-pastel-dot-shape-pattern-image223863397.html [Accessed 26 April 2024].
//Lively. 2024. Cartoon dog with black spots sitting on white background generative ai. [Online]. Available at: https://www.freepik.com/premium-ai-image/cartoon-dog-with-black-spots-sitting-white-background-generative-ai_83930622.htm [Accessed 26 April 2024].
//evet. 2024. Dalmatian Dog - Cartoon Love. [Online]. Available at: https://www.cleanpng.com/png-dalmatian-dog-cruella-de-vil-the-101-dalmatians-mu-2538780/ [Accessed 26 April 2024].
//pngegg. 2024. Dalmatian dog Puppy Dog grooming Bathing Animation, bathtub, furniture, food png. [Online]. Available at: https://www.pngegg.com/en/png-ygigl [Accessed 26 April 2024].
//pngwing. 2024. Dalmatian dog The 101 Dalmatians Musical Puppy Rolly, dalmatians, white, mammal, animals png. [Online]. Available at: https://www.pngwing.com/en/free-png-npjki [Accessed 26 April 2024].
//Canva. 2024. Tamagotchi Background. 26 April 2024. [Online]. Available at: https://www.canva.com/design/DAGDJAWwXtw/HCZkCNeoHm0-VfqN-frQkw/edit?utm_content=DAGDJAWwXtw&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton [Accessed 26 April 2024].