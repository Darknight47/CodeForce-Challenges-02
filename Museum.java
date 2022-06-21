/*
* ------------------ 731A Night at the Museum -------------------- *
Embosser is a special devise that allows to "print" the text of a plastic tape.
Text is printed sequentially, character by character.
The device consists of a wheel with a lowercase English letters written in a circle,
static pointer to the current letter and a button that print the chosen letter.
At one move it's allowed to rotate the alphabetic wheel one step clockwise or counterclockwise.
Initially, static pointer points to letter 'a'. Other letters are located as shown on the picture:

After Grigoriy add new item to the base he has to print its name on the plastic tape and attach it to the corresponding exhibit. It's not required to return the wheel to its initial position with pointer on the letter 'a'.

Our hero is afraid that some exhibits may become alive and start to attack him, so he wants to print the names as fast as possible. Help him, for the given string find the minimum number of rotations of the wheel required to print it.

Input
The only line of input contains the name of some exhibit — the non-empty string consisting of no more than 100 characters. It's guaranteed that the string consists of only lowercase English letters.

Output
Print one integer — the minimum number of rotations of the wheel, required to print the name given in the input.

Input:
zeus

Output:
18
*/
import java.util.Scanner;

public class Museum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] alfa = str.toCharArray();
        int start = Math.abs('a'- alfa[0]);
        int startChar = 26 - Math.abs('a'- alfa[0]);
        int startDis = Math.min(start, startChar);
        int answer = startDis;
        for (int i = 0; i < alfa.length - 1; i++) {
            char first = alfa[i];
            char second = alfa[i+1];
            int a = Math.abs(first-second);
            int b = 26 - Math.abs(first-second);
            int distance = Math.min(a, b);
            answer += distance;
        } 
        System.out.println(answer);
        input.close();
    }
}
