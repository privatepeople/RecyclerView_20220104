package com.nepplus.recyclerview_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.recyclerview_20220104.adapters.StudentAdapter
import com.nepplus.recyclerview_20220104.models.Student

class MainActivity : AppCompatActivity() {

//      여러 학생을 담아줄 그릇으로 사용할 변수 생성    
    val mStudentList = ArrayList<Student>()

//      학생데이터들을 -> 리싸이클러뷰에 뿌려주는 어댑터 변수 생성
//      어댑터 : 어느 화면? 정보 넣어야함 => OnCreate에서 대입해야함
//      변수는 미리 -> 대입은 나중에 (lateinit)
    lateinit var mAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
//          임시방편 : 코드에 직접 타이핑해서 학생 목록 추가

        mStudentList.add(Student("조경진", 1988, "서울시 동대문구"))
        mStudentList.add(Student("이승훈", 1994, "서울시 구로구"))
        mStudentList.add(Student("김범준", 1995, "서울시 성북구"))
        mStudentList.add(Student("김현희", 1995, "서울시 구로구"))
        mStudentList.add(Student("조은형", 1991, "서울시 중랑구"))
        
//          화면이 완성디ㅗ고 난 후에, 어댑터 객체 대입
        mAdapter = StudentAdapter(this, mStudentList)
        
    }
}