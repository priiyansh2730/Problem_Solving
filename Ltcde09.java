class Solution {
    public boolean isPalindrome(int x) {
        int pop = x;
        int ans = 0 ;
        if(x<0) return false;
        while(pop>0){
            ans = ans*10 + (pop%10);
            pop/=10;
        }
        if(x==ans) return true;
        return false;
    }
}