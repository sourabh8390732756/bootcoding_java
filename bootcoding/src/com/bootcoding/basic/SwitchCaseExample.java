package com.bootcoding.basic;

public class SwitchCaseExample {
    public static void main(String[] args) {
        String day = "Thursday";
        int month = 1;
        switch (day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Today is Holiday!");
        }

        switch (month){
            case 1:
                System.out.println("Current Month is January");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            case 8:
                System.out.println("Today is Sunday");
                break;
            case 9:
                System.out.println("Today is Sunday");
                break;
            case 10:
                System.out.println("Today is Sunday");
                break;
            case 11:
                System.out.println("Today is Sunday");
                break;
            case 12:
                System.out.println("Today is Sunday");

            default:
                System.out.println("Invalid Month");
        }
    }
}
