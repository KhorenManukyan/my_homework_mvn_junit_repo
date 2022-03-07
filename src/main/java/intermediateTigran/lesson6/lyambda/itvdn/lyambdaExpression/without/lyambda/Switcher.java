package intermediateTigran.lesson6.lyambda.itvdn.lyambdaExpression.without.lyambda;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> list = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer electricityConsumer){
        list.add(electricityConsumer);
    }

    public void removeElectricityListener(ElectricityConsumer electricityConsumer){
        list.remove(electricityConsumer);
    }

    public void switchOn(){
        System.out.println("Vklyuchatel@ miacvac e");

        for (ElectricityConsumer e:list){
            e.electricityOn(this);
        }
    }
}
