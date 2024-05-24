package com.joon.mushroom_contents

import android.content.ClipData.Item
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RVAdapter(val context : Context, val List : MutableList<ContentsModel>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    // ViewHolderが生成される
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return ViewHolder(v)
    }

    interface ItemClick
    {
        fun onClick(view: View, position: Int)
    }
    var itemClick : ItemClick? = null

    // ViewHolderへDataをBindingする、Itemが選択された時に特定のpositionのitemを探して見せる
    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {

        if(itemClick != null){
            holder?.itemView?.setOnClickListener{ v->
                itemClick!!.onClick(v, position)
            }
        }
        holder.bindItems(List[position])
    }

    // 一番最初に実行される関数、RecyclerViewより投げてあげるDataの長さをリターン
    override fun getItemCount(): Int {
        return List.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(item : ContentsModel) {
            val rv_text = itemView.findViewById<TextView>(R.id.rvTextArea)
            val rv_img = itemView.findViewById<ImageView>(R.id.rvImageArea)

            rv_text.text = item.titleText

            // contextとはapplicationの現在状態の脈絡
            Glide.with(context)
                .load(item.ImageUrl)
                .into(rv_img)
        }
    }


}