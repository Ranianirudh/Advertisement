package com.acro.adv.model;

public class ContentReview {
    Long reviewId;
    float rating;
    Long reviewCount;
    Long contentId;

    public ContentReview(Long reviewId, float rating, Long reviewCount, Long contentId) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.contentId = contentId;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Long getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Long reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }
}
