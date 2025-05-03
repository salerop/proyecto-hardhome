import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class User {

    protected String name;
    protected String dni;
    protected String email;
    protected String passWord;
    protected  String phoneNumber;
    protected  String address;


    public User(String name,String dni,String email,
                String passWord,String phoneNumber,String address)
    {
        this.name=name;
        this.dni=dni;
        this.email=email;
        this.passWord=passWord;
        this.phoneNumber=phoneNumber;
        this.address=address;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public static boolean emailValido(String email){
        Pattern p = Pattern.compile("^[a-zA-Z0-9._%+-]+@(gmail\\.com|@hotmail\\.com|@onFire\\.com)$");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "DNI: " + dni + "\n" +
                "Email: " + email + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Address: " + address + ", " ;

    }
}
