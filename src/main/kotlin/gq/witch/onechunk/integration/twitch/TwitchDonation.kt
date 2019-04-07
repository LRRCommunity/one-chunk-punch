package gq.witch.onechunk.integration.twitch

import gq.witch.onechunk.integration.AbstractDonator

/**
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
class TwitchDonation(val twitchUsername: String, val msg: String): AbstractDonator {
    override fun getMessage() = msg
    override fun getUsername() = twitchUsername
}