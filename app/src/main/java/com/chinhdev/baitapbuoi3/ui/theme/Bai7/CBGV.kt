package com.chinhdev.baitapbuoi3.ui.theme.Bai7

class CBGV(
    hoTen: String,
    tuoi: Int?,
    queQuan: String,
    MSGV: String,
    val luongCung: Double?,
    val luongThuong: Double?,
    val tienPhat: Double?
) : Nguoi(hoTen, tuoi, queQuan, MSGV) {
    fun tinhLuong(): Double? {
        if (luongCung == null || luongThuong == null || tienPhat == null) {
            return null
        }
        return luongCung + luongThuong - tienPhat
    }

    override fun toString(): String {
        return super.toString() + ", Lương cứng: $luongCung, Lương thưởng: $luongThuong, Tiền phạt: $tienPhat, Tien luong thuc la: ${tinhLuong()}"
    }


}