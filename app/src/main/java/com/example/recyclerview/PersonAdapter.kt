package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemPersonBinding

class PersonAdapter(val items: List<Person>) //생성자 추가
    : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() { //상속

    // inner class 정의       //data binding함으로써 item_person에서 생성된 ItemPersonBiding 객체를 받음
    class PersonViewHolder(val binding: ItemPersonBinding): RecyclerView.ViewHolder(binding.root){

    }

    // 뷰홀더 객체생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_person, parent, false) //item_xml 모양을 하는 뷰 홀더를 생성
        val viewHolder = PersonViewHolder(ItemPersonBinding.bind(view))

        return viewHolder
       // return PersonViewHolder(ItemPersonBinding.bind(view)) //위와 같음
    }

    // 데이터를 뷰홀더에 바인딩
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.binding.person = items[position]
        // 홀더에 있는 biding객체에서 data binding할떄 만들어줬던 그 변수인가
    }

    //전체 아이템 갯수 리턴
    override fun getItemCount(): Int = items.size // 한줄일 시 { } 생략가능


}