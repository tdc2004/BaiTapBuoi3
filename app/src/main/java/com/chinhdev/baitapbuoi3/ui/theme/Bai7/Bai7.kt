package com.chinhdev.baitapbuoi3.ui.theme.Bai7

fun main(){
    var qlcb: QLCB = QLCB();
    while (true){
        println("<<Danh sách chức năng>>")
        println("1.Thêm giảng viên mới")
        println("2.Xóa giảng viên")
        println("3.Hiển thị danh sách giảng viên")
        println("Vui lòng chọn chức năng")
        var choice = readLine()
        when(choice){
            "1" ->{
                println("Mời nhập họ tên: ")
                var name = readLine().orEmpty();
                println("Mời nhập tuổi: ")
                val ageInput = readLine().orEmpty();
                val age = ageInput.toIntOrNull();
                println("Mời nhập quê quán: ")
                var country = readLine().orEmpty();
                println("Mời nhập MSGV: ")
                var MSGV = readLine().orEmpty();
                println("Mời nhập lương cứng: ")
                var luongCungInput = readLine().orEmpty();
                var luongCung = luongCungInput?.toDoubleOrNull()
                println("Mời nhập lương thưởng: ")
                var luongThuongInput = readLine().orEmpty();
                var luongThuong = luongThuongInput?.toDoubleOrNull()
                println("Mời nhập tiền phạt: ")
                var tienPhatInput = readLine().orEmpty();
                var tienPhat = tienPhatInput?.toDoubleOrNull()
                val cbgv = CBGV(name,age,country,MSGV,luongCung,luongThuong,tienPhat)
                qlcb.addGV(cbgv)
            }
            "2" -> {
                println("Moi nhap MSGV can xoa: ")
                var id = readLine().orEmpty();
                var check = qlcb.delGV(id)
                if (check){
                    println("Xoa thanh cong")
                }else{
                    println("Xoa that bai")
                }
            }
            "3" ->{
                println("Danh Sach Giang Vien: ")
                qlcb.hienThiChiTiet()
            }
            "0" -> break
            else -> continue

        }

    }
}