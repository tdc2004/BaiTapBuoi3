package com.chinhdev.baitapbuoi3.ui.theme.Bai8

fun main(){
    val qltm : QLTM = QLTM();
    while (true){
        println("<<Danh sách chức năng>>")
        println("1.Thêm thẻ mượn")
        println("2.Xóa thẻ mượn")
        println("3.Hiển thị danh thẻ mượn")
        println("Vui lòng chọn chức năng")
        val choice = readLine();
        when(choice){
            "1" -> {
                println("Mời nhập họ tên: ")
                var name = readLine().orEmpty();
                println("Mời nhập tuổi: ")
                val ageInput = readLine().orEmpty();
                val age = ageInput.toIntOrNull();
                println("Mời nhập lớp: ")
                val classInput = readLine().orEmpty();
                val sinhVien = SinhVien(name,age,classInput)
                println("Mời nhập mã số phiếu mượn: ")
                var mspm = readLine().orEmpty();
                println("Mời nhập ngày mượn: ")
                var ngayMuonIP = readLine().orEmpty();
                val ngayMuon = ngayMuonIP.toIntOrNull()
                println("Mời nhập hạn trả: ")
                var hanTraIP = readLine().orEmpty();
                val hantra = hanTraIP.toIntOrNull()
                println("Mời nhập số hiệu nhà sách: ")
                var soHieuIP = readLine().orEmpty();
                val phieumuon = TheMuon(mspm,ngayMuon,hantra,soHieuIP,sinhVien)
                qltm.addTM(phieumuon)
            }
            "2" ->{
                println("Moi nhap ma so phieu muon can xoa: ")
                var id = readLine().orEmpty()
                val check = qltm.xoaTM(id)
                if (check){
                    println("Xoa thanh cong")
                }else{
                    println("xoa that bai")
                }
            }
            "3"->{
                println("Danh sach phieu muon: ")
                qltm.showDetails()
            }
            "0" -> break
            else -> continue
        }
    }
}