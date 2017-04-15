/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 11                       */
/* Created on:     15/04/2017 10:43:55 AM                       */
/*==============================================================*/


drop DATABASE if EXISTS quanlykhaisinh;
create DATABASE quanlykhaisinh;
USE quanlykhaisinh;

create table CANBO 
(
   MACB                 char(4)                        not null,
   MACV                 char(4)                        not null,
   MAXA                 char(4)                        not null,
   HOTENCB              varchar(200)                   null,
   NGAYSINH             date                           null,
   SDT                  varchar(20)                    null,
   EMAIL                varchar(100)                   null,
   constraint PK_CANBO primary key (MACB)
);

/*==============================================================*/
/* Index: CANBO_PK                                              */
/*==============================================================*/
create unique index CANBO_PK on CANBO (
MACB ASC
);

/*==============================================================*/
/* Index: CO_CHUC_VU_FK                                         */
/*==============================================================*/
create index CO_CHUC_VU_FK on CANBO (
MACV ASC
);

/*==============================================================*/
/* Index: CAN_BO_THUOC_XA_FK                                    */
/*==============================================================*/
create index CAN_BO_THUOC_XA_FK on CANBO (
MAXA ASC
);

/*==============================================================*/
/* Table: CHUCVU                                                */
/*==============================================================*/
create table CHUCVU 
(
   MACV                 char(4)                        not null,
   TENCV                varchar(200)                   null,
   constraint PK_CHUCVU primary key (MACV)
);

/*==============================================================*/
/* Index: CHUCVU_PK                                             */
/*==============================================================*/
create unique index CHUCVU_PK on CHUCVU (
MACV ASC
);

/*==============================================================*/
/* Table: DANTOC                                                */
/*==============================================================*/
create table DANTOC 
(
   MADT                 char(4)                        not null,
   TENDT                varchar(200)                   null,
   constraint PK_DANTOC primary key (MADT)
);

/*==============================================================*/
/* Index: DANTOC_PK                                             */
/*==============================================================*/
create unique index DANTOC_PK on DANTOC (
MADT ASC
);

/*==============================================================*/
/* Table: GIAYKHAISINH                                          */
/*==============================================================*/
create table GIAYKHAISINH 
(
   SOKS                 char(10)                       not null,
   MATK                 char(10)                       not null,
   NGAYCAP              date                           null,
   GHICHU               varchar(500)                   null,
   constraint PK_GIAYKHAISINH primary key (SOKS)
);

/*==============================================================*/
/* Index: GIAYKHAISINH_PK                                       */
/*==============================================================*/
create unique index GIAYKHAISINH_PK on GIAYKHAISINH (
SOKS ASC
);

/*==============================================================*/
/* Index: TAO_THANH_GIAY_KHAI_SINH_FK                           */
/*==============================================================*/
create index TAO_THANH_GIAY_KHAI_SINH_FK on GIAYKHAISINH (
MATK ASC
);

/*==============================================================*/
/* Table: HUYEN                                                 */
/*==============================================================*/
create table HUYEN 
(
   MAHUYEN              char(4)                        not null,
   MATINH               char(4)                        not null,
   TENHUYEN             varchar(200)                   null,
   constraint PK_HUYEN primary key (MAHUYEN)
);

/*==============================================================*/
/* Index: HUYEN_PK                                              */
/*==============================================================*/
create unique index HUYEN_PK on HUYEN (
MAHUYEN ASC
);

/*==============================================================*/
/* Index: THUOC_TINH_FK                                         */
/*==============================================================*/
create index THUOC_TINH_FK on HUYEN (
MATINH ASC
);

/*==============================================================*/
/* Table: NHANKHAU                                              */
/*==============================================================*/
create table NHANKHAU 
(
   MANK                 char(10)                       not null,
   MADT                 char(4)                        not null,
   MAQT                 char(4)                        not null,
   MATG                 char(4)                        not null,
   MAQH                 char(4)                        not null,
   MAXA                 char(4)                        not null,
   SOHK                 char(10)                       not null,
   HOTENNK              varchar(200)                   null,
   GIOITINH             varchar(10)                    null,
   NGAYSINH             date                           null,
   NGAYSINHBC           varchar(200)                   null,
   CMND                 varchar(12)                    not null,
   NGAYCAPCM            date                           null,
   NOICAPCM             varchar(200)                   null,
   constraint PK_NHANKHAU primary key (MANK)
);

