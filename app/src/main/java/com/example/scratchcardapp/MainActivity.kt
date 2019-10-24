package com.example.scratchcardapp

import `in`.codeshuffle.scratchcardlayout.listener.ScratchListener
import `in`.codeshuffle.scratchcardlayout.ui.ScratchCardLayout
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , ScratchListener {

    @SuppressLint("SetTextI18n")
    override fun onScratchProgress(scratchCardLayout: ScratchCardLayout?, atLeastScratchedPercent: Int) {
        if(atLeastScratchedPercent>33){
            scratchCardLayout!!.stopScratching()
        }
        /* tv1.text= "$atLeastScratchedPercent%"
         */
        Log.d("TAGS","A "+atLeastScratchedPercent)

    }

    override fun onScratchComplete() {
        Log.d("TAGS","A   onScratchComplete")
    }

    override fun onScratchStarted() {
        Log.d("TAGS","A   onScratchStarted")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scratchCardLayout.setScratchListener(this);
//Get view reference

        // scratchCardLayout.setScratchDrawable()

        //  scratchCardLayout.setScratchDrawable(resources.getDrawable(R.drawable.electronic))

        //Set scratch brush width
        scratchCardLayout.setScratchWidthDip(90f)

        //Reveal full layout when some percent of the view is scratched
        scratchCardLayout.setRevealFullAtPercent(40)

        //Scratching enable/disable
        scratchCardLayout.setScratchEnabled(true)

        //Remove all scratch made till now

/*

        Picasso.into(getContext()).load(url).placeholder(R.drawable.placeholder)
            .error(R.drawable.placeholder).into(imageView);
*/

        scratchCardLayout.setOnClickListener {

        }



    }

    /* fun btnRest(v: View){
         scratchCardLayout.resetScratch()
     }


     fun btnClean(v: View){
         scratchCardLayout.stopScratching()
     }
 */
}
