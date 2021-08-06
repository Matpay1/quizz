package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    fun numpag() {
        val num_quest = findViewById<TextView>(R.id.num_quest)
        var num = 1
            num = num + 1
            num_quest.text = "n°" + num.toString()
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


        fun bien_jouet(){
            question.text = "vous avez bien jouer recommencer "
            bt_1.text = "c'etait"
            bt_2.text = "une"
            bt_3.text = "bonne"
            bt_4.text = "partie"
            val text = "je vous invite a redemarer"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()        }
        fun newquest4(){
            question.text = "Qui fume sur un champignon devant Alice ? "
            bt_1.text = "Une abeille"
            bt_2.text = "Un ver"
            bt_3.text = "Un papillon"
            bt_4.text = "Une chenille "

            bt_1.setOnClickListener {
                resultat1.text = "mauvaise réponse"
                bien_jouet()
            }
            bt_2.setOnClickListener {
                resultat1.text = "mauvaise réponse"
                bien_jouet()
            }
            bt_3.setOnClickListener{
                resultat1.text = "mauvaise réponse"
                bien_jouet()
            }
            bt_4.setOnClickListener {
                resultat1.text = "  bonne  réponse"
                bien_jouet()
            }
        }
        fun newquest3(){
            question.text = "Quel métier exerce l'ami de Mary Poppins ? "
            bt_1.text = "Plombier "
            bt_2.text = "Couvreur"
            bt_3.text = "Ramoneur"
            bt_4.text = "Peintre"

            bt_1.setOnClickListener {
                resultat1.text = "mauvaise réponse"
                newquest4()
            }
            bt_2.setOnClickListener {
                resultat1.text = "mauvaise réponse"
                newquest4()
            }
            bt_3.setOnClickListener{
                resultat1.text = "  bonne  réponse"
                newquest4()
            }
            bt_4.setOnClickListener{
                resultat1.text = "mauvaise réponse"
                newquest4()
            }
        }

        fun newquest2(){
            question.text = "Qui chante \"Il en faut peu pour être heureux...\" ? "
            bt_1.text = "Simba"
            bt_2.text = "Baghera"
            bt_3.text = "toi"
            bt_4.text = "Baloo"

            bt_1.setOnClickListener {
                resultat1.text = "mauvaise réponse"
                newquest3()
            }
            bt_2.setOnClickListener {
                resultat1.text = "mauvaise réponse"
                newquest3()
            }
            bt_3.setOnClickListener{
                resultat1.text = "mauvaise réponse"
                newquest3()
            }
            bt_4.setOnClickListener{
                resultat1.text = "  bonne  réponse"
                newquest3()
            }
        }


        bt_1.setOnClickListener{
            resultat1.text = "  bonne  réponse"
            newquest2()
            numpag()
        }
        bt_2.setOnClickListener{
            resultat1.text = "mauvaise réponse"
            newquest2()
            numpag()

        }
        bt_3.setOnClickListener{
            resultat1.text = "mauvaise réponse"
            newquest2()
            numpag()

        }
        bt_4.setOnClickListener{
            resultat1.text = "mauvaise réponse"
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