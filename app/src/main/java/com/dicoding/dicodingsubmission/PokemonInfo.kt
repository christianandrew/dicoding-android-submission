package com.dicoding.dicodingsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PokemonInfo : AppCompatActivity() {
    companion object {
        const val POKEMON = "pokemon"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_info)

        var pokemonPhoto: ImageView = findViewById(R.id.img_item_photo)
        var pokemonName: TextView = findViewById(R.id.tv_set_name)
        var pokemonRate: TextView = findViewById(R.id.tv_item_rate)
        var pokemonDetail: TextView = findViewById(R.id.textView)

        val pokemon:Pokemon = intent.getParcelableExtra<Pokemon>(POKEMON)!!
        pokemonPhoto.setImageResource(pokemon.photo)
        pokemonName.text = pokemon.name
        pokemonRate.text = pokemon.rating.toString()
        pokemonDetail.text = pokemon.desc


    }
}