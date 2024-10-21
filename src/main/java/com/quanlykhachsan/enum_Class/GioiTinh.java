package com.quanlykhachsan.enum_Class;

public enum GioiTinh {
    NAM("Nam"),
    NU("Nữ"),
    KHAC("Giới tính khác");

    private String msg;

    GioiTinh(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}

