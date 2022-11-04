class Solution {
    public int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int i = 0, j = height.length-1;
        while(i<j){
            int w = j-i;
            int temp = w*Math.min(height[i],height[j]);
            ans = Math.max(ans,temp);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}