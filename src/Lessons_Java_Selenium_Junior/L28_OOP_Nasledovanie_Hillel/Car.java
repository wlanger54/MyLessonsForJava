package Lessons_Java_Selenium_Junior.L28_OOP_Nasledovanie_Hillel;

public class Car {

     private String name;
     private String color;
     private String year;
     private  int weight;

     public Car(String name, String color, String year, int weight) {
          this.name = name;
          this.color = color;
          this.year = year;
          this.weight = weight;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public String getYear() {
          return year;
     }

     public void setYear(String year) {
          this.year = year;
     }

     public int getWeight() {
          return weight;
     }

     public void setWeight(int weight) {
          this.weight = weight;
     }



     public void go () {
          System.out.println("Я еду");
     }

     public void stop () {
          System.out.println("Я стою");
     }

     public  void refuel() {
          System.out.println("Я заправляюсь");
     }



}
