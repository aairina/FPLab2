package View;

public class DogView {
    
        public void printDogDetails(String dogName, String dogId, String dogBreed, double dogJumpHeight, int dogBirthYear){
            System.out.println("Dog Details: ");
            System.out.println("ID: " + dogId);
            System.out.println("Name: " + dogName);
            System.out.println("Breed: " + dogBreed);
            System.out.println("Birth year: " + dogBirthYear);
            System.out.println("Jump Height: " + dogJumpHeight + "m");
        }
    //
}
