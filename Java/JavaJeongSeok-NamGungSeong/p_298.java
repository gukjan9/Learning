class Car {
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(Car c){                 // instance 복사
        // color = c.color;
        // gearType = c.gearType;
        // door = c.door;
        this(c.color, c.gearType, c.door);
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class p_298 {
    public static void main(String[] args){

    }    
}
