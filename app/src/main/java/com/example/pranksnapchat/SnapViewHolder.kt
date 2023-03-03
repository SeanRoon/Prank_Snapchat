package com.example.pranksnapchat


import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.pranksnapchat.databinding.ListItemLayoutBinding

class SnapViewHolder (val binding: ListItemLayoutBinding):
    RecyclerView.ViewHolder(binding.root) {

    private lateinit var currentSnap: Snap

    init {
        binding.root.setOnClickListener {
            currentSnap.opened = true
            setSnapStatus()
            val action = R.id.action_mainFragment_to_prankSnapFragment
            binding.root.findNavController().navigate(action)
        }
    }

    fun bindSnap(snap: Snap){
        currentSnap = snap
        binding.username.text = currentSnap.username
        binding.time.text = "${currentSnap.time.toString() + "m"}"
        binding.bitmoji.setImageResource(currentSnap.profilePictureResourceID)
        setSnapStatus()
    }
    fun setSnapStatus(){
        binding.statusText.text = currentSnap.snapStatus
        binding.statusIcon.setImageResource(currentSnap.iconResourceID)
        binding.statusText.setTextColor(currentSnap.snapStatusColor)
    }
}