package Driver;

import Model.*;
import Controller.*;
import View.*;
import java.text.ParseException;
import java.util.Date;


public class Driver {
    public static void main(String[] args) throws ParseException {
        Aplikasi app = new Aplikasi();
//        controller con = new controller(app);

        Date dt = new Date();
        System.out.println("tgl : "+dt.toString());
        System.out.println("tahun : "+dt.getYear());
        app.listTahun();
//        System.out.println();
        
    }
}