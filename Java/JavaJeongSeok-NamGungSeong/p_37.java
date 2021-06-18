class p_37 {
    public static void main(String[] args){
        int finger = 10;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;
        int binNum = 0b10;

        System.out.printf("finger = [%10d]%n", finger);
        System.out.printf("finger = [%-5d]%n", finger);
        System.out.printf("finger = [%010d]%n", finger);

        System.out.printf("hex = %x%n", hex);
        System.out.printf("hex = %#x%n", hex);

        System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);
    }
}
