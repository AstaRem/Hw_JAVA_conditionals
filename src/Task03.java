/*

Task 3

Leap years have 366 days, while non-leap years have 365.
Years that are not century years are leap years if they are divisible by 4.
Century years are leap years if they are divisible by 400.
For example, 1600 is a leap year, while 1700 is a non-leap year.

Write a program that determines whether the entered year is a leap year or a non-leap year.

Keliamieji metai turi dalintis is 4 be liekanos - tada 366d
paprasti, nekeliamieji(nesidalina is 4 be liekanos) 365d
taipogi, jei tai simtmetis - jei dalinasi is 400 be liekanos - keliamieji; nesidalina - nekeliamieji

metai/4 && o kaip abibrezti simtmeti? 1500, 1600, 100, 600?
dalinasi is 100 be liekanos
900/100=9
1600/100=16
1340/100=13.40

if (year%400==0 ||  (year%4==0 && year%100!=0){
this is leap year
}else{
not leap year
}

*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = scanner.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }

    }
}
