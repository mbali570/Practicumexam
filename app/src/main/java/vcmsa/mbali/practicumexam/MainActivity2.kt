package vcmsa.mbali.practicumexam

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //St10493957 Mbali Mvambo
        // code starts here
        var edtdisplay = findViewById<Button>(R.id.edtdisplay)
        val edtlist = findViewById<ListView>(R.id.edtlist)
        var edtcalculate = findViewById<TextView>(R.id.edtcalculate)
        var edtreturn = findViewById<Button>(R.id.edtreturn)


        //Arrays of Songs, Rating and comments
        val list = arrayListOf<String>(
            "feel by sonder",
            "Prettey wings by Maxwell",
            "Buy me a rose by lurther vandross",
            "Intro by Nao",

            )
        val rating = arrayOf(
            "4",
            "1",
            "2",
            "3"
        )
        val comments = arrayOf(
            "good song",
            "self confidence song",
            "best love song",
            "relaxing"
        )

        //calculate score
        for (i in edtlist.toString()) {
            if (edtlist == edtdisplay) {
                rating
                return
            }

        }//end of code
    }