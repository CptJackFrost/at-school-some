package main.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import main.java.somepackage.Other;
import main.java.somepackage.Some;
import main.java.somethinggreen.AnnotationForExaple;
import main.java.somethinggreen.Contract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Some some = new Some("Здесь какой-то текст");

        System.out.println(some.toString());
        System.out.println(some.getSecret());
        System.out.println(some.getДаТакТожеМожно());
        some.soTellMeAboutInterfaces();
        System.out.println(some.count());
        some.setNoMoreSecrets("Здесь тоже какой-то текст");
        System.out.println(some.getNoMoreSecrets());

        /* Вроде бы этот код для задания не нужен, но на всякий случай оставлю

        HashMap<String,Object> map = new HashMap<>();
        map.put("key1", "value");
        map.put("key2", "value");
        map.put("key3", "value");
        map.put("key4", "value");

        LinkedList list =
                new LinkedList();
        list.add("UIGIU");
        list.add(new Object());
        list.add(1);

        for(int i=0; i<list.size();i++){
            if(list.get(i).getClass().getSimpleName().equals("Object")){
                System.out.println(list.get(i));
            }
        }

        System.out.println(list.get(0));
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
        Contract.staticMethod("");

        System.out.println(map);*/
    }
}
