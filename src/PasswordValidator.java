// ดูโจทย์ spec และวิธีทำใน README.md
public class PasswordValidator {

    static final int MIN_LEN = 8;
    static final int MAX_LEN = 20;

    static boolean validate(String pw) {
        // TODO: implement ตาม spec ใน README.md (R1-R6)
        if(pw==null) throw new IllegalArgumentException();
        if(pw.length()<8) return false;
        if(pw.length()>20) return false;
    
        if(pw.length()<MIN_LEN) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean noSpace = true;

        for (int i =0; i < pw.length(); i++){
            Character c = pw.charAt(i);
            if(Character.isUpperCase(c)) hasUpper = true;
           
            if(Character.isLowerCase(c)) hasLower = true;

            if(Character.isDigit(c)) hasNumber = true;

            if(pw.contains(" ")) noSpace =false;



        }
        return hasUpper && hasLower && hasNumber && noSpace ;
    }
}
