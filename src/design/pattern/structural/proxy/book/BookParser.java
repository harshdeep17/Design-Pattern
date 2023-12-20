package design.pattern.structural.proxy.book;

public class BookParser implements IBookParser{
    String book;
    BookParser(String book){
        this.book=book;
    }
    @Override
    public int getNumPages() {
        // do something
        return 100;
    }
}
