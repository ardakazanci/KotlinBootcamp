/*
 * *
 *  * Created by Arda Kazancı on 7/11/19 9:15 PM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 7/11/19 9:15 PM
 *  *
 */

package Example_01_01


fun main() {

    fun printAll(vararg message: String) {
        for (m in message) println(m)
    }

    // vararg sayesinde birden fazla parametre gönderebiliyoruz.
    printAll("Foo", "Bar", "X", "Y")


    fun printAllWithPrefix(vararg messages: String, prefix: String) {

        for (m in messages) println(prefix + m)

    }

    printAllWithPrefix("Foo", "Bar", "Foo", "Bar", prefix = "->")


    fun log(vararg entries: String) {
        printAll(*entries) // vararg ' a bir vararg göndermek istersek * koymamız gerekir. Çalışma zamanında string'tir.
    }

    log("Arda", "Kazancı", "Foo", "Bar")

}