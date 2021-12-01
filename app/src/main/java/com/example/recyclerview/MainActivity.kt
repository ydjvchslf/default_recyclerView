package com.example.recyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemPersonBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data 여러개 세팅
        val people = arrayListOf<Person>()
        for (i in 0..30){
            people.add(Person("홍길동 $i", i))
        }

        //activity_main과 어댑터로 리사이클러뷰 연결 //일반 코드로는 어케연결하지?
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = PersonAdapter(people)
        }

    }

}