public class p_362 {
    public static void main(String args[]){
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("FireEngine Instance");
        }

        if (fe instanceof Car) {
            System.out.println("Car Instance");
        }

        if (fe instanceof Object) {
            System.out.println("Object Instance");
        }

        System.out.println(fe.getClass().getName());
    }
}

class Car{

}

class FireEngine extends Car {
    
}
