package com.fares.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var list= ArrayList<String>()//i made a an array looks like a list to conant the elements

//mutableListOf<String>("fares","karam","kamel","melhem")//another type of a list
//var listTool=findViewById<ListView>(R.id.main_list)//to find the list if program doesn't find it

       list.add("fares")//adding elements
        list.add("basics")
        list.add("Kotlin")

        btn_put.setOnClickListener {      // list.add(x.toString())
        }

        var adp=ArrayAdapter(this,android.R.layout.simple_list_item_1,list)//define this adapter to connect kotlin list with xml list


   //listTool.adapter=adp
        main_list.adapter=adp//connecting the xml list with the adapter (which already connected to the kotlin list)

        main_list.setOnItemClickListener{//*****be careful for this code ******//for action on clicking on items

            parent: AdapterView<*>?, view: View?, position: Int, id: Long ->// a ready code to do actions when click on list items

            tv_1.setText(list[position])

        }


        btn_put.setOnClickListener {//for add new items to the list thru the xml button

            var x=et_text.text

            if (x.isEmpty()){
                Toast.makeText(this,"No text to add",Toast.LENGTH_SHORT).show()
            }else list.add(x.toString())


            adp.notifyDataSetChanged()//******This code is very important, it refreshes the adapter to refresh the xml list
        }


        Btn_Lists_Remove.setOnClickListener {//to remove items from the list

            if (!list.isEmpty())
            list.removeAt(list.lastIndex)
            else Toast.makeText(this,"List is Empty" ,Toast.LENGTH_SHORT).show()

            adp.notifyDataSetChanged()
        }
    }
}

/*Comments
* we need adapter to connect the list with the xml listView
*
* we use find element by id if there are a lot of items
*
* */