package br.com.estoque.aplicacao;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

public class T {
    public static void main(String[] args) throws ParseException {
        Date f = new Date(new Date().getTime());
        System.out.println(new java.sql.Date(
            Calendar.getInstance().getTimeInMillis()));

    }
}
