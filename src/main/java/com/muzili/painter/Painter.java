package com.muzili.painter;

/**
 * 画家问题：
 *     给定一个整形数组arr，数组中的每个值都为正数，表示完成一幅画所需的时间；
 *     再给定一个整数quantity，表示画匠的数量，每个画匠只能画连在一起的画作
 *     所有的画家并行工作，返回完成所有的画作需要的最少时间
 *     arr=[3,1,4],quantity=2。
 *         最好的分配方式为第一个画匠画3和1，所需时间为4
 *         第二个画匠画4，所需时间为4
 *         所以返回4
 *     arr=[1,1,1,4,3],quantity=3
 *         最好的分配方式为第一个画匠画前三个，所需时间为3
 *         第二个画匠画4，所需时间为4
 *         第三个画匠画3，所需时间为3
 *         所以返回4
 * @author lizuoliang
 * @create 2022/8/1 16:14
 */
public class Painter {

    public static int getMaxPainter(int[] arr, int quantity){
        long totalTime = 0;
        for (int i = 0; i < arr.length; i++) {
            // 获取所有画作所需要的时间
            totalTime += arr[i];
        }
        long actualTime = 0;
        long right = totalTime;
        long ans = 0;
        while (actualTime <= right){
            long mid = (actualTime + right) / 2;
            int actualQuantity = getActualQuantity(arr, mid);
            if (actualQuantity <= quantity){
                ans = mid;
                right = mid - 1;
            } else {
                actualTime = mid + 1;
            }
        }
        return (int) ans;
    }

    private static int getActualQuantity(int[] arr, long mid) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid){
                // 单个作画时间超过约束时间
                return Integer.MAX_VALUE;
            }
        }
        int quantity = 1;
        int firstTime = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (firstTime + arr[i] > mid){
                // 如果前面作画时间加上后面作画时间大约约定时间
                quantity++;
                firstTime = arr[i];
            } else {
                firstTime =+ arr[i];
            }
        }
        return quantity;
    }

}
