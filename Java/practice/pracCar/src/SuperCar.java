class SuperCar extends Car{
    SuperCar() {
        this.door = 2;
        this.speedLimit = 200;
        this.color = "red";
    }

    @Override
    void speedUp() {
        for(int i=1; i<=speedLimit; i*=2){
            System.out.println("SuperCar Speed : "+i);
        }
    }
}