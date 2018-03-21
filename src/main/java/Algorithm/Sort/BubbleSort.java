package Algorithm.Sort;


/**
 * Created by liuyupeng@hey900.com on 2018/3/16.
 */
public class BubbleSort {//冒泡排序

    private static final int SIZE = 10;

    public static void run(){

        int[] nums = createNums();
        System.out.print("生成的随机数列为:");
        Functions.showInt(nums, SIZE);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 1; j < SIZE - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
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
