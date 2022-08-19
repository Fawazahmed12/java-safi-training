package iterator;

import java.util.Iterator;

public class MyString implements Iterable {
    String chars;
    int charsLength;

    public MyString(String chars){
        this.chars = chars;
        this.charsLength = chars.length();
    }

    @Override
    public Iterator iterator() {

        Iterator itr = new Iterator() {
            int charsIndex = 0;

            @Override
            public boolean hasNext() {
                return charsIndex < charsLength;
            }

            @Override
            public Object next() {
                Character letter = chars.charAt(charsIndex++);
                String output = letter.toString();
                return output;
            }
        };
        return itr;
    }
}
