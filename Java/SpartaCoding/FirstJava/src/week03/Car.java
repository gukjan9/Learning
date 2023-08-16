package week03;

public class Car {  // public - 접근 제어자
    // 필드
    String company;
    String model;
    String color;
    double price;
    double speed;
    char gear;
    boolean lights;

    // 생성자 - constructor : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행 해야 하며, 어떤 값이 필수로 들어 와야 하는지 정의
    public Car(){
        // 기본 생성자 (생략 가능) - 아무것도 없을 때
        System.out.println("생성자가 호출되었습니다.");
    }

    // 메서드
    double gasPedal(double kmh){
        speed = kmh;
        return speed;
    }

    double brakePedal(){
        speed = 0;
        return speed;
    }

    char changeGear(char type){
        gear = type;
        return gear;
    }

}
