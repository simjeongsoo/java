package chapter06;

public class Ex6_1 {
    public static void main(String[] args) {
        Tv t = new Tv();

        t.channel = 7;
        t.channelDown();
        System.out.println("channel : " + t.channel);

    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
