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

    public void showTable() {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(" " + list[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void inputRowandColumn() {
        System.out.print("Input row :");
        row = sc.nextInt();
        System.out.print("Input column :");
        column = sc.nextInt();
        if (((row > 0 && row < 4) && (column > 0 && column < 4))) {
            if (list[row - 1][column - 1].equals("-")) {
                list[row - 1][column - 1] = turn.toUpperCase();

            } else {

                while ((!(row > 0 && row < 4) && !(column > 0 && column < 4)) && (!list[row - 1][column - 1].equals("-"))) {

                    System.out.println("that row and Column is already exits.");
                    System.out.print("Input row :");
                    row = sc.nextInt();
                    System.out.print("Input column :");
                    column = sc.nextInt();
                }
                list[row - 1][column - 1] = turn.toUpperCase();

            }

        } else {
           
            return;
        }

    }

    public boolean checkDraw() {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i][j].toLowerCase().equals("-")) {
                    return false;
                }

            }

        }
        return true;
    }

    public void checkWin() {
        //check 3 style
        if (isEnd == false) {
            if (checkDraw()) {
                isEnd = true;
                System.out.println("+--------------------+");
                System.out.println("|    !!! Draw !!!    |");
                System.out.println("+--------------------+");
                // show table
                // ask to contonue
//                if(continute = true) => reset
//                else is end = true
            }
        }

    }

    public static void main(String[] args) {
        SuperXO project = new SuperXO();
        System.out.println("com.mycompany.superxo.SuperXO.main()");
        project.turn = "x";
        while (!project.isEnd) {
            project.inputRowandColumn();
            project.showTable();
        }
    }

}
