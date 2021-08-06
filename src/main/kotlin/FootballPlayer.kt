class FootballPlayer(
    playerFirstName: String,
    playerLastName: String,
    playerNumber: String,
    playerTeam: String,
    playerPosition: String
) : Player(playerFirstName, playerLastName, playerNumber, playerTeam, playerPosition) {

    data class FootballPlayerData(val playerFirstName: String, val playerLastName: String) {
        val passingYards: Int = 0
        val passingTouchdowns: Int = 0
        val rushingYards: Int = 0
        val rushingTouchdowns: Int = 0
        val receivingYards: Int = 0
        val receivingTouchdowns: Int = 0
    }
}