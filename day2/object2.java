class Example2{
    int x;
    static int y;

}
public class object2 {
    public static void main(String args[])
    {

        Example2.y = 5;
        System.out.println(Example2.y);

        Example2 e1 = new Example2(); 
        e1.y = 10;
        System.out.println(e1.y);     // we can access static member variable by creating object.

        e1.x = 100;
        System.out.println(e1.x);



    }
}
