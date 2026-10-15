

package com.mycompany.homework;
import java.util.List;
//Use polymorphism

public class Main {

    // Entry point of the application.
    public static void main(String[] args) {

        // Create a news article with a title and description.
        News news = new News(
            "Java News",
            "A new Java version has been released"
        );

        // Create an in-memory source containing the news article.
        ContentSource source = new InMemoryContentSource(
            List.of(news)
        );

        // Load the news articles from the source.
        List<News> loadedNews = source.load();