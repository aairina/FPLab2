package Model;

public class Dog {
    private String name;
    private String breed;
    private int birthYear;
    private int id;
    private double jumpHeight;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getId() {
        return id;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void setId(int id){
        this.id = id;
    }
}
