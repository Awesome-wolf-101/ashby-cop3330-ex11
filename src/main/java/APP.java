/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        System.out.println("How many euros are you exchanging?");
        Scanner sc = new Scanner(System.in);
        String NumEuros = sc.nextLine();
        System.out.println("What is the exchange rate? ");
        String ExchangeRate = sc.nextLine();


        double NumEurosDouble = Double.parseDouble(NumEuros);
        double ExchangeRateDouble = Double.parseDouble(ExchangeRate);


        double RoundTotal = Math.round((NumEurosDouble * ExchangeRateDouble) * 100.0) / 100.0;
        String OutputString = NumEuros + " euros at an exchange rate of " + ExchangeRate + " is \n" + RoundTotal + " U.S. dollars.";
        System.out.println(OutputString);




    }
}
