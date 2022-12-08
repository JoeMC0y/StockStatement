package edu.neumont.csc180.winters.dylan;

import edu.neumont.csc180.winters.dylan.controller.jsonreader;

public final class App {
    public static void main(String[] args) {
        String jsonData = "stock_statements/src/main/java/edu/neumont/csc180/winters/dylan/data/thestocks.json";

        jsonreader.readJSON(jsonData);
        System.out.println(jsonreader.getPeople());
    }
}
