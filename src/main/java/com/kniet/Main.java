package com.kniet;

import com.kniet.listeners.InitialListener;
import com.kniet.listeners.MessagesListener;
import com.kniet.utilities.Reader;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    public static final String BOT_TOKEN = Reader.readFromFile();
    public static void main(String[] args) {
        JDA capybarus = JDABuilder.createDefault(BOT_TOKEN)
                .enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
        capybarus.addEventListener(new InitialListener());
        capybarus.addEventListener(new MessagesListener());
    }
}
