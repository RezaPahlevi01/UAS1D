//import Model.Bioskop;
//import Model.Film;
//import Model.Studio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*public class AdminBioskop {
    public static void main(String[] args) {
        Bioskop CGV = new Bioskop();
        CGV.setID("001");
        CGV.setNAMABIOSKOP("Bioskop CGV");
        //set studios at that Bioskop CGV
        int jumlahStudio = 2;
        ArrayList<Studio> studios = new ArrayList<>();
        for(int index=0; index<jumlahStudio;index++){
            Scanner sc = new Scanner(System.in);
            Studio studio = new Studio();
            System.out.print("ID STUDIO : ");//STU001
            studio.setIDSTUDIO(sc.nextLine());
            System.out.print("NAMA STUDIO : ");
            studio.setNAMASTUDIO(sc.nextLine());//STUDIO 1
            System.out.print("KAPASITAS : "); // 100
            studio.setKAPASITAS(sc.nextInt());
            System.out.println("\n Masukkan Data Film di "
                    + studio.getNAMASTUDIO());
            ArrayList<Film> films = new ArrayList<>();
            for(int index1=0; index1<3;index++){
                Film film = new Film();
                Scanner sc1 = new Scanner(System.in);
                System.out.print("ID FILM : ");
                film.setID(sc.nextLine()); // AV001
                System.out.print("NAMA FILM : ");
                film.setNAMAFILM(sc.nextLine()); //AVATAR
                System.out.print("KATEGORI FILM : ");
                film.setKATEGORI(sc.nextLine()); //ACTION
                System.out.print("HARGA FILM : ");
                film.setHARGA(sc.nextLine()); //40000
                films.add(film);
            }
            studio.setFILMSTUDIO(films);
            studios.add(studio);
        }

        //Penjualan Tiket
        Scanner scpntn = new Scanner(System.in);
        System.out.println("Pilih Studio : ");
        switch (scpntn.nextLine()){
            case "0":

                break;
            case "1":
                break;
            default:
                break;
        }

    }
}

      */



        public class Bioskop {
            private String nama,;
            Studio[] studio;


            public Bioskop(String nama, String alamat) {
                this.nama = nama;
                studio = new Studio[5];
                for (int n = 0; n < 5; n++) {
                    studio[n] = new Studio();
                }
            }

            public String getNama() {
                return nama;
            }

            public void setNama(String nama) {
                this.nama = nama;
            }

            public Transaksi reserveSeat(int nStudio) {
                /**
                 * Fungsi untuk memesan kursi dalam studio, input no studio dan fungsi dilanjutkan
                 * ke fungsi pemesanan kursi di class Studio yang dipilih.
                 */
                Transaksi ret = null;
                System.out.println(studio[nStudio-1].toString());
                if (studio[nStudio-1].getFilm() != null) {
                    ret = studio[nStudio-1].reserveSeat();
                }

                return ret;
            }

            public void cancelReservation(int nStudio) {
                /**
                 * Fungsi pembatalan pemesanan kursi dalam studio yang dipilih,
                 * Dilanjutkan dengan fungsi pembatalan di class Studio yang dipilih.
                 */
                studio[nStudio - 1].cancelReservation();
            }

            public void setFilmToStudio(int nStudio, String namaFilm, String sinopsis, ArrayList<JamTayang> jamTayang) {
                /**
                 * Memasukkan film ke studio yang dipilih serta memasukkan jam tayang
                 * film tersebut dan daftar kursi yang tersedia masing-masing jadwal
                 * pemutaran.
                 */
                studio[nStudio - 1] = new Studio(new Film(namaFilm, sinopsis), jamTayang);
            }

            public Studio getStudio(int noStudio) {
                return studio[noStudio-1];
            }

            @Override
            public String toString() {
                String ret = "";
                for (int n = 0; n < 5; n++) {
                    ret = ret + "----Studio " + (n + 1) + "----\n" +
                            studio[n].toString() + "\n";
                }

                return ret;
            }

        }