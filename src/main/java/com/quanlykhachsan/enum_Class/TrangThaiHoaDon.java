package com.quanlykhachsan.enum_Class;

public enum TrangThaiHoaDon {
	DA_THANH_TOAN("Đã thanh toán"),
	CHUA_THANH_TOAN("Chưa thanh toán");
	
	private String msg;

	TrangThaiHoaDon(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
