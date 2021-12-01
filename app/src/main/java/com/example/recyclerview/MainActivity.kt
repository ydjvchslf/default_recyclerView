package com.example.recyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 전역 변수로 바인딩 객체 선언
    private var mBinding: ActivityMainBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //data 여러개 세팅
        val people = arrayListOf<Person>()
        for (i in 0..30){
            people.add(Person("홍길동 $i", i))
        }

        //activity_main과 어댑터로 리사이클러뷰 연결 //훨 가독성이 좋아
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = PersonAdapter(people)
        }
        //위와 동일 일반코드
//        val personAdapter = PersonAdapter(people)
//        binding.recyclerView.adapter = personAdapter
//        binding.recyclerView.layoutManager = LinearLayoutManager(this)


    }

}