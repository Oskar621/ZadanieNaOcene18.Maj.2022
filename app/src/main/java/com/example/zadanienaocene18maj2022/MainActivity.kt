package com.example.zadanienaocene18maj2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nrObrazka = findViewById<TextView>(R.id.numer)
        val poprzedniButton = findViewById<Button>(R.id.poprzedni)
        val nastButton = findViewById<Button>(R.id.nastepny)
        val obrazekid = findViewById<ImageView>(R.id.Obrazki)
        var obraz = 1
        poprzedniButton.setOnClickListener {
            obraz -= 1
            when(obraz)
            {
                0 ->
                    {
                        obraz = 5
                        obrazekid.setImageResource(R.drawable.pies5)
                        nrObrazka.text = "5";
                    }
                1 -> {
                    obrazekid.setImageResource(R.drawable.pies1)
                    nrObrazka.text = "1";
                    }
                2 -> {
                    obrazekid.setImageResource(R.drawable.pies2)
                    nrObrazka.text = "2";
                }
                3 -> {
                    obrazekid.setImageResource(R.drawable.pies3)
                    nrObrazka.text = "3";
                }
                4 -> {
                    obrazekid.setImageResource(R.drawable.pies4)
                    nrObrazka.text = "4";
                }
                5 -> {
                    obrazekid.setImageResource(R.drawable.pies5)
                    nrObrazka.text = "5";
                }
                6 -> {
                    obraz = 1
                    obrazekid.setImageResource(R.drawable.pies1)
                    nrObrazka.text = "1";
                }
            }
        }
        nastButton.setOnClickListener {
            obraz += 1
            when(obraz)
            {
                0 -> {
                    obraz = 5
                    obrazekid.setImageResource(R.drawable.pies5)
                    nrObrazka.text = "5";
                }

                1 -> {
                    obrazekid.setImageResource(R.drawable.pies1)
                    nrObrazka.text = "1";
                }
                2 -> {
                    obrazekid.setImageResource(R.drawable.pies2)
                    nrObrazka.text = "2";
                }
                3 -> {
                    obrazekid.setImageResource(R.drawable.pies3)
                    nrObrazka.text = "3";
                }
                4 -> {
                    obrazekid.setImageResource(R.drawable.pies4)
                    nrObrazka.text = "4";
                }
                5 -> {
                    obrazekid.setImageResource(R.drawable.pies5)
                    nrObrazka.text = "5";
                }
                6 -> {
                    obraz = 1
                    obrazekid.setImageResource(R.drawable.pies1)
                    nrObrazka.text = "1";
                }
            }
        }
    }
}