package com.example.onlineenglish

import android.content.ContentValues

class YanlisKelimelerDao {
    fun yanlisKelimeEkle(vt:VeriTabaniYardimcisi,yanlis_kelime:String){
        var db=vt.writableDatabase
        var values=ContentValues()

        values.put("yanlis_kelime",yanlis_kelime)
        db.insertOrThrow("yanlis_kelimeler",null,values)
        db.close()
    }

    fun tumYanlisKelimeler(vt:VeriTabaniYardimcisi):ArrayList<YanlisKelimeler>{

        var tumkelimeler=ArrayList<YanlisKelimeler>()

        var db=vt.writableDatabase

        var cursor=db.rawQuery("SELECT * FROM yanlis_kelimeler",null)
        while (cursor.moveToNext()){
            var kisi=YanlisKelimeler(cursor.getString(cursor.getColumnIndexOrThrow("yanlis_kelime")))
            tumkelimeler.add(kisi)
        }
        return tumkelimeler
    }

    fun rastgeleKelimeGetir(vt:VeriTabaniYardimcisi):ArrayList<YanlisKelimeler>{
        var rastgele=ArrayList<YanlisKelimeler>()
        var db=vt.writableDatabase
        var cursor=db.rawQuery("SELECT * FROM yanlis_kelimeler ORDER BY RANDOM() LIMIT 1",null)
        while (cursor.moveToNext()){
            var kisi=YanlisKelimeler(cursor.getString(cursor.getColumnIndexOrThrow("yanlis_kelime")))
            rastgele.add(kisi)

        }
        return rastgele
    }


}