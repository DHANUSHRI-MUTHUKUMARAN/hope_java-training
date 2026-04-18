import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]); // sort intervals by start time
        int n = intervals.length; // number of intervals
        int[][] temp = new int[n][2];// temporary array to store merged intervals
        int index = 0;
        temp[index] = intervals[0]; // initialize the first interval in temp
        for(int i=1;i<n;i++){
            if(intervals[i][0] <= temp[index][1])//current is less or eq to end of last merged interval, merge them by updating the end time
                temp[index][1] = Math.max(temp[index][1],intervals[i][1]);// update the end time of the last merged interval
            else{
                index++;
                temp[index] = intervals[i];// move to the next interval in temp and add the current interval
            }
        }
        return Arrays.copyOfRange(temp,0,index+1);// return the merged intervals from temp
    }
}
