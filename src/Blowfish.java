public class Blowfish extends Fish {
    private int diameter;

    public Blowfish() {
    }

    public Blowfish(String name, int age, int weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    public Blowfish(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void blows() {
        System.out.println("Blowfish blows up");
    }

    public void swim() {
        System.out.println("Blowfish swims");
    }

    public void eat(String food) {
        System.out.println("Blowfish eats " + food);
    }

    public void getVoice() {
        System.out.println("Blowfish makes bubbles");
    }

    public String toString() {
        return super.toString() + " " + diameter;
    }
}

