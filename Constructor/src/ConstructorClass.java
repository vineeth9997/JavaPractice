class ParentClass {
    protected int parentVariable;
    public ParentClass(){}
    public ParentClass(int parentVariable) {
        this.parentVariable = parentVariable;
    }

}

class ChildClass extends ParentClass {
    private int childVariable;

    public ChildClass(){}
    public ChildClass(int parentVariable, int childVariable) {

        super(parentVariable);
        this.childVariable = childVariable;
    }

    public ChildClass(int childVariable) {

        super(0);
        this.childVariable = childVariable;
    }

    public int getParentVariable() {
        return parentVariable;
    }

    public int getChildVariable() {
        return childVariable;
    }
}


public class ConstructorClass {
    public static void main(String[] args) {

        ChildClass childInstance1 = new ChildClass(5, 10);

        ChildClass childInstance2 = new ChildClass(15);

        System.out.println("ChildInstance1 - Parent Variable: " + childInstance1.getParentVariable());
        System.out.println("ChildInstance1 - Child Variable: " + childInstance1.getChildVariable());

        System.out.println("\nChildInstance2 - Parent Variable: " + childInstance2.getParentVariable());
        System.out.println("ChildInstance2 - Child Variable: " + childInstance2.getChildVariable());
    }
}
