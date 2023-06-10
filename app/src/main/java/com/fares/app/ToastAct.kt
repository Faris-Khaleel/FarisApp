package com.fares.app


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast//importing toast is important


import kotlinx.android.synthetic.main.activity_toast.*


class ToastAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)


        Toast_Run1.setOnClickListener {var t= Toast.makeText(this,"Simple Toast",Toast.LENGTH_SHORT).show() }
        //we put first where we want to show the Toast ,then the text we want to preview, then Toast time to be shown

        Toast_Run2.setOnClickListener {

            val layoutInflater:LayoutInflater=layoutInflater//i don't really understand this one

            val viewLay=layoutInflater.inflate(R.layout.activity_intent,findViewById(R.id.NOW))//first one is the place where item i want to show is ,second is the item id

            var t =Toast.makeText(this,"",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.CENTER,0,0)
            t.view=viewLay//is like saying the item i want to show(which is a pic) is as view to equal the toast
            t.show()

             }

        BTN_left.setOnClickListener {var t= Toast.makeText(this,"Left",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.LEFT,0,0)
            t.show()}//if yOfset is positive then item will go down

        BTN_Top.setOnClickListener {var t= Toast.makeText(this,"Top",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.TOP,0,0)
            t.show()}//gravity is like position or something like that

        BTN_top_left.setOnClickListener {var t= Toast.makeText(this,"Top left",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.TOP or Gravity.LEFT,0,0)
            t.show()}

        BTN_Down.setOnClickListener { var t=Toast.makeText(this,"Bottom side",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.BOTTOM,0,0)
            t.show()}

        BTN_Right.setOnClickListener { var t=Toast.makeText(this,"Right side",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.RIGHT,0,0)
            t.show()}

        BTN_Center.setOnClickListener { var t=Toast.makeText(this,"Centered",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.CENTER,0,0)
            t.show()}

        BTN_top_Right.setOnClickListener { var t=Toast.makeText(this,"Top Right",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.TOP  or Gravity.LEFT,0,0)
            t.show()}

        BTN_Buttom_left.setOnClickListener { var t=Toast.makeText(this,"Bottom left",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.BOTTOM or Gravity.LEFT,0,0)
            t.show()}

        BTN_Bottom_Right.setOnClickListener { var t=Toast.makeText(this,"Bottom Right",Toast.LENGTH_SHORT)
            t.setGravity(Gravity.BOTTOM or Gravity.RIGHT,0,0)
            t.show()}

        BTN_custoum.setOnClickListener { var t=Toast.makeText(this,"Custom",Toast.LENGTH_LONG)
            t.setGravity(Gravity.CENTER or Gravity.TOP,200,600)
            t.show()}

        Toast_KT1.setOnClickListener { Toast_TV_MAin.setText(" Toast_Run1.setOnClickListener {var t= Toast.makeText(this,\"Simple Toast\",Toast.LENGTH_SHORT).show() }") }

        Toast_KT2.setOnClickListener { Toast_TV_MAin.setText(" Toast_Run2.setOnClickListener {\n" +
                "\n" +
                "            val layoutInflater:LayoutInflater=layoutInflater//i don't really understand this one\n" +
                "\n" +
                "            val viewLay=layoutInflater.inflate(R.layout.activity_intent,findViewById(R.id.NOW))\n" +
                "\n" +
                "            var t =Toast.makeText(this,\"\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.CENTER,0,0)\n" +
                "            t.view=viewLay\n" +
                "            t.show()\n" +
                "\n" +
                "\n" +
                "             }") }

        Toast_KT3.setOnClickListener { Toast_TV_MAin.setText("  BTN_left.setOnClickListener {var t= Toast.makeText(this,\"Left\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.LEFT,0,0)\n" +
                "            t.show()}\n" +
                "        BTN_Top.setOnClickListener {var t= Toast.makeText(this,\"Top\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.TOP,0,0)\n" +
                "            t.show()}\n" +
                "        BTN_top_left.setOnClickListener {var t= Toast.makeText(this,\"Top left\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.TOP or Gravity.LEFT,0,0)\n" +
                "            t.show()}\n" +
                "        BTN_Down.setOnClickListener { var t=Toast.makeText(this,\"Bottom side\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.BOTTOM,0,0)\n" +
                "            t.show()}\n" +
                "\n" +
                "        BTN_Right.setOnClickListener { var t=Toast.makeText(this,\"Right side\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.RIGHT,0,0)\n" +
                "            t.show()}\n" +
                "\n" +
                "        BTN_Center.setOnClickListener { var t=Toast.makeText(this,\"Centered\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.CENTER,0,0)\n" +
                "            t.show()}\n" +
                "\n" +
                "        BTN_top_Right.setOnClickListener { var t=Toast.makeText(this,\"Top Right\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.TOP  or Gravity.LEFT,0,0)\n" +
                "            t.show()}\n" +
                "\n" +
                "        BTN_Buttom_left.setOnClickListener { var t=Toast.makeText(this,\"Bottom left\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.BOTTOM or Gravity.LEFT,0,0)\n" +
                "            t.show()}\n" +
                "\n" +
                "        BTN_Bottom_Right.setOnClickListener { var t=Toast.makeText(this,\"Bottom Right\",Toast.LENGTH_SHORT)\n" +
                "            t.setGravity(Gravity.BOTTOM or Gravity.RIGHT,0,0)\n" +
                "            t.show()}\n" +
                "\n" +
                "        BTN_custoum.setOnClickListener { var t=Toast.makeText(this,\"Custom\",Toast.LENGTH_LONG)\n" +
                "            t.setGravity(Gravity.CENTER or Gravity.TOP,200,600)\n" +
                "            t.show()}") }


    }
}

/*Comments
*
*
*
*
*
*
* */