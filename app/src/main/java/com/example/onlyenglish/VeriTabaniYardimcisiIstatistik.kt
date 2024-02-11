package com.example.onlineenglish

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class VeriTabaniYardimcisiIstatistik(context: Context):SQLiteOpenHelper(context,"istatistikler",null,1) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE istatistikler(dogru INTEGER ,yanlis INTEGER );")

        db.execSQL("INSERT INTO istatistikler(dogru,yanlis) VALUES (0,0);")

    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS istatistikler")
        onCreate(db)
    }
}