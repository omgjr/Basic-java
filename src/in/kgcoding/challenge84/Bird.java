package in.kgcoding.challenge84;

public class abstract Bird implements Flyable {
    private final String breed;

    public Bird(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }
    
}
