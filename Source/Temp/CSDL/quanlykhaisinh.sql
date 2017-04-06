-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 06, 2017 at 04:28 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlykhaisinh`
--

-- --------------------------------------------------------

--
-- Table structure for table `canbo`
--

CREATE TABLE `canbo` (
  `MACB` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MACV` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `HOTENCB` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NGAYSINHBC` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NGAYSINH` date DEFAULT NULL,
  `SDT` decimal(10,0) DEFAULT NULL,
  `EMAIL` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `canbo`
--

INSERT INTO `canbo` (`MACB`, `MAXA`, `MACV`, `HOTENCB`, `NGAYSINHBC`, `NGAYSINH`, `SDT`, `EMAIL`) VALUES
('CB01', 'XA01', 'CV01', 'Lê Văn An', 'Hai mươi tháng tư năm một nghìn chín trăm sáu mươi tám', '1968-04-20', '912345671', 'lvan@gmail.com'),
('CB02', 'XA01', 'CV02', 'Nguyễn Danh', 'Hai mươi bảy tháng tám năm một nghìn chín trăm tám mươi ba', '1983-08-27', '981234567', 'ndanh@gmail.com'),
('CB03', 'XA02', 'CV01', 'Phạm Nhựt Minh', 'Hai tháng tư năm một nghìn chín trăm bảy mươi', '1970-04-02', '901591231', 'pnminh@gmail.com'),
('CB04', 'XA02', 'CV02', 'Châu Ngọc', 'Mười chín tháng năm năm một nghìn chín trăm tám mươi', '1980-05-19', '980124561', 'cngoc@gmail.com'),
('CB05', 'XA03', 'CV01', 'Lê Đức Anh', 'mười lăm tháng ba năm một nghìn chín trăm bảy mươi hai', '1972-03-15', '1215983041', 'lda@gmail.com'),
('CB06', 'XA03', 'CV02', 'Trần Trí Dũng', 'hai mươi bốn tháng sáu năm một nghìn chín trăm tám mươi lăm', '1985-06-24', '987432053', 'ttd@gmail.com'),
('CB07', 'XA04', 'CV01', 'Võ Ngọc Bích', 'hai tháng tám năm một nghìn chín trăm bảy mươi lăm', '1975-08-02', '1269509327', 'vnbich@gmail.com'),
('CB08', 'XA04', 'CV02', 'Đặng Tuấn Hiệp', 'hai mươi ba tháng mười hai năm một nghìn chín trăm chín mươi', '1990-12-23', '907329743', 'dthiep@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `MACV` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENCV` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`MACV`, `TENCV`) VALUES
('CV01', 'Chủ Tịch'),
('CV02', 'Công Chức Tư Pháp Hộ Tịch');

-- --------------------------------------------------------

--
-- Table structure for table `dantoc`
--

CREATE TABLE `dantoc` (
  `MADT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENDT` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `dantoc`
--

INSERT INTO `dantoc` (`MADT`, `TENDT`) VALUES
('DT01', 'Hoa'),
('DT02', 'Kinh'),
('DT03', 'Khơ Me'),
('DT04', 'Mường'),
('DT05', 'Tày'),
('DT06', 'Thái'),
('DT07', 'Nùng'),
('DT08', 'Dao'),
('DT09', 'HMông'),
('DT10', 'Gia-rai'),
('DT11', 'Ê-đê'),
('DT12', 'Ba-na'),
('DT13', 'Chăm'),
('DT14', 'Xê-đăng'),
('DT15', 'Sán dìu'),
('DT16', 'Hrê'),
('DT17', 'Cơ-ho'),
('DT18', 'Thổ'),
('DT19', 'Khơ mú'),
('DT20', 'Ta ôi');

-- --------------------------------------------------------

--
-- Table structure for table `giaykhaisinh`
--

CREATE TABLE `giaykhaisinh` (
  `MATK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `SOKS` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYCAP` date DEFAULT NULL,
  `GHICHU` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `giaykhaisinh`
--

INSERT INTO `giaykhaisinh` (`MATK`, `SOKS`, `NGAYCAP`, `GHICHU`) VALUES
('TK00000001', 'KS00000001', '2017-02-17', NULL),
('TK00000002', 'TK00000002', '2017-04-05', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `huyen`
--

CREATE TABLE `huyen` (
  `MAHUYEN` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MATINH` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENHUYEN` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `huyen`
--

INSERT INTO `huyen` (`MAHUYEN`, `MATINH`, `TENHUYEN`) VALUES
('HU01', 'TI01', 'Ninh Kiều'),
('HU02', 'TI01', 'Thới Lai'),
('HU03', 'TI02', 'Cù Lao Dung'),
('HU04', 'TI03', 'Long Hồ'),
('HU05', 'TI03', 'Bình Minh'),
('HU06', 'TI06', 'Ba Tri'),
('HU07', 'TI06', 'Bình Đại'),
('HU08', 'TI07', 'Cái Bè'),
('HU09', 'TI07', 'Chợ Gạo'),
('HU10', 'TI07', 'Châu Thành');

-- --------------------------------------------------------

--
-- Table structure for table `nhankhau`
--

CREATE TABLE `nhankhau` (
  `MANK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MAQT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MATG` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MADT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAHK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAQH` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `HTNK` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TENKHAC` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GIOTINH` smallint(6) DEFAULT NULL,
  `NGAYSINH` date DEFAULT NULL,
  `CMDN` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MGAYCAPCM` date DEFAULT NULL,
  `NOICAPCM` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhankhau`
--

INSERT INTO `nhankhau` (`MANK`, `MAQT`, `MATG`, `MADT`, `MAHK`, `MAXA`, `MAQH`, `HTNK`, `TENKHAC`, `GIOTINH`, `NGAYSINH`, `CMDN`, `MGAYCAPCM`, `NOICAPCM`) VALUES
('NK00000001', 'QT01', 'TG01', 'DT01', 'HK00000001', 'XA01', 'QH02', 'Bùi Linh Châu', NULL, 0, '1995-02-14', '321456789', '2010-03-08', 'Cần Thơ'),
('NK00000002', 'QT01', 'TG01', 'DT01', 'HK00000001', 'XA01', 'QH02', 'Trần Văn Cao', NULL, 1, '1985-04-26', '385962159', '2005-04-19', 'Cần Thơ'),
('NK00000003', 'QT01', 'TG01', 'DT01', 'HK00000001', 'XA01', 'QH01', 'Trần Văn Phước', NULL, 1, '1972-06-27', '330893478', '2015-06-06', 'Công An TP Cần Thơ'),
('NK00000004', 'QT01', 'TG01', 'DT01', 'HK00000001', 'XA01', 'QH01', 'Trần Ngọc Phượng', NULL, 1, '1985-09-05', '332080326', '2014-04-12', 'Công An TP Cần Thơ'),
('NK00000005', 'QT01', 'TG01', 'DT01', 'HK00000001', 'XA01', 'QH01', 'Bùi Thị Huệ', '', 0, '1955-03-24', '336093285', '2015-03-23', 'Công an TP Cần Thơ'),
('NK00000006', 'QT01', 'TG01', 'DT01', 'HK00000001', 'XA01', 'QH03', 'Lê Thị Tuyết', NULL, 0, '1975-07-07', '339248094', '2016-03-04', 'Công an TP Cần Thơ');

-- --------------------------------------------------------

--
-- Table structure for table `quanhechuho`
--

CREATE TABLE `quanhechuho` (
  `MAQH` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENQUANHE` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `quanhechuho`
--

INSERT INTO `quanhechuho` (`MAQH`, `TENQUANHE`) VALUES
('QH01', 'Con'),
('QH02', 'Cháu'),
('QH03', 'Dâu'),
('QH04', 'Rể'),
('QH05', 'Vợ'),
('QH06', 'Chồng');

-- --------------------------------------------------------

--
-- Table structure for table `quoctich`
--

CREATE TABLE `quoctich` (
  `MAQT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENQT` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `quoctich`
--

INSERT INTO `quoctich` (`MAQT`, `TENQT`) VALUES
('QT01', 'Việt Nam'),
('QT02', 'Nhật Bản'),
('QT03', 'Mỹ'),
('QT04', 'Anh');

-- --------------------------------------------------------

--
-- Table structure for table `sohokau`
--

CREATE TABLE `sohokau` (
  `MAHK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYCAP` date DEFAULT NULL,
  `CHUHO` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sohokau`
--

INSERT INTO `sohokau` (`MAHK`, `MAXA`, `NGAYCAP`, `CHUHO`) VALUES
('HK00000001', 'XA01', '1998-08-28', 'Trần Thiên Tường'),
('HK00000002', 'XA02', '2016-04-26', 'Diệp Huế Chi'),
('HK00000003', 'XA02', '1999-05-14', 'Nguyễn Văn Chiến'),
('HK00000004', 'XA03', '2013-08-09', 'Lê Thị Xuân'),
('HK00000005', 'XA03', '2002-03-06', 'Trần Văn Chính'),
('HK00000006', 'XA03', '1998-11-02', 'Trần Chí Trung');

-- --------------------------------------------------------

--
-- Table structure for table `tinh`
--

CREATE TABLE `tinh` (
  `MATINH` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENTINH` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tinh`
--

INSERT INTO `tinh` (`MATINH`, `TENTINH`) VALUES
('TI01', 'Cần Thơ'),
('TI02', 'Sóc Trăng'),
('TI03', 'Vĩnh Long'),
('TI04', 'An Giang'),
('TI05', 'Hậu Giang'),
('TI06', 'Bến Tre'),
('TI07', 'Tiền Giang'),
('TI08', 'Kiên Giang'),
('TI09', 'Trà Vinh');

-- --------------------------------------------------------

--
-- Table structure for table `tokhai`
--

CREATE TABLE `tokhai` (
  `MATK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MAQT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MADT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MANK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `NHA_MANK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MATG` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `NHA_MANK2` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYLAPTK` date DEFAULT NULL,
  `HTNKS` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GIOITINH` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NGAYSINH` date DEFAULT NULL,
  `NGAYSINHBC` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NOISINH` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GHICHU` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `QUANHENGDKS` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tokhai`
--

INSERT INTO `tokhai` (`MATK`, `MAQT`, `MAXA`, `MADT`, `MANK`, `NHA_MANK`, `MATG`, `NHA_MANK2`, `NGAYLAPTK`, `HTNKS`, `GIOITINH`, `NGAYSINH`, `NGAYSINHBC`, `NOISINH`, `GHICHU`, `QUANHENGDKS`) VALUES
('TK00000001', 'QT01', 'XA01', 'DT01', 'NK00000001', 'NK00000001', 'TG01', 'NK00000001', '2017-02-15', 'Trần Tường Minh', '1', '2017-02-14', 'Mười bốn tháng hai năm hai nghìn không trăm mười bảy', 'Bệnh Viện Phụ Sản Quốc Tế Phương Châu, TPCT', NULL, 'Cha'),
('TK00000002', 'QT01', 'XA01', 'DT01', 'NK00000003', 'NK00000003', 'TG01', 'NK00000006', '2017-04-05', 'Trần Ngọc Bích', 'Nữ', '2017-04-03', 'Ba tháng tư năm hai nghìn không trăm mười bảy', 'Bệnh viện Phụ sản Cần Thơ', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tongiao`
--

CREATE TABLE `tongiao` (
  `MATG` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENTG` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tongiao`
--

INSERT INTO `tongiao` (`MATG`, `TENTG`) VALUES
('TG01', 'Phật'),
('TG02', 'Thiên Chúa'),
('TG03', 'Tin Lành'),
('TG04', 'Hồi Giáo');

-- --------------------------------------------------------

--
-- Table structure for table `xa`
--

CREATE TABLE `xa` (
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAHUYEN` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENXA` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `xa`
--

INSERT INTO `xa` (`MAXA`, `MAHUYEN`, `TENXA`) VALUES
('XA01', 'HU01', 'Xuân Khánh'),
('XA02', 'HU01', 'Tân An'),
('XA03', 'HU03', 'An Thạnh 3'),
('XA04', 'HU04', 'An Bình'),
('XA05', 'HU05', 'Đông Bình'),
('XA06', 'HU05', 'Đông Thạnh'),
('XA07', 'HU08', 'An Cư'),
('XA08', 'HU08', 'An Hữu'),
('XA09', 'HU10', 'Song Thuận'),
('XA10', 'HU10', 'Tam Hiệp');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `canbo`
--
ALTER TABLE `canbo`
  ADD PRIMARY KEY (`MACB`),
  ADD UNIQUE KEY `CANBO_PK` (`MACB`),
  ADD KEY `THUOC_XA_FK` (`MAXA`),
  ADD KEY `CO_CHUC_VU_FK` (`MACV`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`MACV`),
  ADD UNIQUE KEY `CHUCVU_PK` (`MACV`);

--
-- Indexes for table `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`MADT`),
  ADD UNIQUE KEY `DANTOC_PK` (`MADT`);

--
-- Indexes for table `giaykhaisinh`
--
ALTER TABLE `giaykhaisinh`
  ADD PRIMARY KEY (`MATK`,`SOKS`),
  ADD UNIQUE KEY `GIAYKHAISINH_PK` (`MATK`,`SOKS`),
  ADD KEY `TAO_THANH_GIAY_KHAI_SINH_FK` (`MATK`);

--
-- Indexes for table `huyen`
--
ALTER TABLE `huyen`
  ADD PRIMARY KEY (`MAHUYEN`),
  ADD UNIQUE KEY `HUYEN_PK` (`MAHUYEN`),
  ADD KEY `THUOC_TINH_FK` (`MATINH`);

--
-- Indexes for table `nhankhau`
--
ALTER TABLE `nhankhau`
  ADD PRIMARY KEY (`MANK`),
  ADD UNIQUE KEY `NHANKHAU_PK` (`MANK`),
  ADD KEY `THUOC_QUAN_HE_FK` (`MAQH`),
  ADD KEY `NHAN_KHAU_THUOC_XA_FK` (`MAXA`),
  ADD KEY `CO_DAN_TOC_FK` (`MADT`),
  ADD KEY `CO_TON_GIAO_FK` (`MATG`),
  ADD KEY `CO_QUOC_TICH_FK` (`MAQT`),
  ADD KEY `NHAN_KHAU_THUOC_HO_KHAU_FK` (`MAHK`);

--
-- Indexes for table `quanhechuho`
--
ALTER TABLE `quanhechuho`
  ADD PRIMARY KEY (`MAQH`),
  ADD UNIQUE KEY `QUANHECHUHO_PK` (`MAQH`);

--
-- Indexes for table `quoctich`
--
ALTER TABLE `quoctich`
  ADD PRIMARY KEY (`MAQT`),
  ADD UNIQUE KEY `QUOCTICH_PK` (`MAQT`);

--
-- Indexes for table `sohokau`
--
ALTER TABLE `sohokau`
  ADD PRIMARY KEY (`MAHK`),
  ADD UNIQUE KEY `SOHOKAU_PK` (`MAHK`),
  ADD KEY `SO_HO_KHAU_THUOC_XA_FK` (`MAXA`);

--
-- Indexes for table `tinh`
--
ALTER TABLE `tinh`
  ADD PRIMARY KEY (`MATINH`),
  ADD UNIQUE KEY `TINH_PK` (`MATINH`);

--
-- Indexes for table `tokhai`
--
ALTER TABLE `tokhai`
  ADD PRIMARY KEY (`MATK`),
  ADD UNIQUE KEY `TOKHAI_PK` (`MATK`),
  ADD KEY `NGUOI_DI_KHAI_FK` (`NHA_MANK`),
  ADD KEY `CHA_FK` (`MANK`),
  ADD KEY `ME_FK` (`NHA_MANK2`),
  ADD KEY `NOI_DANG_KY_KHAI_SINH_FK` (`MAXA`),
  ADD KEY `NGUOI_KHAI_SINH_CO_DAN_TOC_FK` (`MADT`),
  ADD KEY `NGUOI_KHAI_SINH_CO_TON_GIAO_FK` (`MATG`),
  ADD KEY `NGUOI_KHAI_SINH_CO_QUOC_TICH_FK` (`MAQT`);

--
-- Indexes for table `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`MATG`),
  ADD UNIQUE KEY `TONGIAO_PK` (`MATG`);

--
-- Indexes for table `xa`
--
ALTER TABLE `xa`
  ADD PRIMARY KEY (`MAXA`),
  ADD UNIQUE KEY `XA_PK` (`MAXA`),
  ADD KEY `THUOC_HUYEN_FK` (`MAHUYEN`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `canbo`
--
ALTER TABLE `canbo`
  ADD CONSTRAINT `FK_CANBO_CO_CHUC_V_CHUCVU` FOREIGN KEY (`MACV`) REFERENCES `chucvu` (`MACV`),
  ADD CONSTRAINT `FK_CANBO_THUOC_XA_XA` FOREIGN KEY (`MAXA`) REFERENCES `xa` (`MAXA`);

--
-- Constraints for table `giaykhaisinh`
--
ALTER TABLE `giaykhaisinh`
  ADD CONSTRAINT `FK_GIAYKHAI_TAO_THANH_TOKHAI` FOREIGN KEY (`MATK`) REFERENCES `tokhai` (`MATK`);

--
-- Constraints for table `huyen`
--
ALTER TABLE `huyen`
  ADD CONSTRAINT `FK_HUYEN_THUOC_TIN_TINH` FOREIGN KEY (`MATINH`) REFERENCES `tinh` (`MATINH`);

--
-- Constraints for table `nhankhau`
--
ALTER TABLE `nhankhau`
  ADD CONSTRAINT `FK_NHANKHAU_CO_DAN_TO_DANTOC` FOREIGN KEY (`MADT`) REFERENCES `dantoc` (`MADT`),
  ADD CONSTRAINT `FK_NHANKHAU_CO_QUOC_T_QUOCTICH` FOREIGN KEY (`MAQT`) REFERENCES `quoctich` (`MAQT`),
  ADD CONSTRAINT `FK_NHANKHAU_CO_TON_GI_TONGIAO` FOREIGN KEY (`MATG`) REFERENCES `tongiao` (`MATG`),
  ADD CONSTRAINT `FK_NHANKHAU_NHAN_KHAU_SOHOKAU` FOREIGN KEY (`MAHK`) REFERENCES `sohokau` (`MAHK`),
  ADD CONSTRAINT `FK_NHANKHAU_NHAN_KHAU_XA` FOREIGN KEY (`MAXA`) REFERENCES `xa` (`MAXA`),
  ADD CONSTRAINT `FK_NHANKHAU_THUOC_QUA_QUANHECH` FOREIGN KEY (`MAQH`) REFERENCES `quanhechuho` (`MAQH`);

--
-- Constraints for table `sohokau`
--
ALTER TABLE `sohokau`
  ADD CONSTRAINT `FK_SOHOKAU_SO_HO_KHA_XA` FOREIGN KEY (`MAXA`) REFERENCES `xa` (`MAXA`);

--
-- Constraints for table `tokhai`
--
ALTER TABLE `tokhai`
  ADD CONSTRAINT `FK_TOKHAI_CHA_NHANKHAU` FOREIGN KEY (`MANK`) REFERENCES `nhankhau` (`MANK`),
  ADD CONSTRAINT `FK_TOKHAI_ME_NHANKHAU` FOREIGN KEY (`NHA_MANK2`) REFERENCES `nhankhau` (`MANK`),
  ADD CONSTRAINT `FK_TOKHAI_NGUOI_DI__NHANKHAU` FOREIGN KEY (`NHA_MANK`) REFERENCES `nhankhau` (`MANK`),
  ADD CONSTRAINT `FK_TOKHAI_NGUOI_KHA_DANTOC` FOREIGN KEY (`MADT`) REFERENCES `dantoc` (`MADT`),
  ADD CONSTRAINT `FK_TOKHAI_NGUOI_KHA_QUOCTICH` FOREIGN KEY (`MAQT`) REFERENCES `quoctich` (`MAQT`),
  ADD CONSTRAINT `FK_TOKHAI_NGUOI_KHA_TONGIAO` FOREIGN KEY (`MATG`) REFERENCES `tongiao` (`MATG`),
  ADD CONSTRAINT `FK_TOKHAI_NOI_DANG__XA` FOREIGN KEY (`MAXA`) REFERENCES `xa` (`MAXA`);

--
-- Constraints for table `xa`
--
ALTER TABLE `xa`
  ADD CONSTRAINT `FK_XA_THUOC_HUY_HUYEN` FOREIGN KEY (`MAHUYEN`) REFERENCES `huyen` (`MAHUYEN`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
