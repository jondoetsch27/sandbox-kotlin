import java.util.*

open class Player constructor(
    private var playerFirstName: String,
    private var playerLastName: String,
    private var playerNumber: String,
    private var playerTeam: String,
    private var playerPosition: String
) : Comparable<Player> {

    fun getPlayerFirstName(): String {
        return this.playerFirstName
    }

    fun getPlayerLastName(): String {
        return this.playerLastName
    }

    fun getPlayerFullName(): String {
        return this.playerFirstName + " " + this.playerLastName
    }

    fun getPlayerNumber(): String {
        return this.playerNumber
    }

    fun getPlayerPosition(): String {
        return this.playerPosition
    }

    override fun toString(): String {
        return this.playerFirstName +
                this.playerLastName +
                this.playerNumber +
                this.playerTeam +
                this.playerPosition
    }

    override fun equals(other: Any?): Boolean {
        return other != null
                && other is Player
                && other.getPlayerFullName() == this.getPlayerFullName()
                && other.playerNumber == this.playerNumber
                && other.playerTeam == this.playerTeam
                && other.playerPosition == this.playerPosition
    }

    override fun hashCode(): Int {
        return (31 * Objects.hash(this.getPlayerFullName())
            + (31 * Objects.hash(this.playerNumber))
            + (31 * Objects.hash(this.playerTeam))
            + (31 * Objects.hash(this.playerPosition)))
    }

    override fun compareTo(other: Player): Int {
        return compareValues(this.getPlayerFullName(), other.getPlayerFullName())
    }
}