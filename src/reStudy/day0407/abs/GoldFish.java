package reStudy.day0407.abs;

class GoldFish extends Pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("골드피쉬는 잠을 안잡니다.");
    }

    @Override
    public void eat() {
        System.out.println("골드피쉬는 녹말을 먹습니다.");
    }
}
