package collectionexamples;

public class InterviewQuestion {
    public int minX(int[] nums) {
        int startValue = 0; //Integer.MIN_VALUE
        for (int x = startValue; x <= Integer.MAX_VALUE; x++) {
            int sum = x;
            for (int n : nums) {
                sum += n;
                if (sum < 1) {
                    break;
                }
            }
            if (sum >= 1) {
                return x;
            }
        }
        return 0;
    }
}
