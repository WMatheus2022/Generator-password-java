import java.util.Random;

public class GeneratorPassword {
    public static void main(String[] args) throws Exception {
        int length = 10;
        System.out.println(geek_Password(length));
    }
    static char[] geek_Password(int len) {
        System.out.println("Gerando senha usando aleatório");
        System.out.println("Sua nova senha é:");
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&^<>+=-/.*?(){}_[]";
        String values = 
            Capital_chars + Small_chars + numbers + symbols;
        Random rndm_method = new Random();
        char[] password = new char[len];
        for(int i = 0; i < len; i++) {
            password[i] = values.charAt(rndm_method.nextInt(values.length()));
        } 
        return password;
    }
    
}
