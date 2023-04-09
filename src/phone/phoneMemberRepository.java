package phone;

import java.util.HashMap;
import java.util.Map;

public class phoneMemberRepository {
    private static Map<String,Member> phoneMap;
    Member member;
    static {
        phoneMap = new HashMap<>();
    }


    //1.전화번호 등록
    public void addMember(String inputAddMember,String inputAddPhone,String inputAddAddr){
        Member putMember = phoneMap.put(inputAddMember, new Member(inputAddMember, inputAddPhone, inputAddAddr));
    }

    //2.전화번호 수정
    public Member changeMemberInfo(String inputChangeMember,String inputChangePhone,String inputChangeAddr){
//        Member changeMember = phoneMap.put(inputChangeMember, new Member(inputChangeMember, inputChangePhone, inputChangeAddr));
        Member changeMember = phoneMap.get(inputChangeMember);
        changeMember.setPhone(inputChangePhone);
        changeMember.setAddr(inputChangeAddr);
        return changeMember;
    }

    //2-1 전화번호(이름)의 유무 확인
    public boolean checkMember(String checkMember){
        boolean resultCheck = phoneMap.containsKey(checkMember);
        return resultCheck;
    }
    //3.전화번호 삭제 (조건 : 없으면 알림)
    public void deleteMemberInfo(String deleteMember){
        Member removeMember = phoneMap.remove(deleteMember);
    }

    //4.전화번호 검색 (조건 : 없으면 알림)
    public Member searchMemberInfo(String Member){
        Member searchMember = phoneMap.get(Member);
        return searchMember;
    }
    
    //5.전화번호 전체 출력
    public void allMemberInfo(){
        for (String allMember : phoneMap.keySet()) {
            Member memberInfo = phoneMap.get(allMember);
            System.out.printf("[이름:%s 전화번호:%s 주소:%s]\n",memberInfo.getName(),memberInfo.getPhone(),memberInfo.getAddr());

        }
    }
    

}
