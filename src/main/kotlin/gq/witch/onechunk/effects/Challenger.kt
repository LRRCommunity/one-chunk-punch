package gq.witch.onechunk.effects

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.util.*

/**
 * Represents a user challenging the One Chunk Punch
 *
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
class Challenger(val uuid: UUID, val twitchUsername: String) {
    val player: Player? get() = Bukkit.getPlayer(uuid)
}