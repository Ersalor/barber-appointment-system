public class User {
    private Long id;
    private String name;
    private String surname;
    private String phone;
    private String password;
    private Role role;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole(){
        return role;
    }
}
