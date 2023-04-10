package reStudy.day0410.obj;

public class Pen {
    Company company;
    long serial; //시리얼 번호
    String color; //색상
    int price; //가격

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pen){
            Pen target = (Pen) obj;
            return this.serial == target.serial&&this.color == target.color;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
