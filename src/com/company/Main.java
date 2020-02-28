package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String month = s.nextLine().toUpperCase();
        monthResolver(month);
    }

    public static void monthResolver(String month) {
        Seasons season = null;
        switch (month) {
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                season = Seasons.WINTER;
                break;
            case "MARCH":
            case "APRIL":
            case "MAY":
                season = Seasons.SPRING;
                break;
            case "JUNE":
            case "JULY":
            case "AUGUST":
                season = Seasons.SUMMER;
                break;
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
                season = Seasons.AUTUMN;
                break;
            default:
                System.out.println("No such month");
                break;
        }
        if (season != null) System.out.println(season.toString());
    }
}
