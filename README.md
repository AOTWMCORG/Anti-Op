# Anti-Op
This Plugin removes operator from anyone who isn't whitelisted to have it.


# Description
Anti-Op automatically removes operator (OP) privileges from anyone who is not whitelisted in the config.yml. This ensures that only trusted players have access to OP commands on your server.

# Features

Automatically deops unauthorized players.

Fully configurable whitelist in config.yml.

Lightweight and easy to use.

Compatible with Paper and Spigot servers.

Can be used to stop people who have backdoors from getting operator status.

# Installation

Download the latest JAR from the Releases
 section.

Place the JAR file in your server’s plugins folder.

Start the server to generate the default config.yml.

Edit config.yml to add players who should have OP privileges.

Restart the server or reload the plugin.

# Configuration (config.yml)

whitelist:
  - Uptightplum
  - TrustedPlayer1
  - TrustedPlayer2


Players listed under whitelist will retain OP status.

All others will be automatically deopped if they attempt to gain OP.

Commands

This plugin doesn’t require commands to function. All actions are automatic.

Notes

Anti-Op does not grant OP to any players automatically—it only enforces the whitelist.

Make sure your whitelist is up-to-date to prevent accidentally deopping trusted admins.

Project's source code is available but i'm still new to github so build at your own risk

