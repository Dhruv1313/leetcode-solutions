class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)
        return 0;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        int count = 0;
        int previousEnd = intervals[0][1];
        for(int i=1; i< intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start < previousEnd){
                count++;
            } else {
                previousEnd = end;
            }
        }
        return count;
    }
}