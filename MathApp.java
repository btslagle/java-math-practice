public class MathApp {

  static int job1Salary = 51_000;
  static int job2Salary = 72_000;

  static int carPrice = 40_000;
  static int truckPrice = 120_000;
  static double circleRadius = 7.25;
  static double  num1 = 5.0;
  
  public static void main(String[] args) {
    System.out.println("");
  }
  
  int findLargestSalary= Math.max(job1Salary,job2Salary);  
  int lowestVechiclePrice =  Math.min(carPrice,truckPrice);
  double areaOfCircle= Math.PI*(circleRadius * circleRadius);
  double squareRoot = Math.sqrt(num1);


  }


//In `MathApp.java`, write methods for the following:

//1. Find and display the largest of two variables named `job1Salary` and `job2Salary` using `Math.max()`. Set the variables to any value you want.
//2. Find and display the smallest of two variables named `carPrice` and `truckPrice`. Set the variables to any value you want.
//3. Find and display the area of a circle whose radius is 7.25.
//4. Find and display the square root the variable `num1` after it is set to `5.0`.
//5. Find and display the distance between the points (5, 10) and (85, 50).
//6. Find and display the absolute (positive) value of `num2` after it is set to `-3.8`.
//7. Find and display a random number between 0 and 1.
//