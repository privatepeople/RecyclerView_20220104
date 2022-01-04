package com.nepplus.recyclerview_20220104.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.nepplus.recyclerview_20220104.models.Student

// 학생 한 명 데이터 + 학생 한 명 xml 조합 => 위치에 맞게 보내주는 역할
// 안드로이드에서 기초 작업을 제공 => 상속을 받아서 일부 수정

class StudentAdapter : RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

//      StudentAdapter 클래스 안에서, 내부 전용 클래스 추가 생성.
    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {

    }

}