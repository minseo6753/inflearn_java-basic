package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.call();
//        child.protetectedMethod();
        child.publicValue=1;
//        child.protectedValue=1;
    }
}
