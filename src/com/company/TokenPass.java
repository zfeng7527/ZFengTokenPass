package com.company;

public class TokenPass {
    private int playerCount,currentPlayer,holder;

    int[] Board = new int[10];

public TokenPass(int playerCount){
    this.playerCount=playerCount;
}

public int [] getBoard(){
for(int i=0; i < playerCount-1;i++){
   Board[i] = ((int) (Math.random()*9))+1;
}
return Board;
}

    public void distributeCurrentPlayertokens(){
     holder = Board[currentPlayer];
     int player = currentPlayer;
     Board[currentPlayer]=0;
     for(int i=holder; i>0; i--){
         player++;
         if(player > Board.length){
             player=0;
         }
         Board[player]++;
     }
    }

    public int getCurrentPlayer(){

    return currentPlayer;
    }

}
