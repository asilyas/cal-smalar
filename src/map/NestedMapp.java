package map;

import java.util.HashMap;
import java.util.Map;

public class NestedMapp {
    public static void main(String[] args) {
        /*
        {
            "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
            "checkin" : "2021-06-01",
                    "checkout" : "2021-06-10"
        },
            "additionalneeds" : "wi-fi" }

         */

        Map<String,String>bookingdaresMap=new HashMap();
        bookingdaresMap.put("checkin","2021-06-01");
        bookingdaresMap.put("checkout","2021-06-10");

        Map<String,Object>bookingMap=new HashMap();



    }
}
