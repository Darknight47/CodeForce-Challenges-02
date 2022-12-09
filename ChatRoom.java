/*
Vasya has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say
hello to everybody. Vasya typed the word s. It is considered that Vasya managed to say hello if several letters can
be deleted from the typed word so that it resulted in the word "hello". For example, if Vasya types the word
"ahhellllloou", it will be considered that he said hello, and if he types "hlelo", it will be considered that Vasya
got misunderstood and he didn't manage to say hello. Determine whether Vasya managed to say hello by the given word s.


Input
The first and only line contains the word s, which Vasya typed. This word consisits of small Latin letters, its length is no less that 1 and no more than 100 letters.

Output
If Vasya managed to say hello, print "YES", otherwise print "NO".

Input:
ahhellllloou

Output:
YES

Input:
hlelo
 
*/


import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] arr = str.toCharArray();
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            if(answer.isEmpty() && temp == 'h')
            {
                answer += temp;
            }
            else if(answer.equals("h") && temp == 'e')
            {
                answer += temp;
            }
            else if(answer.equals("he") && temp == 'l')
            {
                answer += temp;
            }
            else if(answer.equals("hel") && temp == 'l')
            {
                answer += temp;
            }
            else if(answer.equals("hell") && temp == 'o')
            {
                answer += temp;
            }
        }
        if(answer.equals("hello"))
            System.out.println("YES");
        else
            System.out.println("NO");

        input.close();
    }
}
