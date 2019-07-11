/*
 * *
 *  * Created by Arda Kazancı on 7/11/19 8:30 PM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 7/11/19 8:30 PM
 *  *
 */

package Example_01_01

// Fonksiyon Kullanımı Örnek Serisi 1



fun printMessage(message: String): Unit { // Unit ile birlikte geriye bir değer döndürmeyecek anlamı katıyoruz.

    println(message)

}


fun printMessageWithPrefix(message: String, prefix: String = "Info") {

    println("[$prefix] $message") // $ prefix i " " tırnak işaretleri içerisinde değişken ekleyebiliyoruz.

}

fun sum(x: Int, y: Int): Int {

    return x + y

}

fun multiply(x:Int,y:Int) = x * y // = operatörü ile birlikte return işlemini gerçekleştirmiş oluyoruz.


fun main() {
    printMessage("Arda")
    printMessageWithPrefix("Arda")
    printMessageWithPrefix("Arda", "Android Native Mobile Developer")
    printMessageWithPrefix(prefix = "->",message = "FooBar") // Sıralarını değiştirebildik.
    println(sum(10, 20))
    println(multiply(10,20))
}