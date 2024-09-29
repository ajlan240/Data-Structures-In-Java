package String;

public class StringProblem {
    public static void main(String[] args) {
        String message = "hai";
        System.out.println(change(2, message));
    }
    public static String change(int key, String str) {
        int newKey = key % 26;
        char[] charArray = new char[(str.length())];

        for (int i = 0; i < str.length(); i++) {
            int letterPosition = str.charAt(i) + newKey;

            if (letterPosition <= 122) {
                charArray[i] = (char) letterPosition;
            } else {
                charArray[i] = (char) (96 + letterPosition % 122);
            }


            
        }
        return new String(charArray);
    }
    
}
