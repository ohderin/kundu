import java.util.Random;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[6];
        Random randNum = new Random();
        for (int i = 0; i < 6; i++) {
            nums[i] =  randNum.nextInt(64);
        }
        System.out.println("before " + Arrays.toString(nums));
        for (int i = 1; i < 6; i++) 
        { int leftmostPosnMaxItem = 0;
            for (int j = 1; j <= nums.length - i; j++) 
            if (nums[j] > nums[leftmostPosnMaxItem]) leftmostPosnMaxItem = j;
            if (nums[leftmostPosnMaxItem] > nums[nums.length - i])
            { int temp = nums[nums.length - i];
                nums[nums.length - i] = nums[leftmostPosnMaxItem]; nums[leftmostPosnMaxItem] = temp;
            } 
        }
        System.out.println("after " + Arrays.toString(nums));
}
}