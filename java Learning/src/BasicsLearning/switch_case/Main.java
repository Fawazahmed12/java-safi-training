package BasicsLearning.switch_case;
/*
 **If expression matches with value1, the code of case value1 are executed.
     Similarly, the code of case value2 is executed if expression matches with value2.
 **If there is no match, the code of the default case is executed.
 *
 * syntax:
 switch (expression) {

  case value1:
    // code
    break;

  case value2:
    // code
    break;

  ...
  ...

  default:
    // default statements
  }

*/


public class Main {
    public static void main(String[] args) {

        int number = 44;
        String size = "one";

        // switch statement to check size
        switch (number) {

            case 29:
                size += "Small";


            case 42:
                size += "Medium";

                // match the value of week
            case 44:
                size += "Large";

            default:
                size += "Unknown";


            case 48:
                size += "Extra Large";

        }
        System.out.println("Size: " + size);
    }
}
