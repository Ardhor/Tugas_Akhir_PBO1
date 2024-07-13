public class Pohon {
    private int id;
    private String namaPohon;
    private int tinggi;
    private String jenisDaun;
    private String jenisAkar;

    //Constructor
    public Pohon(){
        System.out.println("Objek ini telah diciptakan, constructor dijalankan");
    }

    //Getter
    public int getId(){
        return this.id;
    }

    public String getNamaPohon(){
        return this.namaPohon;
    }

    public int getTinggi(){
        return this.tinggi;
    }

    public String getJenisDaun(){
        return this.jenisDaun;
    }

    public String getJenisAkar(){
        return this.jenisAkar;
    }

    //Setter
    public void setId(int id){
        this.id = id;
    }

    public void setNamaPohon(String namaPohon){
        this.namaPohon = namaPohon;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public void setJenisDaun(String jenisDaun){
        this.jenisDaun = jenisDaun;
    }

    public void setJenisAkar(String jenisAkar){
        this.jenisAkar = jenisAkar;
    }

    // ...
    public void input(){
        System.out.println("Insert into pohon values('namaPohon',tinggi,'jenisDaun', 'jenisAkar')");
    }

    public void tampilkan(){
        System.out.println("SELECT * FROM pohon");
    }

    public void tampilkan(int id){
        System.out.println("SELECT * FROM pohon WHERE id=" + id);
    }

    public void tampilkan(String jenisDaun){
        System.out.println("SELECT * FROM pohon WHERE jenisDaun= " + jenisDaun);
    }

    public void tampilkan(String jenisDaun, String jenisAkar){
        System.out.println("SELECT * FROM pohon WHERE jenisDaun=" + jenisDaun + "and jenisAkar=" + jenisAkar);
    }

    public void hapus(){
        System.out.println("DELETE FROM pohon");
    }
}
