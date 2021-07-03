public class p_195 {
    public static void main(String[] args){
        char[] abc = {'A', 'B'};
        char[] num = {'0', '1', '2', '3', '4'};

        char[] result = new char[abc.length+num.length];

        // System.arraycopy(num, 0, newNum, 0, num.length);
        // num[0] -> newNum[0] num.length 만큼 복사
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);

        System.out.println(result);             // AB01234
    }
}
