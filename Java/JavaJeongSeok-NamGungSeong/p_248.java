public class p_248 {
    public static void main(String args[]){
        System.out.println("Card.width = " + Card.width);       // 클래스 변수는 인스턴스 생성 안하고 바로 사용 가능
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이다.");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이다.");
    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
