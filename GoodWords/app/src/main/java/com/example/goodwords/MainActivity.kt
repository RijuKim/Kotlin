package com.example.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("너무 소심하고 까다롭게 자신의 행동을 고민하지 말라 . 모든 인생은 실험이다 . 더많이 실험할수록 더나아진다")
        sentenceList.add("한번의 실패와 영원한 실패를 혼동하지 마라")
        sentenceList.add(" 1퍼센트의 가능성, 그것이 나의 길이다")
        sentenceList.add("꿈을 계속 간직하고 있으면 반드시 실현할 때가 온다")
        sentenceList.add("화가 날 때는 100까지 세라. 최악일 때는 욕설을 퍼부어라.")
        sentenceList.add("그대의 하루 하루를 그대의 마지막 날이라고 생각하라")
        sentenceList.add("작은 기회로 부터 종종 위대한 업적이 시작된다")
        sentenceList.add("한 번 실패와 영원한 실패를 혼동하지 마라.")

        Log.d("MainActivity", sentenceList.random())

        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener{

            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())

    }
}