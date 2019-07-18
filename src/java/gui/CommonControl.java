
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author DuongHX
 */
public class CommonControl {
    public static String generateHyperlink(String url, String label)
    {
        return "<li class=\"page-item\"><a class=\"page-link\" href=\""+url+"\">"+label+"</a></li>";
    }
    
    public static String generateTextbase(String text)
    {
        return "<li class=\"page-item active\"><a class=\"page-link\" href=\"#\">"+text+"</a></li>";
    }
    
}
