import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arrInput = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arrInput, 9)));
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (hm.containsKey(diff)) {
                return new int[] {i, hm.get(diff)};
            }
            hm.put(arr[i], i);
        }

        return result;
    }
}
