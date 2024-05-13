package com.chinhdev.baitapbuoi3.ui.theme.Bai8

class QLTM {
    private var list: MutableList<TheMuon> = mutableListOf();
    fun addTM(theMuon: TheMuon){
        this.list.add(theMuon)
    }
    fun xoaTM(id: String):Boolean{
        var tm = list.stream().filter { t -> t.maPM.equals(id) }.findFirst().orElse(null)
        if (tm == null){
            return false
        }else{
            list.remove(tm)
            return true
        }
    }
    fun showDetails(){
        println(list.stream().forEach { tm -> println(tm.toString()) })
    }
}