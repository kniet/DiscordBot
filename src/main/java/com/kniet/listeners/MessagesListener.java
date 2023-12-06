package com.kniet.listeners;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessagesListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        Message message = event.getMessage();

        if (message.getContentRaw().equals("Capybara")) {
            MessageChannel channel = event.getChannel();
            if (channel.canTalk()) {
                channel.sendMessage("EWA").queue();
            }
        }
    }
}
