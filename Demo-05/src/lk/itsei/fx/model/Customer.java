package lk.itsei.fx.model;

public class Customer {
    private String cid;
    private String name;
    private String password;

    public Customer() {
    }

    public Customer(String cid, String name, String password) {
        this.cid = cid;
        this.name = name;
        this.password = password;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid='" + cid + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
