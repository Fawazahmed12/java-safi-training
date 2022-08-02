package mathcalculation;

public class Calculation {
    public static void main(String args[]){
       double finalValue =  exercise.exercise_one(2,3,4);
        System.out.println(finalValue);
    }
}



class exercise {
    public static double exercise_one(double x, double y, double z) {
        double answer = 0;

        double squareValueX = Math.pow(x,2);
        double squareValueY = Math.pow(y,2);
        double addSquaredValueXY = squareValueX + squareValueY;
        double absoluteValueZ = Math.abs(z);
        double Subtract = addSquaredValueXY - absoluteValueZ;
         answer = Math.cbrt(Subtract);

        return answer;
    }
}