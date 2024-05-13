package com.chinhdev.baitapbuoi3.ui.theme.Bai8

class TheMuon(
    val maPM: String,
    val ngayMuon: Int?,
    val hanTra: Int?,
    val soHieuSach: String,
    val sinhVien: SinhVien
) {
    override fun toString(): String {
        return "TheMuon(maPM='$maPM', ngayMuon=$ngayMuon, hanTra=$hanTra, soHieuSach='$soHieuSach', sinhVien=$sinhVien)"
    }
}