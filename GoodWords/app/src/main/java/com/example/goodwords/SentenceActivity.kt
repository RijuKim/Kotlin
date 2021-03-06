package com.example.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("너무 소심하고 까다롭게 자신의 행동을 고민하지 말라 . 모든 인생은 실험이다 . 더많이 실험할수록 더나아진다")
        sentenceList.add("한번의 실패와 영원한 실패를 혼동하지 마라")
        sentenceList.add(" 1퍼센트의 가능성, 그것이 나의 길이다")
        sentenceList.add("꿈을 계속 간직하고 있으면 반드시 실현할 때가 온다")
        sentenceList.add("화가 날 때는 100까지 세라. 최악일 때는 욕설을 퍼부어라.")
        sentenceList.add("그대의 하루 하루를 그대의 마지막 날이라고 생각하라")
        sentenceList.add("작은 기회로 부터 종종 위대한 업적이 시작된다")
        sentenceList.add("한 번 실패와 영원한 실패를 혼동하지 마라.")


        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter
    }
}