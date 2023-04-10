package reStudy.day0410.system;

import java.util.Arrays;

public class system {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        System.out.println("time1 = " + time1);

        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);

        int[] arr = {10,20,30};
        int[] copyArr = new int[arr.length+1];
        System.arraycopy(arr,0,copyArr,0,arr.length);
        System.out.println(Arrays.toString(copyArr));





    }
}
