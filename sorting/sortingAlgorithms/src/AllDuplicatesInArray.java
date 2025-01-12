import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<>();

        while(i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                list.add(nums[index]);
            }
        }

        return list;
    }

    static void swap(int[] arr, int first, int second) {
        CyclicSort.swap(arr, first, second);
    }
}
