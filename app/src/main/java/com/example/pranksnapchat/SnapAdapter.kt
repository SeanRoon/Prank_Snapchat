package com.example.pranksnapchat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pranksnapchat.databinding.ListItemLayoutBinding

class SnapAdapter(val snapList: List<Snap>) : RecyclerView.Adapter<SnapViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnapViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SnapViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SnapViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}