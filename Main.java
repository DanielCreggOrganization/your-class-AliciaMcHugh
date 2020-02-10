class main {
    public static void main(String[] args) {
        Animals Animalsobj1 = new Animals();
        //Animals Animalsobj2 = new Animals();
        Animalsobj1.cost=100;
        Animalsobj1.gender="female";
        Animalsobj1.weight=35;
        Animalsobj1.species="dog";

        Animalsobj1.printGender();
        Animalsobj1.reduceWeight();

        System.out.println("It is "+Animalsobj1.cost+" euro.");
        System.out.println("It is "+Animalsobj1.gender+".");
        System.out.println("It weighs "+Animalsobj1.weight+" kg.");
        System.out.println("It is a "+Animalsobj1.species+".");

    }
}