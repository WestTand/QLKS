package com.quanlykhachsan.enum_Class;

public enum TrangThaiThietBi {
	DANG_HOAT_DONG("Đang hoạt động"),
	KHONG_HOAT_DONG("Không hoạt động");
	
	private String msg;

	TrangThaiThietBi(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
