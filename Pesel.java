import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pesel {
        private byte PESEL[] = new byte[11];
        private boolean valid = false;

    public static void main(String args[]){

        Pesel pesel = new Pesel("89080510513");

        LocalDate localDate1 = LocalDate.of(pesel.getBirthYear(), pesel.getBirthMonth(), pesel.getBirthDay());
        LocalDate localDate2 = LocalDate.now();
        long age = ChronoUnit.YEARS.between(localDate1, localDate2);

        System.out.println(String.valueOf(age));
    }
        public Pesel(String PESELNumber)
        {
                for (int i = 0; i < 11; i++){
                    PESEL[i] = Byte.parseByte(PESELNumber.substring(i, i+1));
                }
        }

        public int getBirthYear() {
            int year;
            int month;
            year = 10 * PESEL[0];
            year += PESEL[1];
            month = 10 * PESEL[2];
            month += PESEL[3];
            if (month > 80 && month < 93) {
                year += 1800;
            }
            else if (month > 0 && month < 13) {
                year += 1900;
            }
            else if (month > 20 && month < 33) {
                year += 2000;
            }
            else if (month > 40 && month < 53) {
                year += 2100;
            }
            else if (month > 60 && month < 73) {
                year += 2200;
            }
            return year;
        }

        public int getBirthMonth() {
            int month;
            month = 10 * PESEL[2];
            month += PESEL[3];
            if (month > 80 && month < 93) {
                month -= 80;
            }
            else if (month > 20 && month < 33) {
                month -= 20;
            }
            else if (month > 40 && month < 53) {
                month -= 40;
            }
            else if (month > 60 && month < 73) {
                month -= 60;
            }
            return month;
        }


        public int getBirthDay() {
            int day;
            day = 10 * PESEL[4];
            day += PESEL[5];
            return day;
        }
}
