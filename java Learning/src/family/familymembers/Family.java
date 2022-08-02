package family.familymembers;

import java.util.ArrayList;
import java.util.List;

public class Family {

    List<Person> familyList = new ArrayList<Person>();



    public void addMembers(Person person){
        familyList.add(person);
    }

//    public void greet(){
//        this.familyList.forEach((l) -> System.out.println(l.toString()));
//    }

    public void greet(){
        for (Person family: familyList){
            System.out.println(family.getFamiliyDetails());
        }
    }

}

