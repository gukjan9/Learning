public class Car {
    int carNum;
    String color;

    String gear;
    int door;

    int[] boot = {0, 1, 2};
    int speedLimit;

    Car(){
        this.door = 4;
        this.speedLimit = 100;
    }

    void speedUp(){
        for(int i=0; i<=speedLimit; i++){
            System.out.println("Car Speed : "+i);
        }
    }
}

