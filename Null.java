public class Null {
    public static void main(String[] args){
        String ad=null;
        try {
            if (ad.equals("null")) {
                System.out.println("Eynidir");
            } else {
                System.out.println("Eyni deyil");
            }
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException-u saxla!");
        }
    }
}
