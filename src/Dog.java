public class Dog extends Mammal {
    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, int weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void sport() {
        System.out.println("Dog does sport");
    }

    public void eat(String food) {
        System.out.println("Dog eats " + food);
    }

    public void getVoice() {
        System.out.println("Woof woof");
    }

    public void drinkMilk() {
        System.out.println("Dog drinks milk");
    }

    public String toString() {
        return super.toString() + " " + breed;
    }
}