/*==============================================================*/
/* Index: NHANKHAU_PK                                           */
/*==============================================================*/
create unique index NHANKHAU_PK on NHANKHAU (
MANK ASC
);

/*==============================================================*/
/* Index: CO_QUOC_TICH_FK                                       */
/*==============================================================*/
create index CO_QUOC_TICH_FK on NHANKHAU (
MAQT ASC
);

/*==============================================================*/
/* Index: CO_TON_GIAO_FK                                        */
/*==============================================================*/
create index CO_TON_GIAO_FK on NHANKHAU (
MATG ASC
);

/*==============================================================*/
/* Index: CO_DAN_TOC_FK                                         */
/*==============================================================*/
create index CO_DAN_TOC_FK on NHANKHAU (
MADT ASC
);

/*==============================================================*/
/* Index: CO_QUAN_HE_CHU_HO_FK                                  */
/*==============================================================*/
create index CO_QUAN_HE_CHU_HO_FK on NHANKHAU (
MAQH ASC
);

/*==============================================================*/
/* Index: NHAN_KHAU_O_XA_FK                                     */
/*==============================================================*/
create index NHAN_KHAU_O_XA_FK on NHANKHAU (
MAXA ASC
);

/*==============================================================*/
/* Index: NHAN_KHAU_THUOC_HO_KHAU_FK                            */
/*==============================================================*/
create index NHAN_KHAU_THUOC_HO_KHAU_FK on NHANKHAU (
SOHK ASC
);

/*==============================================================*/
/* Table: QUANHECHUHO                                           */
/*==============================================================*/
create table QUANHECHUHO 
(
   MAQH                 char(4)                        not null,
   TENQH                varchar(200)                   null,
   constraint PK_QUANHECHUHO primary key (MAQH)
);

/*==============================================================*/
/* Index: QUANHECHUHO_PK                                        */
/*==============================================================*/
create unique index QUANHECHUHO_PK on QUANHECHUHO (
MAQH ASC
);

/*==============================================================*/
/* Table: QUOCTICH                                              */
/*==============================================================*/
create table QUOCTICH 
(
   MAQT                 char(4)                        not null,
   TENQT                varchar(200)                   null,
   constraint PK_QUOCTICH primary key (MAQT)
);

/*==============================================================*/
/* Index: QUOCTICH_PK                                           */
/*==============================================================*/
create unique index QUOCTICH_PK on QUOCTICH (
MAQT ASC
);

/*==============================================================*/
/* Table: SOHOKHAU                                              */
/*==============================================================*/
create table SOHOKHAU 
(
   SOHK                 char(10)                       not null,
   MAXA                 char(4)                        not null,
   NGAYCAP              date                           null,
   CHUHO                varchar(200)                   null,
   constraint PK_SOHOKHAU primary key (SOHK)
);

/*==============================================================*/
/* Index: SOHOKHAU_PK                                           */
/*==============================================================*/
create unique index SOHOKHAU_PK on SOHOKHAU (
SOHK ASC
);

/*==============================================================*/
/* Index: HO_KHAU_THUOC_XA_FK                                   */
/*==============================================================*/
create index HO_KHAU_THUOC_XA_FK on SOHOKHAU (
MAXA ASC
);

/*==============================================================*/
/* Table: TAIKHOANCB                                            */
/*==============================================================*/
create table TAIKHOANCB 
(
   ID                   char(4)                        not null,
   MACB                 char(4)                        not null,
   USERNAME             varchar(20)                    null,
   PASS                 varchar(20)                    null,
   PASSCONFIRM          varchar(20)                    null,
   constraint PK_TAIKHOANCB primary key (ID)
);

/*==============================================================*/
/* Index: TAIKHOANCB_PK                                         */
/*==============================================================*/
create unique index TAIKHOANCB_PK on TAIKHOANCB (
ID ASC
);

/*==============================================================*/
/* Index: CO_FK                                                 */
/*==============================================================*/
create index CO_FK on TAIKHOANCB (
MACB ASC
);

