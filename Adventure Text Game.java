package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     operation start = new operation();
	     start.GameMenu();

    }
}

class operation {
    int playerHealthStatus = 25;
    int mobHealthStatus = 20;
    int playerDamage = 3;
    int mobDamage = 3;
    int healHP = 3;

    void playerHealthDamaged() {  // This method is to attack the player.
        playerHealthStatus = playerHealthStatus - mobDamage;
        playerHealthStatus = playerHealthStatus;

    }
    void mobHealthDamage() { // this method is to attack the mob.
        mobHealthStatus = mobHealthStatus - playerDamage;
        mobHealthStatus = mobHealthStatus;
    }
    void playerHealthrecovery() { // this is recovery potion that gives 3 hp to the player.
        playerHealthStatus = playerHealthStatus + healHP;
        playerHealthStatus = playerHealthStatus;
    }

    void GameMenu() {
        Scanner input = new Scanner(System.in);
        char option = '\0';
        System.out.println("==================================================================================");
        System.out.println("                     Welcome to !<>! TEXT ADVENTURE REBORN !<>!                   ");
        System.out.println("==================================================================================");
        System.out.println("\n");
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        System.out.println("You are sent here to be train how to be THE BEST WARRIOR!");
        System.out.println("Goblin: Now Show me what you got newbie!");
        System.out.println("\n");
        System.out.println("Okay to use any action type the letters you want to activate.");
        System.out.println("Dont forget to set your keyboard on CAPSLOCK!");
        System.out.println("Goodluck Warrior!");
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        System.out.println();
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        System.out.println("A. Attack " + "\n" + "B. HEAL" + "\n" + "C. FLEE" );
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        System.out.println();
        do {
             option = input.nextLine().charAt(0);
             System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
             System.out.println("Player HP :" + playerHealthStatus);
             System.out.println("A. Attack " + "\n" + "B. HEAL" + "\n" + "F. FLEE" );
             System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
             System.out.println();
         switch(option) {

             case 'A': 
                 System.out.println("Player: HIYA! taste my sword you filthy beast!");
                 mobHealthDamage();
                 System.out.println("Goblin taken damage: " + playerDamage + " DAMAGE");
                 System.out.println("Goblin Health: " + mobHealthStatus);
                 playerHealthDamaged();
                 System.out.println("Goblin attacked: " +mobDamage + " DAMAGE");
                 System.out.println("Player health remaining : " + playerHealthStatus);
                  break;

             case 'B':
              System.out.println("Player: I need to win... *DRINKS HEALING POTION*");
              playerHealthrecovery();
              System.out.println("Player health has been recovered!");
              System.out.println("Player current Health: " + playerHealthStatus);
              System.out.println("Goblin: HA! you thought ill just watch you recover prepare to eat my attack!");
              mobHealthDamage();
              System.out.println("Goblin attacked: " + mobDamage + " DAMAGE");
              System.out.println("Player: You sneaky bastard!!!");
              break;
         }


         } while(option != 'F' && mobHealthStatus > 0 && playerHealthStatus > 0); // if the mob health or player health meet 0 the game will end or either press E to flee.
                 System.out.println("Thank you for playing!");
    }
}
