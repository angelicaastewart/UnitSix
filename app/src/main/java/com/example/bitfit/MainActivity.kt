package com.example.bitfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bitfit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Communicator{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Add())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){

                R.id.add -> replaceFragment(Add())
                R.id.dash -> replaceFragment(Dash())

                else -> {

                }
            }

            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }

    override fun passData(editTextData: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextData)

        val transaction = supportFragmentManager.beginTransaction()
        val fragmentDash = Dash()

        fragmentDash.arguments = bundle

        transaction.replace(R.id.frame_layout,fragmentDash).commit()
    }
}