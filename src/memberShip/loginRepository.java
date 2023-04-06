package memberShip;

public class loginRepository {
    private static user[] userArr;

    static {
        userArr = new user[]{
                new user("대길이", "abcd", "1111"),
                new user("길동이", "dddd", "2222"),
                new user("홍길이", "cccc", "3333"),
        };
    }

    public static boolean logintest(String id, String pw) {
        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i].getId().equals(id) && userArr[i].getPw().equals(pw)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static String userName(String id, String pw) {
        if (logintest(id, pw)) {
            for (user user : userArr) {
                return user.getUser();
            }
        }
        return null;
    }
}
