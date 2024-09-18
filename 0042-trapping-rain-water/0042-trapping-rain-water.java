class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxl=0,maxr=0,w=0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=maxl){
                    maxl=height[l];
                }
                else{
                    w+=maxl-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=maxr){
                    maxr=height[r];
                }
                else{
                    w+=maxr-height[r];
                }
                r--;
            }
        }
        return w;
    }
}