package BasicsLearning.instance_count_byasraf.list_set_difference;

import java.util.HashSet;
import java.util.Set;

//1.
// public class InstanceCountExample {
//    String name;
//    int age;
//    String degree;
//
//    public InstanceCountExample() {
//    }
//
//        void printMyAddressHandle() {
//
//    }
//
//
//    public static void main(String... args) {
//
//        InstanceCountExample instanceCountExample1 = new InstanceCountExample();
//        instanceCountExample1.age = 10;
//        instanceCountExample1.name = "fawaz";
//        instanceCountExample1.degree = "MCA";
//        instanceCountExample1.printMyAddressHandle(); // address will be print
//
//
//        InstanceCountExample instanceCountExample2 = new InstanceCountExample();
//        instanceCountExample2.age = 20;
//        instanceCountExample2.name = "rasik";
//        instanceCountExample2.degree = "BBA";
//        instanceCountExample2.printMyAddressHandle();
//// list
//        List<InstanceCountExample> someInstanceList = new ArrayList<>();
//        someInstanceList.add(instanceCountExample1);
//        someInstanceList.add(instanceCountExample1);
//        someInstanceList.add(instanceCountExample2);
//        someInstanceList.add(instanceCountExample1);
//
//        System.out.println(someInstanceList.size()); // 4 obj will be created:
//
//    }
// }


//2.
//public class InstanceCountExample {
//  String name;
//  int age;
//  String degree;
//
//  public InstanceCountExample() {}
//

//  void printMyAddressHandle() {}
//
//  public static void main(String... args) {
//
//    InstanceCountExample instanceCountExample1 = new InstanceCountExample();
//    instanceCountExample1.age = 10;
//    instanceCountExample1.name = "fawaz";
//    instanceCountExample1.degree = "MCA";
//    instanceCountExample1.printMyAddressHandle();
//
//    InstanceCountExample instanceCountExample2 = new InstanceCountExample();
//    instanceCountExample2.age = 20;
//    instanceCountExample2.name = "rasik";
//    instanceCountExample2.degree = "BBA";
//    instanceCountExample2.printMyAddressHandle();
////set
//// only see the address no: check equals or not
//
//    Set<InstanceCountExample> instanceCountExampleSet = new HashSet<>();
//    instanceCountExampleSet.add(instanceCountExample1);
//    instanceCountExampleSet.add(instanceCountExample2);
//
//    instanceCountExampleSet.add(instanceCountExample2);
//    instanceCountExampleSet.add(instanceCountExample1);
//
//    System.out.println(instanceCountExampleSet.size());
//  }
//}


//3.
public class InstanceCountExample {
    String name;
    int age;
    String degree;

    public InstanceCountExample() {}

    // we  have to use equals. because different obj but same value .then we have to tell that , its same.
    //same obj but different memory address:
  public boolean equals(Object other) {
    if (other instanceof InstanceCountExample) {
      if (this.name == ((InstanceCountExample) other).name) {
        return true;
      }
    }
    return false;
  }

  public int hashCode() {
    return this.name.hashCode();
  }

    void printMyAddressHandle() {}

    public static void main(String... args) {

        InstanceCountExample instanceCountExample1 = new InstanceCountExample();
        instanceCountExample1.name = "fawaz";

        InstanceCountExample instanceCountExample2 = new InstanceCountExample();
        instanceCountExample2.name = "balaji";

        InstanceCountExample instanceCountExample3 = new InstanceCountExample();
        instanceCountExample3.name = "fawaz";

        InstanceCountExample instanceCountExample4 = new InstanceCountExample();
        instanceCountExample4.name = "fawaz";
//set

        Set<InstanceCountExample> instanceCountExampleSet = new HashSet<>();
        instanceCountExampleSet.add(instanceCountExample1);
        instanceCountExampleSet.add(instanceCountExample2);
        instanceCountExampleSet.add(instanceCountExample3);
        instanceCountExampleSet.add(instanceCountExample4);

        System.out.println(instanceCountExampleSet.size());
    }
}