package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven");
        User john = new YGeneration("John");
        User rafal = new ZGeneration("Rafal");
        //When
        String stevenSharingMethod = steven.sharePost();
        System.out.println("Steven use: " + stevenSharingMethod);
        String johnSharingMethod = john.sharePost();
        System.out.println("John use: " + johnSharingMethod);
        String rafalSharingMethod = rafal.sharePost();
        System.out.println("Rafal use: " + rafalSharingMethod);
        //Then
        Assert.assertEquals("[FacebookPublisher] Share post on Facebook", stevenSharingMethod);
        Assert.assertEquals("[SnapchatPublisher] Share post on Snapchat", johnSharingMethod);
        Assert.assertEquals("[TwitterPublisher] Share post on Twitter", rafalSharingMethod);

    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven");
        User john = new YGeneration("John");
        User rafal = new ZGeneration("Rafal");
        //When
        String stevenSharingMethod = steven.sharePost();
        System.out.println("Steven use: " + stevenSharingMethod);
        steven.setShareMethod(new SnapchatPublisher());
        stevenSharingMethod = steven.sharePost();
        System.out.println("Steven use now: " + stevenSharingMethod);

        String johnSharingMethod = john.sharePost();
        System.out.println("John use: " + johnSharingMethod);
        john.setShareMethod(new TwitterPublisher());
        johnSharingMethod = john.sharePost();
        System.out.println("John use now: " + johnSharingMethod);

        String rafalSharingMethod = rafal.sharePost();
        System.out.println("Rafal use: " + rafalSharingMethod);
        rafal.setShareMethod(new FacebookPublisher());
        rafalSharingMethod = rafal.sharePost();
        System.out.println("Rafal use now: " + rafalSharingMethod);

        //Then
        Assert.assertEquals("[SnapchatPublisher] Share post on Snapchat", stevenSharingMethod);
        Assert.assertEquals("[TwitterPublisher] Share post on Twitter", johnSharingMethod);
        Assert.assertEquals("[FacebookPublisher] Share post on Facebook", rafalSharingMethod);


    }
}
