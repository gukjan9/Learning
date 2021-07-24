public class p_423 {
    public static void main(String args[]){
        System.out.println(1);
    
        try{
            System.out.println(2);
            System.out.println(0/0);
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();           // Call Stack 에 있었던 메서드의 정보와 예외 메세지를 화면에 출력한다.
            System.out.println("Exception Message : " + ae.getMessage());      // 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.
        }
        System.out.println(4);
    }
}
