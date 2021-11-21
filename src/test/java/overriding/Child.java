package overriding;

public class Child extends Parent{
//    void show(int a){
//        System.out.println("calls show() method of the child class with integer");
//    }
    void show(double a){
        System.out.println("calls show() method of the child class with double");
    }
}
