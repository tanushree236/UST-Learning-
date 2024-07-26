public class BinaryToDecimal {
    public static class BinaryToDecimal1{
        public int convert(String str){
            int result=0;
            for (int i = 1; i <= str.length(); i++) {
                if (str.charAt(str.length()-i)=='1'){
                    result +=(int)Math.pow(2,i-1);
                }
            }
            return result;
        }

    }
    public static void main(String[] args) {
        BinaryToDecimal1 n1=new BinaryToDecimal1();
        System.out.println(n1.convert("10110"));;
    }
}
