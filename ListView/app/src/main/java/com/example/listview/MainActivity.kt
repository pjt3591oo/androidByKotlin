package com.example.listview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var userList = arrayListOf<User> (
        User(R.drawable.robot1, "Mung1", "28", "멍개1-안녕하세요"),
        User(R.drawable.robot2, "Mung2", "27", "멍개2-안녕하세요"),
        User(R.drawable.robot3, "Mung3", "26", "멍개3-안녕하세요"),
        User(R.drawable.robot1, "Mung4", "29", "멍개4-안녕하세요")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//         var items = arrayOf("사과", "배", "딸기", "멍개")
//
//        // context란 한 액티비티의 모든 정보를 담고있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = UserAdapter(this, userList)

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectitem = parent.getItemAtPosition(position) as User
            println(parent)
            println(view)
            println(position)
            println(id)

            Toast.makeText(this, selectitem.name, Toast.LENGTH_LONG ).show()
        }
    }
}