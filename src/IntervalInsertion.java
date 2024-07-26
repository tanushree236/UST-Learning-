import java.util.ArrayList;
import java.util.List;

public class IntervalInsertion {
    public static int[][] intervalInsertion(int interval1[][],int interval2[][]){
        List<int[]> result = new ArrayList<>();
        int i=0;int j=0;
        while (i<interval1.length && j<interval2.length){
            int start1=interval1[i][0];
            int end1=interval1[i][1];
            int start2=interval2[j][0];
            int end2=interval2[j][1];

            int start=Math.max(start1,start2);
            int end=Math.min(end1,end2);

            if(start<=end){
                result.add(new int[]{start,end});
            }
            if(end1<end2){
                i++;
            }else{
                j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        int [][] interval1={{0,2},{5,10},{13,23},{24,25}};
        int [][] interval2={{1,5},{8,12},{15,24},{25,26}};

        int [][] insertions=intervalInsertion(interval1,interval2);

        System.out.println("Output");
        for(int[] interval:insertions){
            System.out.println("["+interval[0]+","+interval[1]+"]");
        }
    }
}
