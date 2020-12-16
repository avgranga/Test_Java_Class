package com.company;

public class gameLogic {

    public int winnerCalc(int[] currentHand, int startType, int thumb) {

        boolean thumbFlag = false;
        int maxThubb = 0;
        int maxType = 0;
        int winner = 0;

        for (int i = 1; i < 5; i++) {
            int tempCardType = currentHand[i] / 100;
            int tempCardValue = currentHand[i] - (tempCardType * 100);

            if (thumb == tempCardType) {
                thumbFlag = true;

                if (maxThubb < tempCardValue) {
                    maxThubb = tempCardValue;
                    winner = i;
                }
            }
            if (!thumbFlag) {
                if (startType == tempCardType) {
                    if (maxType < tempCardValue) {
                        maxType = tempCardValue;
                        winner = i;
                    }

                }

            }

        }

        return winner;

    }
}
