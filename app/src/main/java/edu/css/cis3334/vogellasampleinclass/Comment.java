//CIS 3334 Sec 700 Mobile Device Programming - Spring 2016
//Assignment 7: Vogella Database
//Date: 04/03/2016
//Submitted by: Dana McGree

package edu.css.cis3334.vogellasampleinclass;

public class Comment {
    private long id;
    private String comment;
    private String rating;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }


    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {

        return comment + rating;
    }
}