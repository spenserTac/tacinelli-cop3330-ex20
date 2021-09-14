/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_20{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String temp_order_amount = scanner.nextLine();
        float order_amount = Float.parseFloat(temp_order_amount);

        System.out.print("What state do you live in? ");
        String current_state = scanner.nextLine();
        current_state = current_state.toLowerCase();

        String current_county = "";

        double tax = 0;

        if(current_state.equals("wisconsin")){

            System.out.print("What county do you live in? ");
            current_county = scanner.nextLine();
            current_county = current_county.toLowerCase();

            if(current_county.equals("eau")){
                tax = 0.055;
            }
            else if(current_county.equals("dunn")){
                tax = 0.054;
            }
            else{
                tax = 0.05;
            }
        }
        else{
            tax = 0.008;
        }

        double total = (tax * order_amount) + order_amount;
        double taxed = tax * order_amount;

        System.out.println("The tax is $" + String.format("%.2f", taxed) +
                ". \nThe total is $" + String.format("%.2f", total) + ".");
    }
}