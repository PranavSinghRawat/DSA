class Solution {
    public long hour(int[] piles,int n,int speed){
        long h=0;
        for(int i=0;i<n;i++){
            h=h+(piles[i]/speed);
            if(piles[i]%speed!=0) h++;
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int n=piles.length;
        int high=0;
        for(int i=0;i<n;i++){
            high=Math.max(high,piles[i]);
        }
        int res=-1;
        while(low<=high){
            int guess=(high+low)/2;
            long check=hour(piles,n,guess);
            if(check>h){
                low=guess+1;
            }else{
                res=guess;
                high=guess-1;
            }
        }
        return res;
    }
}