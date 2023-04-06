package reStudy.day0407.abs;

public class Main {
    private static Pet[] pets;

    static {
        pets = new Pet[]{
                new Cat("해피", "샴", 2),
                new Dog("꽁꽁", "시츄", 3),
                new GoldFish("롤롤", "구피", 3),
        };
    }

    public static void main(String[] args) {
        for (Pet pet : pets) {
            pet.eat();
            pet.takeNap();
        }
    }

}
