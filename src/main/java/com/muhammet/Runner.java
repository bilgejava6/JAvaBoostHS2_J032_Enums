package com.muhammet;

import com.muhammet.entity.Personel;
import com.muhammet.entity.Unvanlar;

public class Runner {
    public static void main(String[] args) {
        /**
         * SORUN:
         * basit bir ünvan kısmında bile, String değerin farklılık göstermesi veri tutarlılığını
         * ve arama bulma işlemlerini kısır bir döngüye sokar. Belli bir standardı yok bu nedenle
         * büyük sorunların çıkması kaçınılmazdır.
         * ---------------------------
         * işlemler
         * 1- toplam
         * 2- çıkartma
         * 3- çarpma
         * 4- bölme
         * 0 çıkış
         * secçiniz...:
         * * ne yapmak istiyorsun: çarpa, çarp, çarpma işlemi yapacağım, Çarp, .....
         * Geçici çözüm:
         * string yerine belirlenmiş int değerler alarak sorunu çözebiliriz, ancak bu seferde
         * insanlar sınırların değerler girebilirler ayrıca int değerlerin hangi ifadeye
         * ait olduğunu bulmak zaman alacaktır.
         *
         */


        Personel personel = new Personel("Murat", "Ankara","0 888 999 7755",
                "murat@gmail.com", Unvanlar.MUDUR, 2);
        Personel personel2 = new Personel("Bahar","Ankara","0 666 999 7455"
                ,"bahar@gmail.com",Unvanlar.MUDUR,2);
        Personel personel3 = new Personel("Hakkı","Ankara","0 332 222 4532"
                ,"hakki@gmail.com",Unvanlar.MUDUR,21);
        Personel personel4 = new Personel("Fatih","Ankara","0 658 222 3244"
                ,"fatih@gmail.com",Unvanlar.MUHENDIS,23);





    }
}