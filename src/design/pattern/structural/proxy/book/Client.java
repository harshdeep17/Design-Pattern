package design.pattern.structural.proxy.book;

public class Client {
    public static void main(String[] args) {
        IBookParser bookParser=new LazyBookParserProxy("head first to design pattern");
        System.out.println(bookParser.getNumPages());
    }
}
