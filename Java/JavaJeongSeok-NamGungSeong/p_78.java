public class p_78 {
    public static void main(String[] args){
        float f = 9.1234567f;
        double d = 9.1234567;           // double 은 f 안 붙여줘도 된다.
        double d2 = (double)f;

        System.out.printf("f = %20.18f\n", f);
        System.out.printf("d = %20.18f\n", d);
        System.out.printf("d2 = %20.18f\n", d2);        
    }
}
