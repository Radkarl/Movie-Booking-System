public class User {
    
    // MEMBERS
    public int user_id;
    public String user_name;
    public int user_phno;
    public String user_address;
    public String user_email;
    public String user_pwd;
    // END MEMBERS

    // METHODS
    public void user_login() {}
    public void user_logout() {}
    public void viewmovies() {}
    public void bookticket() {}
    public void makepayment() {}
    public void set_id(int id) {
        this.user_id = id;
    }
    public void set_name(String name) {
        this.user_name = name;
    }
    public void set_phno(int num) {
        this.user_phno = num;
    }
    public void set_address(String address) {
        this.user_address = address;
    }
    public void set_email(String email) {
        this.user_email = email;
    }
    public void set_pwd(String password) {
        this.user_pwd = password;
    }
    public int get_id() {
        return user_id;
    }
    public String get_name() {
        return user_name;
    }
    public int get_phno() {
        return user_phno;
    }
    public String get_address() {
        return user_address;
    }
    public String get_email() {
        return user_email;
    }
    public String get_pwd() {
        return user_pwd;
    }
    // END METHODS

}
