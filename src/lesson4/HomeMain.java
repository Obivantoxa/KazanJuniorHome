package lesson4;

public class HomeMain {
    public static void main(String[] args) {

        String mail = "example@mail.ru";
        String password = "Passw0rd.1133";
      //  DogSplit.dogSpliting(mail);
        PasswordCheck.passwordChecking(password,mail);
        PasswordCheck.charCheckPass(password);
        PasswordCheck.engPassCheck(password);
        PasswordCheck.povtor(password);

    }
}
