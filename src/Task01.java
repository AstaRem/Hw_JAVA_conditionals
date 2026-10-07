/*

Task 1

The first Summer Olympic Games were held in Athens in 1896.
After that, they were held or scheduled to be held every four years:
the second Games in 1900, the third in 1904, and so on.
Games that did not take place are still assigned an edition number,
and those years are still considered Olympic years.

Given a year M, determine the edition number of the Olympic Games if it is an Olympic year.
 Otherwise, state that it is not an Olympic year.
 The program must prompt the user to enter a year and display whether it is an Olympic year.

 ivesti metus, pradedant 1896 ir velesni
 visu pirma, ar tai olimpiniai metai, %4=0 - vadinasi , olimpiniai, jei lieka liekana - neolimpiniai
 jei olimpiniai, tai kelinti? nuo 1896.  (metai-1896)/4 = skaicius + 1(nes juk ne nuo nulio,
 o nuo vieno prasidejo skaiciavimas
 parodyti vartotojui, kad:
 metai olimpiniai(ar ne)
 jei taip- kelintos zaidynes tai yra

 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = scanner.nextInt();

        if (year >= 1896 && (year - 1896) % 4 == 0) {
            int olympics_number = (year - 1896) / 4 + 1;

            System.out.println("The year " + year + " is an Olympic year;");
            System.out.println("Olympic Games number is: " + olympics_number);
        } else {
            System.out.println(year + " No, the year you entered is not an Olympic year.");

        }

    }
}