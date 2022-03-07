package intermediateTigran.lesson6.lyambda.itvdn.lyambdaExpression.with.lyambda;

public class Main {
    private static void fire(Object o){
        System.out.println("Fire!!!");
    }
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "Pajar";
//        message = "1";

        switcher.addElectricityListener(sender-> System.out.println(message));

        switcher.addElectricityListener(Main::fire);

        switcher.switchOn(); 
    }
}
