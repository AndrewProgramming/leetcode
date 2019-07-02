package question13;

import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Character, Integer> map = new HashMap<>();
    public int romanToInt(String s) {
        map.put('I',1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return rommanToInteger(s.toCharArray(),0,s.length()-1);


    }

    private int findMaxIndex(char[] c,int left,int right){
        int idx = left;
        int max = map.get(c[left]);
        for(int i = left;i<=right;i++){
            if(map.get(c[i])>max){
                idx = i;
            }
        }
        return idx;
    }

    private int rommanToInteger(char c[],int left,int right){
        if(left>right){
            return 0;
        }

        if(left == right) return map.get(c[left]);

        int maxIndex = findMaxIndex(c,left,right);
        int value = map.get(c[maxIndex]);

        int leftVal = rommanToInteger(c,left,maxIndex-1);
        int rightVal = rommanToInteger(c,maxIndex+1,right);

        return value - leftVal + rightVal;
    }
}