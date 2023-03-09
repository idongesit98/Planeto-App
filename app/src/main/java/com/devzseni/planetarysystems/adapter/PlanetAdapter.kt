package com.devzseni.planetarysystems.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.devzseni.planetarysystems.PlanetData
import com.devzseni.planetarysystems.R
import com.devzseni.planetarysystems.databinding.ViewPlanetBinding
import com.devzseni.planetarysystems.fragments.RvFragmentDirections

class PlanetAdapter(
    var planet:List<PlanetData>
): RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>(){

    inner class PlanetViewHolder(val binding: ViewPlanetBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        return PlanetViewHolder(
            ViewPlanetBinding.inflate(LayoutInflater.from(parent.context),
            parent,false)
        )
    }
    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        var dummyImage = 0
        holder.itemView.setOnClickListener {
            val action = RvFragmentDirections.actionRvFragmentToPlanetDetailFragment(planet[position])
            it.findNavController().navigate(action)

        }
        holder.binding.title.text = planet[position].title
        holder.binding.galaxy.text = planet[position].galaxy
        holder.binding.distance.text = planet[position].distance + "m km"
        holder.binding.gravity.text = planet[position].gravity + "m/ss"

        when (planet[position].title!!.lowercase()){
            "mercury" ->{
                dummyImage = R.drawable.mercury
            }

            "venus" ->{
                dummyImage = R.drawable.venus
            }

            "earth" -> {
                dummyImage = R.drawable.earth
            }

            "jupiter" -> {
                dummyImage = R.drawable.jupiter
            }

            "saturn" ->{
                dummyImage = R.drawable.astronomy
            }

            "uranus" ->{
                dummyImage = R.drawable.uranus
            }

            "neptune" ->{
                dummyImage = R.drawable.neptune
            }

            "pluto" ->{
                dummyImage = R.drawable.pluto
            }

            "sun" ->{
                dummyImage = R.drawable.sun
            }

            "moon" ->{
                dummyImage = R.drawable.half_moon
            }

            "mars" ->{
                dummyImage = R.drawable.mars
            }

        }
        holder.binding.planetImg.setImageResource(dummyImage)

    }

    override fun getItemCount(): Int {
        return planet.size
    }
}

