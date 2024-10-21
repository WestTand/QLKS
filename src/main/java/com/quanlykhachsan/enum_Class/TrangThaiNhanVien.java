package com.quanlykhachsan.enum_Class;

public enum TrangThaiNhanVien {
	DANG_LAM_VIEC("Đang làm việc"),
	NGHI_PHEP("Nghỉ phép"),
	NGHI_VIEC("Nghỉ việc");
	
	private String msg;

	TrangThaiNhanVien(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
