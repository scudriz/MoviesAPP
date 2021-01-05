package com.cudriz.moviesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.cudriz.moviesapp.databinding.FragmentMoviesBinding

class MoviesFragment : Fragment(R.layout.fragment_movies) {

    private var fragmentMoviesBinding: FragmentMoviesBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentMoviesBinding.bind(view)
        fragmentMoviesBinding = binding
    }

    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        fragmentMoviesBinding = null
        super.onDestroyView()
    }

}