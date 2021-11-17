package com.nikitaponomar;

public class PaintJob {

    //The method needs to return a value of type int that represents the number of buckets
    // that Bob needs to buy before going to work.
    // To calculate the bucket count, refer to the notes below.
    //If one of the parameters width, height or areaPerBucket is less or equal to 0
    // or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket-extraBuckets);// rounded to maximum


    }
//Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket
    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width<=0 || height<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket);// rounded to maximum
    }
//In some cases, Bob does not know the width and height of the wall but he knows the area of a wall.
    public static int getBucketCount (double area, double areaPerBucket) {
        if (area<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(area/areaPerBucket); // rounded to maximum
    }
}
