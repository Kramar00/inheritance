
    public abstract class Animal {
        private String name;
        private int age;
        private int weight;

        public Animal() {
        }

        public Animal(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public abstract void eat(String food);
        public abstract void getVoice();

        public String toString() {
            return name + " " + age + " " + weight;
        }
    }


