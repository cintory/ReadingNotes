package inner_classes_10.why_inner_class_8.practice;

interface U {

    void f();

    void g();

    void h();
}

class A {
    U takesU() {
        return new U() {
            @Override
            public void f() {
                System.out.println("f();\n");
            }

            @Override
            public void g() {
                System.out.println("g();\n");
            }

            @Override
            public void h() {
                System.out.println("h();\n");
            }
        };
    }
}

class B {
    private U[] us;

    B(int length) {
        us = new U[length];
    }

    void add(U u, int index) {
        us[index] = u;
    }

    void remove(int index) {
        us[index] = null;
    }

    void traverse() {
        for (U u : us) {
            if (u != null) {
                u.f();
                u.g();
                u.h();
            } else {
                System.out.println("U is null.\n");
            }
        }
    }
}

public class Practice23 {
    public  static void main(String[] args){
        A a0 = new A();
        A a1 = new A();
        A a2 = new A();
        B b = new B(3);
        b.add(a0.takesU(), 0);
        b.add(a1.takesU(), 1);
        b.add(a2.takesU(), 2);
        b.traverse();
        b.remove(0);
        b.remove(1);
        b.traverse();
    }
}
