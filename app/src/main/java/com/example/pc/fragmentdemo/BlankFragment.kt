package com.example.pc.fragmentdemo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rtvw= inflater?.inflate(R.layout.fragment_blank,container,false)
        rtvw!!.findViewById<Button>(R.id.btnMouse).setOnClickListener {
            (activity as MainActivity).loadFrag(MauseFragment())
        }
        rtvw!!.findViewById<Button>(R.id.btnMoniter).setOnClickListener {
            (activity as MainActivity).loadFrag(MoniterFragment())
        }
        rtvw!!.findViewById<Button>(R.id.btnScreen).setOnClickListener {
            (activity as MainActivity).loadFrag(ScreenFragment())
        }
        return rtvw
    }

}// Required empty public constructor
