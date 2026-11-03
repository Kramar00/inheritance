public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void transportMail() {
        System.out.println("Pigeon transports mail");
    }

    public void eat(String food) {
        System.out.println("Pigeon eats " + food);
    }

    public void getVoice() {
        System.out.println("Coo coo");
    }

    public String toString() {
        return super.toString() + " " + species;
    }
}


