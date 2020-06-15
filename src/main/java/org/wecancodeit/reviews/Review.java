package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Review {
    String title;
    String developer;
    String publisher;
    int releaseDate;
    ArrayList<UserTag> userTags;
    String description;
    ArrayList<String> userReviews;

    public void Review(String title, String developer, String publisher,
    int releaseDate, int score, ArrayList<UserTag> userTags, String description,
    ArrayList<String> userReviews) {
        this.title = title;
        this.developer = developer;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.userTags = userTags;
        this.description = description;
        this.userReviews = userReviews;
    }
}