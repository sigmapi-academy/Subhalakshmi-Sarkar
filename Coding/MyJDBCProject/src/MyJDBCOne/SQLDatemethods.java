package MyJDBCOne;

import java.sql.Date;
//import java.time.Instant;
import java.time.LocalDate;

public class SQLDatemethods {
    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        Date sqlDate = new Date(now);
        System.out.println("SQLDate:" + sqlDate);
        sqlDate.setTime(356373000000L);
        System.out.println("sqlDate: " + sqlDate);

        LocalDate localDt = sqlDate.toLocalDate();
        System.out.println("LocalDate: "+ localDt);
        //Instant instant = sqlDate.toInstant();
        //System.out.println("Instant: "+ instant);
    }
}
