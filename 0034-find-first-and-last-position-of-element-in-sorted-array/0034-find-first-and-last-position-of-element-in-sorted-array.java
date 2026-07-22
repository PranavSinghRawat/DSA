class Solution {
    public int first(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                high=mid-1;
                first=mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;

    }
    public int last(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                low=mid+1;
                last=mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[]{-1,-1};
        ans[0]=first(nums,target);
        ans[1]=last(nums,target);
        return ans;
    }
}