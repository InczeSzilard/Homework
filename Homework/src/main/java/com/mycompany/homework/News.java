//Mini feladat: Egészítsd ki az osztályt author, publisher, language és coverImage mezőkkel. Mit ellenőrizz a konstruktorban?
package com.mycompany.homework;

// Represents a news article and supports searching.
public class News implements Searchable {

    // Store the news article's information.
    private final String title;
    private final String description;
    private final String source;
    private final String url;
    private final String author;
    private final String publisher;
    private final String language;
    private final String coverImage;

    // Create a news article and validate required fields.
    public News(
            String title,
            String description,
            String source,
            String url,
            String author,
            String publisher,
            String language,
            String coverImage
    ) {
        // Validate required fields before storing them.
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title is required");
        }
        if (source == null || source.isBlank()) {
            throw new IllegalArgumentException("Source is required");
        }
        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("URL is required");
        }

        // Store the validated values.
        this.title = title;
        this.description = description;
        this.source = source;
        this.url = url;
        this.author = author;
        this.publisher = publisher;
        this.language = language;
        this.coverImage = coverImage;
    }

    // Return the title.
    public String getTitle() {
        return title;
    }

    // Return the description.
    public String getDescription() {
        return description;
    }

    // Return the source name.
    public String getSource() {
        return source;
    }

    // Return the article URL.
    public String getUrl() {
        return url;
    }

    // Return the author's name.
    public String getAuthor() {
        return author;
    }

    // Return the publisher's name.
    public String getPublisher() {
        return publisher;
    }

    @Override
    public boolean matches(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    