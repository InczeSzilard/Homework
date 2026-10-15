//Könnyű — RssSource osztály
//Készíts RssSource osztályt name, url, language mezőkkel.
//Követelmény: valid konstruktor, adatrejtés, nincs felesleges
//setter.
package com.mycompany.homework;

// Represents an RSS news source.
public class RssSource {

    // Private final fields provide data hiding and prevent reassignment.
    private final String name;
    private final String url;
    private final String language;

    // Creates an RSS source and validates the required fields.
    public RssSource(String name, String url, String language) {

        // Check that the name is not null or blank.
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        // Check that the URL is not null or blank.
        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("URL cannot be empty");
        }

        // Check that the language is not null or blank.
        if (language == null || language.isBlank()) {
            throw new IllegalArgumentException("Language cannot be empty");
        }

        // Initialize the fields with the validated values.
        this.name = name;
        this.url = url;
        this.language = language;
    }

    // Returns the name of the RSS source.
    public String getName() {
        return name;
    }

    // Returns the URL of the RSS feed.
    public String getUrl() {
        return url;
    }

    // Returns the language of the RSS feed.
    public String getLanguage() {
        return language;
    }
}