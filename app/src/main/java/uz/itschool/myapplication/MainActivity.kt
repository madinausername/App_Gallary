package uz.itschool.gallary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import uz.itschool.myapplication.R

class MainActivity : AppCompatActivity(){
    var index=0
    var array_list:MutableList<Int> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var right_button=findViewById<ImageView>(R.id.image_right)
        var left_button=findViewById<ImageView>(R.id.image_left)
        var full_screen_image=findViewById<ImageView>(R.id.image_full)
        var image_1=findViewById<ImageView>(R.id.imageView_1)


        array_list.add(R.drawable.img_1)
        array_list.add(R.drawable.img_2)
        array_list.add(R.drawable.img_3)
        array_list.add(R.drawable.img_4)
        array_list.add(R.drawable.img_5)
        array_list.add(R.drawable.img_6)

        image_1.setOnClickListener {
            full_screen_image.setImageResource(array_list[index])
        }

        right_button.setOnClickListener {
            if(index<array_list.size-1){
                index++
            }
            else{
                index=0
            }
            full_screen_image.setImageResource(array_list[index])
        }


        left_button.setOnClickListener {
            if(index <= array_list.size-1) {
                index--
            }
            else{
                index=array_list.size-2
            }
            full_screen_image.setImageResource(array_list[index])
        }
    }
}