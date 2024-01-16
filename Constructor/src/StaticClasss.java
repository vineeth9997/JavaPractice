public class StaticClasss {
        private static int staticVariable = 10;
        public static int getStaticVariable() {
            return staticVariable;
        }
        public static void main(String[] args) {

            System.out.println("Static Variable: " + StaticClasss.staticVariable);
            System.out.println("Static Method Result: " + StaticClasss.getStaticVariable());
        }

}
