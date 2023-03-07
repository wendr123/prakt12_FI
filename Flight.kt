interface Flight {
    fun delayLaunch(delayLaunch: Int)
    suspend fun launchInCoroutine(n: Int)
}