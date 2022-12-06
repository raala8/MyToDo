package com.example.mytodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tasks = findViewById<EditText>(R.id.task)
        val task_time = findViewById<EditText>(R.id.time_task)
        val add_task = findViewById<Button>(R.id.button)
        val add_time = findViewById<Button>(R.id.button2)
        val to_do_lists = findViewById<ListView>(R.id.to_do_list)

    }
}