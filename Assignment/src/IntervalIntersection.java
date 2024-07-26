import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {

    public static int[][] intervalIntersection(int[][] intervals1, int[][] intervals2) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < intervals1.length && j < intervals2.length) {
            int start1 = intervals1[i][0];
            int end1 = intervals1[i][1];
            int start2 = intervals2[j][0];
            int end2 = intervals2[j][1];

            // Find the intersection of intervals1[i] and intervals2[j]
            int start = Math.max(start1, start2);
            int end = Math.min(end1, end2);

            if (start <= end) {
                result.add(new int[]{start, end});
            }

            // Move the pointer that points to the interval with the smaller end time
            if (end1 < end2) {
                i++;
            } else {
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] intervals2 = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};

        int[][] intersections = intervalIntersection(intervals1, intervals2);

        System.out.println("Intersection:");
        for (int[] interval : intersections) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
