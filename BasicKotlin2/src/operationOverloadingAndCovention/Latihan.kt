package operationOverloadingAndCovention

import kotlin.io.println

data class Mana(val current: Int, val max: Int) {
    operator fun plus(other: Mana): Mana {
        return Mana(current + other.current, max)
    }
    operator fun inc(): Mana {
        val newMana = (current + 10).coerceAtMost(100)
        return Mana(newMana, max)
    }

    operator fun minus(Mana: Int): Mana {
        val newMana = (current - Mana).coerceAtLeast(0)
        return Mana(newMana, max)
    }
}


fun main() {
    var mana1 = Mana(50,100)
    var mana2 = Mana(20,50)

    println(mana1 + mana2)
    mana1++
    println(mana1)
    println(mana1 - 100)
}
