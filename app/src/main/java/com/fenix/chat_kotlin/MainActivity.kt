package com.fenix.chat_kotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fenix.chat_kotlin.Fragments.FragmentChats
import com.fenix.chat_kotlin.Fragments.FragmentPerfil
import com.fenix.chat_kotlin.Fragments.FragmentUsuarios
import com.fenix.chat_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Fragmento default ...
        verFragmentoPerfil()

        binding.bottomV.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.item_perfil -> {
                    verFragmentoPerfil()
                    true
                }
                R.id.item_usuarios -> {
                    verFragmentoUsuarios()
                    true
                }
                R.id.item_chats -> {
                    verFragmentoChats()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun verFragmentoPerfil(){
        binding.tvTitulo.text = "Perfil"

        val fragment = FragmentPerfil()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentoFL.id, fragment, "Fragment Perfil")
        fragmentTransaction.commit()
    }

    private fun verFragmentoUsuarios(){
        binding.tvTitulo.text = "Usuarios"

        val fragment = FragmentUsuarios()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentoFL.id, fragment, "Fragment Usuarios")
        fragmentTransaction.commit()
    }

    private fun verFragmentoChats(){
        binding.tvTitulo.text = "Perfil"

        val fragment = FragmentChats()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentoFL.id, fragment, "Fragment Chats")
        fragmentTransaction.commit()
    }
}

















