package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
    Q.Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects. Now
    write a program to
    (a) find the average marks obtained in each subject.
    (b) find the average marks obtained by every student.  
    (c) find the number of students who have scored below 50 in their average.  
    (d) display the scores obtained by every student.
	 */
    int[][] arr = new int[4][5];






    }
    public static int subjects(int[][] nums){
        int s1=0,s2=0,s3=0,s4=0,s5=0;
        System.out.println("average marks obtained in each subject");
        for(int i=0;i< nums[5].length;i++){
            s1 = s1+nums[i][0];
            s1 = s1+nums[i][1];
            s1 = s1+nums[i][2];
            s1 = s1+nums[i][3];
            s1 = s1+nums[i][4];
        }
        System.out.println("the average of subject 1,2,3,4,5 are "+(s1)/+" "+s2+" "+s3+" "+s4+" "+s5);
    }

}
