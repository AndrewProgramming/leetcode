package question412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
                continue;
            } else if (i % 3 == 0) {
                list.add("Fizz");
                continue;
            } else if (i % 5 == 0) {
                list.add("Buzz");
                continue;
            }else{
                list.add(i+"");
            }
        }

        return list;
    }
}