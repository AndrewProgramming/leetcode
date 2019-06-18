package question179;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] x = {3,30,34,5,9};
        Solution ins = new Solution();
        System.out.print(ins.largestNumber(x));
    }
    public String largestNumber(int[] nums) {
        String[]s = new String[nums.length];
        for(int i = 0;i < nums.length;i++)
            s[i] = ""+nums[i];
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return -(o1+o2).compareTo(o2+o1);
            }
        });
        for (String item:s){
            System.out.print(item+" ");

        }
        System.out.println();

        if(s[0].equals("0"))return "0";
        String ans = "";
        for(int i = 0;i < s.length;i++)
            ans += s[i];
        return ans;
    }
}