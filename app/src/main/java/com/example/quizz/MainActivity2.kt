package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text3 = findViewById<TextView>(R.id.text3)
        val text4 = findViewById<TextView>(R.id.text4)
        val text5 = findViewById<TextView>(R.id.text5)
        val text6 = findViewById<TextView>(R.id.text6)
        val text7 = findViewById<TextView>(R.id.text7)
        val textrep = findViewById<TextView>(R.id.textrep)
        val butret = findViewById<Button>(R.id.butret)
        val but9 = findViewById<Button>(R.id.but9)


        class Quest(
            val Enonce: String,
            val Reponse: Array<String>,
            var bonnereponse: Int, // trailing comma
        )

        val q1 = Quest(Enonce = "Qui doit absolument rentrer avant minuit ?", Reponse = arrayOf("La belle au bois dormant","Cendrillon","Blanche-Neige","Moi, sinon ma femme va crier"), bonnereponse = 1)
        val q2 = Quest(Enonce = "Qui chante \\\"Il en faut peu pour être heureux...\\\" ? ", Reponse = arrayOf("Simba","Baloo","toi","Baghera"), bonnereponse = 1)
        val q3 = Quest(Enonce = "Quel métier exerce l'ami de Mary Poppins ?", Reponse = arrayOf("Plombier","Couvreur","Ramoneur","Peintre"), bonnereponse = 2)
        val q4 = Quest(Enonce = "Qui fume sur un champignon devant Alice ?", Reponse = arrayOf("Une chenille","Un papillon","Une abeille","Un ver"), bonnereponse = 0)
        val q5 = Quest(Enonce = "Lequel de ces ustensiles n'est pas utilisé dans le piège qui doit tuer Basil ?", Reponse = arrayOf("Un phonographe","Un couteau","Un arbalète","Une hache"), bonnereponse = 1)
        val q6 = Quest(Enonce = "Dans quel véhicule Edgar enlève-t'il les chatons de Duchesse ?", Reponse = arrayOf("Dans une fourgonnette","Dans une voiture","Dans un fiacre","Dans un side-car"), bonnereponse = 3)
        val q7 = Quest(Enonce = "Comment s'appelle le petit singe d'Aladdin ?", Reponse = arrayOf("Aba","Abi","Abo","Abu"), bonnereponse = 3)
        val q8 = Quest(Enonce = "Quelle profession exerce Basil ?", Reponse = arrayOf("Détective privé","Constructeur de limes à épaissir","Inspecteur de police","Commissaire de police"), bonnereponse = 0)
        val q9 = Quest(Enonce = "Que prend Ursula, la sorcière de la mer à Ariel, la petite sirène ?", Reponse = arrayOf("Sa jeunesse","Sa beauté","Sa voix","Son scooter des mers"), bonnereponse = 2)
        val q10 = Quest(Enonce = "Qui chante \"Hakuna Matata\" ?", Reponse = arrayOf("Pimba","Bamba","Pumba","Samba"), bonnereponse = 2)

        var bonrep = q1.Reponse[q1.bonnereponse]

        val randArray = q1.Reponse.shuffle()

            text3.text = q1.Enonce
            text4.text = q1.Reponse[0]
            text5.text = q1.Reponse[1]
            text6.text = q1.Reponse[2]
            text7.text = q1.Reponse[3]



        fun quest1 (){
            but9.setOnClickListener {
                println(q2.toString())
                textrep.text = "bonne reponse"

                /*if (bonrep == 2){

                }
                else {
                    textrep.text = "mauvaise reponse"
                }*/
            }
        }
        quest1()




        butret.setOnClickListener {
            val newIntent = Intent(this, MainActivity::class.java)
            startActivity(newIntent)
        }
    }
}