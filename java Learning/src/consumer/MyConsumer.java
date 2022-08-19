package consumer;

//public class MyConsumer {
//}



public interface MyConsumer<T> {
    void accept(T t);
}

