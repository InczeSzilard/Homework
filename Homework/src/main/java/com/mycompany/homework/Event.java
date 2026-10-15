
//Mi történjen hibás dátumformátumnál? Hogyan adjon értelmes hibát a konstruktor?

package com.mycompany.homework;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Event extends News {

    // Event-specific information
    private Timestamp eventDateTime;
    private String location;

    public Event(
            String title,
            String description,
            String source,
            String url,
            String author,
            String publisher,
            String language,
            String coverImage,
            String dateText,
            String location) {

        // Initialize the inherited fields from the News class
        super(title, description, source, url,
              author, publisher, language, coverImage);

        // Check that the event date is provided
        if (dateText == null || dateText.isBlank()) {
            throw new IllegalArgumentException(
                "Event date is required");
        }

        // Parse the date string and handle invalid formats
        try {
            this.eventDateTime = Timestamp.valueOf(dateText);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(
                "Invalid date format. Expected: yyyy-MM-dd HH:mm:ss",
                e);
        }

        // Check that the event date is in the future
        if (!eventDateTime.toLocalDateTime()
                .isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException(
                "Event date must be in the future");
        }

        // Check that the event location is not null or empty
        if (location == null || location.isBlank()) {
            throw new IllegalArgumentException(
                "Event location is required");
        }

        // Initialize the event-specific fields
        this.location = location;
    }

    // Returns the event date and time
    public Timestamp getEventDateTime() {
        return eventDateTime;
    }

    // Returns the event location
    public String getLocation() {
        return location;
    }
}
