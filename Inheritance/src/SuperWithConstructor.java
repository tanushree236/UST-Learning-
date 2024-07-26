class India{
    India(){
        System.out.println("Welcome to India");
    }
}
class Tourist extends India{
    Tourist(){
        super();
        System.out.println("India Welcomes Tourist");
    }

}
public class SuperWithConstructor {
    public static void main(String[] args) {
        Tourist t=new Tourist();

    }
}
