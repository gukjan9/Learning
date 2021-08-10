class Math_1{
    long a, b;

    long add(){
        return a + b;
    }

    static long add(long a, long b){
        return a + b;
    }
}

public class p_279 {
    public static void main(String args[]){
        System.out.println(Math_1.add(200L, 100L));       // 매개변수만 필요로 하여 static method, instance 생성 x

        Math_1 mm = new Math_1();
        mm.a = 200L;
        mm.b = 100L;

        System.out.println(mm.add());
    }
}
