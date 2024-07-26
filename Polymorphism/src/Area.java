public class Area {
    public double calculateArea(double s){
        double area=s*s;
        return area;
    }
    public double calculateArea(double l, double b){
        double area=l*b;
        return area;
    }
    public double calculateArea(double l,double b, String s){
        System.out.print(s+" ");
        double area=l*b;
        return area;
    }
    public double calculateArea(String s,double l,double b){
        System.out.print(s+" ");
        double area=l*b;
        return area;
    }
    public int calculateArea(int l){
        return (int) (l*l);
    }


}
