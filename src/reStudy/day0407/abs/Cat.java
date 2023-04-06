package reStudy.day0407.abs;

public class Cat extends Pet{


    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("고양이는 캣타워에서 낮잠을 잡니다.");
    }

    @Override
    public void eat() {
        System.out.println("고양이는 생선을 좋아합니다.");
    }


}
