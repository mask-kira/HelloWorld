package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 文本输入框
        val editText = findViewById<EditText>(R.id.edit_text)
        // 确认按钮
        val confirmButton = findViewById<Button>(R.id.confirm_button)
        // 为确认按钮绑定监听事件
        confirmButton.setOnClickListener {
            // 获取文本输入框的内容
            val text = editText.text.toString()
            // 弹出提示，提示内容为文本输入框的内容
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}