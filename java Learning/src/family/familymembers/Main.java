package family.familymembers;

public class Main {
    public static void main(String args[]){

        Family fawazFamily = new Family();

        fawazFamily.addMembers(new Person( "fawaz",23 ));
        fawazFamily.addMembers(new Person( "irfan",30,"student" ));
        fawazFamily.addMembers(new Person( "ijas",20 ));
        fawazFamily.addMembers(new Person( "Nooh",52,"teacher" ));
        fawazFamily.addMembers(new Person( "Rahmath",42,"House wife" ));

        fawazFamily.greet();


        Family farhanFamily = new Family();
        farhanFamily.addMembers(new Person( "farhaan",16 ));
        farhanFamily.addMembers(new Person( "farhiya",12 ));
        farhanFamily.addMembers(new Person( "Thasneem Banu",38, "House wife" ));
        farhanFamily.addMembers(new Person( "Samad",48,"Driver" ));
        farhanFamily.addMembers(new Person( "Raahiba",13 ));

        farhanFamily.greet();
    }
}
