public class Main {
    Users uzytkownicy;
    Obywatele obywatele;
    User admin;
    public static void main(String[] args) {

        Operacje_uzytkownika operacje_uzytkownika=new Fasada();
        operacje_uzytkownika.loginAttempt("login", "password");
        //TODO-dane w zaden sposob nie sa dostarczane do bufora
        operacje_uzytkownika.modifyDB(1);
    }
}