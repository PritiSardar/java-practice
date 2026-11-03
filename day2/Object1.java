class Example{
    int x;  //instance(object) member variable
    int y;  //instance(object) member variable

    void fun1(){   //instance(object) member function
        System.out.println("fun1");
    }

     void fun2(){   //instance(object) member function
        System.out.println("fun2");
    }
}
class Object1{   //there is a pre-defined class named as Object in java so here we are using Object1

    public static void main(String args[])
    {

        System.out.println("main function\n");
        System.out.println("e1 object member variables values are: ");
        Example e1 = new Example();
        System.out.println(e1.x);
        e1.x = 5;
        System.out.println(e1.x);
        System.out.println(e1.y);
        e1.y = 6;
        System.out.println(e1.y);

        System.out.println("\ne2 object member variables values are: ");
        Example e2 = new Example();
        System.out.println(e2.x);
        e2.x = 8;
        System.out.println(e2.x);
        System.out.println(e2.y);
        e2.y = 9;
        System.out.println(e2.y);
    }
}