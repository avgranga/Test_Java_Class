package com.company;


import java.util.Random;

public class Main {


    public static void main(String[] args) {


        cardMix cardmix = new cardMix();
        int [][] mixcards = cardmix.playersCard("Oombi",4);

        for (int i = 0; i < 4; i++) {
            System.out.println("Payer " + i + " cards");
            for (int j = 0; j < 8; j++) {
                System.out.println(mixcards[i][j]);
            }
        }

        playingOombi Oombiplay = new playingOombi();
        int[] currentHand = Oombiplay.Start();
        int startType = currentHand[0]/100;

        gameLogic gameL = new gameLogic();
        int winner = gameL.winnerCalc(currentHand,startType,3);

        System.out.println("Winner is player " + winner);

    }


}
