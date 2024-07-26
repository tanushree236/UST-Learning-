//SUPER WITH VARIABLE


     class Redmi{
        int maxSpeed=1000;
    }
     class RedmiPro extends Redmi{
        int maxSpeed=900;
        void display(){

            System.out.println(super.maxSpeed);
        }
    }
public class SuperWithVariable {
    public static void main(String[] args) {
        RedmiPro r1=new RedmiPro();
        r1.display();

    }
}
