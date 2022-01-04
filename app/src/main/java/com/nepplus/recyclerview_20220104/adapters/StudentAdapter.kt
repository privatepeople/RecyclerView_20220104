package com.nepplus.recyclerview_20220104.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nepplus.recyclerview_20220104.models.Student

// 학생 한 명 데이터 + 학생 한 명 xml 조합 => 위치에 맞게 보내주는 역할
// 안드로이드에서 기초 작업을 제공 => 상속을 받아서 일부 수정

class StudentAdapter(
    val mContext: Context, // 어느 화면에서 이 어댑터를 쓰는가?
    val mList: List<Student>, // 어떤 학생들을 보여줄건지? 목록을 통째로 받아오자.
) : RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

//      StudentAdapter 클래스 안에서, 내부 전용 클래스 추가 생성.
    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }

}