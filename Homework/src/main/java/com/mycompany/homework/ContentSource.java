//Haladó — ContentSource polimorfizmus
//Tervezd meg a ContentSource interface-t és két
//implementációját: RssContentSource és
//InMemoryContentSource. Nem kell valódi RSS letöltés — csak a
//List<News> load() működjön.


package com.mycompany.homework;

import java.util.ArrayList;
import java.util.List;

public interface ContentSource {
    List<News> load();
}


// Loads news from an RSS source.
public class RssContentSource implements ContentSource {

    // Store the RSS source configuration.
    private final RssSource source;

    // Create an RSS content source and validate the configuration.
    public RssContentSource(RssSource source) {
        if (source == null) {
            throw new IllegalArgumentException("Source cannot be null");
        }

        this.source = source;
    }

    // Load news articles from the RSS feed.
    @Override
    public List<News> load() {
        // RSS downloading and parsing can be implemented later.
        return new ArrayList<>();
    }
}




// Loads news articles from an in-memory list.
public class InMemoryContentSource implements ContentSource {

    // Store a private copy of the news list.
    private final List<News> newsItems;

    // Create an in-memory source and validate the input list.
    public InMemoryContentSource(List<News> newsItems) {
        if (newsItems == null) {
            throw new IllegalArgumentException("News list cannot be null");
        }

        // Copy the list to prevent external changes to its structure.
        this.newsItems = new ArrayList<>(newsItems);
    }

    // Return the stored news articles.
    @Override
    public List<News> load() {
        // Return a copy to protect the internal list.
        return new ArrayList<>(newsItems);
    }
}


