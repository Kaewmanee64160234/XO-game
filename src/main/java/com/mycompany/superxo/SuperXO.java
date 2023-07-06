/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superxo;

import java.util.Arrays;
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
    
    public void checkStart() {
        System.out.println("Welcome to XO Game");
        System.out.print("Start XO Games? (Y/N)");
        start = sc.nextLine().toLowerCase();
        if( start.equals("y")) {
            confirm = true;
        }if( start.equals("n")) {
            confirm = false;
        }else {
           System.out.print("Start XO Games? (Y/N)");
           start = sc.nextLine().toLowerCase();
        }
    }
    
    public void checkNawTang() {
        for(int i = 0; i<list.length;i++) {
            if(list[i][column].toLowerCase().equals(turn)) {
                
            }
        }
    }

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
    
        
    public static void main(String[] args) {
         SuperXO project = new SuperXO();
         project.checkStart();
         project.showTable();
         project.checkNawTang();
    }
    
    
}
