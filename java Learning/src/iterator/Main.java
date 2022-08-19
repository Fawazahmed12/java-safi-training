package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        MyString str1  = new MyString("Hello");

        Iterator<String> iterator = str1.iterator();

        while (iterator.hasNext()) {

            String next = iterator.next();
            System.out.println(next);
        }
    }
}
