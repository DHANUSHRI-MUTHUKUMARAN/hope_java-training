package NewsAggregator;

import java.util.ArrayList;
import java.util.List;

public class NewsManager implements NewsOperations {

    private List<News> newsList = new ArrayList<>();

    @Override
    public void addNews(News news) {
        if (news == null) {
            throw new IllegalArgumentException("News cannot be null");
        }
        newsList.add(news);
    }

    @Override
    public List<News> getAllNews() {
        return newsList;
    }

    @Override
    public List<News> getNewsByCategory(Category category) {
        List<News> result = new ArrayList<>();
        for (News n : newsList) {
            if (n.getCategory() == category) {
                result.add(n);
            }
        }
        return result;
    }

    // ⭐ Extra Feature: Search
    public List<News> searchByTitle(String keyword) {
        List<News> result = new ArrayList<>();
        for (News n : newsList) {
            if (n.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(n);
            }
        }
        return result;
    }
}