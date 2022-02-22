/*
package Curs10;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.util.Iterator;

public class JsonProcessor {
    public void writeJsonFile(){
        JSONObject obj = new JSONObject();
        obj.put("name", "testUser");
        JSONArray list = new JSONArray();
        list.add("Object 1");
        list.add("Object 2");
        list.add("Object 3");
        list.add("Object 4");

        obj.put("Lista Obiecte", list);
        try (FileWriter file= new FileWriter("test.json")) {
            file.write((obj.toJSONString()));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occured");
        }
        public void redJsonFile(){
        try {
            Reader reader = new FileReader("test.json");
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);
            String key = jsonObject.get("name");
            System.out.println(key);
            JSONArray obj = (JSONArray) jsonObject.get("listaObiecte");
            Iterator<String> it = obj.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        }
    }

}
*/
