class AnotherClassWithNonStaticFun{


    void fun1(){

        System.out.println("non static fun1");

    }
   
   void fun2(){

        System.out.println("non static fun2");

    }
}

class NonStaticFun{

    public static void main(String args[])
    {
        System.out.println("main static fun");
       
        AnotherClassWithNonStaticFun f1 = new AnotherClassWithNonStaticFun();
        f1.fun1();
        f1.fun2();
    }

}
