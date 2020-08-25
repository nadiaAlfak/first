import java.util.Scanner;

public class HorofeSedaDar {
    public void horof(){
        boolean issedaDar=chek(vorodi());

        if(issedaDar==true){
            System.out.println("seda dar bod");
        }
        else if (issedaDar==false){
            System.out.println("seda dar nabod");
        }

    }
    //gereftan vorodi az karbar
    private String vorodi(){
        System.out.println("esm ra vared konid");
        Scanner scanner=new Scanner(System.in);
        String esm =new String();
        esm=scanner.next();
        return esm;
    }
    //
    private boolean chek(String kalame){
        //salam nadia, man in code ro ezafe kardam.
        try{
        String chahar=new String();
        chahar=String.valueOf(kalame.charAt(3));
        if(chahar.equals("a")|| chahar.equals("o")|| chahar.equals("u")|| chahar.equals("e")){
            return true;
        }
        else {
            return false;
        }
        }
        catch (Exception ex){
            System.out.println("kalame kamtar az 4 harf ast.");
            return false;
        }
    }

    private boolean chekswitch(String kalame) {
        try {
            String chahar = new String();
            chahar = String.valueOf(kalame.charAt(3));

            switch (chahar){
                case "a":
                case "o":
                case "u":
                case "e":
                    return true;
                default:
                    return false;
            }

        } catch (Exception ex) {
            System.out.println("kalame kamtar az 4 harf ast.");
            return false;
        }
    }
}

