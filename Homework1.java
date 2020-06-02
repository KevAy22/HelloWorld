/*
Write a program that does some "magic" math. Here are the steps you need to take / follow.

First, define an integer variable and assign it any value of your choice. Then you'll need to perform the following operations with it:
Add 9
Multiply by 2
Subtract 4
Divide by 2
Subtract by the variable's original value
Finally, display what the end result is.
Once your math / code is complete, double check your work by seeing what happens with the end result when you use different starting values. You should notice something "interesting".

Kevin Ayala
N. Pallares
CSC 110AB
02 June 2020


 */


package CSC110AB;

public class Homework1 {

    public static void main(String[] args) {
        int a = 6; // int variable that is declared
        System.out.println("The result is " + (((((a + 9) * 2)-4) /2) -a)); // calculation
    }
}