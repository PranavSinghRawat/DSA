class Solution {
    public long sumAndMultiply(int n) {
        Stack<Integer> st=new Stack<>();
        while(n>0){
            int ld=n%10;
            if(ld!=0){
                st.push(ld);
            }
            n=n/10;
        }
        long x=0;
        long sum=0;
        while(!st.isEmpty()){
            x=x*10+st.peek();
            sum=sum+st.peek();
            st.pop();
        }
        return x*sum;
    }
}