package question739;

class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] r = new int[T.length];
        if (T.length == 0) return r;

        for (int i = 0; i < T.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < T.length; j++) {
                counter += 1;
                if (T[j] > T[i]) {
                    r[i] = counter;
                    break;
                }
            }
        }

        return r;
    }
}