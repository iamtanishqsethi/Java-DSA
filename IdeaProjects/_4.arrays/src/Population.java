public class Population {//
    //https://leetcode.com/problems/maximum-population-year/
    public int maximumPopulation(int[][] logs) {
        int[] nums=new int[101];

       for (int[] log:logs){
           int birthYear=log[0];
           int deathYear=log[1];
           for (int year=birthYear;year<deathYear;year++){
               //we will not count the death year as mentioned in question
               nums[year-1950]++;
           }
       }
       //find max;
        int max=nums[0];
        int maxYear=1950;
        for (int year=1;year< nums.length;year++){
            if(nums[year]>max){
                max=nums[year];
                maxYear=year+1950;
            }
        }
        return maxYear;

    }
}