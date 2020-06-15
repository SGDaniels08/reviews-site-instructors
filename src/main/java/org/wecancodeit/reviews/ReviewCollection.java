package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewCollection {
    private Map<String, Review> reviews = new HashMap<>();

    public ReviewCollection(Map<String, Review> reviews) {
        this.reviews = reviews;
    }

    public Map<String, Review> getReviews() {
        return reviews;
    }

    public Review getSingleReview(String reviewKey) {
        return reviews.get(reviewKey);
    }
}
