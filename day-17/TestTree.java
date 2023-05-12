import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go () {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book ("Finding Emo");

        BookTitleReverseCompare bookCompare = new BookTitleReverseCompare();

        // TreeSet makes a Set of order unique objets.
        Set<Book> tree = new TreeSet<>(bookCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);
    }
}


class BookTitleReverseCompare implements Comparator<Book>{
    public int compare(Book one, Book two) {
        return two.getTitle().compareTo(one.getTitle());
    }
}

// Class Book must be comparable in order to can create a TreeSet
class Book implements Comparable<Book>{
    private String title;

    public Book (String t) {
        title = t;
    }

    public int compareTo(Book b) {
        return title.compareTo(b.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title;
    }
}