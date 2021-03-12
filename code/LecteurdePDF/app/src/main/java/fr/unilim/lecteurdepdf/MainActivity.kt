package fr.unilim.lecteurdepdf

import android.os.Bundle
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var categories:Spinner
    lateinit var trie_par:Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ajouter_une_categorie)
    }
}