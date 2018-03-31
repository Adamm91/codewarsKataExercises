package kata;

public class SleighAuthentication {
    public static void main(String[] args) {

    }

    public static Boolean authenticate(String name, String password){
        return name.equals("Santa Claus") && password.equals("Ho Ho Ho!") ? true : false;
    }
}
