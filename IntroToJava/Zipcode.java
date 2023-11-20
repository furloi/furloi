/**********************************************
* Converts zipcodes to bar codes and vice versa
**********************************************/


import java.util.ArrayList;

public class Zipcode{

    private int zip;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int check;
   
    private int [] code;
    private String bar;


    //creates zipcode object and puts digits into an Array.
  
    public Zipcode(int zip){
        this.zip = zip;

        a = zip/10000;
        b = (zip % 10000) / 1000;
        c = (zip % 1000) / 100;
        d = (zip % 100) / 10;
        e = zip % 10;

        check = 10 -((a+b+c+d+e)%10);
        
        code = new int[] {a, b, c, d, e, check};
    }

    //creates barcode object
    public Zipcode (String bar){
        this.bar = bar;
    }



    // converts numerical zipcode to US mail barcode including check digit.  
  
    public String getBarcode(){
         String barcode = new String ("|");

        for (int i=0; i <= 5; i++){
            switch (code[i]){
                case 0: barcode = barcode + "||:::"; break;
                case 1: barcode = barcode + ":::||"; break;
                case 2: barcode = barcode + "::|:|"; break;
                case 3: barcode = barcode + "::||:"; break;
                case 4: barcode = barcode + ":|::|"; break;
                case 5: barcode = barcode + ":|:|:"; break;
                case 6: barcode = barcode + ":||::"; break;
                case 7: barcode = barcode + "|:::|"; break;
                case 8: barcode = barcode + "|::|:"; break;
                case 9: barcode = barcode + "|:|::"; break;
            }
        }
        barcode = barcode +"|";

        return barcode;
    }


        // converts US Mail barcode to numerical zipcode.
  
        public String getZIPcode(){

            // breaks barcode down into an array list of the individual digit sized
            // codes. Omits check digit and external brackets
          
            ArrayList<String> barDigits = new ArrayList<String>();
            for (int i=1; i<25; i=i+5){
                barDigits.add(bar.substring(i,i+5));
            }
            
           // builds zipcode as a string by converting the 5 char chunks of barcode into digits.
            String zipDigits = "";

            for (int i = 0; i<=4; i++){

                String lilBar =barDigits.get(i);

                if (lilBar.equals("||:::")){
                    zipDigits = zipDigits + "0";
                  }
                else if (lilBar.equals(":::||")){
                        zipDigits = zipDigits + "1";
                  }
                else if (lilBar.equals("::|:|")) {
                    zipDigits = zipDigits + "2"; 
                  }
                 else if (lilBar.equals("::||:")) {
                    zipDigits = zipDigits + "3";
                   }
                else if (lilBar.equals(":|::|")) {
                    zipDigits = zipDigits + "4";
                  }
                else if (lilBar.equals(":|:|:")){
                     zipDigits = zipDigits + "5";
                  }
                else if (lilBar.equals(":||::")){
                     zipDigits = zipDigits + "6";
                  }
                else if (lilBar.equals("|:::|")){
                    zipDigits = zipDigits + "7";
                  }
                else if (lilBar.equals("|::|:")){ 
                    zipDigits = zipDigits + "8";
                  }
                else if (lilBar.equals("|:|::")){ 
                    zipDigits = zipDigits + "9";
                  }
                }
          
                // returns numerical zipcode.
                return zipDigits;

            } 

            

        }
