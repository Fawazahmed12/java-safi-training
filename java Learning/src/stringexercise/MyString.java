package stringexercise;

public class MyString {
    public static void main(String args[]){
        String finalResult =  StringChallenge.sc(" i am fawaz ");
        System.out.println(finalResult);
    }
}

class StringChallenge {
    public static String sc(String text) {
        String answer = "";

        String removeEmptySpace = text.replaceAll("\\s+","");
        String takeIndexValue = removeEmptySpace.substring(0,6);
        String convertUpperCase = takeIndexValue.toUpperCase();
        answer = convertUpperCase;
        return answer;
    }
}



//output: IAMFAW