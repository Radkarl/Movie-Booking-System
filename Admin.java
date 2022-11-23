public class Admin {
    
    // MEMBERS
    private int admin_id;
    private String admin_name;
    private String admin_password;
    // END MEMBERS

    // METHODS
    public void StatusReport() {}
    public void AddMovie() {}
    public void RemoveMovie() {}
    public void UpdateMovie() {}
    public void show_details() {
        System.out.println("ID: " + admin_id);
        System.out.println("Name: " + admin_name);
        System.out.println("Password: " + admin_password);
    }



}
