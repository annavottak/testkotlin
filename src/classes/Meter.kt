package classes
@JvmInline
value class Meter(val value: Float) {
    fun toKilometers() = Kilometer(value / 1000)
    fun toCentimeters() = Centimeter(value * 100)
    fun toMillimeters() = Millimeter(value * 1000)
}