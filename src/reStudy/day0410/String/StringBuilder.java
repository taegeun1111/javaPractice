package reStudy.day0410.String;

import java.util.Arrays;

public class StringBuilder {

    public static void makeString(){
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 500000; i++) {
            s+="A";
        }
        long end = System.currentTimeMillis();
        System.out.println("총 소요시간 : "+(end-start)+"밀리초");
    }
    private static void makeStringBuider() {
        long start = System.currentTimeMillis();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        for (int i = 0; i < 500000; i++) {
            sb.append("A");
        }
        long end = System.currentTimeMillis();
        System.out.println("총 소요시간 : "+(end-start)+"밀리초");
    }

    public static void main(String[] args) {
//        String s = "안녕하세요 반갑습니다.";
//
//        String substring = s.substring(3, 7);
//        System.out.println(substring);
        makeString();
        makeStringBuider();



    }



}
