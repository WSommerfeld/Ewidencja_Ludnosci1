public class Main {



    public static void main(String[] args) {
        Users uzytkownicy= new Users();
        Obywatele obywatele = new Obywatele();
        User admin = new User("admin","adminpass",true);
        User user1 = new User ("user1", "password", false);

        Record obywatel1 = new Record(777777777, "Jan", "Kowalski", "20.03.2003",
                "Kraków", "Polska", false, 'M', "PL", 0, "brak");
        Record obywatel2 = new Record(777777778, "Piotr", "Kowalski", "20.03.2001",
                "Wrocław", "Polska", false, 'M', "PL", 0, "brak");

        Users.user.add(admin);
        Users.user.add(user1);

        Obywatele.record.add(obywatel1);
        Obywatele.record.add(obywatel2);

        Operacje_uzytkownika operacje_uzytkownika=new Fasada();
        operacje_uzytkownika.loginAttempt("login", "password");
        //TODO-dane w zaden sposob nie sa dostarczane do bufora
        operacje_uzytkownika.modifyDB(1);
    }
}