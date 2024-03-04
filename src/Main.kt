import classes.Liter
import classes.Meter
import classes.Mililiter

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите число в метрах:")
    try {
        val meterEnter = readln().toFloat()
        val meter= Meter(meterEnter)
        val km= meter.toKilometers()
        val cm= meter.toCentimeters()
        val  mm=meter.toMillimeters()
        print(meter.value.toString()+ " метров в километрах: "+ km.value.toString() +" \n")
        print(meter.value.toString()+" метров в сантимерах: "+cm.value.toString()+" \n")
        print(meter.value.toString()+" метров в милиметрах: "+mm.value.toString()+" \n")
        print("Введите объем в милилитрах:")
        val volume=readln().toFloat()
        val ml=Mililiter(volume)
        val l=ml.toLiters()
        print(ml.value.toString()+ " милилитров в литрах: "+ l.value.toString() +" \n")
    } catch (e: Exception) {
        println("Неверные вводные данные")
    }
}