package memberShip;

import java.util.Scanner;

public class membershipLoginView {
    public static loginRepository lr;

    static {
        loginRepository lr = new loginRepository();
    }

    public static String input(String message){
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }

    public static void start(){

        int failCount = 1;
        while (true) {
            System.out.println("----- 회원가입 -----");
            String inputId = input("id 입력 : ");
            String inputPw = input("pw 입력 : ");
            boolean logintest = lr.logintest(inputId, inputPw);
            String userName = lr.userName(inputId, inputPw);
            if(logintest){
                System.out.printf("%s님이 로그인하셨습니다.\n",userName);
                break;
            }else{
                System.out.printf("비밀번호가 틀렸습니다.[%d회 실패]\n",failCount);
                ++failCount;
            }
        }
    }

    public static void main(String[] args) {
        start();
    }
}
