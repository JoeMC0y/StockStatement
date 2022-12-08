package edu.neumont.csc180.winters.dylan.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import edu.neumont.csc180.winters.dylan.object.Person;
import edu.neumont.csc180.winters.dylan.object.Trades;

public class jsonreader{

    private static JSONArray data;

    public static void readJSON(String path) {
        JSONParser parser = new JSONParser();

        try(FileReader reader = new FileReader(path)) {
            data = (JSONArray) parser.parse(reader);
        }catch (ParseException | IOException e){
            e.printStackTrace();
        }

    }

    public static List<Person> getPersonsFromData() {
        List
    }


}