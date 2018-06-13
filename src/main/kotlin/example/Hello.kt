package example

import kotlinx.html.*
import kotlinx.html.dom.*
import kotlin.browser.document
import kotlin.browser.window


val myDiv = document.create.div {
    p { +"text inside" }
}

fun main(args: Array<String>) {
    document.body?.append(myDiv)
    appendRepeat()
}

fun appendRepeat() {
    window.setInterval({
        val myDiv = document.create.div("panel") {
            p {
                +"Here is "
                a("http://kotlinlang.org") { +"official Kotlin site" }
            }
        }

        val container = document.getElementById("container")
        container?.appendChild(myDiv)
        container?.append {
            div {
                +"added it"
            }
        }
    }, 1000)
}

