package youtube.videos.uroki.java.patterns.pattern20.Iterator;

interface Iterator {
    boolean hasNext();

    Object next();
}

interface Container {
    Iterator getIterator();
}

public class IteratorLesson {
    public static void main(String[] args) {
        ArrayContainer arrayContainer = new ArrayContainer();
        Iterator iterator = arrayContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class ArrayContainer implements Container {
    String[] array = {"Max", "John", "Mikael"};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return (index < array.length) ? true : false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return array[index++];
            }
            return null;
        }
    }
}
