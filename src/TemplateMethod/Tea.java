package TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return getUserInput().toLowerCase().startsWith("y");
    }
    protected String getUserInput(){
        String answer = null;
        System.out.println("Would You Like Lemon with Your Tea? y/n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = reader.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
