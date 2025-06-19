package vcmsa.mbali.practicumexam

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Rate
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //code starts here

            // Parallel Arrays
        var edtsongtext = arrayListOf<String>()
        var edtartistname = arrayListOf<String>()
        var edtrates = arrayListOf<Int>()
        var edtcomment = arrayListOf<String>()


        val edtaddtolist = findViewById<Button>(R.id.edtaddlist)
        var edtbuttonnext = findViewById<Button>(R.id.edtbuttonnext)
        var edtexit = findViewById<Button>(R.id.edtexit)

        edtaddtolist.setOnClickListener {
            showDialog(R.id.edtaddlist)
        }

        edtaddtolist.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putStringArrayListExtra("Song title",edtsongtext)
            intent.putStringArrayListExtra("Artist Name",edtartistname)
            intent.putStringArrayListExtra("Rating",edtrates)
            intent.putStringArrayListExtra("Comments",edtcomment)

        }
        edtexit.setOnClickListener {
            finish()
        }
    }

    private fun showAddDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("enter song title")
        val layout = layoutInflater.inflate(R.layout.activity_main2,null)
        builder.setView(layout)

        val edtsongtext = findViewById<android.widget.EditText>(R.id.edtsongtext)
        val edtartistname = findViewById<android.widget.EditText>(R.id.edtartistname)
        val edtrates = findViewById<android.widget.EditText>(R.id.edtrates)
        val edtcomment = findViewById<android.widget.EditText>(R.id.edtcomment)

        builder.setPositiveButton("Add")
        val song = edtsongtext.text.toString()
        val artist = edtartistname.text.toString()
        val rating = edtrates.text.toString()
        val comment = edtcomment.text.toString()

        if (edtsongtext.isShown() || artist.isEmpty() || edtrates == null) {
            Toast.makeText(this, "please enter valid song details.", Toast.LENGTH_SHORT).show()
            return
        }
        edtsongtext.addTouchables(edtsongtext)
        edtartistname.addTouchables(edtartistname)
        edtrates.addTouchables(edtrates)
        edtcomment.addTouchables(edtcomment)
    }

}// end of main activity