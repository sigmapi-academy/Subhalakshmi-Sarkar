package MyJDBCOne;

import java.sql.Date;

public class TestDateAndTime {
    public static void main(String[] args) {
        java.util.Date ddate = new java.util.Date();
        long l = ddate.getTime();
        Date udate = new Date(l);
        System.out.println("java.util.Date = " + ddate);
        System.out.println("java.sql.Date = " + udate);
    }
}
