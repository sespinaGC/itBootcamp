package password;

public class PasswordSimple extends Password {
    private String pwd;
    public PasswordSimple (String pwd) {
        super(pwd, "^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{8,}$\n", "The password policy is:\n" +
                "\n" +
                "At least 8 chars\n" +
                "\n" +
                "Contains at least one digit\n" +
                "\n" +
                "Contains at least one lower alpha char\n" +
                "\n" +
                "Does not contain space, tab, etc.");
        this.pwd = getPwd();
    }
    public PasswordSimple() {
        setRegex("^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{8,}$\n");
    }
}
