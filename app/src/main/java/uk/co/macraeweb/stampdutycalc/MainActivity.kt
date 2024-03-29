package uk.co.macraeweb.stampdutycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateStandard (view: View) {
        val textEdit = findViewById<EditText>(R.id.standard);

        try {
            val price = textEdit.text.toString().toDouble();
            var result = if (price < 125001) {
                0;
            } else {
                ((price - 125000) * 0.02).toInt();
            }
            findViewById<TextView>(R.id.result).setText(result.toString());
        } finally {

        }
    }
}