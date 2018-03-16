import Algorithm.BubbleSort;

import java.util.Scanner;

/**
 * Created by liuyupeng@hey900.com on 2018/3/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer select = -1;
        while (true) {
            System.out.println(Constant.title);
            System.out.print("请选择:");

            select = in.nextInt();
            if (select == 0) break;
            switch (select) {
                case 1://冒泡排序
                    BubbleSort.run();
                    break;

                default:
                    System.out.println("异常");
            }
            System.out.println("算法完成。");
        }
    }
}
