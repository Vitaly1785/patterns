package TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar And Milk");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    protected String getUserInput(){
        String answer = null;

        System.out.println("Would You Like Sugar And Milk In Your Coffee? y/n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                answer = reader.readLine();
            } catch (IOException e) {
                System.err.println("IO Error trying to read your answer");
            }
            if (answer == null){
                return "no";
            }
        return answer;
    }
}
