package password;

public class PasswordIntermedia extends Password {
    private String pwd;
    public PasswordIntermedia (String pwd) {
        super(pwd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\\\S+$).{8, 20}$", "The password policy is:\n" +
                "\n" +
                "At least 8 chars\n" +
                "\n" +
                "Contains at least one digit\n" +
                "\n" +
                "Contains at least one lower alpha char and one upper alpha char\n" +
                "\n" +
                "Does not contain space, tab, etc.");
        this.pwd = getPwd();
    }
    public PasswordIntermedia() {
        setRegex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$\n");
    }
}
