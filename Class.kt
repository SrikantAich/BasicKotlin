class Lamp {
     var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun displayStat() {
        if (isOn) {
            println("Lamp is ON")
        } else {
            println("Lamp is OFF")
        }
    }


}

fun main() {
    val l1 = Lamp()
    println("Initial stage of Lamp is ${l1.isOn}"); //string Interpolation
    l1.turnOn()
    l1.displayStat()
    l1.turnOff()
    l1.displayStat()

    //another example of string interpolation
    val a=15;
    val b=10;
    println("Sum of $a and $b is equal to $(a+b)");
}
