package edu.neumont.csc180.winters.dylan.controller;

import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import edu.neumont.csc180.winters.dylan.object.Person;
import edu.neumont.csc180.winters.dylan.object.Trades;

public class htmlwriter {
    private static DateFormat format = new SimpleDateFormat("MM/d/yyyy HH:mm");
    private static Date dateTime = new Date();

    public static void writeHTML(List<Person> people){
        for (Person person : people){
            StringBuilder s = new StringBuilder();
            s.append("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><title>Document</title></head>");
            s.append("<body>");
            s.append(String.format("<p>date created: %s</p>", format.format(dateTime)));
            s.append(String.format(" <h1>%s %s Acc#:%s</h1>", person.getFName(), person.getLName(), person.getAccNum()));
            s.append(String.format("<p>phone: %s</p>", person.getPhone()));
            s.append(String.format("<p>email: %s</p>", person.getEmail()));
            s.append(String.format("<p>ssn: %s</p>", person.getSsn()));
            s.append("<br><br>");
            s.append("<table><tr><th>Type</th><th>Symbol</th><th>Shares</th><th>Share price</th><th>Total</th></tr>");
            for (Trades trade : person.getTrades()){
                s.append("<tr>");
                s.append(String.format("<td> %s </td>", trade.getBuySell()));
                s.append(String.format("<td> %s </td>", trade.getSymbol()));
                s.append(String.format("<td> %s </td>", trade.getShares()));
                s.append(String.format("<td> $ %s </td>", trade.getSharePrice()));
                s.append(String.format("<td> $ %s </td>", trade.getTotal()));
                s.append("</tr>");
            }

            s.append(String.format("<h3> Balance: $ %s</h3>", person.getCash()));
            s.append(String.format("<h3> Shares Value: $ %s</h3>", person.getStocks()));
            s.append("</body></html>");

            

            String html = s.toString();

            writeFiles(html, person.getAccNum());
        }
    }

    private static void writeFiles(String html, long acc){
        try (OutputStream outputStream = new FileOutputStream(String.format("stock_statements/src/main/java/edu/neumont/csc180/winters/dylan/htmlfiles/%s.html", acc))){
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);
            writer.write(html);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
