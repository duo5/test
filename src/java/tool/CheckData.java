/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DuongHX
 */
public class CheckData {

    public boolean isFullName(String s) {
        s = s.trim();
        String ePattern = "^[a-zA-Z]{1,50}$";//fafew
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(s);
        if (m.matches()) {

            return true;
        }

        return false;
    }

    public boolean isEmail(String s) {
        s = s.trim();
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";//duong231998@gmail.com or .vn
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(s);
        if (m.matches()) {

            return true;
        }

        return false;
    }

    public boolean isUserName(String s) {
        s = s.trim();
        String ePattern = "^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";// username is 8-20 characters long// no _ or . at the beginning//no __ or _. or ._ or .. inside//allowed characters// no _ or . at the end
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(s);
        if (m.matches()) {

            return true;
        }

        return false;
    }

    public boolean isPassword(String s) {
        s = s.trim();
        String ePattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(s);
        if (m.matches()) {

            return true;
        }

        return false;
    }

    /*^                 # start-of-string
(?=.*[0-9])       # a digit must occur at least once
(?=.*[a-z])       # a lower case letter must occur at least once
(?=.*[A-Z])       # an upper case letter must occur at least once
(?=.*[@#$%^&+=])  # a special character must occur at least once
(?=\S+$)          # no whitespace allowed in the entire string
.{8,}             # anything, at least eight places though
$                 # end-of-string*/
}
