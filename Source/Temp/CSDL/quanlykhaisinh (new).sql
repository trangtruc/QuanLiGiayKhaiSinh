-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2017 at 03:33 PM
-- Server version: 5.6.11
-- PHP Version: 5.5.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `quanlykhaisinh`
--
CREATE DATABASE IF NOT EXISTS `quanlykhaisinh` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `quanlykhaisinh`;

-- --------------------------------------------------------

--
-- Table structure for table `canbo`
--

CREATE TABLE IF NOT EXISTS `canbo` (
  `MACB` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MACV` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `HOTENCB` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NGAYSINH` date DEFAULT NULL,
  `SDT` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EMAIL` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MACB`),
  UNIQUE KEY `CANBO_PK` (`MACB`),
  KEY `CO_CHUC_VU_FK` (`MACV`),
  KEY `CAN_BO_THUOC_XA_FK` (`MAXA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `canbo`
--

INSERT INTO `canbo` (`MACB`, `MACV`, `MAXA`, `HOTENCB`, `NGAYSINH`, `SDT`, `EMAIL`) VALUES
('CB01', 'CV01', 'XA01', 'Nguyễn Đức An', '1980-04-12', '0907382129', 'ndan@gmail.com'),
('CB02', 'CV02', 'XA01', 'Lê Anh Xuân', '1990-03-23', '01232904783', 'laxuan@gmail.com'),
('CB03', 'CV01', 'XA02', 'Trần Trí Trực', '1989-12-12', '0986349084', 'tttruc@gmail.com'),
('CB04', 'CV02', 'XA02', 'Lâm Quang Khải', '1991-06-19', '0987340285', 'lqkhai@gmail.com'),
('CB05', 'CV01', 'XA03', 'Lâm Nhật Trường', '1985-07-28', '01687392647', 'lntruong@gmail.com'),
('CB06', 'CV02', 'XA03', 'Lê Văn Tuấn', '1988-09-15', '0985498230', 'lvtuan@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE IF NOT EXISTS `chucvu` (
  `MACV` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENCV` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MACV`),
  UNIQUE KEY `CHUCVU_PK` (`MACV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`MACV`, `TENCV`) VALUES
('CV01', 'Chủ tịch UBND xã'),
('CV02', 'Cán bộ Tư pháp - Hộ tịch'),
('CV03', 'Cán bộ địa chính');

-- --------------------------------------------------------

--
-- Table structure for table `dantoc`
--

