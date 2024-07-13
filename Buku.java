public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private int harga;

    // Constructor
    public Buku(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    // Getter
    public int getId(){
        return this.id;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public int getJumlah_halaman(){
        return this.jumlah_halaman;
    }

    public int getHarga(){
        return this.harga;
    }

    // Setter
    public void setId(int id){
        this.id = id;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void setJumlah_halaman(int jumlah_halaman){
        this.jumlah_halaman = jumlah_halaman;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    // ...
    public void input(){
        System.out.println("Ini method untuk input data");
    }
    
    public void tampilkan(){
        System.out.println("select * from buku");
    }
    
    public void hapus(){
        System.out.println("delete from buku");
    }

    public void naikkanHarga(){
        System.out.println("ini method untuk naikkan harga");
    }

    public void naikkanHarga(double kenaikan){
        System.out.println("Harga sekarang = " + (harga + kenaikan));
    }
}
