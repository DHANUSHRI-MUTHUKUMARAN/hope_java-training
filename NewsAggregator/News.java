package NewsAggregator;

public class News {
    private String title;
    private String content;
    private Category category;
    private NewsSource source;

    public News(String title, String content, Category category, NewsSource source) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        this.content = content;
        this.category = category;
        this.source = source;
    }

    public void display() {
        System.out.println("\nTitle: " + title);
        System.out.println("Category: " + category);
        System.out.println("Source: " + source.getName());
        System.out.println("Content: " + content);
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }
}