import java.util.*;
class Abstraction {
    public static void main(String[] args) {
        ali_baba obj = new ali_baba();
        obj.open_sesame();
        obj.get_treasure();
    }
}
abstract class magic_cave {
    String treasure = "hidden treasure";
    abstract void gates_open();
    void open_sesame() {
        System.out.println("The magic words are spoken.");
    }
}
class ali_baba extends magic_cave {
    void gates_open() {
        System.out.println("....");
    }
    void open_sesame() {
        System.out.println("The gates of the cave open.");
    }
    void get_treasure() {
        System.out.println(this.treasure);
    }
    void sleep(){
        System.out.println("sleeping in the cave for a while");
    }
}