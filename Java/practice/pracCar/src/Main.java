class Main{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.speedUp();

        Car sc1 = new SuperCar();
        sc1.speedUp();

        // 다형성
//        Car c[] = new Car[2];
//        c[0] = new Car();
//        c[1] = new SuperCar();
//
//        for(Car d : c){     // 향상된 for 문 var
//            d.speedUp();
//        }
    }
}