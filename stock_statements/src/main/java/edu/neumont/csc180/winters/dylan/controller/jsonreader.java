package edu.neumont.csc180.winters.dylan.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import edu.neumont.csc180.winters.dylan.object.Person;
import edu.neumont.csc180.winters.dylan.object.Trades;
import edu.neumont.csc180.winters.dylan.object.person;

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

    private static Person makePerson(JSONObject p) {
        Person person = new Person();
        person.setAccNum((int) p.get("account_number"));
        person.setSsn((String) p.get("ssn"));
        person.setFName((String) p.get("first_name"));
        person.setLName((String) p.get("last_name"));
        person.setEmail((String) p.get("email"));
        person.setPhone((String) p.get("phone"));
        person.setBegin((double) p.get("beginning_balance"));
        person.setTrades(getTrades((JSONArray) p.get("stock_trades")));
        return person;
    }

    private static List<Trades> getTrades(JSONArray d) {
    List<Trades> trades = new ArrayList<>();

        for (Object t : d){
            JSONObject trade = (JSONObject) t;
            Trades tradee = new Trades();
            tradee.setBuySell((String) trade.get("type"));
            tradee.setSharePrice((double) trade.get("price_per_share"));
            tradee.setShares((int) trade.get("count_shares"));
            tradee.setSymbol((String) trade.get("stock_symbol"));

            trades.add(tradee);
        }

        return trades;

    }

    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        for (Object o : data){
            Person person = makePerson((JSONObject) o);
            people.add(person);
        }

        return people;
    }




}