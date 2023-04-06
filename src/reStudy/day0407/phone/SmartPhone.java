package reStudy.day0407.phone;

public abstract class SmartPhone implements Camera, PhoneCall, Touchable{
    private String model;

    public SmartPhone(String model) {
        this.model= model;
    }

    //필수 기능 설계
    public abstract String information();
    public abstract String charge();


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