/*==============================================================*/
/* Table: TINH                                                  */
/*==============================================================*/
create table TINH 
(
   MATINH               char(4)                        not null,
   TENTINH              varchar(200)                   null,
   constraint PK_TINH primary key (MATINH)
);

/*==============================================================*/
/* Index: TINH_PK                                               */
/*==============================================================*/
create unique index TINH_PK on TINH (
MATINH ASC
);

/*==============================================================*/
/* Table: TINHTRANGTK                                           */
/*==============================================================*/
create table TINHTRANGTK 
(
   MATT                 char(4)                        not null,
   TRANGTHAI            varchar(200)                   null,
   constraint PK_TINHTRANGTK primary key (MATT)
);

/*==============================================================*/
/* Index: TINHTRANGTK_PK                                        */
/*==============================================================*/
create unique index TINHTRANGTK_PK on TINHTRANGTK (
MATT ASC
);

/*==============================================================*/
/* Table: TOKHAI                                                */
/*==============================================================*/
create table TOKHAI 
(
   MATK                 char(10)                       not null,
   MANK                 char(10)                       not null,
   NHA_MANK             char(10)                       not null,
   MAQT                 char(4)                        not null,
   MAXA                 char(4)                        not null,
   MATG                 char(4)                        not null,
   MATT                 char(4)                        not null,
   MADT                 char(4)                        not null,
   NHA_MANK2            char(10)                       not null,
   XA_MAXA              char(4)                        not null,
   NGAYLAP              date                           null,
   HTNKS                varchar(200)                   null,
   GIOITINH             varchar(10)                    null,
   NGAYSINH             date                           null,
   NGAYSINHBC           varchar(200)                   null,
   NOISINH              varchar(300)                   null,
   GHICHU               varchar(500)                   null,
   QUANHEVOINGDK        varchar(100)                   null,
   constraint PK_TOKHAI primary key (MATK)
);

/*==============================================================*/
/* Index: TOKHAI_PK                                             */
/*==============================================================*/
create unique index TOKHAI_PK on TOKHAI (
MATK ASC
);

/*==============================================================*/
/* Index: CO_ME_FK                                              */
/*==============================================================*/
create index CO_ME_FK on TOKHAI (
NHA_MANK2 ASC
);

/*==============================================================*/
/* Index: CO_CHA_FK                                             */
/*==============================================================*/
create index CO_CHA_FK on TOKHAI (
NHA_MANK ASC
);

/*==============================================================*/
/* Index: NGUOI_DI_DK_FK                                        */
/*==============================================================*/
create index NGUOI_DI_DK_FK on TOKHAI (
MANK ASC
);

/*==============================================================*/
/* Index: THUOC_DAN_TOC_FK                                      */
/*==============================================================*/
create index THUOC_DAN_TOC_FK on TOKHAI (
MADT ASC
);

/*==============================================================*/
/* Index: THUOC_TON_GIAO_FK                                     */
/*==============================================================*/
create index THUOC_TON_GIAO_FK on TOKHAI (
MATG ASC
);

/*==============================================================*/
/* Index: THUOC_QUOC_TICH_FK                                    */
/*==============================================================*/
create index THUOC_QUOC_TICH_FK on TOKHAI (
MAQT ASC
);

/*==============================================================*/
/* Index: CO_TINH_TRANG_FK                                      */
/*==============================================================*/
create index CO_TINH_TRANG_FK on TOKHAI (
MATT ASC
);

/*==============================================================*/
/* Index: NOI_DK_KS_FK                                          */
/*==============================================================*/
create index NOI_DK_KS_FK on TOKHAI (
MAXA ASC
);

/*==============================================================*/
/* Index: DC_THUONG_TRU_NG_KS_FK                                */
/*==============================================================*/
create index DC_THUONG_TRU_NG_KS_FK on TOKHAI (
XA_MAXA ASC
);

/*==============================================================*/
/* Table: TONGIAO                                               */
/*==============================================================*/
create table TONGIAO 
(
   MATG                 char(4)                        not null,
   TENTG                varchar(200)                   null,
   constraint PK_TONGIAO primary key (MATG)
);

/*==============================================================*/
/* Index: TONGIAO_PK                                            */
/*==============================================================*/
create unique index TONGIAO_PK on TONGIAO (
MATG ASC
);

