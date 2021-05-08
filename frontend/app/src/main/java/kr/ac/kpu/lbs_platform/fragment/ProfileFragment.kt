package kr.ac.kpu.lbs_platform.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import kr.ac.kpu.lbs_platform.R
import kr.ac.kpu.lbs_platform.global.FragmentChanger

class ProfileFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val inflated = inflater.inflate(R.layout.fragment_profile, container, false)
        val routesRadioButton = inflated.findViewById<RadioButton>(R.id.routesRadioButton)
        val placesRadioButton = inflated.findViewById<RadioButton>(R.id.placesRadioButton)


        routesRadioButton.setOnClickListener {
            routesRadioButton.isChecked = true
            placesRadioButton.isChecked = false
            FragmentChanger.change(this, DocumentFragment(), R.id.profileFragment)
        }
        placesRadioButton.setOnClickListener {
            placesRadioButton.isChecked = true
            routesRadioButton.isChecked = false
            FragmentChanger.change(this, PlaceFragment(), R.id.profileFragment)
        }
        routesRadioButton.performClick()

        // Inflate the layout for this fragment
        return inflated
    }

}