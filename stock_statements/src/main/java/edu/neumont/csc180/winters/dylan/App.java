package edu.neumont.csc180.winters.dylan;

import java.util.List;

import edu.neumont.csc180.winters.dylan.controller.htmlwriter;
import edu.neumont.csc180.winters.dylan.controller.jsonreader;
import edu.neumont.csc180.winters.dylan.object.Person;

public final class App {
    public static void main(String[] args) {
        String jsonData = "stock_statements/src/main/java/edu/neumont/csc180/winters/dylan/data/thestocks.json";

        jsonreader.readJSON(jsonData);
        List<Person> people = jsonreader.getPeople();
        htmlwriter.writeHTML(people);
    }
}
