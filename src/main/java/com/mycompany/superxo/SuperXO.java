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
    }

}
