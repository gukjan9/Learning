class Data{
     int x;
    }

public class p_264 {
    public static void main(String[] args){
        Data d = new Data();
        d.x = 10;
        System.out.println("Before : " + d.x);

        notChanged(d.x);
        System.out.println("Not changed result : " + d.x);
        changed(d);
        System.out.println("Changed result : " + d.x);
    }

    static void notChanged(int x){                     // 기본형 매개변수 (primitive)
        x = 1000;
        System.out.println("Not changed : " + x);
    }

    static void changed(Data d){                        // 참조형 매개변수 (reference)
        d.x = 1000;
        System.out.println("Changed : " + d.x);
    }
}
