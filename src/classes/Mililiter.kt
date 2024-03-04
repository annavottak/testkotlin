package classes
@JvmInline
value class Mililiter (val value: Float){
    fun toLiters()=Liter(value/1000)
}