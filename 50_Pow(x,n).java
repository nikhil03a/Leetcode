class Solution {
    public double myPow(double x, double n) {
        double ans = 1;
        double pow = n;
        if(n<0) pow*=-1;
        while(pow>0){
            if(pow%2==1){
                ans=ans*x;
            }
            x=x*x;
            pow=(int)(pow)>>1;
        }
        if(n>0)
            return ans;
        else
            return (double)(1.0/ans);
    }
}
