final class MyFinalClass {
    final int finalVariable = 10;
    final void finalMethod() {
        System.out.println("Final method in FinalClass");
    }
}


public class FinalClass {
    public static void main(String[] args) {

        MyFinalClass myFinalClass = new MyFinalClass();

        System.out.println("Final Variable: " + myFinalClass.finalVariable);

        myFinalClass.finalMethod();
    }
}
