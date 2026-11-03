public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];

        animals[0] = new Bird("Bird", 2, 1, "blue");
        animals[1] = new Fish("Fish", 1, 2, "gold");
        animals[2] = new Mammal("Cat", 3, 4, "Carnivora");
        animals[3] = new Pigeon("Pigeon", 2, 1, "gray", "Rock");
        animals[4] = new Blowfish("Blowfish", 1, 2, "yellow", 10);
        animals[5] = new Dog("Rex", 5, 20, "Carnivora", "Labrador");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            animals[i].getVoice();
            animals[i].eat("food");
        }

        Dog dog = new Dog("Rex", 5, 20, "Carnivora", "Labrador");
        dog.sport();

        Blowfish fish = new Blowfish(10);
        fish.blows();

        Pigeon pigeon = new Pigeon("Rock");
        pigeon.transportMail();
    }
}