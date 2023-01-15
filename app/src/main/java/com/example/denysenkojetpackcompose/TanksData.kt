package com.example.denysenkojetpackcompose

import androidx.lifecycle.ViewModel
import com.example.denysenkojetpackcompose.model.Tank
import kotlinx.coroutines.flow.MutableStateFlow

class TanksData : ViewModel() {
    private val _anime = MutableStateFlow<List<Tank>>(emptyList())
    val anime = _anime

    fun getById(id: String): Tank {
        return _anime.value.filter { it.id == id }.first()
    }

    init {
        _anime.value = mutableListOf(
            Tank(
                "1",
                "C1 Ariete",
                R.drawable.c1,
                1956,
                "The role of tank vs. tank combat is becoming diminished. Tanks work in concert with infantry in urban warfare by deploying them ahead of the platoon. When engaging enemy infantry, tanks can provide covering fire on the battlefield. Conversely, tanks can spearhead attacks when infantry are deployed in personnel carriers.[58]\n" +
                        "\n",
                "USA"
            ),
            Tank(
                "2",
                "XM1202 Mounted Combat System",
                R.drawable.img,
                1943,
                "Toy Story is about the 'secret life of toys' when people are not around. When Buzz Lightyear, a space-ranger, takes Woody's place as Andy's favorite toy, Woody doesn't like the situation and gets into a fight with Buzz.",
                "USA"
            ),
            Tank(
                "3",
                "M1",
                R.drawable.img_1,
                2000,
                "The three traditional factors determining a tank's capability effectiveness are its firepower, protection, and mobility.[70][71] Firepower is the ability of a tank's crew to identify, engage, and destroy enemy tanks and other targets using its large-caliber cannon. Protection is the degree to which the tank's armour, profile and camouflage enables the tank crew to evade detection, protect themselves from enemy fire, and retain vehicle functionality during and after combat.",
                "USSR"
            ),
            Tank(
                "4",
                "Leopard",
                R.drawable.img_2,
                1843,
                "Until the arrival of the main battle tank, tanks were typically categorized either by weight class (light, medium, heavy or superheavy tanks) or doctrinal purpose (breakthrough-, cavalry-, infantry-, cruiser-, or reconnaissance tanks). ",
                "Germany"
            ),
            Tank(
                "1",
                "C1 Ariete",
                R.drawable.c1,
                1956,
                "The role of tank vs. tank combat is becoming diminished. Tanks work in concert with infantry in urban warfare by deploying them ahead of the platoon. When engaging enemy infantry, tanks can provide covering fire on the battlefield. Conversely, tanks can spearhead attacks when infantry are deployed in personnel carriers.[58]\n" +
                        "\n",
                "USA"
            ),
            Tank(
                "2",
                "XM1202 Mounted Combat System",
                R.drawable.img,
                1943,
                "Toy Story is about the 'secret life of toys' when people are not around. When Buzz Lightyear, a space-ranger, takes Woody's place as Andy's favorite toy, Woody doesn't like the situation and gets into a fight with Buzz.",
                "USA"
            ),
            Tank(
                "3",
                "M1",
                R.drawable.img_1,
                2000,
                "The three traditional factors determining a tank's capability effectiveness are its firepower, protection, and mobility.[70][71] Firepower is the ability of a tank's crew to identify, engage, and destroy enemy tanks and other targets using its large-caliber cannon. Protection is the degree to which the tank's armour, profile and camouflage enables the tank crew to evade detection, protect themselves from enemy fire, and retain vehicle functionality during and after combat.",
                "USSR"
            ),
            Tank(
                "4",
                "Leopard",
                R.drawable.img_2,
                1843,
                "Until the arrival of the main battle tank, tanks were typically categorized either by weight class (light, medium, heavy or superheavy tanks) or doctrinal purpose (breakthrough-, cavalry-, infantry-, cruiser-, or reconnaissance tanks). ",
                "Germany"
            )
        )
    }
}