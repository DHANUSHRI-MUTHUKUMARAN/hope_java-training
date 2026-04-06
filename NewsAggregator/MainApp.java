package NewsAggregator;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        NewsManager manager = new NewsManager();

        NewsSource bbc = new NewsSource("BBC");
        NewsSource cnn = new NewsSource("CNN");

        News n1 = new News("AI Revolution", "AI is growing fast",
                Category.TECHNOLOGY, bbc);

        News n2 = new News("Cricket Finals", "India won the match",
                Category.SPORTS, cnn);

        manager.addNews(n1);
        manager.addNews(n2);

        User user = new User("Dhanushri");

        // Display all news
        for (News n : manager.getAllNews()) {
            user.readNews(n);
        }

        // Filter
        System.out.println("\n--- TECHNOLOGY NEWS ---");
        List<News> tech = manager.getNewsByCategory(Category.TECHNOLOGY);
        for (News n : tech) {
            n.display();
        }

        // Search feature
        System.out.println("\n--- SEARCH: AI ---");
        List<News> search = manager.searchByTitle("AI");
        for (News n : search) {
            n.display();
        }
    }
}