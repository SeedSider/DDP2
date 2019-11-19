import java.sql.Driver;
import java.util.*;

public class Lab10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws CustomException{
        System.out.print("Jumlah pendaftar: ");
        try {
            int Input = in.nextInt();
            for (int i = 0; i < Input; i++) {
                readInput();
            }
        }
        catch(InputMismatchException e) {
            System.out.println("Mohon masukkan angka dalam format Integer");
        }

        finally {
            System.out.println("-------------------------");
            System.out.println("Done.");
        }
    }

    // method to prompt user input
    public static void readInput() throws CustomException {
        System.out.println("");
        System.out.println("(masukkan dalam format \"nama#gender#kotaAsal#tanggalLahir");
        System.out.println("dengan tanggalLahir dalam (dd-mm-yyyy)");
        System.out.println("dan kotaAsal dalam x,y,z");
        System.out.println("contoh: Dekdepe#wanita#Koja,Jakarta Utara,DKI Jakarta#24-07-1995");
        System.out.println("");
        System.out.println("identitas: ");
        try {
            String inputUser = in.next();
            String[] identity = inputUser.split("#");
            if (identity.length != 4) {
                throw new CustomException();
            }
            else {
                Driver driver = new Driver(identity[0]);
                driver.setGender(identity[1]);
                driver.setAddress(identity[2]);
                driver.setBirthDate(identity[3]);
            }
        }
        catch (CustomException e) {
            e.getMessage();
        }
    }

    static class Driver {
        String name;
        String[] address;
        String gender;
        String[] birthDate;

        Driver(String name){
            this.name = name;
            this.address = new String[3];
            this.birthDate = new String[3];
        }

        // method to set Gender
        void setGender(String gender) {
            if(!gender.equals("pria")) {
                if(!gender.equals("wanita")) {
                    System.out.println("Gender tidak sesuai");
                }
                else {
                    this.gender = gender;
                }
            }
            else {
                this.gender = gender;
            }
            // code here
        }

        // method to set Address
        void setAddress(String query) throws CustomException {
            String add[] = query.split(",");
            if(add.length != 3) {
                throw new CustomException("alamat");
            }
            else {
                this.address = add;
            }
            // code here
        }

        // method to set BirthDate
        void setBirthDate(String query) throws CustomException{
            String[] date = query.split("-");
            if(date.length != 3) {
                throw new CustomException("tanggal");
            }
            else {
                this.birthDate = date;
            }
            // code here
        }
    }

    static class CustomException extends Exception {
        public CustomException() {
            System.out.println("Masukkan input yang sesuai dengan format");
        }

        public CustomException(String message) {
            System.out.println("mohon masukkan " + message + " sesuai format");
        }
    }
}