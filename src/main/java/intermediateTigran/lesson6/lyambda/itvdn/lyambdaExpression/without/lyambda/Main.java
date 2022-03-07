package intermediateTigran.lesson6.lyambda.itvdn.lyambdaExpression.without.lyambda;

public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "Pajar";
//        message = "1";

        switcher.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn(Object sender) {
                System.out.println(message);
            }
        });

        switcher.switchOn();
    }
}
