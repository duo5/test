/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DuongHX
 */
public class CurrentTime {
    public Date currentTime(){
        Date date=new Date();
        return date;
    }
    public long ID(){
        Date date=new Date();
        return date.getTime();
    }
}
