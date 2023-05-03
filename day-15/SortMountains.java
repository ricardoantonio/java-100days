import java.util.*;

public class SortMountains {
    public static void main(String[] args) {
        new SortMountains().go();
    }
    public void go(){
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));

        System.out.println("As entered:\n" + mountains);

        mountains.sort((one, two) -> one.getName().compareTo(two.getName()));
        System.out.println("By name:\n" + mountains);

        mountains.sort((one, two) -> one.getHeight() - two.getHeight());
        System.out.println("By height:\n" + mountains);
    }
}

class Mountain {
    private String name;
    private int height;

    Mountain(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

    public String toString(){
        return String.format("%s %d", name, height);
    }
}
