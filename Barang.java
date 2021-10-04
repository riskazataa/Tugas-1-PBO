public class Barang {
        String idProduk;
        String nama;
        double harga;

        Barang(String idProduk, String nama, double harga){
            this.idProduk = idProduk;
            this.nama = nama;
            this.harga = harga;
        }


     Barang(String idProduk, String nama){
            this.idProduk = idProduk;
            this.nama = nama;
        }
        public void setNama(String nama) {

            this.nama = nama;
        }
        public String getNama() {
            return nama;
        }
        public void setHarga(double harga) {
            this.harga = harga;
        }
        public double getHarga() {
            return harga;
        }
        public String getIdProduk() {
            return idProduk;
        }
        public void print(){
            System.out.println("IdProduk = "+getIdProduk()+"\n"+"Nama Barang = "+getNama()+"\n"+
                    "Harga Barang ="+getHarga());
        }
    }

    class Tugas01 {
        public static void main(String[] args) {
            Barang brg01 = new Barang("BRG-001","Tas Gucci");
            brg01.setHarga(1200);

            Barang brg02 = new Barang("BRG-002","Printer Epson L355");
            brg02.setHarga(200);

            brg01.print();

            Barang brg03 = new Barang("BRG-003","Koper",150);
            Barang brg04 = new Barang("BRG-004","Helm",20);

            brg03.print();
            brg04.print();

            System.out.println(brg01.getHarga()+brg03.getHarga()+brg04.getHarga());
        }
    }

