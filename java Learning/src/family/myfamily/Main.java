package family.myfamily;

public class Main {

    public static void main(String[] args){
        Parents mother =  new Parents("Kaiser Jahan J", 56, "Home Maker");
        Parents father =  new Parents("Mohamed Jabarulla MA", 66, "Retired Electrical Engineer");
        Siblings sibling1 = Siblings.setSiblingDetails("Azad", 36, "Mechanical Engineer", "M");
        Siblings sibling2 = Siblings.setSiblingDetails("Farhana", 17, "12th grade", "F");

        MyFamily family = new MyFamily("Sheerin", 29, "Senior Software Engineer");

        family.parents.add(mother);
        family.parents.add(father);

        family.getParentCount();

        family.siblings.add(sibling1);
        family.siblings.add(sibling2);

        family.getSiblingCount();
        family.getGender();
        family.getElderOrYoungerSibling();
    }
}
