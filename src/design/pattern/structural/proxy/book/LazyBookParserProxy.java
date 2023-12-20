package design.pattern.structural.proxy.book;

public class LazyBookParserProxy implements IBookParser{
    BookParser bookParser=null;
    String book;
    LazyBookParserProxy(String book){
        this.book=book;
    }

    @Override
    public int getNumPages() {
        if(bookParser==null){
            bookParser=new BookParser(this.book);
        }
        return this.bookParser.getNumPages();
    }
}
