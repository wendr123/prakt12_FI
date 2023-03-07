class Airplane(
    val model: String,
    val departure: String,
    val destination: String,
    val departureDate: String,
    val departureTime: String,
    val flightTime: String
) : AbstractFlight() {
    override fun launch() {
        println("Самолет $model из $departure летит в $destination , дата: $departureDate в $departureTime , время полета $flightTime")
    }

    override suspend fun launchInCoroutine(n: Int) {
        repeat(n) {
            launch()
            kotlinx.coroutines.delay(1000L)
        }
    }
}