CREATE TABLE IF NOT EXISTS `dantoc` (
  `MADT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENDT` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MADT`),
  UNIQUE KEY `DANTOC_PK` (`MADT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `dantoc`
--

INSERT INTO `dantoc` (`MADT`, `TENDT`) VALUES
('DT01', 'Kinh'),
('DT02', 'Chức'),
('DT03', 'Mường'),
('DT04', 'Thổ'),
('DT05', 'Bố y'),
('DT06', 'Lào'),
('DT07', 'Nùng'),
('DT08', 'Khơ me');

-- --------------------------------------------------------

--
-- Table structure for table `giaykhaisinh`
--

CREATE TABLE IF NOT EXISTS `giaykhaisinh` (
  `SOKS` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MATK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYCAP` date DEFAULT NULL,
  `GHICHU` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`SOKS`),
  UNIQUE KEY `GIAYKHAISINH_PK` (`SOKS`),
  KEY `TAO_THANH_GIAY_KHAI_SINH_FK` (`MATK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `giaykhaisinh`
--

INSERT INTO `giaykhaisinh` (`SOKS`, `MATK`, `NGAYCAP`, `GHICHU`) VALUES
('KS00000001', 'TK00000001', '2017-02-15', 'Không Có');

-- --------------------------------------------------------

--
-- Table structure for table `huyen`
--

CREATE TABLE IF NOT EXISTS `huyen` (
  `MAHUYEN` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MATINH` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENHUYEN` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MAHUYEN`),
  UNIQUE KEY `HUYEN_PK` (`MAHUYEN`),
  KEY `THUOC_TINH_FK` (`MATINH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `huyen`
--

INSERT INTO `huyen` (`MAHUYEN`, `MATINH`, `TENHUYEN`) VALUES
('HU01', 'TI01', 'Ninh Kiều'),
('HU02', 'TI01', 'Cái Răng'),
('HU03', 'TI02', 'Long Hồ'),
('HU04', 'TI02', 'Bình Minh'),
('HU06', 'TI03', 'Kế Sách'),
('HU07', 'TI03', 'Long Phú');

-- --------------------------------------------------------

--
-- Table structure for table `nhankhau`
--

CREATE TABLE IF NOT EXISTS `nhankhau` (
  `MANK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MADT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAQT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MATG` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAQH` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `SOHK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `HOTENNK` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GIOITINH` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NGAYSINH` date DEFAULT NULL,
  `NGAYSINHBC` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CMND` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYCAPCM` date DEFAULT NULL,
  `NOICAPCM` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MANK`),
  UNIQUE KEY `NHANKHAU_PK` (`MANK`),
  KEY `CO_QUOC_TICH_FK` (`MAQT`),
  KEY `CO_TON_GIAO_FK` (`MATG`),
  KEY `CO_DAN_TOC_FK` (`MADT`),
  KEY `CO_QUAN_HE_CHU_HO_FK` (`MAQH`),
  KEY `NHAN_KHAU_O_XA_FK` (`MAXA`),
  KEY `NHAN_KHAU_THUOC_HO_KHAU_FK` (`SOHK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhankhau`
--

INSERT INTO `nhankhau` (`MANK`, `MADT`, `MAQT`, `MATG`, `MAQH`, `MAXA`, `SOHK`, `HOTENNK`, `GIOITINH`, `NGAYSINH`, `NGAYSINHBC`, `CMND`, `NGAYCAPCM`, `NOICAPCM`) VALUES
('NK00000001', 'DT01', 'QT01', 'TG01', 'QH00', 'XA01', 'HK00000001', 'Nguyễn Tấn Lộc', 'Nam', '1950-01-01', 'Một tháng một năm một nghìn chín trăm năm mươi', '330873240', '2011-08-10', 'Công an TP Cần Thơ'),
('NK00000002', 'DT01', 'QT01', 'TG01', 'QH01', 'XA01', 'HK00000001', 'Lê Thu Thủy', 'Nữ', '1955-10-10', 'Mười tháng mười năm một nghìn chín trăm năm mươi lăm', '331894356', '2012-12-23', 'Công an TP Cần Thơ'),
('NK00000003', 'DT01', 'QT01', 'TG01', 'QH03', 'XA01', 'HK00000001', 'Nguyễn Văn Tường', 'Nam', '1975-08-09', 'Chín tháng tám năm một nghìn chín trăm bảy lăm', '345671234', '2000-03-21', 'Công An TP Cần Thơ'),
('NK00000004', 'DT01', 'QT01', 'TG01', 'QH04', 'XA01', 'HK00000001', 'Lê Kiều Nhi', 'Nữ', '1978-03-21', 'Hai mươi mốt tháng ba năm một nghìn chín trăm bảy tám', '367234678', '2002-02-12', 'Công An TP Cần Thơ');

-- --------------------------------------------------------

--
-- Table structure for table `quanhechuho`
--

CREATE TABLE IF NOT EXISTS `quanhechuho` (
  `MAQH` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENQH` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MAQH`),
  UNIQUE KEY `QUANHECHUHO_PK` (`MAQH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `quanhechuho`
--

INSERT INTO `quanhechuho` (`MAQH`, `TENQH`) VALUES
('QH00', 'Là chủ hộ'),
('QH01', 'Vợ'),
('QH02', 'Chồng'),
('QH03', 'Con'),
('QH04', 'Dâu'),
('QH05', 'Rể'),
('QH06', 'Cháu');

-- --------------------------------------------------------

--
-- Table structure for table `quoctich`
--

CREATE TABLE IF NOT EXISTS `quoctich` (
  `MAQT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENQT` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MAQT`),
  UNIQUE KEY `QUOCTICH_PK` (`MAQT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `quoctich`
--

INSERT INTO `quoctich` (`MAQT`, `TENQT`) VALUES
('QT01', 'Việt Nam'),
('QT02', 'Lào'),
('QT03', 'Campuchia'),
('QT04', 'Thái Lan'),
('QT05', 'Mỹ'),
('QT06', 'Pháp');

-- --------------------------------------------------------

--
-- Table structure for table `sohokhau`
--

CREATE TABLE IF NOT EXISTS `sohokhau` (
  `SOHK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYCAP` date DEFAULT NULL,
  `CHUHO` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`SOHK`),
  UNIQUE KEY `SOHOKHAU_PK` (`SOHK`),
  KEY `HO_KHAU_THUOC_XA_FK` (`MAXA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sohokhau`
--

INSERT INTO `sohokhau` (`SOHK`, `MAXA`, `NGAYCAP`, `CHUHO`) VALUES
('HK00000001', 'XA01', '2000-09-10', 'Nguyễn Tấn Lộc'),
('HK00000002', 'XA01', '2002-10-24', 'Lê Văn Đức'),
('HK00000003', 'XA02', '2000-04-03', 'Lê Mỹ Phượng'),
('HK00000004', 'XA02', '2005-12-07', 'Phạm Thanh Danh'),
('HK00000005', 'XA03', '2009-12-29', 'Mai Văn Tâm'),
('HK00000006', 'XA03', '2000-08-08', 'Lưu Tuấn Tú');

-- --------------------------------------------------------

--
-- Table structure for table `tinh`
--

CREATE TABLE IF NOT EXISTS `tinh` (
  `MATINH` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENTINH` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MATINH`),
  UNIQUE KEY `TINH_PK` (`MATINH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tinh`
--

INSERT INTO `tinh` (`MATINH`, `TENTINH`) VALUES
('TI01', 'Cần Thơ'),
('TI02', 'Vĩnh Long'),
('TI03', 'Sóc Trăng'),
('TI04', 'An Giang'),
('TI05', 'Bạc Liêu'),
('TI06', 'Hậu Giang');

-- --------------------------------------------------------

--
-- Table structure for table `tinhtrangtk`
--

CREATE TABLE IF NOT EXISTS `tinhtrangtk` (
  `MATT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TRANGTHAI` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MATT`),
  UNIQUE KEY `TINHTRANGTK_PK` (`MATT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tinhtrangtk`
--

INSERT INTO `tinhtrangtk` (`MATT`, `TRANGTHAI`) VALUES
('TT01', 'Chưa duyệt'),
('TT02', 'Đã duyệt');

-- --------------------------------------------------------

--
-- Table structure for table `tokhai`
--

CREATE TABLE IF NOT EXISTS `tokhai` (
  `MATK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MANK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `NHA_MANK` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `MAQT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MATG` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MATT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MADT` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `NHA_MANK2` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `XA_MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYLAP` date DEFAULT NULL,
  `HTNKS` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GIOITINH` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NGAYSINH` date DEFAULT NULL,
  `NGAYSINHBC` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NOISINH` varchar(300) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GHICHU` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `QUANHEVOINGDK` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MATK`),
  UNIQUE KEY `TOKHAI_PK` (`MATK`),
  KEY `CO_ME_FK` (`NHA_MANK2`),
  KEY `CO_CHA_FK` (`NHA_MANK`),
  KEY `NGUOI_DI_DK_FK` (`MANK`),
  KEY `THUOC_DAN_TOC_FK` (`MADT`),
  KEY `THUOC_TON_GIAO_FK` (`MATG`),
  KEY `THUOC_QUOC_TICH_FK` (`MAQT`),
  KEY `CO_TINH_TRANG_FK` (`MATT`),
  KEY `NOI_DK_KS_FK` (`MAXA`),
  KEY `DC_THUONG_TRU_NG_KS_FK` (`XA_MAXA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tokhai`
--

INSERT INTO `tokhai` (`MATK`, `MANK`, `NHA_MANK`, `MAQT`, `MAXA`, `MATG`, `MATT`, `MADT`, `NHA_MANK2`, `XA_MAXA`, `NGAYLAP`, `HTNKS`, `GIOITINH`, `NGAYSINH`, `NGAYSINHBC`, `NOISINH`, `GHICHU`, `QUANHEVOINGDK`) VALUES
('TK00000001', 'NK00000001', 'NK00000003', 'QT01', 'XA01', 'TG01', 'TT01', 'DT01', 'NK00000004', 'XA01', '2017-02-14', 'Nguyễn Minh Long', 'Nam', '2017-02-10', 'Mười tháng hai năm hai nghìn không trăm mười bảy', 'Bệnh viện quốc tế Phương Châu, TPCT', 'Không có', 'Cha');

-- --------------------------------------------------------

--
-- Table structure for table `tongiao`
--

CREATE TABLE IF NOT EXISTS `tongiao` (
  `MATG` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENTG` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MATG`),
  UNIQUE KEY `TONGIAO_PK` (`MATG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tongiao`
--

INSERT INTO `tongiao` (`MATG`, `TENTG`) VALUES
('TG01', 'Phật Giáo'),
('TG02', 'Hồi giáo'),
('TG03', 'Kito giáo'),
('TG04', 'Ấn Độ giáo'),
('TG05', 'Nho giáo'),
('TG06', 'Do Thái giáo');

-- --------------------------------------------------------

--
-- Table structure for table `xa`
--

CREATE TABLE IF NOT EXISTS `xa` (
  `MAXA` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `MAHUYEN` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `TENXA` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MAXA`),
  UNIQUE KEY `XA_PK` (`MAXA`),
  KEY `THUOC_HUYEN_FK` (`MAHUYEN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `xa`
--

INSERT INTO `xa` (`MAXA`, `MAHUYEN`, `TENXA`) VALUES
('XA01', 'HU01', 'Tân An'),
('XA02', 'HU01', 'Xuân Khánh'),
('XA03', 'HU02', 'Hưng Phú'),
('XA04', 'HU02', 'Hưng Thạnh'),
('XA05', 'HU03', 'An Bình'),
('XA06', 'HU03', 'Hòa Ninh'),
('XA07', 'HU04', 'Cái Vồn'),
('XA08', 'HU04', 'Đông Thạnh');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `canbo`
--
ALTER TABLE `canbo`
  ADD CONSTRAINT `FK_CANBO_CO_CHUC_V_CHUCVU` FOREIGN KEY (`MACV`) REFERENCES `chucvu` (`MACV`),
  ADD CONSTRAINT `FK_CANBO_CAN_BO_TH_XA` FOREIGN KEY (`MAXA`) REFERENCES `xa` (`MAXA`);

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
  ADD CONSTRAINT `FK_NHANKHAU_NHAN_KHAU_SOHOKHAU` FOREIGN KEY (`SOHK`) REFERENCES `sohokhau` (`SOHK`),
  ADD CONSTRAINT `FK_NHANKHAU_CO_DAN_TO_DANTOC` FOREIGN KEY (`MADT`) REFERENCES `dantoc` (`MADT`),
  ADD CONSTRAINT `FK_NHANKHAU_CO_QUAN_H_QUANHECH` FOREIGN KEY (`MAQH`) REFERENCES `quanhechuho` (`MAQH`),
  ADD CONSTRAINT `FK_NHANKHAU_CO_QUOC_T_QUOCTICH` FOREIGN KEY (`MAQT`) REFERENCES `quoctich` (`MAQT`),
  ADD CONSTRAINT `FK_NHANKHAU_CO_TON_GI_TONGIAO` FOREIGN KEY (`MATG`) REFERENCES `tongiao` (`MATG`),
  ADD CONSTRAINT `FK_NHANKHAU_NHAN_KHAU_XA` FOREIGN KEY (`MAXA`) REFERENCES `xa` (`MAXA`);

--
-- Constraints for table `sohokhau`
--
ALTER TABLE `sohokhau`
  ADD CONSTRAINT `FK_SOHOKHAU_HO_KHAU_T_XA` FOREIGN KEY (`MAXA`) REFERENCES `xa` (`MAXA`);

--
-- Constraints for table `tokhai`
--
ALTER TABLE `tokhai`
  ADD CONSTRAINT `FK_TOKHAI_THUOC_TON_TONGIAO` FOREIGN KEY (`MATG`) REFERENCES `tongiao` (`MATG`),
  ADD CONSTRAINT `FK_TOKHAI_CO_CHA_NHANKHAU` FOREIGN KEY (`NHA_MANK`) REFERENCES `nhankhau` (`MANK`),
  ADD CONSTRAINT `FK_TOKHAI_CO_ME_NHANKHAU` FOREIGN KEY (`NHA_MANK2`) REFERENCES `nhankhau` (`MANK`),
  ADD CONSTRAINT `FK_TOKHAI_CO_TINH_T_TINHTRAN` FOREIGN KEY (`MATT`) REFERENCES `tinhtrangtk` (`MATT`),
  ADD CONSTRAINT `FK_TOKHAI_DC_THUONG_XA` FOREIGN KEY (`XA_MAXA`) REFERENCES `xa` (`MAXA`),
  ADD CONSTRAINT `FK_TOKHAI_NGUOI_DI__NHANKHAU` FOREIGN KEY (`MANK`) REFERENCES `nhankhau` (`MANK`),
  ADD CONSTRAINT `FK_TOKHAI_NOI_DK_KS_XA` FOREIGN KEY (`MAXA`) REFERENCES `xa` (`MAXA`),
  ADD CONSTRAINT `FK_TOKHAI_THUOC_DAN_DANTOC` FOREIGN KEY (`MADT`) REFERENCES `dantoc` (`MADT`),
  ADD CONSTRAINT `FK_TOKHAI_THUOC_QUO_QUOCTICH` FOREIGN KEY (`MAQT`) REFERENCES `quoctich` (`MAQT`);

--
-- Constraints for table `xa`
--
ALTER TABLE `xa`
  ADD CONSTRAINT `FK_XA_THUOC_HUY_HUYEN` FOREIGN KEY (`MAHUYEN`) REFERENCES `huyen` (`MAHUYEN`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