/*==============================================================*/
/* Table: XA                                                    */
/*==============================================================*/
create table XA 
(
   MAXA                 char(4)                        not null,
   MAHUYEN              char(4)                        not null,
   TENXA                varchar(200)                   null,
   constraint PK_XA primary key (MAXA)
);

/*==============================================================*/
/* Index: XA_PK                                                 */
/*==============================================================*/
create unique index XA_PK on XA (
MAXA ASC
);

/*==============================================================*/
/* Index: THUOC_HUYEN_FK                                        */
/*==============================================================*/
create index THUOC_HUYEN_FK on XA (
MAHUYEN ASC
);

alter table CANBO
   add constraint FK_CANBO_CAN_BO_TH_XA foreign key (MAXA)
      references XA (MAXA)
      on update restrict
      on delete restrict;

alter table CANBO
   add constraint FK_CANBO_CO_CHUC_V_CHUCVU foreign key (MACV)
      references CHUCVU (MACV)
      on update restrict
      on delete restrict;

alter table GIAYKHAISINH
   add constraint FK_GIAYKHAI_TAO_THANH_TOKHAI foreign key (MATK)
      references TOKHAI (MATK)
      on update restrict
      on delete restrict;

alter table HUYEN
   add constraint FK_HUYEN_THUOC_TIN_TINH foreign key (MATINH)
      references TINH (MATINH)
      on update restrict
      on delete restrict;

alter table NHANKHAU
   add constraint FK_NHANKHAU_CO_DAN_TO_DANTOC foreign key (MADT)
      references DANTOC (MADT)
      on update restrict
      on delete restrict;

alter table NHANKHAU
   add constraint FK_NHANKHAU_CO_QUAN_H_QUANHECH foreign key (MAQH)
      references QUANHECHUHO (MAQH)
      on update restrict
      on delete restrict;

alter table NHANKHAU
   add constraint FK_NHANKHAU_CO_QUOC_T_QUOCTICH foreign key (MAQT)
      references QUOCTICH (MAQT)
      on update restrict
      on delete restrict;

alter table NHANKHAU
   add constraint FK_NHANKHAU_CO_TON_GI_TONGIAO foreign key (MATG)
      references TONGIAO (MATG)
      on update restrict
      on delete restrict;

alter table NHANKHAU
   add constraint FK_NHANKHAU_NHAN_KHAU_XA foreign key (MAXA)
      references XA (MAXA)
      on update restrict
      on delete restrict;

alter table NHANKHAU
   add constraint FK_NHANKHAU_NHAN_KHAU_SOHOKHAU foreign key (SOHK)
      references SOHOKHAU (SOHK)
      on update restrict
      on delete restrict;

alter table SOHOKHAU
   add constraint FK_SOHOKHAU_HO_KHAU_T_XA foreign key (MAXA)
      references XA (MAXA)
      on update restrict
      on delete restrict;

alter table TAIKHOANCB
   add constraint FK_TAIKHOAN_CO_CANBO foreign key (MACB)
      references CANBO (MACB)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_CO_CHA_NHANKHAU foreign key (NHA_MANK)
      references NHANKHAU (MANK)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_CO_ME_NHANKHAU foreign key (NHA_MANK2)
      references NHANKHAU (MANK)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_CO_TINH_T_TINHTRAN foreign key (MATT)
      references TINHTRANGTK (MATT)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_DC_THUONG_XA foreign key (XA_MAXA)
      references XA (MAXA)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_NGUOI_DI__NHANKHAU foreign key (MANK)
      references NHANKHAU (MANK)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_NOI_DK_KS_XA foreign key (MAXA)
      references XA (MAXA)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_THUOC_DAN_DANTOC foreign key (MADT)
      references DANTOC (MADT)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_THUOC_QUO_QUOCTICH foreign key (MAQT)
      references QUOCTICH (MAQT)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_THUOC_TON_TONGIAO foreign key (MATG)
      references TONGIAO (MATG)
      on update restrict
      on delete restrict;

alter table XA
   add constraint FK_XA_THUOC_HUY_HUYEN foreign key (MAHUYEN)
      references HUYEN (MAHUYEN)
      on update restrict
      on delete restrict;

