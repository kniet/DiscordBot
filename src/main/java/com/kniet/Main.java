package com.kniet;

import com.kniet.listeners.InitialListener;
import com.kniet.listeners.MessagesListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

//https://discord.com/developers/applications/1181891389374603344/information  -  bot panel

public class Main {
    public static final String BOT_TOKEN = "MTE4MTg5MTM4OTM3NDYwMzM0NA.GAqxV5.HkO-i34frCfGQlt7rfRm5LeZqOpLi4rkd6IxXM";
    public static void main(String[] args) {
        JDA capybarus = JDABuilder.createDefault(BOT_TOKEN)
                .enableIntents(GatewayIntent.MESSAGE_CONTENT).build();

        capybarus.addEventListener(new InitialListener());
        capybarus.addEventListener(new MessagesListener());
    }
}
