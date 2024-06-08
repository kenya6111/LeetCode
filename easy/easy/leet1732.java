package easy;
public class leet1732 {

    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        // Highest altitude currently is 0.
        int highestPoint = currentAltitude;
        
        for (int altitudeGain : gain) {
          // Adding the gain in altitude to the current altitude.
            currentAltitude += altitudeGain;
          // Update the highest altitude.
            highestPoint = Math.max(highestPoint, currentAltitude);
        }
        return highestPoint;
    }

    public static void main(String[] args){
        int[] num={-5,1,5,0,-7};

        System.out.println(largestAltitude(num));

    }
}
