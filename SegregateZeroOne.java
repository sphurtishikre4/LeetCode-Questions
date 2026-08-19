import java.util.Arrays;

public class SegregateZeroOne {

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 0, 1, 0, 0, 1};

        System.out.println(Arrays.toString(segregateZeroOne(nums)));
    }

    public static int[] segregateZeroOne(int[] nums) {

        int i = 0, j = nums.length - 1;

        while (i < j) {

            while (i < j && nums[i] == 0)
                i++;

            while (i < j && nums[j] == 1)
                j--;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        return nums;
    }
}
