package com.example.onlineenglish

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class VeriTabaniYardimcisi(context:Context):SQLiteOpenHelper(context,"yanlis_kelimeler",null,1) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE yanlis_kelimeler(yanlis_kelime TEXT);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS yanlis_kelimeler")
        onCreate(db)


    }
}