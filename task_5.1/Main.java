package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/* 
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> addresses = new HashMap<>();
        while (true)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            String city = reader.readLine();
            if (city.isEmpty()) break;
            addresses.put(city, family);
        }

        String cityName = reader.readLine();

        System.out.println(addresses.get(cityName));
    }
}
