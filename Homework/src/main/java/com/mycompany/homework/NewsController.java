
package com.mycompany.homework;

//Tervezd meg: melyik osztály felelős a lista frissítéséért kiválasztás után?
//Hogyan értesül a detail panel a kiválasztott elemről?

//1.The user selects a news item in NewsList.
//2.NewsList notifies the NewsController about the selection.
//3.NewsController passes the selected News object to DetailPanel.
//4.DetailPanel updates its content and displays the selected news details.


// Responsible for coordinating the news list and detail panel
public class NewsController {

    private DetailPanel detailPanel;

    public NewsController(DetailPanel detailPanel) {
        this.detailPanel = detailPanel;
    }

    // Called when the user selects a news item
    public void onNewsSelected(News news) {
        detailPanel.showNews(news);
    }
}

//The DetailPanel could provide a method like this:

// Displays the details of the selected news item
public void showNews(News news) {
    System.out.println("Title: " + news.getTitle());
    System.out.println("Description: " + news.getDescription());
    System.out.println("Source: " + news.getSource());
    System.out.println("URL: " + news.getUrl());
}