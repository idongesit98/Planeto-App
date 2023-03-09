package com.devzseni.planetarysystems

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.devzseni.planetarysystems.databinding.FragmentPlanetDetailBinding

class PlanetDetailFragment : Fragment() {
    lateinit var binding: FragmentPlanetDetailBinding
    private val args by navArgs<PlanetDetailFragmentArgs>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

       binding = FragmentPlanetDetailBinding.inflate(
           layoutInflater, container, false
       )
        val planetDetails = args.data

        binding.titleInfo.text = planetDetails.title
        binding.distanceInfo.text = planetDetails.distance
        binding.galaxyInfo.text = planetDetails.galaxy
        binding.gravityInfo.text = planetDetails.gravity
        binding.overviewInfo.text = planetDetails.overView
       // binding.planetImgInfo.setImageResource(planetImg!!)
        return binding.root
    }






}



