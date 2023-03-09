package com.devzseni.planetarysystems.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.devzseni.planetarysystems.SetData
import com.devzseni.planetarysystems.adapter.PlanetAdapter
import com.devzseni.planetarysystems.databinding.FragmentRvBinding


/**
 * A simple [Fragment] subclass.
 * Use the [RvFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RvFragment : Fragment() {
    lateinit var binding: FragmentRvBinding
    var listData = SetData.setPlanet()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRvBinding.inflate(layoutInflater,container, false)
        Log.d("Data",listData.toString())

        val layoutManager = LinearLayoutManager(requireContext())
        binding.planetRv.layoutManager = layoutManager
        binding.planetRv.adapter = PlanetAdapter(listData)

        return binding.root

    }

}