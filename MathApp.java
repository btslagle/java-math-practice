public class MathApp {
  public static void main(String[] args) {
    MathApp.findLargestSalary(60_000.00,72_000.00);
    MathApp.minCarPrice(40_000.00, 120_000.00);
    MathApp.areaOfCircle(7.25);
    MathApp.squareRoot(14);
    MathApp.distance(5, 10, 85, 50);
    MathApp.absoluteValue(-3.8);
    MathApp.randomNumber();
  }

  private static void findLargestSalary(double job1Salary,double job2Salary){
    System.out.println(Math.max(job1Salary,job2Salary));
  } 
  private static void minCarPrice(double carPrice, double truckPrice){
    System.out.println(Math.min(carPrice,truckPrice));
  }
  private static void areaOfCircle(double radius){
    System.out.println( Math.PI * radius * radius);
  }
  private static void squareRoot(double num1){
    System.out.println(Math.sqrt(num1));
  } 
  private static void distance(double x1, double x2, double y1, double y2){
    System.out.println(Math.hypot(x1-x2, y1-y2));
  }
  private static void absoluteValue(double num2){
    System.out.println(Math.abs(num2));
  }
  private static void randomNumber(){
    System.out.println(Math.random());
  }

  }

