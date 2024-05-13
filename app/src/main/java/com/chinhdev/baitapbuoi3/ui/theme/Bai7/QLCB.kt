package com.chinhdev.baitapbuoi3.ui.theme.Bai7

class QLCB {
    private var list:MutableList<CBGV> = mutableListOf()
    fun addGV(gv: CBGV){
        this.list.add(gv)
    }
    fun delGV(id: String): Boolean{
        var giangVien = list.stream().filter { gv->gv.MSGV.equals(id) }.findFirst().orElse(null);
        if (giangVien == null){
            return false
        }else{
            list.remove(giangVien)
            return true
        }
    }
    fun hienThiChiTiet(){
        list.stream().forEach { gv -> println(gv.toString()) }
    }

}