/*
 * *
 *  * Created by Arda Kazancı on 7/11/19 9:06 PM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 7/11/19 9:06 PM
 *  *
 */

package Example_01_01

fun main() {


    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye") // Bye Bye - * operatörü times ' ı çağırıyor.

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Foo Bar Foo Bar Foo Bar Foo Bar"
    println(str[0..14]) // [a..b] get i çağırıyor.


}

