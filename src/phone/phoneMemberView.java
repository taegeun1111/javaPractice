package phone;

import java.util.Scanner;

public class phoneMemberView {
    private static Scanner sc;
    private static phoneMemberRepository pr;

    static {
        sc = new Scanner(System.in);
        pr = new phoneMemberRepository();
    }


    public static void start() {
        System.out.println("==================================");
        System.out.println("     전화번호 관리 프로그램");
        System.out.println("==================================");
        selectMenu();
        String inputNum = input("번호입력 : ");

        switch (inputNum) {
            case "1":
                newaddMember();
                break;
            case "2":
                changeMember();
                break;
            case "3":
                deleteMember();
                break;
            case "4":
                break;
            case "5":
                break;
            case "0":
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("해당 화면에 있는 번호를 입력해주세요.");
        }
    }
    //1. 정보 등록
    private static void newaddMember() {
        System.out.println("새롭게 등록할 정보를 입력해주세요.");
        String inputAddMember = input("이름 : ");
        String inputAddPhone = input("전화번호 : ");
        String inputAddAddr = input("주소 : ");
        pr.addMember(inputAddMember, inputAddPhone, inputAddAddr);
        System.out.printf("[%s]님이 등록되었습니다.", inputAddMember);
    }

    //2. 전화번호 수정 (이름 확인)
    private static void changeMember() {
        String changeName = input("수정할 사람의 이름을 입력해주세요.");
        while (true) {
            if (pr.checkMember(changeName)) { //중복확인 : 있으면 실행, 없으면 return
                String changePhone = input("수정할 전화번호를 입력해주세요. : ");
                System.out.printf("[기존 전화번호 : %s]",pr.searchMemberInfo(changeName).getPhone());
                String changeAddr = input("수정할 주소를 입력해주세요. : ");
                System.out.printf("[기존 주소 : %s]",pr.searchMemberInfo(changeName).getAddr());
                Member endChangeMember = pr.changeMemberInfo(changeName, changePhone, changeAddr);
                //수정완료
                System.out.printf("[%s]님의 수정이 완료되었습니다.",endChangeMember.getName());
                System.out.printf("[수정된 전화번호 : %s]",endChangeMember.getPhone());
                System.out.printf("[수정된 주소 : %s]",endChangeMember.getAddr());
                break;
            }else {
                System.out.println("등록된 이름이 아닙니다. 다시 입력해주세요.");
                return;
            }
        }

    }

    private static void deleteMember() {
        String deleteMember = input("삭제할 사람의 이름을 입력해주세요 : ");
        pr.deleteMemberInfo(deleteMember);
    }


    private static void selectMenu() {
        System.out.println("메뉴를 선택하세요");
        System.out.println("1.전화번호 등록");
        System.out.println("2.전화번호 수정");
        System.out.println("3.전화번호 삭제");
        System.out.println("4.전화번호 검색");
        System.out.println("5.전화번호 전체 출력");
        System.out.println("0.프로그램 종료");
    }

    private static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }


}
