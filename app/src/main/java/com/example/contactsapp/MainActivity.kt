package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.contactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcvNavHostFragment) as NavHostFragment

        val navController = navHostFragment.navController
        navController.navigate(R.id.navigateToRecentsFragment)

        binding.btnRecents.setOnClickListener {
            navController.popBackStack()
            navController.navigate(R.id.navigateToRecentsFragment)
        }

        binding.btnContacts.setOnClickListener {
            navController.popBackStack()
            navController.navigate(R.id.navigateToContactsFragment)
        }
    }
}