package intermediateTigran.lesson6.lyambda.itvdn.lyambdaExpression.without.lyambda;

public class Lamp implements ElectricityConsumer {
    private void lightOn() {
        System.out.println("lamp@ miacav");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
