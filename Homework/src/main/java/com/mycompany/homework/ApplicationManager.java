/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework;

import java.util.List;

// Coordinates the news refresh workflow.
public class ApplicationManager {

    // Store references to the classes responsible for each task.
    private final RssDownloader downloader;
    private final RssParser parser;
    private final NewsRepository repository;
    private final NewsView view;

    // Initialize the required dependencies.
    public ApplicationManager(
            RssDownloader downloader,
            RssParser parser,
            NewsRepository repository,
            NewsView view
    ) {
        this.downloader = downloader;
        this.parser = parser;
        this.repository = repository;
        this.view = view;
    }

    // Refresh the news by downloading, parsing, saving, and displaying it.
    public void refreshNews(String url) {

        // Download the RSS feed.
        String rssData = downloader.download(url);

        // Convert the RSS data into a list of News objects.
        List<News> news = parser.parse(rssData);

        // Save the news articles.
        repository.saveNews(news);

        // Display the updated news articles.
        view.draw(news);
    }
}