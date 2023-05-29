package com.example.app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app.databinding.ItemMusicBinding
import com.example.app.models.Music

class MusicAdapter(
    val navigateToPlayerListener: () -> Unit,
)    : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    private val musicList = mutableListOf<Music>()

    fun updateList(newMusicList: List<Music>) {
        musicList.clear()
        musicList.addAll(newMusicList)
        notifyDataSetChanged()
    }

    inner class MusicViewHolder(
        private val binding: ItemMusicBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindMusic(music: Music){
            binding.titleTextView.text = music.title
            binding.authorTextView.text = music.author

            Glide.with(binding.root.context)
                .load(music.posterUrl)
                .into(binding.posterImage)

            binding.root.setOnClickListener {
                navigateToPlayerListener()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val binding = ItemMusicBinding.bind(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_music, parent, false
            )
        )
        val viewHolder = MusicViewHolder(binding)
        return viewHolder
    }

    override fun getItemCount(): Int = musicList.size


    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bindMusic(musicList[position])
    }
}
