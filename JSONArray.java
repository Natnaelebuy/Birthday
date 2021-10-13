import java.util.HashMap;
import java.util.Scanner;

public class JSONArray {

    public Integer size() {
        return null;
    }

    public JSONObject get(Integer i) {
        return null; }
        /// creat hash map list of my friends and family name and birthday
        public static void main(String[] args) {
            HashMap<String, String> birthdays = new HashMap<>();
            birthdays.put("Natnael", "12/07/1998");
            birthdays.put("Yordanos", "06/20/1980");
            birthdays.put("Yonatan", "11/07/2013");
            birthdays.put("Eden", "06/18/2000");
            birthdays.put("Hawaz", "03/02/1993");
            birthdays.put("Mekdess", "10/13/1981");
            birthdays.put("Gelila", "12/31/2018");
            birthdays.put("Jose", "09/02/1990");
            birthdays.put("Abele", "10/18/1998");
           
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            if(birthdays.get(name) != null)
                System.out.println(name + " my birth dat it: " + birthdays.get(name));
            else
                System.out.println("Birth date not found");
    


    }

}


           

