// Shift 와 And Operator 를 이용하여 16진수를 끝에서부터 한자리씩 뽑아낸다.

public class p_128 {
    public static void main(String[] args){
        int dec = 1234;
        int hex = 0xABCD;
        int mask = 0xF;

        System.out.printf("hex = %X%n", hex);
        System.out.printf("%X%n", hex & mask);      // D

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);      // C

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);      // B

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);      // A
    }
}
