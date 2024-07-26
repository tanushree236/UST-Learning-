public class Shape {
    int length;
    int breadth;
    String s;
    public Shape(){
        System.out.println("Defalut Constructor");
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(s);
    }
    public Shape(int l,String s){
        System.out.println("Two parameterised Constructor");
        this.length=l;
        this.s=s;
        System.out.println(l);
        System.out.println(s);
    }
    public Shape(int l,int b,String s){
        System.out.println("Three Parameterised Constructor");
        this.length=l;
        this.breadth=b;
        this.s=s;
        System.out.println(l);
        System.out.println(b);
        System.out.println(s);
        this.test(); //Calling the method
    }
    // This is a method
    public void test(){
        System.out.println("Hello I am Test");
    }
    class xyz{
        int d=5;
        public void display(){
            System.out.println("Display: "+d);
        }
    }
}
