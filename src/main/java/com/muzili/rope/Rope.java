package com.muzili.rope;

/**
 * 绳子问题:
 *     给定一个有序数组arr,
 *     代表坐落在X轴上的点，给定一个正数K，
 *     代表绳子的长度，返回绳子最多压中几个点？
 *     即使绳子边缘处盖住也算盖住
 * @author lizuoliang
 * @create 2022/8/1 15:34
 */
public class Rope {

    public static int coveragePoint(int[] arr, int L){
        int left = 0;
        int right = 0;
        int length = arr.length;
        int max = 0;
        while (left < length){
            while (right < length && (arr[right] - arr[left]) <= L){
                right ++;
            }
            max = Math.max(max, right - (left++));
        }
        return max;
    }

}
