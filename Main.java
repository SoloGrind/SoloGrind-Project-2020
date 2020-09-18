package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        operation menu = new operation();
        menu.mainMenu();
    }
}

class operation {
    int Value;
    int Subtraction;
    int previousAmountAdd;
    char stopAdd = '\0';

    void MethodAddition(int amount) {
        if (amount > 0) {
            Value = Value + amount;
            previousAmountAdd = Value;
        }
    }
     void MethodSubtraction(int amount) {
        Value = Value - amount;
        previousAmountAdd = Value;
     }
     void MethodMultiplication(int amount) {
        Value = Value * amount;
        previousAmountAdd = Value;
     }
     void MethodDivision(int amount) {
        Value = Value / amount;
        previousAmountAdd = Value;
    }

      void MethodErase(int amount) {
        Value = amount;
        previousAmountAdd = Value;

      }

    void mainMenu() {
        Scanner input = new Scanner(System.in);
        char inside = '\0';
        System.out.println("======================================================================================");
        System.out.println("================================Welcome=to=CalTextulator==============================");
        System.out.println("======================================================================================");
        System.out.println("========================Please=select=a=letter=you=want=to=use========================");


        do {
            System.out.println("======================================================================================");
            System.out.println("A. Addition B. Subtraction C. Multiplication D. Division F. ERASE NUMBER E. Exit");
            System.out.println("======================================================================================");
            inside = input.next().charAt(0);

            switch(inside) {

                case 'A':
                        System.out.print("Please insert a number: ");
                       int amount = input.nextInt();
                      MethodAddition(amount);
                      System.out.println("The amount is : " + previousAmountAdd);
                    break;

                case 'B':
                    System.out.print("Please insert a number: ");
                    int amount1 = input.nextInt();
                     MethodSubtraction(amount1);
                     System.out.println("The amount is : " + previousAmountAdd);
                     break;

                case 'C':
                   System.out.print("Please insert a number: ");
                   int amount2 = input.nextInt();
                   MethodMultiplication(amount2);
                   System.out.println("The amount is : " + previousAmountAdd);
                   break;

                case 'D':
                    System.out.print("Please insert a number: ");
                    int amount3 = input.nextInt();
                    MethodDivision(amount3);
                    System.out.println("The amount is : " + previousAmountAdd);
                    break;

                case 'F':
                    MethodErase(0);
                    System.out.println("The amount is : " + previousAmountAdd);
                    break;

                case 'E':
                    System.out.println("Thank you for using CalTextulator!");
                    break;

                default :
                    System.out.println("Please choose within the options only.");

                }




        } while (inside != 'E');



    }
}