//Reid Childs
//10/28/26
//This program contains a variety of methods which the user may call in order to create various text structures

public class Patterns {

     //Returns a right triangle of asterisks with the inputted rows value being the character count of the bottom row (while)

     //Precondition: In order for an output, rows must be greater than 0 and non-null
     //Postcondition: Returns a right triangle of asterisks with the inputted rows value being the character count of the bottom row
     public static void stars(int rows){
          int i = 1;
          int j = 0;

          while(i < rows + 1){
               while (j < i){
                    System.out.print("*");
                    j++;
               }
               System.out.println();
               j = 0;

               i++;
          }
     }

     //Returns a right triangle of incrementing values with the rows value being the character count of the bottom row (do while)

     //Precondition: I must be greater than or equal to 0 and non-null. This will work with numbers greater than nine, but for each base 10 added, the structure of the triangle will be messed up.
     //Postcondition: Returns a right triangle of incrementing values with the rows value being the character count of the bottom row
     public static void triangle(int rows){

          int i = 1;
          int j = 0;

          do {
               while (j < i){
                    System.out.print(i);
                    j++;
               }
               System.out.println();
               j = 0;
               
               i++;
          }while (i <= rows);
     }

     //Returns an inverted right triangle of numbers with start being the value and length of the row. It only uses odd numbers going down to one (for)

     //Precondition: 
     //Postcondition: 
     public static void odds(int start){

     }

     //Returns a pyramid of the characters E and O with the center being the widest part, E, and the value maxE. If an even number, have to start with E. If odd, start with O

     //Precondition: 
     //Postcondition: 
     public static void eo(int maxE){

     }

     /*Returns a pyramid with the apex centered within the line of characters. Rows is the character count of the top row, 
     and all rows decrease by one character per row. The character of every row is the row imdex.*/

     //Precondition: 
     //Postcondition: 
     public static void pyramid(int rows){

     }


     public static void main(String[] args) {
          //stars(7);

          //triangle(9);


     }
}