package com.fares.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var list= ArrayList<String>()

        list.add("Buttons")
        list.add("Intent")
        list.add("Toast")
        list.add("lists")
        list.add("menu")
        list.add("Edit text")
        list.add("text view")
        var adp= ArrayAdapter(this,android.R.layout.simple_list_item_1,list)
        Home_list.adapter=adp

        Home_list.setOnItemClickListener{

                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->

            when (position){
                0-> intent=Intent(this,buttonsAct::class.java)
                1-> intent=Intent(this,IntentAct::class.java)
                2->intent=Intent(this,ToastAct::class.java)
                3->intent=Intent(this,MainActivity::class.java)
                4->intent=Intent(this,IntentAct::class.java)
                5->intent=Intent(this,EditTextAct::class.java)
                6->intent=Intent(this,TextViewAct::class.java)
            }

            startActivity(intent)
        }

    }}
