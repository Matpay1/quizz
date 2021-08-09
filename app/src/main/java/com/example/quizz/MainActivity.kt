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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val question = findViewById<TextView>(R.id.question)
        var bt_1 = findViewById<Button>(R.id.bt_1)
        var bt_2 = findViewById<Button>(R.id.bt_2)
        var bt_3 = findViewById<Button>(R.id.bt_3)
        var bt_4 = findViewById<Button>(R.id.bt_4)
        val resultat1 = findViewById<TextView>(R.id.resultat1)
        val bt_ret = findViewById<Button>(R.id.bt_ret)
        var score = 0

        fun bon_rep () {
            resultat1.text = "  bonne  réponse"
            resultat1.setTextColor(Color.parseColor("#19DD21"))
            score ++
        }

        fun mauv_rep () {
            resultat1.text = "mauvaise réponse"
            resultat1.setTextColor(Color.parseColor("#F44336"))
        }

        fun quest_2 () {
            question.text = "Qui chante \"Il en faut peu pour être heureux...\" ? "
            bt_1.text = "Simba"
            bt_2.text = "Baloo"
            bt_3.text = "toi"
            bt_4.text = "Baghera"
        }
        fun quest_3 () {
            question.text = "Quel métier exerce l'ami de Mary Poppins ? "
            bt_1.text = "Plombier "
            bt_2.text = "Ramoneur"
            bt_3.text = "Couvreur"
            bt_4.text = "Peintre"
        }
        fun quest_4 () {
            question.text = "Qui fume sur un champignon devant Alice ? "
            bt_1.text = "Une abeille"
            bt_2.text = "Une chenille"
            bt_3.text = "Un papillon"
            bt_4.text = "Un ver"
        }
        fun quest_5 () {
            question.text = "Lequel de ces ustensiles n'est pas utilisé dans le piège qui doit tuer Basil ?"
            bt_1.text = "Un phonographe"
            bt_2.text = "Un couteau"
            bt_3.text = "Un arbalète"
            bt_4.text = "Une hache"
        }
        fun quest_6 () {
            question.text = "Quelle profession exerce Basil ?"
            bt_1.text = "Constructeur de limes à épaissir"
            bt_2.text = "Inspecteur de police"
            bt_3.text = "Commissaire de police"
            bt_4.text = "Détective privé"
        }
        fun quest_7 () {
            question.text = "Dans quel véhicule Edgar enlève-t'il les chatons de Duchesse ?"
            bt_1.text = "Dans une fourgonnette"
            bt_2.text = "Dans une voiture"
            bt_3.text = "Dans un fiacre"
            bt_4.text = "Dans un side-car"
        }
        fun quest_8 () {
            question.text = " Comment s'appelle le petit singe d'Aladdin ?"
            bt_1.text = "Aba"
            bt_2.text = "Abi"
            bt_3.text = "Abo"
            bt_4.text = "Abu"
        }
        fun quest_9 () {
            question.text = " Que prend Ursula, la sorcière de la mer à Ariel, la petite sirène ?"
            bt_1.text = "Sa jeunesse"
            bt_2.text = "Sa beauté"
            bt_3.text = "Sa voix"
            bt_4.text = "Son scooter des mers"
        }
        fun quest_10 () {
            question.text = "Qui chante \"Hakuna Matata\" ?"
            bt_1.text = "Pimba"
            bt_2.text = "Samba"
            bt_3.text = "Pumba"
            bt_4.text = "Bamba"
        }

        fun bien_jouet () {
            question.text = "vous avez bien jouer recommencer "
            bt_1.text = "c'etait"
            bt_2.text = "une"
            bt_3.text = "bonne"
            bt_4.text = "partie"
            AlertDialog.Builder(this)
                .setTitle("BIEN JOUER")
                .setMessage("Je vous invite à redémarer                          votre score est de "+score+"/10")
                .setPositiveButton(android.R.string.yes) { dialog, which ->
                    val newIntent = Intent(this, MainActivity::class.java)
                    startActivity(newIntent)
                }
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()
        }
        fun ques_alea() {
            /*bt_0 = bt_1.text as String
            bt_1.text = bt_3.text
            bt_3.text = bt_4.text
            bt_4.text = bt_2.text
            bt_2.text = bt_0*/


            val x    = bt_2
            bt_2 = bt_1
            bt_1 = bt_3
            bt_3 = bt_4
            bt_4 = x

            /*val y    = bt_2.isClickable
            bt_2.isClickable = bt_1.isClickable
            bt_1.isClickable = bt_3.isClickable
            bt_3.isClickable = bt_4.isClickable
            bt_4.isClickable = y*/

        }
        /*fun ok (){
            if (ok <= 4){
                bon_rep()
            }
            else{
                mauv_rep()
            }
        }*/

        var num = 1

        fun numpag() {
            val num_quest = findViewById<TextView>(R.id.num_quest)
            num ++
            num_quest.text = "n°" + num

            if (num == 2){
                quest_2()
            }
            else if (num == 3){
                quest_3()
            }
            else if (num == 4){
                quest_4()
            }
            else if (num == 5){
                quest_5()
            }
            else if (num == 6){
                quest_6()
            }
            else if (num == 7){
                quest_7()
            }
            else if (num == 8){
                quest_8()
            }
            else if (num == 9){
                quest_9()
            }
            else if (num == 10){
                quest_10()
            }
            else
                bien_jouet()
        }
        bt_1.setOnClickListener{
            mauv_rep()
            numpag()
            ques_alea()
        }
        bt_2.setOnClickListener{
            bon_rep()
            numpag()
            ques_alea()
        }
        bt_3.setOnClickListener{
            mauv_rep()
            numpag()
            ques_alea()
        }
        bt_4.setOnClickListener{
            mauv_rep()
            numpag()
            ques_alea()
        }

        bt_ret.setOnClickListener {
            val newIntent = Intent(this, MainActivity::class.java)
            startActivity(newIntent)
        }
    }

}