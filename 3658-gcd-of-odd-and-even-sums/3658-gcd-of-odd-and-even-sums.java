class Solution {
    public int sumOdd(int n){
        return n*n;
    }
    public int sumEven(int n){
        return n*(n+1);
    }
    public int gcd(int n,int n1){
        if(n1==0){
            return n;
        }
        return gcd(n1,n%n1);
    }
    public int gcdOfOddEvenSums(int n) {
        int odd=sumOdd(n);
        int even=sumEven(n);
        return gcd(odd,even);
    }
}