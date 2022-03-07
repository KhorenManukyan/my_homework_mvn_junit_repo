package zzz.examples;

public class Fibbanachi {
    static void meth(Integer integer) {
        int num1 = 1, num2 = 1, result = 0;
        for (int i = 0; i <= integer; i++) {
            num1 = num2;
            num2 = result;
            result = num1 + num2;
            if (result<=integer){
                System.out.print(result + " ");
            }
        }
    }

    static void meth1(Integer integer) {
        int num1 = 1, num2 = 1, result = 0;
        while (result<integer) {
            num1 = num2;
            num2 = result;
            result = num1 + num2;
            System.out.print(result + " ");
        }
    }


    public static void main(String[] args) {
        meth(21);
        System.out.println();
        meth1(21);
    }
}
