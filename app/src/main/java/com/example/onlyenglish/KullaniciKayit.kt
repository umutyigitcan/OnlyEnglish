package com.example.onlyenglish

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class KullaniciKayit(var ad_soyad:String?="",var kullanici_adi:String?="",var sifre:String?="") {
}