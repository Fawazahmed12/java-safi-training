public class LargerNumber {

//   int[] array = new int[10];
    int[] numbers = {1,2,5,4,3};
    public static void main(String args[]){
        LargerNumber largerDigit = new LargerNumber();
        largerDigit.getLargerNumber();
    }



    public  void getLargerNumber(){
        int biggest = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > biggest){
                biggest=numbers[i];
            }
        }
        System.out.println(biggest);
    }
}
