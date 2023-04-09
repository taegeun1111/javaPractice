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
        while (true) {
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
                    searchMember();
                    break;
                case "5":
//                    pr.allMemberInfo();
                    allMember();
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("해당 화면에 있는 번호를 입력해주세요.");
            }
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
                System.out.printf("[기존 전화번호:%s] >> ", pr.searchMemberInfo(changeName).getPhone());
                String changePhone = input("수정할 전화번호를 입력해주세요. : ");
                System.out.printf("[기존 주소:%s] >> ", pr.searchMemberInfo(changeName).getAddr());
                String changeAddr = input("수정할 주소를 입력해주세요. : ");
                Member endChangeMember = pr.changeMemberInfo(changeName, changePhone, changeAddr);

                //수정완료
                System.out.printf("\n[%s]님의 수정이 완료되었습니다.", endChangeMember.getName());
                System.out.printf("[수정된 전화번호:%s] ", endChangeMember.getPhone());
                System.out.printf("[수정된 주소:%s]", endChangeMember.getAddr());
                break;
            } else {
                System.out.println("등록된 이름이 아닙니다. 다시 입력해주세요.");
                return;
            }
        }

    }

    //3.전화번호 삭제
    private static void deleteMember() {
        String deleteMember = input("삭제할 사람의 이름을 입력해주세요 : ");
        if (pr.checkMember(deleteMember)) {
            pr.deleteMemberInfo(deleteMember);
            System.out.printf("%s님이 삭제되었습니다.", deleteMember);
        } else {
            System.out.printf("%s님은 없는 사람입니다.", deleteMember);
        }
    }

    //4. 전화번호 검색
    private static void searchMember() {
        String search = input("검색할 사람을 입력해주세요.");
        if (pr.checkMember(search)) {
            Member memberInfo = pr.searchMemberInfo(search);
            System.out.printf("[%s님의 정보] >>", memberInfo.getName());
            System.out.printf("전화번호:%s ", memberInfo.getPhone());
            System.out.printf("주소:%s ", memberInfo.getAddr());
        } else {
            System.out.println("등록된 이름이 아닙니다. 다시 입력해주세요.");
        }
    }

    private static void allMember() {
        System.out.println("[모든 전화번호부 정보]");
        pr.allMemberInfo();
//        System.out.println(member.getName());
//        Member member1 = pr.member;
//        System.out.println(member1.getName());

    }


    private static void selectMenu() {
        System.out.println("\n\n메뉴를 선택하세요");
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
