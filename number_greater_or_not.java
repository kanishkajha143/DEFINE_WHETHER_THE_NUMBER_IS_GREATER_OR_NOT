package Greater_Or_Not;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
       int myNumber = (int)(Math.random()*100);
       int userNumber = 0;

       do {
           System.out.println("Guess my number(1-100) : ");
           userNumber = sc.nextInt();

           if(userNumber == myNumber) {
               System.out.println("WOAH.. ITS CORRECT NUMBER!!!");
               break;
           }
           else if(userNumber > myNumber) {
               System.out.println("your number is too BIG");
           }
           else {
               System.out.println("your number is too SMALL");
           }
       } while(userNumber >= 0);

       System.out.print("My number was : ");
       System.out.println(myNumber);
   }
