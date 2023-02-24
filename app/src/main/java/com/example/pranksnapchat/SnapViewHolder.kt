package com.example.pranksnapchat

import androidx.recyclerview.widget.RecyclerView
import com.example.pranksnapchat.databinding.ListItemLayoutBinding

class SnapViewHolder (val binding: ListItemLayoutBinding):
    RecyclerView.ViewHolder(binding.root) {

    private lateinit var currentSnap: Snap

    init {
        binding.root.setOnClickListener { view ->
            currentSnap.opened = true
            setSnapStatus()
//            add navigation to PrankSnapFragment
        }
    }

    fun bindSnap(snap: Snap){
        currentSnap = snap
        binding.username.text = currentSnap.username
        binding.time.text = currentSnap.time.toString()
        binding.bitmoji.setImageResource(currentSnap.profilePictureResourceID)
        setSnapStatus()
    }
    fun setSnapStatus(){
        binding.statusText.text = currentSnap.snapStatus
        binding.statusIcon.setImageResource(currentSnap.iconResourceID)
        binding.statusText.setTextColor(currentSnap.snapStatusColor)
    }
}