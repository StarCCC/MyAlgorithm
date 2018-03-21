package Algorithm.Sort;

/**
 * Created by liuyupeng@hey900.com on 2018/3/21.
 */
public class SelectionSort {

    private static final int SIZE = 10;

    public static void run(){

        int[] nums = createNums();
        System.out.print("生成的随机数列为:");
        Functions.showInt(nums, SIZE);
        int k = 0;
        for (int i = 0; i < SIZE; i++) {
            k = i;
            for (int j = k + 1; j < SIZE; j++) {
                if (nums[j] < nums[k]) {
                    k = j;
                }
            }
            int temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
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
