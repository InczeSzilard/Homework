
package com.mycompany.homework;


// Defines a contract for classes that provide data.
public interface IDataSource
{
    // Retrieves data from the source.
    List<string> GetData();
}
// Represents a news article that can be searched.
public class News implements Searchable {

    // Store the title and description as immutable fields.
    private final String title;
    private final String description;

    // Create a news article and validate its required fields.
    public News(String title, String description) {
        // Ensure the title is not null or blank.
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        // Ensure the description is not null.
        if (description == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }

        // Store the validated values.
        this.title = title;
        this.description = description;
    }

    // Return the news title.
    public String getTitle() {
        return title;
    }

    // Return the news description.
    public String getDescription() {
        return description;
    }

    // Check whether the title or description contains the search text.
    @Override
    public boolean matches(String text) {
        // Reject null or blank search queries.
        if (text == null || text.isBlank()) {
            return false;
        }

        // Convert the query to lowercase for case-insensitive searching.
        String query = text.toLowerCase();

        // Return true if the title or description contains the query.
        return title.toLowerCase().contains(query)
            || description.toLowerCase().contains(query);
    }
}