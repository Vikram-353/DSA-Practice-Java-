package questions.Arrays.MaxAreaofLongDiagonal;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAreaofLongDiagonal {
    public static void main(String[] args) {
        int[][] diaognal = { { 6, 5 }, { 8, 6 }, { 2, 10 }, { 8, 1 }, { 9, 2 }, { 3, 5 }, { 3, 5 } };
        System.out.println(areaOfMaxDiagonal(diaognal));
        ;

    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        if (dimensions == null) {
            return 0;
        }
        double area = 0;
        double maxDiagonal = Integer.MIN_VALUE;
        ArrayList<Integer> len = new ArrayList<>();
        for (int i = 0; i < dimensions.length; i++) {
            double diagonal = Integer.MIN_VALUE;
            diagonal = Math.sqrt(Math.pow(dimensions[i][0], 2) + Math.pow(dimensions[i][1], 2));
            if (maxDiagonal < diagonal) {
                maxDiagonal = Math.max(maxDiagonal, diagonal);
                len.clear();
                len.add(i);
            } else if (maxDiagonal == diagonal) {
                len.add(i);
            }

        }
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < len.size(); i++) {
            area = dimensions[len.get(i)][0] * dimensions[len.get(i)][1];
            if (area >= maxArea) {
                maxArea = (int) area;
            }
        }
        return maxArea;

    }
}
