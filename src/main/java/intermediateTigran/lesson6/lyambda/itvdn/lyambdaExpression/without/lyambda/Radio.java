package intermediateTigran.lesson6.lyambda.itvdn.lyambdaExpression.without.lyambda;

public class Radio implements ElectricityConsumer{
    private void playMusic(){
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
