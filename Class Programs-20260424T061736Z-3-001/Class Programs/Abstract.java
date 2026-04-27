abstract class A {
    // This is abstract method
    abstract void myMethod();

    // This is concrete method with body
    void anotherMethod() {
        // Does something
    }

    protected abstract void display();
}

abstract class AbstractExample3 {
    public void disp() {
        System.out.println("Concrete method of parent class");
    }
    abstract public void disp2();
}

class Demo extends AbstractExample3 {
    public void disp2() {
        System.out.println("overriding abstract method");
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        AbstractExample3 obj1 = new Demo();
        obj1.disp();
        obj1.disp2();
        obj.disp2();
        obj.disp();
    }
}