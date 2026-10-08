/*

Task 2

A digital clock displays the time in hours, minutes, and seconds (input values h, m, s).
What time will the clock display one second later?
Output h, m, and s. All three values (h, m, s) must be entered using the keyboard.


paprasom vartotojo, kad suvestu, parodom, ka suvede

seconds padidinam 1

jei seconds == 60
    seconds = 0
    minutes padidinam 1

jei minutes == 60
    minutes = 0
    hour padidinam 1

jei hour == 24
    hour = 0
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an hour range 0 - 23: ");
        int hour = scanner.nextInt();

        System.out.print("Please enter the minutes range 0 - 59: ");
        int minutes = scanner.nextInt();

        System.out.print("Please enter the seconds range 0 - 59: ");
        int seconds = scanner.nextInt();

        System.out.println("The time value you have entered is: " + hour + ":"
                + minutes + ":" + seconds);

        seconds++;

        if (seconds == 60){
            seconds = 0;
            minutes++;
        }
        if (minutes == 60){
            minutes = 0;
            hour++;
        }

        if(hour == 24) {
            hour = 0;
        }

        System.out.println("The time one second later is: " + hour + ":"
                + minutes + ":" + seconds);

    }
}