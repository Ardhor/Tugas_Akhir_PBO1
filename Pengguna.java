// Class
public class Pengguna {
    // Atribut
    private int id;
    private String username;
    private String password;

    // Constructor
    public Pengguna(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    // Getter
    public int getId(){
        return this.id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    // Setter
    public void setId(int id){
        this.id = id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    
    public void setPassword(String password){
        this.password = password;
    }

    // ...
    public void hapus(){
        System.out.println("DELETE FROM pengguna");   
    }

    public void hapus(int id){
        System.out.println("DELETE FROM pengguna where id=" + id);
    }

    public void hapus(String username){
        System.out.println("DELEET FROM pengguna where username=" + username);
    }

    public void login(){
        System.out.println("Ini Method Untuk Login");
    }
    
    public void login(String tokenGoogle){
        System.out.println("Ini login menggunakan Google");
    }

    public void lupaPassword(){
        System.out.println("Ini method untuk lupa password");
    }
    
    public void daftar(){
        System.out.println("Ini method daftar user baru");
    }
}
