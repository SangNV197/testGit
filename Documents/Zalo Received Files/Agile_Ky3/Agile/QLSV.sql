USE QLSV_AGILE
CREATE DATABASE QLSV_AGILE

CREATE TABLE ACCOUNT(
	USERNAME NVARCHAR(30) PRIMARY KEY,
	PASS NVARCHAR(20),
	
);

INSERT INTO ACCOUNT VALUES ('TK01',123456);
INSERT INTO ACCOUNT VALUES ('TK02',123456);

SELECT * FROM ACCOUNT

CREATE TABLE SINHVIEN(
	mssv varchar(10) primary key,
	ho_ten nvarchar(50),
	ngay_sinh varchar(10),
	gioi_tinh bit,
	dia_chi nvarchar(50),
	sdt varchar(10),
	email varchar(50),
	chuyen_nganh nvarchar(50),
	ky_hoc int
);
INSERT INTO SINHVIEN VALUES('SV01',N'Nguyễn Văn Nam','20-05-2002',1,N'Hà Nội','0954785623','namnv@gmail.com',N'Phát Triển Phần Mềm',1)
INSERT INTO SINHVIEN VALUES('SV02',N'Nguyễn Thị Hoa','11-10-2001',0,N'Hà Nội','0654789512','hoant@gmail.com',N'Marketing',5)
insert into SINHVIEN values('SV03',N'Nguyễn Lan Hương','05-12-2000',0,N'Đà Nẵng','0987456235','huongnl@gmail.com',N'Lập Trình Web',4)
insert into SINHVIEN values('SV04',N'Đỗ Thị Ninh','15-01-1998',0,N'TP HCM','0897456035','ninhdt@gmail.com',N'Thiết Kế Đồ Họa',2)
insert into SINHVIEN values('SV05',N'Nguyễn Văn Duy','15-10-2001',1,N'Hà Nội','0358954123','duynv@gmail.com',N'Kinh Tế',5)
insert into SINHVIEN values('SV06',N'Lê Anh Dương','20-10-2004',0,N'Hải Phòng','0654789512','duongla@gmail.com',N'Marketing',1)
insert into SINHVIEN values('SV07',N'Nguyễn Ngọc Lan','11-10-2001',0,N'Hà Nội','0987523654','lannn@gmail.com',N'Kinh Tế',6)

select * from SINHVIEN