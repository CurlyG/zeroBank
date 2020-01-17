package com.zerobank.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OtherUtils {

    /**
     * This method will pass a List of WebElements and converts it to List of Integers
     * @param listWeb
     * @return
     */
    public static List<Integer> convertListWEtoInteger(List<WebElement> listWeb){
        List<Integer> list = new ArrayList<>();
        for (WebElement webElement : listWeb) {
            String str = webElement.getText().replace("-","");
            list.add(Integer.parseInt(str));
        }
        return list;
    }

    /**
     * This method will pass a List of Integers and will sort it in Descending order
     * @param list
     * @return
     */
    public static List<Integer> sortListDescending(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(list);
        Collections.sort(list1);
        List<Integer> newList = new ArrayList<>();
        for (int i = list.size()-1; i >=0; i--) {
            newList.add(list1.get(i));
        }

        return newList;
    }
}
