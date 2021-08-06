fun main(args: Array<String>) {
    var footballPlayer = FootballPlayer(
        playerFirstName = "Josh",
        playerLastName = "Allen",
        playerNumber = "17",
        playerPosition = "QB",
        playerTeam = "BUF"
    )
    var footballPlayerData =
        FootballPlayer.FootballPlayerData(footballPlayer.getPlayerFirstName(), footballPlayer.getPlayerLastName())
    footballPlayerData.passingYards
}