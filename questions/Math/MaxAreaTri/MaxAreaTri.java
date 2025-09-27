package questions.Math.MaxAreaTri;

import java.util.Arrays;

public class MaxAreaTri {
    public static void main(String[] args) {
        int[][] points = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 0, 2 }, { 2, 0 } };
        System.out.println(largestTriangleArea(points));
    }

    public static double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        if (points.length < 3) {
            return maxArea;
        }

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    int x1 = points[i][0];
                    int x2 = points[j][0];
                    int x3 = points[k][0];
                    int y1 = points[i][1];
                    int y2 = points[j][1];
                    int y3 = points[k][1];

                    double area = ((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)));
                    area = Math.abs(area) / 2;
                    if (area >= maxArea) {
                        maxArea = area;
                    }
                }
            }

        }
        return maxArea;
    }
}
