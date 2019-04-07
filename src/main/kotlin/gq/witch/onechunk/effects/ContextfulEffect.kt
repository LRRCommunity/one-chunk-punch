package gq.witch.onechunk.effects

import gq.witch.onechunk.integration.AbstractDonator
import org.bukkit.ChatColor
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

/**
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
interface ContextfulEffect {
    fun execute(target: Challenger, donator: AbstractDonator)

    enum class MaliciousContextualEffect: ContextfulEffect {
        MINING_FATIGUE_SHORT {
            override fun execute(target: Challenger, donator: AbstractDonator) {
                target.player?.addPotionEffect(
                    PotionEffect(PotionEffectType.SLOW_DIGGING, 200, 1)
                )
            }
        },
        BLINDNESS {
            override fun execute(target: Challenger, donator: AbstractDonator) {
                target.player?.addPotionEffect(
                    PotionEffect(PotionEffectType.BLINDNESS, 400, 1)
                )
            }
        },
        INSULTS {
            val insults = arrayOf(
                "Bet you can't punch this chunk.",
                "Hey. You. Bet there's lava under this layer.",
                "I couldn't think of a non-mean insult to write here."
            )

            override fun execute(target: Challenger, donator: AbstractDonator) {
                target.player?.sendMessage("${ChatColor.RED}${insults.random()}")
            }
        },
        CUSTOM_MESSAGE {
            override fun execute(target: Challenger, donator: AbstractDonator) {
                target.player?.sendMessage("${ChatColor.RED}${donator.getMessage()}")
            }
        }
    }
}