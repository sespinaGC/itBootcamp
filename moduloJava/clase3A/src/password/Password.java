package password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String pwd;
    private String ex;
    private String regex;

    public Password(){};
    public Password (String pwd, String regex, String ex) {
        this.ex = ex;
        this.regex = regex;
        setPwd(pwd);
    }

    public void setPwd(String pwd) {
        Pattern pattern = Pattern.compile(regex, Pattern.LITERAL);
        Matcher matcher = pattern.matcher(pwd);
        boolean matchFound = matcher.find();
        if(matchFound) this.pwd = pwd;
        else {
            throw new RuntimeException(ex);
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}
