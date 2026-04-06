package NewsAggregator;

import java.util.List;

public interface NewsOperations {
    void addNews(News news);
    List<News> getAllNews();
    List<News> getNewsByCategory(Category category);
}