package edu.eci.arep;

import static spark.Spark.*;

import java.util.ArrayList;

public class SparkWebServer {

    public static void main(String... args) {
        
        port(getPort());
        get("hello", (req, res) -> "Hello Docker!");
        get("collatzsequence", (req, res) -> {
            CollatzMader collatzMader = new CollatzMader(Integer.parseInt(req.queryParams("value")));
            collatzMader.makeCollatz();
            ArrayList<Integer> ans = collatzMader.getCollatzResult();
            String formatter = stringResFormat(ans);
            res.type("application/json");
            return "{\"operation\":\"collatzOperation\",\"input\":"+req.queryParams("value") +",\"output\":\""+ formatter +"\"}";
        });
    }

    private static String stringResFormat(ArrayList<Integer> ans) {
        String answer = ""+ ans.get(0) + " ";
        for(int i = 1 ; i < ans.size()-1; ++i){
            answer += "->" + String.valueOf(ans.get(i)) + " "; 
        }
        return answer;
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}