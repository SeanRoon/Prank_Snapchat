package com.example.pranksnapchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pranksnapchat.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val snaps = listOf<Snap>(
        Snap("1", 12, R.drawable.snap_bitmoji_one, false),
        Snap("2", 34, R.drawable.bitmoji_two_1, false),
        Snap("3", 120, R.drawable.bitmoji_three, false)
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root
        val myAdapter = SnapAdapter(snaps)
        binding.recyclerView.adapter = myAdapter
        return rootView
    }
}