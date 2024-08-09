import java.util.HashMap;


class twosum {
    public static void main(String[] args) {
        // we have to receive in the array in array
        int[] m = Tosum();
        for (int k : m) {
            System.out.print(k);

        }
    }

    public static int[] Tosum() {    //Created Function

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {2, 7, 3, 4, 5};
        int target = 9;

        int[] arr = new int[0];
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                arr = new int[]{map.get(rem), i};
                return arr;

            }
            map.put(nums[i], i);
        }
        return arr;

    }
}






