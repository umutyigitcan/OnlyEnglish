package com.example.onlyenglish

import android.database.Cursor

class Leveldao {

    fun levelArttir(vt: VeritabaniYardimcisiLevel) {
        var db = vt.writableDatabase
        db.execSQL("UPDATE level SET leveldurum = leveldurum + 1;")
        db.close()
    }

    fun levelAzalt(vt:VeritabaniYardimcisiLevel){
        var db=vt.writableDatabase
        db.execSQL("UPDATE level SET leveldurum=leveldurum-1;")
        db.close()
    }

    fun levelDurum(vt:VeritabaniYardimcisiLevel):ArrayList<Level>{

        var db=vt.writableDatabase
        var levelDurumListe=ArrayList<Level>()
        var cursor=db.rawQuery("SELECT * FROM  level",null)
        while (cursor.moveToNext()){
            var ekleme=Level(cursor.getInt(cursor.getColumnIndexOrThrow("leveldurum")))
            levelDurumListe.add(ekleme)
        }
        db.close()

        return levelDurumListe
    }


}