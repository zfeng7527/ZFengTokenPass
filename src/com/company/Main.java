package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TokenPass testGame = new TokenPass(10);
        int [] testBoard = testGame.getBoard();
        System.out.println("Constructed a test board: ");
        for(int i=0;i<testBoard.length;i++){
            System.out.print(testBoard[i]+" ");
        }
        System.out.println();
        testGame.distributeCurrentPlayertokens();
        System.out.println("After distributing tokens  from player "+testGame.getCurrentPlayer()+": ");
        for (int i=0;i>testBoard.length;i++){
            System.out.print(testBoard[i]+" ");
        }
    }
}
