package question11;

class Solution {
    public int maxArea(int[] height) {
        int left = 0 ;
        int right = height.length-1;
        int maxArea  = -1;
        while(left<right){
            int width = right - left;
            int h = Math.min(height[left],height[right]);
            int area = width*h;
            if(area>maxArea){
                maxArea = area;
            }
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;

    }
}