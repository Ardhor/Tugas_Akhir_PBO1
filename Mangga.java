public class Mangga extends Pohon{
    private String JenisMangga;

    public void getJenisMangga(String JenisMangga){
        this.JenisMangga = JenisMangga;
    }

    public void tampilkan(){
        System.out.println("SELECT * FROM pohon WHERE jenis_pohon='mangga' and jenis_mangga=" + JenisMangga);
    }
}
