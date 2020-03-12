package br.projeto.componentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    override fun onClick(view: View) {
        val btnId = view.id

        when (btnId){
            R.id.buttonToaskMe -> {
                Toast.makeText(baseContext, "Toast notification", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun setListeners(){
        buttonToaskMe.setOnClickListener(this)
    }
}
