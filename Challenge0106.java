// Adrián Navarro Gabino

import java.util.*;

public class Challenge0106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String code = sc.nextLine();
        short result;
        String country;

        while(!code.equals("0")) {
            code = code.length() > 8 ? String.format("%013d", Long.parseLong(code)) :
                String.format("%08d", Long.parseLong(code));

            result = 0;
            
            for(int i = code.length() - 1; i > 0; i -= 2) {
                result += Short.parseShort(code.charAt(i) + "");
                result += Short.parseShort(code.charAt(i - 1) + "") * 3;
            }

            if(code.length() == 13) {
                result += Short.parseShort(code.charAt(0) + "");

                if(result % 10 != 0) {
                    System.out.println("NO");
                }
                else {
                    country = "Desconocido";

                    if(code.charAt(0) == '0') {
                        country = "EEUU";
                    }
                    else {
                        switch(code.substring(0, 2)) {
                            case "50": country = "Inglaterra"; break;
                            case "70": country = "Noruega"; break;
                            default:
                                switch(code.substring(0, 3)) {
                                    case "380": country = "Bulgaria"; break;
                                    case "539": country = "Irlanda"; break;
                                    case "560": country = "Portugal"; break;
                                    case "759": country = "Venezuela"; break;
                                    case "850": country = "Cuba"; break;
                                    case "890": country = "India"; break;
                                }
                                break;
                        }
                    }

                    System.out.println("SI " + country);
                }
            }
            else if(result % 10 == 0) {
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }

            code = sc.nextLine();
        }
    }
}