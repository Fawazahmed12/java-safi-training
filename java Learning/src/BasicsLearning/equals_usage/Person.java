package BasicsLearning.equals_usage;

public class Person {
    String name;
//    final static int MAX_AGE = 100;
//
    public Person(String name) {
        this.name = name;

//        Integer maxAge = MAX_AGE;
//        int max = maxAge;
    }

//    public void init() {
//        System.out.println(this.name);
//    }
//
//    static Person create(String  name) {
//        Person person = new Person(name);
//        person.init();
//        return person;
//    }


    @Override
    public boolean equals(Object person){
        if(!(person instanceof  Person)){
            return  false;
        }

        Person other = (Person) person;
        if(other.name.equals(this.name)){
            return  true;
        }
        return false;
    }

}



