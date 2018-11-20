package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int namesCounter;
    private int postsCounter;
    private int commentsCounter;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public ForumStatistics(Statistics statistics){

    }

    public int getNamesCount() {
        return namesCounter;
    }

    public int getPostsCount() {
        return postsCounter;
    }

    public int getCommentsCount() {
        return commentsCounter;
    }

    public void setNamesCount(int namesCount) {
        this.namesCounter = namesCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCounter = postsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCounter = commentsCount;
    }

    public void setAvgPostsPerUser(double avgPostsPerUser) {
        this.avgPostsPerUser = avgPostsPerUser;
    }

    public void setAvgCommentsPerUser(double avgCommentsPerUser) {
        this.avgCommentsPerUser = avgCommentsPerUser;
    }

    public void setAvgCommentsPerPost(double avgCommentsPerPost) {
        this.avgCommentsPerPost = avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        namesCounter = statistics.usersNames().size();
        setNamesCount(namesCounter);
        postsCounter = statistics.postsCount();
        setPostsCount(postsCounter);
        commentsCounter = statistics.commentsCount();
        setCommentsCount(commentsCounter);
        if(postsCounter != 0 && namesCounter != 0){
            avgPostsPerUser = postsCounter / namesCounter;
            setAvgPostsPerUser(avgPostsPerUser);
        } else {}
        if(commentsCounter != 0 && namesCounter != 0){
            avgCommentsPerUser = commentsCounter / namesCounter;
            setAvgCommentsPerUser(avgCommentsPerUser);
        } else {}
        if(commentsCounter != 0 && postsCounter != 0){
            avgCommentsPerPost = commentsCounter / postsCounter;
            setAvgCommentsPerPost(avgCommentsPerPost);
        } else {}

    }
    public void showStatistics(){
        System.out.println("namescounter " + namesCounter + ", postsCounter " + postsCounter + ", commentsCounter " + commentsCounter
                + ", avgPostPerUser " + avgPostsPerUser + ", avgCommentsPerUser " + avgCommentsPerUser + ", avgCommentsPerPost " + avgCommentsPerPost);
    }
}