package com.example.smart_health

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smart_health.databinding.FragmentLogginBinding

class LogginFragment : Fragment() {

    private var _binding: FragmentLogginBinding? = null
    private val  binding: FragmentLogginBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLogginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        binding.botonIngresar.setOnClickListener {
            if (!binding.spaceEmail.text.toString().isValidEmail()) {
                binding.logginEmailLayout.error = getString(R.string.invalid_email)
            } else {
                binding.logginEmailLayout.error = null
            }
            if (!binding.spacePassword.text.toString().isValidPassword()) {
                binding.logginPaswordLayout.error = getString(R.string.invalid_password)
            } else {
                binding.logginPaswordLayout.error = null
            }

        }


    }

}