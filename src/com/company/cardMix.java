package com.company;

import java.util.Random;

public class cardMix {

    public int[] cardPacks(String packName, int mixNo){

        int tempMixNo=0;

        int oombiPack[] = {107, 108, 109, 110, 111, 112, 113, 114, 207, 208, 209, 210, 211, 212, 213, 214, 307, 308, 309, 310, 311, 312, 313, 314, 407, 408, 409, 410, 411, 412, 413, 414};
        int mixPack[] = new int[oombiPack.length];
        mixPack = oombiPack;

        Random rand = new Random();

        for (int i = 0; i < mixPack.length; i++) {
            int randomIndexToSwap = rand.nextInt(mixPack.length);
            int temp = mixPack[randomIndexToSwap];
            mixPack[randomIndexToSwap] = mixPack[i];
            mixPack[i] = temp;
        }
        return  mixPack;
    }

        public int[][] playersCard(String packName,int Pcnt){

        int[] Pack = cardPacks("Oombi",32);

        int PcardCnt = Pack.length / Pcnt;
        int[][] playCard = new int[Pcnt][PcardCnt];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                playCard[i][j] = Pack[k];
                k++;
            }
        }
        return playCard;

//        for (int i = 0; i < 4; i++) {
//            System.out.println("Payer " + i+ " cards");
//            for (int j = 0; j < 8; j++) {
//                System.out.println(playCard[i][j]);
//            }
//        }
    }
}
