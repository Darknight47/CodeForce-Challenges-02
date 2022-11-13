/*
* ----------- 620A Professor GukiZ's Robot -------------------- 
Professor GukiZ makes a new robot. The robot are in the point with coordinates (x1, y1)
and should go to the point (x2, y2). In a single step the robot can change any of its
coordinates (maybe both of them) by one (decrease or increase). So the robot can move in
one of the 8 directions. Find the minimal number of steps the robot should make to get the
finish position.

Input
The first line contains two integers x1, y1 ( - 10^9 ≤ x1, y1 ≤ 10^9) — the start position of the robot.

The second line contains two integers x2, y2 ( - 10^9 ≤ x2, y2 ≤ 10^9) — the finish position of the robot.

Output
Print the only integer d — the minimal number of steps to get the finish position.


Input:
0 0
4 5

Output:
5

*/

import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int xdiff = Math.abs(x2 - x1);
        int ydifff = Math.abs(y2 - y1);

        if(ydifff > xdiff)
        {
            System.out.println(ydifff);
        }
        else
        {
            System.out.println(xdiff);
        }

        input.close();
    }
}
