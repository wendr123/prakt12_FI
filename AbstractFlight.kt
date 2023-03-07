abstract class AbstractFlight : Flight {
    override fun delayLaunch(delaySeconds: Int) {
        Thread.sleep(delaySeconds * 1000L)
        launch()
    }

    abstract fun launch()
}