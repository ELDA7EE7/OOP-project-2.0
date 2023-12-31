package UsersOfLibrary;

import java.io.Serializable;

public abstract class Person implements Serializable {
    protected final int ID;
    protected String name;
    protected String email;
    protected String password;
    public Person(int id, String name, String email, String password) {
        this.ID = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
