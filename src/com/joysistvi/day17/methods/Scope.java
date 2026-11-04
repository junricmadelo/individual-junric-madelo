package com.joysistvi.day17.methods;

public class Scope {

    static String name  = "Winter"; // static variable // class  variable
    int age = 60;

    public static void main(String[] args){
        int num = 0; // local variable

        System.out.println(num);

        for (int i =  0; i  < 10; i++) {
            System.out.println(i);
        }

        Scope obj = new Scope();
        System.out.println(obj.age);
        System.out.println(name);
    }
    public static void greet () {
        System.out.println(name);
    }
    public static void scope (){

    }

    // static method
    public static int sum (int a, int b) {
        return a + b ;

    }


    //instance method
    public int product(int a, int b){
        return a+ b;
    }

    int num = 0;
    public void a (){

    }

    public void b() {
        System.out.println(num);
        a();
    }




    //Easy Memory Trick
    /*
    static to static - direct
    static to instance - direct
    instance  to static - instantiate
    instance to instance = direct
     */
}
