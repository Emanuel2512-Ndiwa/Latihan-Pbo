package Modul_02.lathianmembuatclassdanobject;

public class ketuaprodi {
   

        private String nip;
        private String nama;
        private String email;
        private String gelar;
    
        public ketuaprodi(String nip, String nama) {
            this.nip = nip;
            this.nama = nama;
        }
    
        public String getNIP() {
            return nip;
        }
    
        public String getNama() {
            return nama;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public String getGelar() {
            return gelar;
        }
    
        public void setGelar(String gelar) {
            this.gelar = gelar;
        }
    }


