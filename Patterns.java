//Reid Childs
//10/28/26
//This class contains a variety of methods which the user may call in order to create various text structures

public class Patterns {

     //Precondition: In order for an output, rows must be greater than 0 and non-null
     //Postcondition: Returns a right triangle of asterisks with the inputted rows value being the character count of the bottom row
     public static void stars(int rows){
          int i = 1;
          int j = 1;

          while(i < rows + 1){
               while (j > 0){
                    System.out.print("*");
                    j--;
               }
               System.out.println();
               j = (i + 1) * 2 - 1;

               i++;
          }
     }

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

     //Precondition: Non-null number greater than 0. Form of triangle may deteriorate with numbers greater than 11.
     //Postcondition: Returns an inverted right triangle of numbers with start being the value and length of the row. It only uses odd numbers going down to one.
     public static void odds(int start){
          int num = start;

          for (int i = num; i > 0; i--){
               if (num % 2 != 0){
                    for (int j = 0; j < num; j++){  
                         System.out.print(num);
                    }
                    System.out.println();
               }
               num--;

          }
     }

     //Precondition: Takes in a non-null greater than zero number.
     //Postcondition: Returns a pyramid of the characters E and O with the center being the widest part, E, and the value maxE. If an even number, have to start with E. If odd, start with O
     public static void eo(int maxE){
          boolean isO = true;
          boolean ascend = true;
          int countMax = 1;

          if (maxE % 2 == 0){
               isO = true;
          }else {
               isO = false;
          }

          for (int i = (2 * maxE) - 1; i > 0; i--){
               if (isO){
                    for (int count = 0 ; count < countMax; count++){
                         System.out.print("O");
                    }

                    isO = false;
               }else{
                    for (int count = 0 ; count < countMax; count++){
                         System.out.print("E");
                    }

                    isO = true;
               }

               System.out.println();

               if (countMax == maxE){
                    ascend = false;
               }

               if (ascend){
                    countMax++;
               }else {
                    countMax--;
               }
          }
     }

     //Precondition: A non-null greater than zero number. However, the pyramid may start to lose it's shape when numbers over 9 are entered.
     /*Postcondition: Returns a pyramid with the apex centered within the line of characters. Rows is the character count of the top row, 
     and all rows decrease by one character per row. The character of every row is the row imdex.*/
     public static void pyramid(int rows){
          int rowLength = rows * 2 - 1;
          int rowIndex = 1;

          for (int i = 1; i <= rows; i++){


               for (int j = 1; j < i; j++){
                    System.out.print(" ");
               }
               
               for (int j = rowLength; j > 0; j--){
                    System.out.print(rowIndex);
               }

               rowLength -= 2;
               rowIndex++;
               System.out.println();
          }
     }


     public static void main(String[] args) {
          System.out.print("stars");
          System.out.println();
          stars(7);

          System.out.println();

          System.out.print("triangle");
          System.out.println();
          triangle(9);

          System.out.println();

          System.out.print("odds");
          System.out.println();
          odds(9);

          System.out.println();

          System.out.print("Eo (even)");
          System.out.println();
          eo(6);

          System.out.println();

          System.out.print("Eo (odd)");
          System.out.println();
          eo(5);

          System.out.println();

          System.out.print("Pyramid");
          System.out.println();
          pyramid(5);
     }
}