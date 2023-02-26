package OtherQues;

import java.util.Arrays;
public class Que5b {
    public static int batteryReplacement(int[][] serviceCenters, int targetMiles, int startChargeCapacity) {
        Arrays.sort(serviceCenters, (a, b) -> a[0] - b[0]);
        int count = 0;
        int curMiles = startChargeCapacity;
        int i = 0;
        while (curMiles < targetMiles) {
            int maxMiles = 0;
            while (i < serviceCenters.length && serviceCenters[i][0] <= curMiles) {
                maxMiles = Math.max(maxMiles, serviceCenters[i][1]);
                i++;
            }
            if (maxMiles == 0) {
                return -1;
            }
            curMiles = maxMiles + curMiles;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] serviceCenters = {{10,60},{20,30},{30,30},{60,40}};
        int targetMiles = 100;
        int startChargeCapacity = 10;
        System.out.println(batteryReplacement(serviceCenters, targetMiles, startChargeCapacity)); // output: 3
    }


}