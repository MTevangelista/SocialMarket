package br.projeto.componentes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
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
                val toast = Toast.makeText(baseContext, "Toast notification", Toast.LENGTH_LONG)

                //layout padrão da toast
                val toastLayout = layoutInflater.inflate(R.layout.toast_custom, null)
                toast.view = toastLayout

                val textView = toast.view.findViewById<TextView>(R.id.textMessage)
                textView.setTextColor(Color.RED)
                textView.text = "Toast notification!"

                toast.show()
            }
        }
    }

    private fun setListeners(){
        buttonToaskMe.setOnClickListener(this)
    }
}
