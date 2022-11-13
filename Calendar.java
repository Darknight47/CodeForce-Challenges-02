/**
Petr wants to make a calendar for current month. For this purpose he draws a table in 
which columns correspond to weeks (a week is seven consequent days from Monday to Sunday),
rows correspond to weekdays, and cells contain dates. For example, a calendar for January 2017
should look like on the picture:

Petr wants to know how many columns his table should have given the month and the weekday of the first date of that month? Assume that the year is non-leap.

Input
The only line contain two integers m and d (1 ≤ m ≤ 12, 1 ≤ d ≤ 7) — the number of month (January is the first month, December is the twelfth)
and the weekday of the first date of this month (1 is Monday, 7 is Sunday).

Output
Print single integer: the number of columns the table should have.

Input:
1 7
Output:
6

*/
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int weekday = input.nextInt();

        if(month == 2)
        {
            if(weekday == 1)
            {
                System.out.println(4);
            }
            else
            {
                System.out.println(5);
            }
        }
        else if(month == 1 || month == 3 || month == 5 || 
                month == 7 || month == 8 || month == 10 ||
                month == 12)
        {
            if(weekday > 5)
            {
                System.out.println(6);
            }
            else {
                System.out.println(5);
            }
        }
        else
        {
            if(weekday > 6)
            {
                System.out.println(6);
            }
            else
            {
                System.out.println(5);
            }
        }

        input.close();
    }
}
