package com.company;

import java.util.Scanner;

public class playingOombi {

    String currentCardType;

    public int[] Start() {

        int[] currentTableCard = new int[5];
        int lastWinner;
        lastWinner = getLastWinner();
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Put Player " + lastWinner + " card ");
            currentTableCard[lastWinner] = keyboard.nextInt();
            if (i==0){
                currentTableCard[0]=currentTableCard[lastWinner];
            }
            if (lastWinner == 4) {
                lastWinner = 1;
            } else {
                lastWinner = lastWinner + 1;
            }
        }
        return currentTableCard;

    }

    public int getLastWinner() {
        int winner = 3;


        return winner;
    }


}
