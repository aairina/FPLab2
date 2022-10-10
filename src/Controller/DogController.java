package Controller;

import Model.Dog;
import View.DogView;

public class DogController {
    static int id = 0;
    private Dog model;
    private DogView view;

    public DogController(Dog model, DogView view){
        this.model = model;
        this.view = view;
    }

    public String getDogName(){
       return model.getName();
    }

    public int getDogId(){
        return model.getId();
    }

    public String getDogBreed(){
        return model.getBreed();
    }

    public int getDogBirthYear(){
        return model.getBirthYear();
    }

    public double getDogJumpHeight(){
        return model.getJumpHeight();
    }

    public void setDogName(String name){
        model.setName(name);
    }

    public void setDogId(int id){
        model.setId(id);
    }

    public void setDogBreed(String breed){
        model.setBreed(breed);
    }

    public void setDogBirthYear(int birthYear){
        model.setBirthYear(birthYear);
    }

    public void setDogJumpHeight(double jumpHeight){
        model.setJumpHeight(jumpHeight);
    }
}