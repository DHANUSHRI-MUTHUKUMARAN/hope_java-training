package NewsAggregator;

public class User extends Person {

    public User(String name) {
        super(name);
    }

    public void readNews(News news) {
        System.out.println("\n" + name + " is reading:");
        news.display();
    }
}