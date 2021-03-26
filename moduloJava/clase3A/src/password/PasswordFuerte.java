package password;

public class PasswordFuerte extends Password {
    private String pwd;
    public PasswordFuerte (String pwd) {
        super(pwd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$\n", "The password policy is:\n" +
                "\n" +
                "At least 8 chars\n" +
                "\n" +
                "Contains at least one digit\n" +
                "\n" +
                "Contains at least one lower alpha char and one upper alpha char\n" +
                "\n" +
                "Contains at least one char within a set of special chars (@#%$^ etc.)\n" +
                "\n" +
                "Does not contain space, tab, etc.");
        this.pwd = getPwd();
    }
    public PasswordFuerte() {
        setRegex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$\n");
    }
}
