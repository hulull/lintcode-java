public class Main {

    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if (0 == nums[i]) {
                for (int j = i; j < nums.length-count-1; j++) {
                    nums[j] = nums[j+1];
                }
                nums[nums.length-count-1] = 0;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int[] test = {0, 1, 0, 3, 12};
        new Main().moveZeroes(test);
        for (int i : test)
            System.out.println(i);
    }
}
