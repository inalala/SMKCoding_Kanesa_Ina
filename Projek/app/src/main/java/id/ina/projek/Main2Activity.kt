package com.example.projek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import id.ina.projek.Adapter.MyFriendAdapter
import id.ina.projek.R
import id.ina.projek.model.MyFriend
import kotlinx.android.synthetic.main.activity_main2.*


class Main2Activity : AppCompatActivity() {

    var data: MutableList<MyFriend> = ArrayList()
    var adapter: MyFriendAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        generateDataDummy()
        adapter = MyFriendAdapter(this)
        adapter?.data = data
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
    fun generateDataDummy(){
        var MyFriendObj = MyFriend(
            "INA NUR LAILATUL",
            "P",
            "inalala05@gmail.com",
            "082223521935",
            "MALANG")

        data.add(MyFriendObj)

    }
}