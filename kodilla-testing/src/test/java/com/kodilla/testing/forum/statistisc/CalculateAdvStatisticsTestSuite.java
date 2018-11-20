package com.kodilla.testing.forum.statistisc;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;
import static org.mockito.Mockito.mock;

import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of the tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesMock = new ArrayList<String>();
        usersNamesMock.add("user1");
        usersNamesMock.add("user2");
        usersNamesMock.add("user3");
        usersNamesMock.add("user4");
        when(statisticsMock.usersNames()).thenReturn(usersNamesMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int quantityOfUsers = forumStatistics.getNamesCount();
        int quantityOfPosts = forumStatistics.getPostsCount();
        int quantityOdComments = forumStatistics.getCommentsCount();
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(4, quantityOfUsers);
        Assert.assertEquals(100, quantityOfPosts);
        Assert.assertEquals(200, quantityOdComments);
    }
    @Test
    public void testPostCounterIsZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int quantityOfPosts = forumStatistics.getPostsCount();
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(0, quantityOfPosts);
    }
    @Test
    public void testPostCounterIsThousand(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int quantityOfPosts = forumStatistics.getPostsCount();
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(1000, quantityOfPosts);
    }
    @Test
    public void tesCommentsCounterIsZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int quantityOfComments = forumStatistics.getCommentsCount();
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(0, quantityOfComments);
    }
    @Test
    public void tesCommentsCounterIsThousand(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int quantityOfComments = forumStatistics.getCommentsCount();
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(1000, quantityOfComments);
    }
    @Test
    public void testCommentsCounterLessThanPostsCounter(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(300);
        when(statisticsMock.commentsCount()).thenReturn(200);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int quantityOfPosts = forumStatistics.getPostsCount();
        int quantityOdComments = forumStatistics.getCommentsCount();
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(300, quantityOfPosts);
        Assert.assertEquals(200, quantityOdComments);
    }
    @Test
    public void testPostsCounterLessThanCommentsCounter(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int quantityOfPosts = forumStatistics.getPostsCount();
        int quantityOdComments = forumStatistics.getCommentsCount();
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(100, quantityOfPosts);
        Assert.assertEquals(200, quantityOdComments);
    }
    @Test
    public void testUserNamesCounterIsZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesMock = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(usersNamesMock);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int quantityOfUsers = forumStatistics.getNamesCount();
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(0, quantityOfUsers);
    }
    @Test
    public void testUserNamesCounterIsThousand(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesMock = new ArrayList<String>();
        for(int n = 0; n < 1000; n++){
            usersNamesMock.add("user" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesMock);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int quantityOfUsers = forumStatistics.getNamesCount();
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(1000, quantityOfUsers);
    }
}