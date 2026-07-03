class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][] arr=new int[n+1][2];
        int k=0;
        boolean added=false;

        for(int i=0;i<n;i++){
            if(!added&&newInterval[0]<intervals[i][0]){
                arr[k++]=newInterval;
                added=true;
            }
            arr[k++]=intervals[i];
        }

        if(!added)
            arr[k++]=newInterval;

        int[][] res=new int[k][2];
        int start=arr[0][0],end=arr[0][1];
        int m=0;

        for(int i=1;i<k;i++){
            if(end>=arr[i][0]){
                end=Math.max(end,arr[i][1]);
            }else{
                res[m++]=new int[]{start,end};
                start=arr[i][0];
                end=arr[i][1];
            }
        }

        res[m++]=new int[]{start,end};
        return java.util.Arrays.copyOf(res,m);
    }
}