public class Player {
    private String name;
    private String country;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins;
    private int losses;

    public Player(String name, String country, int age, float height, float weight, int wins, int losses) {
        this.setName(name);
        this.setCountry(country);
        this.setAge(age);
        this.height = height;
        this.setWeight(weight);
        this.wins = wins;
        this.losses = losses;

    }

    public void playerStats() {
        System.out.println(getName() +  " is a " + getCategory() + " from " + getCountry() + "." +
                            " He is " + getAge() + " years old. His record is: " + getWins() +
                            " wins and " + getLosses() + " losses");
    }
    public void winMatch() {
        this.setWins(this.getWins() + 1);
    }
    public void loseMatch() {
        this.setLosses(this.getLosses() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Player must have a name");
        }
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.trim().isEmpty()) {
            throw new IllegalArgumentException("Country cannot be empty");
        }
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
        this.setCategory();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight < 20.0 || weight > 100.0) {
            throw new IllegalArgumentException("Invalid weight");
        }
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if (this.age <= 18) {
            this.category = "Junior Player";
        } else {
            this.category = "Pro Player";
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}



