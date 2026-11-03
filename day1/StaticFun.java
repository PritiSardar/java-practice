class AnotherClassWithStaticFun{
static void fun1()
{  
   System.out.println("Area 1");
}
static void fun2()
{  
   System.out.println("Area 2");
}


}
class StaticFun
{
   static void fun1()
   {  
     System.out.println("A");
}
static void fun2()
{  
   System.out.println("B");
} 

public static void main(String args[])
{
  System.out.println("hey Priti");
fun1();
fun2();
AnotherClassWithStaticFun.fun1();
AnotherClassWithStaticFun.fun2();



}
}