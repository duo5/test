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
public class PaggerControl {
    public static String generate(int pageIndex, int maxPage, int gap)
    {
        String result = "";
        if(pageIndex - gap > 1)
          result+=  CommonControl.generateHyperlink("?page=1", "First");
        
        for(int i = pageIndex - gap; i<pageIndex;i++)
            if(i>0)
                result+=  CommonControl.generateHyperlink("?page="+i, ""+i);
        
        result+=  CommonControl.generateTextbase(""+pageIndex);
        
        for(int i=pageIndex+1;i<= pageIndex+gap;i++)
            if(i<= maxPage)
                result+=  CommonControl.generateHyperlink("?page="+i, ""+i);
        
        if(maxPage - gap > pageIndex)
            result+=  CommonControl.generateHyperlink("?page="+ maxPage, "...Last");
        return result;
    }
}
