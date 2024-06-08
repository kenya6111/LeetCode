package recursion.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class pr5 {

    public static String diceStreakGamble(int[] player1, int[] player2, int[] player3, int[] player4){
        // 関数を完成させてください
        HashMap<int[],String> map = new HashMap<>();
        map.put(player1,"player1");
        map.put(player2,"player2");
        map.put(player3,"player3");
        map.put(player4,"player4");
        ArrayList<int[]> darr = new ArrayList<>();
        darr.add(player1);
        darr.add(player2);
        darr.add(player3);
        darr.add(player4);

        int[] winner=player1;
        int winnerPoint=0;
        ArrayDeque<int[]> playerque = new ArrayDeque<>();

        for(int[] player: darr){
            ArrayDeque<Integer> pointque = new ArrayDeque<>();
            int currentPlayerPoint=4;
            pointque.addFirst(player[0]);
            for(int i=1;i<player.length;i++){
                if(player[i] <pointque.getFirst()){
                    currentPlayerPoint=0;
                    pointque.addLast(player[i]);
                }else{
                    pointque.addFirst(player[i]);
                }
                currentPlayerPoint+=4;
            }

            if(currentPlayerPoint>winnerPoint){
                winnerPoint=currentPlayerPoint;
                winner=player;
                playerque.addFirst(player);
            }

        }


        return " Winner: "+map.get(playerque.getFirst())+" won "+winnerPoint+" by rolling" +"["+winner[0]+","+winner[1]+","+winner[2]+"]";
    }
    public static void main(String[] args){
        System.out.println("aaa");

        System.out.println(diceStreakGamble(new int[]{1,2,3},new int[]{3,4,2},new int[]{4,2,4}, new int[]{6,16,4}));


     }
}

// 賭けサイコロゲーム
// easy
// Mike は友達 3 人とお金を賭けながらサイコロゲームで遊んでいます。このゲームでは 36 面で構成されているサイコロを n 回振ることができサイコロの目が出ると$4獲得し、蓄積していくことができます。ただし、出た目が前に自分が出した目の数字よりも低い場合、バーストし、今までの蓄積は全て失われます。バーストは $4 獲得の前に起こります。

// プレイヤーのサイコロ目を表す配列 player1、player2、player3、player4 が与えられるので、勝利プレイヤー、その金額、勝利を決定した連続部分配列を文字列として返す、diceStreakGamble という関数を作成してください。ただし、最終的に獲得した金額が同じ場合は最初にサイコロを投げた人を優先してください。このゲームではプレイヤー1、2、3、4の順にサイコロを投げます。

// 関数の入出力例

// 入力のデータ型： integer[] player1, integer[] player2, integer[] player3, integer[] player4

// 出力のデータ型： string

// diceStreakGamble([1,2,3],[3,4,2],[4,2,4],[6,16,4]) --> Winner: Player 1 won $12 by rolling [1,2,3]

// diceStreakGamble([1,2,3,-1,4,5],[3,4,2],[4,2,4],[6,16,4]) --> Winner: Player 1 won $12 by rolling [-1,4,5]

// diceStreakGamble([4,3,2,1],[4,3,2,1],[4,3,2,1],[4,3,2,1]) --> Winner: Player 1 won $4 by rolling [1]

// diceStreakGamble([1,2,3],[3,4,2],[4,2,4],[6,16,26]) --> Winner: Player 1 won $12 by rolling [1,2,3]

// diceStreakGamble([1,2,1],[3,4,2],[4,2,4],[6,16,26]) --> Winner: Player 4 won $12 by rolling [6,16,26]

// diceStreakGamble([5,19,19,20],[23,23,32,5],[20,23,30,23],[12,20,24,29]) --> Winner: Player 1 won $16 by rolling [5,19,19,20]

// diceStreakGamble([10,9,9,9,1,4],[10,9,9,9,1,4],[0,1,3,6,2,8],[1,2,2,1,0,1]) --> Winner: Player 1 won $8 by rolling [1,4]

// diceStreakGamble([2,45,56,6,4,10,34,20,3,4],[20,45,56,6,4,3,5,3,2,20],[3,4,20,20,21,30,33,35,35,36],[3,4,20,45,56,6,4,3,5,9]) --> Winner: Player 3 won $40 by rolling [3,4,20,20,21,30,33,35,35,36]
