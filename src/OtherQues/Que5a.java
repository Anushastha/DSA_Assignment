package OtherQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Que5a {
    public static int[][] getBorderLine(int[][] height) {
        List<Integer> xCoords = new ArrayList<>();
        for (int[] h : height) {
            xCoords.add(h[0]);
            xCoords.add(h[1]);
        }
        Collections.sort(xCoords);

        int[][] keyPoints = new int[xCoords.size()][2];
        int prevHeight = 0;
        int index = 0;
        for (int x : xCoords) {
            int maxHeight = 0;
            for (int[] h : height) {
                if (x >= h[0] && x < h[1]) {
                    maxHeight = Math.max(maxHeight, h[2]);
                }
            }
            if (maxHeight != prevHeight) {
                keyPoints[index][0] = x;
                keyPoints[index][1] = maxHeight;
                prevHeight = maxHeight;
                index++;
            }
        }

        // trim keyPoints array to remove unused elements
        int[][] result = new int[index][2];
        for (int i = 0; i < index; i++) {
            result[i] = keyPoints[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] height = {{1,4,10},{2,5,15},{5,8,12},{9,11,1},{11,13,15}};
        int[][] borderLine = getBorderLine(height);
        for (int[] point : borderLine) {
            System.out.println(point[0] + "," + point[1]);
        }
    }
}