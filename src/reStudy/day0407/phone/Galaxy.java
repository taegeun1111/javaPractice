package reStudy.day0407.phone;

public class Galaxy extends SmartPhone {

    public Galaxy(String model) {
        super(model);
    }

    @Override
    public String information() {
        String message = String.format("갤럭시는 %s에서 만들어졌고 제원은 다음과 같다\n", getModel());
        message += makeCall() + "\n";
        message += takeCall() + "\n";
        message += takePicture() + "\n";
        message += charge() + "\n";
        message += touchDisplay() + "\n";
        message += "블루투스 펜 탑재 여부" + bluetoothPen() + "\n";
        return message;
    }

    @Override
    public String takePicture() {
        return null;
    }

    @Override
    public String makeCall() {
        return null;
    }

    @Override
    public String takeCall() {
        return null;
    }


    @Override
    public String charge() {
        return null;
    }

    @Override
    public String touchDisplay() {
        return null;
    }

    public static boolean bluetoothPen(){
        return true;
    }
}
