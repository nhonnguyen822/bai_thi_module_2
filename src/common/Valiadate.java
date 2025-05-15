package common;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valiadate {
    //check tên

    public static boolean isInputName(String name) {
        String regex = "^([\\p{Lu}][\\p{L}]*)(\\s[\\p{Lu}][\\p{L}]*)+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    //check code
    public static boolean isInputCodeBenhAN(String code) {
        String regex = "^BA-\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
    public static boolean isInputCodeBenhNhan(String code) {
        String regex = "^BN-\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }



    //check ngay sinh
    public static boolean isInputDay(String birthDay) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate birthDay1 = LocalDate.parse(birthDay, dateTimeFormatter);
            return true;
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }



}
