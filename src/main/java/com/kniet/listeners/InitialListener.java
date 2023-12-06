package com.kniet.listeners;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class InitialListener extends ListenerAdapter {
    @Override
    public void onGuildJoin(GuildJoinEvent event) {
        List<TextChannel> textChannels = event.getGuild().getTextChannels();
        for (TextChannel textChannel : textChannels) {
            event.getJDA().getGuildById(event.getGuild().getId()).getTextChannelById(textChannel.getId())
                    .sendMessage("Cześć jestem Kapibara i czasem mi odpierdala")
                    .queue();
        }
    }

    @Override
    public void onReady(ReadyEvent event) {
        List<Guild> guilds = event.getJDA().getGuilds();

        for (Guild guild : guilds) {
            event.getJDA().getGuildById(guild.getId()).getTextChannelById(guild.getTextChannels().get(0).getId())
                    .sendMessage("Agent Capybara reporting for duty!")
                    .queue();
        }
    }
}
