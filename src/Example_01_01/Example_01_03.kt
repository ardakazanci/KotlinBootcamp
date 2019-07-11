/*
 * *
 *  * Created by Arda Kazancı on 7/11/19 8:40 PM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 7/11/19 8:40 PM
 *  *
 */

package Example_01_01

import jdk.internal.util.xml.impl.Pair

// Infix Fonksiyon


fun main() {

    /*-------------------*/

    infix fun Int.times(str: String) = str.repeat(this)

    println(2 times "Arda Kazancı ")


    /*-------------------*/

    val pair = "Foo" to "Bar"

    println(pair)

    /*-------------------*/

    // To Ayracı ile aynı işlevi yapan kendi infix fonksiyonumuz.

    infix fun String.onto(other: String) = Pair(this, other)

    val myPair = "Foo" onto "Bar"

    println(myPair)


    /*-------------------*/

    val foo = Person("Foo")

    val bar = Person("Bar")

    foo likes bar


}

class Person(val name: String) {

    val likedPeople = mutableListOf<Person>()

    infix fun likes(other: Person) {

        likedPeople.add(other)

    }

}