import java.util.Scanner;

public class Converter{
  public static void main (String [] args){
  
    Scanner input = new Scanner(System.in);
    
    switch(input.nextInt()){
      case(1):
        System.out.print("Enter the Hexademical number: ");
        System.out.println(hexToDec(IO.readString()));
        break;

      case(2):
        System.out.println("Enter the Demical number: ");
        System.out.println(decToHex(input.nextInt()));
        break;

      default:
        System.out.println("Unknown input!");
        break;
    }
  }
  
  public static String decToHex(int decimal){
    String hex = "";
    int power = 1;

     while(decimal/power >= 16){
        power *= 16;
      }
    
    while(power != 0){
      
      if(decimal/power == 15){
        hex += "F";
      }
      else if(decimal/power == 14){
        hex += "E";
      }
      else if(decimal/power == 13){
        hex += "D";
      }
      else if(decimal/power == 12){
        hex += "C";
      }
      else if(decimal/power == 11){
        hex += "B";
      }  
      else if(decimal/power == 10){
        hex += "A";
      }
      else
        hex += decimal/power;
      
      decimal -= (decimal/power)*power;
      power /= 16;
    }
    
    return hex;
  }

  public static int hexToDec(String hex){
    int power = 1;
    int dec = 0;
    for(int i = hex.length()-1; i > -1; i--){

      if(hex.charAt(i) == 'F'){
        dec += power*15;
      }
      else if(hex.charAt(i) == 'E'){
        dec += power*14;
      }
      else if(hex.charAt(i) == 'D'){
        dec += power*13;
      }
      else if(hex.charAt(i) == 'C'){
        dec += power*12;
      }
      else if(hex.charAt(i) == 'B'){
        dec += power*11;
      }
      else if(hex.charAt(i) == 'A'){
        dec += power*10;
      }
      else if(hex.charAt(i) == '9'){
        dec += power*9;
      }
      else if(hex.charAt(i) == '8'){
        dec += power*8;
      }
      else if(hex.charAt(i) == '7'){
        dec += power*7;
      }
      else if(hex.charAt(i) == '6'){
        dec += power*6;
      }
      else if(hex.charAt(i) == '5'){
        dec += power*5;
      }
      else if(hex.charAt(i) == '4'){
        dec += power*4;
      }
      else if(hex.charAt(i) == '3'){
        dec += power*3;
      }
      else if(hex.charAt(i) == '2'){
        dec += power*2;
      }
      else if(hex.charAt(i) == '1'){
        dec += power*1;
      }
      power *= 16;
    }
    return dec;
  }
}
