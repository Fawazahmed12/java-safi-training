

public class DuplicateString {
    String country = "indianapolis";

    public static void main(String args[]){
        DuplicateString character = new DuplicateString();
        character.getDuplicateCharacter();
    }



    public  void getDuplicateCharacter(){
        for(int i=0; i <country.length();i++){
            char temp = country.charAt(i);

            if(temp == 'i'){
                System.out.println(temp);
            }
        }
    }
}
