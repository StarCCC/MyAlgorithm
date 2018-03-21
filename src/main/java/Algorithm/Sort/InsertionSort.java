package Algorithm.Sort;

/**
 * Created by liuyupeng@hey900.com on 2018/3/21.
 */
public class InsertionSort {

    private static final int SIZE = 10;

    public static void run(){

        int[] nums = createNums();
        System.out.print("生成的随机数列为:");
        Functions.showInt(nums, SIZE);
        int temp = 0;
        int in = 0;
        for (int i = 1; i < SIZE; i++) {
            temp = nums[i];
            in = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > temp) {
                    nums[j + 1] = nums[j];
                } else {
                    in = j + 1;
                    break;
                }
            }
            nums[in] = temp;
            System.out.print("第" + (i + 1) + "趟排序后结果为:");
            Functions.showInt(nums, SIZE);
        }
        System.out.print("排序完成数列为:");
        Functions.showInt(nums, SIZE);
    }

    private static int[] createNums() {
        int[] res = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            res[i] = (int) Math.round(Math.random() * 100);
        }
        return res;
    }
}
