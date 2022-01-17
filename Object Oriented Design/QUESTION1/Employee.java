import java.util.Random;
public class Employee {
    protected int id;
    protected String name;
    protected String mail;
    public boolean free = true;
    public boolean canHandleCall = true ;

    Employee(String name, String mail) {
        Random rand = new Random();
        this.id = rand.nextInt(1000);
        this.name = name;
        this.mail = mail;
    }

    Employee() {
        Random rand = new Random();
        this.id = rand.nextInt(1000);
        this.name = "";
        this.mail = "";
    }

    public int getId() {
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return this.mail;
    }
}