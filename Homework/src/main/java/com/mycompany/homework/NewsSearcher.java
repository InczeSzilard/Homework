
package com.mycompany.homework;

import java.util.ArrayList;
import java.util.List;


// Searches a list of news articles for items matching a query.
public class NewsSearcher {

    // Returns a list containing only the news articles that match the search text.
    public List<News> search(List<News> news, String query) {

        // Create a list to store the matching news articles.
        List<News> results = new ArrayList<>();

        // Check each news article in the input list.
        for (News item : news) {

            // Add the article if its title or description matches the query.
            if (item.matches(query)) {
                results.add(item);
            }
        }

        // Return all matching news articles.
        return results;
    }
}