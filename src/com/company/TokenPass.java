package com.company;

public class TokenPass {
    private int playerCount;
    private int [] Board;
public TokenPass(int playerCount){
    this.playerCount=playerCount;
}
public int [] getBoard(){
for(int i=0; i<playerCount;i++){
   Board[i] = (int) ((Math.random()*9)+1);
}
return Board;
}
}
