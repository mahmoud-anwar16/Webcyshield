package com.page;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Json {

        public static String getValue(String filePath, String key) throws IOException {

            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));

            JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);

            String value = jsonObject.get(key).getAsString();

            return value;
        }
}
