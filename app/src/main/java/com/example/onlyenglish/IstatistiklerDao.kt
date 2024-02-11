package com.example.onlineenglish

class IstatistiklerDao {

    fun dogruArttir(vt:VeriTabaniYardimcisiIstatistik){
        var db=vt.writableDatabase
        db.execSQL("UPDATE istatistikler SET dogru=dogru+1")
        db.close()
    }

    fun yanlisArttir(vt:VeriTabaniYardimcisiIstatistik){
        var db=vt.writableDatabase
        db.execSQL("UPDATE istatistikler SET yanlis=yanlis+1")
        db.close()
    }

    fun istatiskleriGetir(vt:VeriTabaniYardimcisiIstatistik):ArrayList<Istatistikler>{
        var db=vt.writableDatabase
        var bilgiler=ArrayList<Istatistikler>()
        var cursor=db.rawQuery("SELECT * FROM istatiskler",null)
        while (cursor.moveToNext()){
            var bilgi=Istatistikler(cursor.getInt(cursor.getColumnIndexOrThrow("dogru")),
                cursor.getInt(cursor.getColumnIndexOrThrow("yanlis")))
            bilgiler.add(bilgi)
        }
        return bilgiler
    }

    fun istatistikleriSifirla(vt:VeriTabaniYardimcisi){
        var db=vt.writableDatabase
        db.execSQL("DELETE FROM istatistikler")
        db.execSQL("INSERT INTO istatistikler(dogru,yanlis) VALUES(0,0)")
        db.close()
    }

}