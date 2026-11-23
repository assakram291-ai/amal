package ma.ofppt.ista.alamal

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

//        val imp = findViewById<CheckBox>(R.id.chkImpression)
//        val casque = findViewById<CheckBox>(R.id.chkCasque)
//        val scanner = findViewById<CheckBox>(R.id.chkScanner)
//        val btn = findViewById<Button>(R.id.btnTotal)
//        val txtTotale = findViewById<TextView>(R.id.txtTotal)
//        btn.setOnClickListener {
//            var prix = 0
//            var options = 0
//            if (imp.isChecked) {
//                prix += 2
//                options++
//            }
//            if (casque.isChecked) {
//                prix += 2
//                options++
//            }
//            if (scanner.isChecked) {
//                prix += 2
//                options++
//            }
//            txtTotale.text = "$options Options(s):$prix DH"
//        }
        val radioGroupe=findViewById<RadioGroup>(R.id.grpForfait)
        val txtforfait=findViewById<TextView>(R.id.txtForfait)
        radioGroupe.setOnCheckedChangeListener { group, id ->
            when(id){
                R.id.rad30 -> txtforfait.text="Forfait 30 min,6 DH"
                R.id.rad60 -> txtforfait.text="Forfait 60 min,10 DH"
            }
        }
    }

}
