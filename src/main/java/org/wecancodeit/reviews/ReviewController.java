package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
    // What goes here?
    private ReviewCollection reviews;

    public ReviewController(ReviewCollection reviews) {
        //
    }

    @RequestMapping ("review/{reviewName}")
    public String showSingleReview(@PathVariable String reviewName, Model model) {
        model.addAttribute("review", reviews.getSingleReview("reviewName"));

        return "review-template";
    }
}
