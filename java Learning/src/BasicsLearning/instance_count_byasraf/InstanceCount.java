package BasicsLearning.instance_count_byasraf;

public class InstanceCount {
   static int noOfInstances = 0;

   public InstanceCount(){
    System.out.println("This is the starting point");
        noOfInstances++;
    }

    public static void main(String args[]){
        InstanceCount instanceCount1 = new InstanceCount();
        InstanceCount instanceCount2 = new InstanceCount();
        InstanceCount instanceCount3 = new InstanceCount();
        InstanceCount instanceCount4 = new InstanceCount();

//        InstanceCount.noOfInstances ===> we have to tell one time like that,
//                       because its a class level object (if we tell static)

    System.out.println("N0 0f instance created = " + InstanceCount.noOfInstances);

    }
}
