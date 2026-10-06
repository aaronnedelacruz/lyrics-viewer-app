package com.example.lyricsviewerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSong1.setOnClickListener(){
            val firstSongLyrics = "[Verse 1]\n" +
                "I didn't think you'd understand me\n" +
                "How could you ever even try?\n" +
                "I don't wanna tiptoe, but I don't wanna hide\n" +
                "But I don't wanna feed this monstrous fire\n" +
                "Just wanna let this story die\n" +
                "And I'll be alright\n" +
                "\n" +
                "[Chorus]\n" +
                "We can't be friends\n" +
                "But I'd like to just pretend\n" +
                "You cling to your papers and pens\n" +
                "Wait until you like me again\n" +
                "\n" +
                "[Post-Chorus]\n" +
                "Wait for your love\n" +
                "Lo-love, I'll wait for your love\n" +
                "\n" +
                "[Verse 2]\n" +
                "Me and my truth, we sit in silence\n" +
                "Mm\n" +
                "Baby girl, it's just me and you\n" +
                "'Cause I don't wanna argue, but I don't wanna bite\n" +
                "My tongue, yeah, I think I'd rather die\n" +
                "You got me misunderstood\n" +
                "But at least I look this good\n" +
                "\n" +
                "[Chorus]\n" +
                "We can't be friends\n" +
                "But I'd like to just pretend\n" +
                "You cling to your papers and pens\n" +
                "Wait until you like me again\n" +
                "\n" +
                "[Post-Chorus]\n" +
                "Wait for your love\n" +
                "Lo-love, I'll wait for your love\n" +
                "I'll wait for your love\n" +
                "Lo-love, I'll wait for your love\n" +
                "\n" +
                "[Bridge]\n" +
                "Know that you made me\n" +
                "I don't like how you paint me, yet I'm still here hanging\n" +
                "Not what you made me\n" +
                "It's somethin' like a daydream\n" +
                "But I feel so seen in the night\n" +
                "So for now, it's only me\n" +
                "And maybe that's all I need\n" +
                "\n" +
                "[Chorus]\n" +
                "We can't be friends\n" +
                "But I'd like to just pretend\n" +
                "You cling to your papers and pens\n" +
                "Wait until you like me again\n" +
                "\n" +
                "[Post-Chorus]\n" +
                "Wait for your love\n" +
                "Lo-love, I'll wait for your love\n" +
                "I'll wait for your love\n" +
                "Lo-love, I'll wait for your love\n" +
                "\n" +
                "[Outro]\n" +
                "I'll wait for your love\n" +
                "I'll wait for your love\n" +
                "I'll wait for your love\n" +
                "I'll wait for your love\n" +
                "I'll wait for your love\n"

            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("firstSong", firstSongLyrics)
            startActivity(intent)

        }
        binding.btnSong2.setOnClickListener(){
            val secondSongLyrics = "[Verse 1]\n" +
                    "It's been a long time\n" +
                    "And seeing the shape of your name\n" +
                    "Still spells out pain\n" +
                    "It wasn't right\n" +
                    "The way it all went down\n" +
                    "Looks like you know that now\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "Yes, I got your letter\n" +
                    "Yes, I'm doing better\n" +
                    "It cut deep to know ya, right to the bone\n" +
                    "Yes, I got your letter\n" +
                    "Yes, I'm doing better\n" +
                    "I know that it's over, I don't need your\n" +
                    "Closure, your closure\n" +
                    "\n" +
                    "[Verse 2]\n" +
                    "Don't treat me like\n" +
                    "Some situation that needs to be handled\n" +
                    "I'm fine with my spite\n" +
                    "And my tears and my beers and my candles\n" +
                    "I can feel you smoothing me over\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "Yes, I got your letter\n" +
                    "Yes, I'm doing bettеr\n" +
                    "It cut deep to know ya, right to the bone\n" +
                    "Yes, I got your lеtter\n" +
                    "Yes, I'm doing better\n" +
                    "I know that it's over, I don't need your\n" +
                    "Closure, your closure\n" +
                    "Your closure, your closure\n" +
                    "\n" +
                    "[Bridge]\n" +
                    "I know I'm just a wrinkle in your new life\n" +
                    "Staying friends would iron it out so nice\n" +
                    "Guilty, guilty, reaching out across the sea\n" +
                    "That you put between you and me\n" +
                    "But it's fake and it's oh-so unnecessary\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "Yes, I got your letter\n" +
                    "Yes, I'm doing better\n" +
                    "It cut deep to know ya, right to the bone\n" +
                    "Yes, I got your letter\n" +
                    "Yes, I'm doing better\n" +
                    "I know that it's over, I don't need your\n" +
                    "Closure, closure, your closure\n" +
                    "Your closure\n"

            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("secondSong", secondSongLyrics)
            startActivity(intent)
        }
        binding.btnSong3.setOnClickListener(){
            val thirdSongLyrics = "[Verse 1]\n" +
                    "I took the supermarket flowers from the windowsill\n" +
                    "I threw the day old tea from the cup\n" +
                    "Packed up the photo album Matthew had made\n" +
                    "Memories of a life that's been loved\n" +
                    "Took the get well soon cards and stuffed animals\n" +
                    "Poured the old ginger beer down the sink\n" +
                    "Dad always told me, \"Don't you cry when you're down\"\n" +
                    "But mum, there's a tear every time that I blink\n" +
                    "\n" +
                    "[Pre-Chorus]\n" +
                    "Oh, I'm in pieces, it's tearing me up, but I know\n" +
                    "A heart that's broke is a heart that's been loved\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "So I'll sing Hallelujah\n" +
                    "You were an angel in the shape of my mum\n" +
                    "When I fell down, you'd be there holding me up\n" +
                    "Spread your wings as you go\n" +
                    "When God takes you back\n" +
                    "He'll say, \"Hallelujah, you're home\"\n" +
                    "\n" +
                    "[Verse 2]\n" +
                    "I fluffed the pillows, made the beds, stacked the chairs up\n" +
                    "Folded your nightgowns neatly in a case\n" +
                    "John says he'd drive then put his hand on my cheek\n" +
                    "And wiped a tear from the side of my face\n" +
                    "[Pre-Chorus]\n" +
                    "And I hope that I see the world as you did 'cause I know\n" +
                    "A life with love is a life that's been lived\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "So I'll sing Hallelujah\n" +
                    "You were an angel in the shape of my mum\n" +
                    "When I fell down, you'd be there holding me up\n" +
                    "Spread your wings as you go\n" +
                    "When God takes you back\n" +
                    "He'll say, \"Hallelujah, you're home\"\n" +
                    "\n" +
                    "[Bridge]\n" +
                    "(Ooh)\n" +
                    "(Ooh)\n" +
                    "(Ooh)\n" +
                    "(Ooh)\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "Hallelujah\n" +
                    "You were an angel in the shape of my mum\n" +
                    "You got to see the person I have become\n" +
                    "Spread your wings and I know\n" +
                    "That when God took you back\n" +
                    "He said, \"Hallelujah, you're home\"\n"

            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra("thirdSong", thirdSongLyrics)
            startActivity(intent)
        }
        binding.btnSong4.setOnClickListener(){
            val fourthSongLyrics = "[Verse 1]\n" +
                    "Moved out to a new city\n" +
                    "June is dawning down on me\n" +
                    "And all that I can find's\n" +
                    "\n" +
                    "A sickly romance in the air\n" +
                    "Lovers stroll without a care in sight\n" +
                    "Oh this can’t be right\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "'Cause the sun's engaged to the sky\n" +
                    "And my best friends found a new guy\n" +
                    "I’m only getting older\n" +
                    "I've never had a shoulder to cry on\n" +
                    "Someone to call mine\n" +
                    "Everybody's falling in love\n" +
                    "And I'm falling behind\n" +
                    "\n" +
                    "[Verse 2]\n" +
                    "Touched the ocean fell right in\n" +
                    "Stepped outside and burned my skin\n" +
                    "My life won't go my way\n" +
                    "Bossa nova in my room\n" +
                    "Hoped that I'll find someone too\n" +
                    "To love, bеcause\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "The sun's engagеd to the sky\n" +
                    "And my best friends found a new guy\n" +
                    "I'm only getting older\n" +
                    "I’ve never had a shoulder to cry on\n" +
                    "Someone to call mine\n" +
                    "Everybody’s falling in love\n" +
                    "And I'm falling behind\n" +
                    "\n" +
                    "[Post-Chorus]\n" +
                    "Everybody’s falling in love\n" +
                    "Everybody's falling in love\n" +
                    "Everybody's falling in love but me\n"

            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra("fourthSong", fourthSongLyrics)
            startActivity(intent)
        }
        binding.btnSong5.setOnClickListener(){
            val fifthSongLyrics = "[Verse 1]\n" +
                    "You always wanted to see the moonlight\n" +
                    "And I, I just wanted to see your smile\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "There is a light not far away from us, from us\n" +
                    "The light will shine with the clouds\n" +
                    "We're gonna fly up into the blue sky\n" +
                    "So slowly\n" +
                    "And we held the moon in our arms\n" +
                    "You always had me\n" +
                    "You're always shining\n" +
                    "\n" +
                    "[Verse 2]\n" +
                    "I've seen a wonderful sight\n" +
                    "With a bright glow\n" +
                    "You are my sea, you are my sunshine\n" +
                    "The star, the moon\n" +
                    "\n" +
                    "[Chorus]\n" +
                    "There is a light not far away from us, from us\n" +
                    "The light will shine with the clouds\n" +
                    "We're gonna fly up into the blue sky\n" +
                    "So slowly\n" +
                    "And we held the moon in our arms\n" +
                    "You always had me\n" +
                    "You're always shining\n"

            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra("fifthSong", fifthSongLyrics)
            startActivity(intent)
        }
    }
}