package org.wecancodeit.reviews;

public class Review {
    String title;
    String developer;
    String publisher;
    int releaseYear;
    int score;
    ArrayList<String> userTags;
    String description;
    ArrayList<String> userReviews;

    public void Review(String title, String developer, String publisher,
    int releaseYear, int score, ArrayList<String> userTags, String description,
    ArrayList<String> userReviews) {
        this.title = title;
        this.developer = developer;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
        this.score = score;
        this.userTags = userTags;
        this.description = description;
        this.userReviews = userReviews;
    }
}