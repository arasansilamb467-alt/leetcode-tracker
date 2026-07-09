// Last updated: 7/9/2026, 10:15:21 AM
class Solution {
    public int reverse(int x) {
        int reversed=0;
        while(x!=0){
            int lastdigit=x%10;
            x/=10;
            if(reversed>Integer.MAX_VALUE/10 || (reversed==Integer.MAX_VALUE / 10 && lastdigit>7)){
                return 0;
            }
            if(reversed<Integer.MIN_VALUE/10 || (reversed==Integer.MIN_VALUE / 10 && lastdigit<-8)){
                return 0;
            }
            reversed=reversed*10+lastdigit;
        }
        return reversed;
    }
}