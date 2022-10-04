package com.ckc.kotlintemelleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.PrintStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // Variables

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        // Integer
        println("----------Integer--------")
        var a=5
        var b=58
        //Bir değişkene değer atamaya " Initialize " yapmak denir.
        println(a*b)
        val c : Int
        c=93
        val d : Int = 86

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        // Double && Float
        println("----------Double && Float --------")

        var e = 5.8   // default olarak float dır

        var f = 5.9f
        var g :Double  //yanda uyarı vermesini sebebi ise initialize yi tanımlamadan sonra yapmamızı istemesidir.
        g = 5.0

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        // String
        println("----------String--------")

        val name = "can"
        val surname = "Cakici"

        println(name + surname)
        println("$name $surname")
        println("Adı SoyAdı : $name $surname")

        val pencil : String = "black Pencil"

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        // Boolean
        println("----------Boolean--------")

        var boo :Boolean = true

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && -> AND
        // || -> OR

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        //Conversion
        println("------- Conversion -------")

        var s = 5

        s.toString()
        s.toInt()
        s.toFloat()
        s.toLong()

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        //Collections
        //Arrays
        println("-------Array-------")

        val array = arrayOf("can","kasım","ahmet")
        val array2 = arrayOf(1,5,8,9,4)
        val doubleArrayy = doubleArrayOf(1.5,8.8,8.5)
        val mixArray = arrayOf("can",8)

        // Arrayler sıfırdan başlar

        array.get(0)
        array[0] //en fazla tercih edilen

        array[0] = "murat"
        println(array[0])

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        println("-------List - ArrayList-------")

        val arrayyy = arrayListOf<Int>(5,8,9,47,76)
        val arrayyy1 = arrayListOf<Int>()
        arrayyy1.add(5)
        arrayyy1.add(569)
        arrayyy1.add(65)

        val mixArrayyyy = arrayListOf<Any>()
        mixArrayyyy.add(5)
        mixArrayyyy.add("cab")
        mixArrayyyy.add(50.5)
        mixArrayyyy.add(true)

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        println("--------Set------")

        val sett = setOf<Int>(88,98,8,8,94,84)
        println(sett.size) // normal bir array dizi uzunluğu 6 çıkarır iken setOf 5 çıkarır

        val Hset = HashSet<String>()
        Hset.add("can")
        Hset.add("can")
        Hset.add("murat")

        println(Hset.size) // Dizi uzunluğu 2 çıkar ( 3 )

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        println("--------Map - HashMap------")

        //Key Value

        val mapExample = hashMapOf<String,Int>()
        mapExample.put("can",23)
        mapExample.put("murat",52)

        val mapExample2 = HashMap<String,String>()
        mapExample2.put("can","murat")


        val mapExample3 = hashMapOf<String,Int>("a" to 3,"5" to 5)

        mapExample3["a"]

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        println("--------Operator------")

        var t =15
        var k =8
        var x =4
        println(8<t || k>65) //or
        println(8<t && k>65) //and

        println(t%5)
        println(k%5)

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        println("--------If Control------")

        val Anumber =4

        if (Anumber==1){ println("Anumber 1 eşittir")}
        else if(Anumber==2){println("Anumber 2 eşittir")}
        else if(Anumber==3){println("Anumber 3 eşittir")}
        else if(Anumber==4){println("Anumber 4 eşittir")}
        else if(Anumber==5){println("Anumber 5 eşittir")}
        else{println("Anumber aralık dışı")}

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        println("--------Swich/Case --- When------")

        var p = 2

        when(p){

            1 -> println("değer 1")
            2 -> println("değer 2")
            3 -> println("değer 3")
            else -> println("aralık dışı")
        }

        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------

        println("--------Loops------")

        // For loops

        val arrayForloops = arrayListOf<Int>(5,8,9,4)

        for(a in arrayForloops){
            println(a)
        }

        // forEach

        arrayForloops.forEach {
            println(it)
        }

        //While

        var wh = 0

        while (wh<10){
            println(wh)
            wh++
        }

        

    }
}