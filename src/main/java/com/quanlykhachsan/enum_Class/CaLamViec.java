package com.quanlykhachsan.enum_Class;

public enum CaLamViec {
    CA_SANG("Ca sáng", 6f, 14f),    // 6 -> 14
    CA_TRUA("Ca trưa", 14f, 22f),   // 14 -> 22
    CA_TOI("Ca tối", 22f, 6f);      // 22 -> 6 (qua ngày hôm sau)

    private final String msg;
    private final float gioVaoLam;
    private final float gioTanLam;

    CaLamViec(String msg, float gioVaoLam, float gioTanLam) {
        this.msg = msg;
        this.gioVaoLam = gioVaoLam;
        this.gioTanLam = gioTanLam;
    }

    @Override
    public String toString() {
        return String.format("%s: Từ %.2f giờ đến %.2f giờ", this.msg, this.gioVaoLam, this.gioTanLam);
    }
}

