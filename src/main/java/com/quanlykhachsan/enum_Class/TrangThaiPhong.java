package com.quanlykhachsan.enum_Class;

public enum TrangThaiPhong {
	TRONG("Phòng trống"),
	DA_DAT("Phòng đã đặt"),
	DON_DEP("Phòng đang đọn dẹp"),
	BAO_TRI("Phòng đang được bảo trì"),
	DA_COC("Phòng đã được đặt trước");
	
	private String msg;

	TrangThaiPhong(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
