package iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CakeList<String> implements Iterable<String> {
    List<String> cakes;
    int size;
    CakeList(){
        cakes= new ArrayList<>();
    }
    public void addCake(String cake){
        this.cakes.add(cake);
        this.size++;
    }
    @Override
    public Iterator<String> iterator() {
        return new customCakeIterator<String>(this);
    }

}
