package ExiaGame;

import java.io.*;
import java.util.*;

public class Solution {
static int calculate_bid(int player, int pos,int[] first_moves,int[] second_moves) {
        //Your logic to be put here
   int k;
    if(player==1){
        k=0;
        if(first_moves.length != 0)
        for(int i : first_moves){
              k = k+i;
        }
        k=100-k;
        if (k>=5)
        return 5;
        else 
            return 0;
    }
   if(player==2){
        k=0;
        if(first_moves.length != 0)
        for(int i : second_moves){
            k =k+i;
        }
        k=100-k;
        if (k>=5)
        return 5;
        else 
            return 0;
    }
        
    return 0;
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int player = in.nextInt();                     //1 if first player 2 if second
        int scotch_pos = in.nextInt();                 //position of the scotch
        int bid = 0;                                   //Amount bid by the player
        in.useDelimiter("\r\n");
       // in.next();
        String first_move = in.next();
     //  System.out.println(first_move);
       first_move.split(" ");
        String[] move_1 = first_move.split(" ");
       // System.out.println(move_1.length);
        String second_move = in.next();
        String[] move_2= second_move.split(" ");
        int[] first_moves = new int[move_1.length];
        int[] second_moves = new int[move_2.length];
        if(first_move.equals("")== false) {
            for (int i=0;i<move_1.length;i++) {
            	System.out.print("true");
                first_moves[i] = Integer.parseInt(move_1[i]);
                second_moves[i] = Integer.parseInt(move_2[i]);
            }
        }
        bid = calculate_bid(player,scotch_pos,first_moves,second_moves);
        System.out.print(bid);
    }
}
