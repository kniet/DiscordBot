package com.kniet.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static String readFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/applicationProperties.txt"));
            String line = reader.readLine();
            reader.close();
            return line;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
