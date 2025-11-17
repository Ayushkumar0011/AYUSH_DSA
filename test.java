public class test{
    public static void main(String[] args) {
        System.out.println("hello coder!");
        Abc a=new Abc(2, 3);
    System.out.println(a.add());
    }
}
class Abc{
    int x=0,y=0;
    Abc(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int add()
    {
        return this.x+this.y;
    }
    public static void main(String[] args) {
        System.out.println("hello world!");
    }
}
class Hello{
    public void sayHello()
    {
        System.out.println("hello");
    }
}