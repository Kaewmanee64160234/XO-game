/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superxo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SuperXO {
    
    public String[][] list = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    public String start;
    public String turn;
    public boolean confirm;
    public int row;
    public int column;
    public boolean isEnd = false;

    Scanner sc = new Scanner(System.in);

    public void showTable(){
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list[i].length; j++) {
                    System.out.print(" "+list[i][j] + " ");
                }
                System.out.println();
            }
}
    public void changeTurn() {
        if (turn.equals("X")) {
            turn = "O";
        } else {
            turn = "X";
        }
    }
    
        public void showTurn() {
        System.out.println("--------------------------------");
        System.out.println("Turn >>> " + turn.toUpperCase());
    }
        
        public void reset() {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                list[i][j] = "-";
            }
        }
    }
            
        public boolean continute() {
        System.out.print("You want to play again (Y/N) : ");
        String str = sc.next();
        while (!str.toLowerCase().equals("n") && !str.toLowerCase().equals("y")) {
            System.out.print("You want to play again (Y/N) : ");
            str = sc.next();
        }
        if (str.equals("n")) {
            isEnd = true;
            System.out.println("GoodBye!!");
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
         SuperXO project = new SuperXO();
         project.showTable();
    }
    
    
}
