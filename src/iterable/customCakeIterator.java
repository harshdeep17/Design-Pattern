package iterable;

import java.util.Iterator;

public class customCakeIterator<String> implements Iterator<String> {
    CakeList<String> cakeList;
    private int currentIndex = 0;
    public customCakeIterator(CakeList<String> cakes) {
        this.cakeList=cakes;
    }
    @Override
    public boolean hasNext() {
        return currentIndex<cakeList.size;
    }

    @Override
    public String next() {
        return cakeList.cakes.get(currentIndex++);
    }
}
