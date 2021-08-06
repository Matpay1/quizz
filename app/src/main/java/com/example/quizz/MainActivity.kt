package com.example.quizz

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    var num = 1
    var score = 0
    fun numpag() {
        val num_quest = findViewById<TextView>(R.id.num_quest)
        num ++
        num_quest.text = "n°" + num
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val question = findViewById<TextView>(R.id.question)
        val bt_1 = findViewById<Button>(R.id.bt_1)
        val bt_2 = findViewById<Button>(R.id.bt_2)
        val bt_3 = findViewById<Button>(R.id.bt_3)
        val bt_4 = findViewById<Button>(R.id.bt_4)
        val resultat1 = findViewById<TextView>(R.id.resultat1)
        val bt_ret = findViewById<Button>(R.id.bt_ret)

        fun bon_rep(){
            resultat1.text = "  bonne  réponse"
            resultat1.setTextColor(Color.parseColor("#4CAF50"))
            score ++
        }
        fun mauv_rep(){
            resultat1.text = "mauvaise réponse"
            resultat1.setTextColor(Color.parseColor("#F44336"))
        }



        fun bien_jouet(){
            question.text = "vous avez bien jouer recommencer "
            bt_1.text = "c'etait"
            bt_2.text = "une"
            bt_3.text = "bonne"
            bt_4.text = "partie"
            AlertDialog.Builder(this)
                .setTitle("bien jouer")
                .setMessage("je vous invite a redemarer" +
                        " votre score est de "+score)
                .setPositiveButton(android.R.string.yes) { dialog, which ->
                    val newIntent = Intent(this, MainActivity::class.java)
                    startActivity(newIntent)
                }
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()
        }
        fun newquest4(){
            question.text = "Qui fume sur un champignon devant Alice ? "
            bt_1.text = "Une abeille"
            bt_2.text = "Un ver"
            bt_3.text = "Un papillon"
            bt_4.text = "Une chenille "

            bt_1.setOnClickListener {
                mauv_rep()
                bien_jouet()
                numpag()
            }
            bt_2.setOnClickListener {
                mauv_rep()
                bien_jouet()
                numpag()
            }
            bt_3.setOnClickListener{
                mauv_rep()
                bien_jouet()
                numpag()
            }
            bt_4.setOnClickListener {
                bon_rep()
                bien_jouet()
                numpag()
            }
        }
        fun newquest3(){
            question.text = "Quel métier exerce l'ami de Mary Poppins ? "
            bt_1.text = "Plombier "
            bt_2.text = "Couvreur"
            bt_3.text = "Ramoneur"
            bt_4.text = "Peintre"

            bt_1.setOnClickListener {
                mauv_rep()
                resultat1.setTextColor(Color.parseColor("#F44336"))
                newquest4()
                numpag()
            }
            bt_2.setOnClickListener {
                mauv_rep()
                newquest4()
                numpag()
            }
            bt_3.setOnClickListener{
                bon_rep()
                newquest4()
                numpag()
            }
            bt_4.setOnClickListener{
                mauv_rep()
                newquest4()
                numpag()
            }
        }

        fun newquest2(){
            question.text = "Qui chante \"Il en faut peu pour être heureux...\" ? "
            bt_1.text = "Simba"
            bt_2.text = "Baghera"
            bt_3.text = "toi"
            bt_4.text = "Baloo"

            bt_1.setOnClickListener {
                mauv_rep()
                newquest3()
                numpag()
            }
            bt_2.setOnClickListener {
                mauv_rep()
                newquest3()
                numpag()
            }
            bt_3.setOnClickListener{
                mauv_rep()
                newquest3()
                numpag()
            }
            bt_4.setOnClickListener{
                bon_rep()
                newquest3()
                numpag()
            }
        }

        bt_1.setOnClickListener{
            bon_rep()
            newquest2()
            numpag()
        }
        bt_2.setOnClickListener{
            mauv_rep()
            newquest2()
            numpag()
        }
        bt_3.setOnClickListener{
            mauv_rep()
            newquest2()
            numpag()
        }
        bt_4.setOnClickListener{
            mauv_rep()
            newquest2()
            numpag()
        }

        bt_ret.setOnClickListener {
            val newIntent = Intent(this, MainActivity::class.java)
            startActivity(newIntent)
        }





        /*fun reponce () {
            if (et_c1.text.isNotEmpty() and et_c2.text.isNotEmpty()) {
                tvmess.text = "valide"
            } else if (et_c1.text.isNotEmpty() or et_c2.text.isNotEmpty()) {
                tvmess.text = "veuillez remplir l'autre champs"
            } else {
                tvmess.text = "veuillez remplir les champs"
            }
        }*/
    }

}