package com.quanlykhachsan.enum_Class;

public enum TrangThaiTaiKhoan {
	DANG_HOAT_DONG("Đang hoạt động"),
	KHONG_HOAT_DONG("Không hoạt động");
	
	private String msg;

	TrangThaiTaiKhoan(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
