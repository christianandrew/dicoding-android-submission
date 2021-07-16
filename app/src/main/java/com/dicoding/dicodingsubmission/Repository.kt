package com.dicoding.dicodingsubmission

object Repository {
    private val pokemonNames = listOf(
        "Pikachu", "Charmender", "Bulbasaur",
        "Squirtle", "Caterpie", "Butterfree",
        "Pidgey", "Lucario", "Hippopotas",
        "Arceus"
    )

    private val pokemonRate = listOf(
        258, 258, 273,
        221, 273, 273,
        258, 273, 369,
        1000
    )


    private val pokemonDesc = listOf(
        "Pikachu that can generate powerful electricity have cheek sacs that are extra soft and super stretchy.", "It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.", "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.",
        "When it retracts its long neck into its shell, it squirts out water with vigorous force.", "For protection, it releases a horrible stench from the antenna on its head to drive away enemies.", "In battle, it flaps its wings at great speed to release highly toxic dust into the air.",
        "Very docile. If attacked, it will often kick up sand to protect itself rather than fight back.", "It controls waves known as auras, which are powerful enough to pulverize huge rocks. It uses these waves to take down its prey.", "It moves through the sands with its mouth open, swallowing sand along with its prey. It gets rid of the sand by spouting it from its nose.",
        "According to the legends of Sinnoh, this Pokémon emerged from an egg and shaped all there is in this world."
    )

    private val pokemonPhoto = listOf(
        R.drawable.pka,
        R.drawable.pkb,
        R.drawable.pkc,
        R.drawable.pkd,
        R.drawable.pke,
        R.drawable.pkf,
        R.drawable.pkg,
        R.drawable.pkh,
        R.drawable.pki,
        R.drawable.pkj
    )
    val listData: ArrayList<Pokemon>
        get() {
            val list = arrayListOf<Pokemon>()
            for (pos in pokemonNames.indices) {
                var pokemon = Pokemon(pokemonPhoto[pos],pokemonNames[pos],pokemonRate[pos],pokemonDesc[pos])
                list.add(pokemon)
            }
            return list
        }
}