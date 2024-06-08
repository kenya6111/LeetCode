package easy;

public class leet252 {
    public static boolean canAttendMeetings(int[][] intervals) {

        boolean[] aaa= new boolean[100];
        for(int i=0;i<intervals.length;i++){

            int first=intervals[i][0];
            int second=intervals[i][1];
            for(int j =first; j<=second;j++){
                if( aaa[j]==true){
                    return false;
                }
                aaa[j]=true;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("aaa");

        int[][] aaa= new int[][]{{0,30},{5,10},{15,20}};
        System.out.println(canAttendMeetings(aaa));;

    }
}


// Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.
// Example 1:
// Input: intervals = [[0,30],[5,10],[15,20]]
// Output: false

// Example 2:
// Input: intervals = [[7,10],[2,4]]
// Output: true