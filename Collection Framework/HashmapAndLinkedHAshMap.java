// video 230 : Hashmap and LinkedhashMap


import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashmapAndLinkedHAshMap {

    public static void main(String[] args) {
        HashMap hm=new HashMap<>();
        hm.put(01, "Biswajit");
        hm.put(02, "Dey");
        hm.put(03, "pw");
        hm.put(null, null);
        System.out.println(hm);//{null=null, 1=Biswajit, 2=Dey, 3=pw}


        HashMap hm1=new HashMap<>();//Insertion are not same 
        hm1.put("virat", "kohili");
        hm1.put("Biswajit","dey" );
        hm1.put("Partha", "Sinha");
        hm1.put("Arup", "Ghosh");
        System.out.println(hm1);//{virat=kohili, Arup=Ghosh, Biswajit=dey, Partha=Sinha}


        LinkedHashMap hm2=new LinkedHashMap();//Insertion are same 
        hm2.put("virat", "kohili");
        hm2.put("Biswajit","dey" );
        hm2.put("Partha", "Sinha");
        hm2.put("Arup", "Ghosh");
        System.out.println(hm2);//{virat=kohili, Biswajit=dey, Partha=Sinha, Arup=Ghosh}


    }
}