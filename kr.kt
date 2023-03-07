import kotlinx.coroutines.*
suspend fun main() {
    val airplane = Airplane(
        model = "Боинг 747",
        departure = "Нью Йорк",
        destination = "Лондон",
        departureDate = "2023-03-10",
        departureTime = "12:00",
        flightTime = "8 часов"
    )

    airplane.delayLaunch(5)

    runBlocking {
        airplane.launchInCoroutine(3)
    }
}