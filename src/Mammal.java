public class Mammal extends Animal {
    private String order;

    public Mammal() {
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammal(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void drinkMilk() {
        System.out.println("Mammal drinks milk");
    }

    public void eat(String food) {
        System.out.println("Mammal eats " + food);
    }

    public void getVoice() {
        System.out.println("Mammal makes a sound");
    }

    public String toString() {
        return super.toString() + " " + order;
    }
}




