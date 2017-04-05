/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 11                       */
/* Created on:     03/04/2017 5:25:22 PM                        */
/*==============================================================*/

create database quanlykhaisinh;
use quanlykhaisinh;

/*==============================================================*/
/* Table: CANBO                                                 */
/*==============================================================*/
create table CANBO 
(
   MACB                 char(4)                        not null,
   MAXA                 integer                        not null,
   MACV                 integer                        not null,
   HOTENCB              varchar(150)                   null,
   GIOITINH             smallint                       null,
   NGAYSINH             date                           null,
   SDT                  numeric                        null,
   EMAIL                varchar(150)                   null,
   constraint PK_CANBO primary key (MACB)
);

/*==============================================================*/
/* Index: CANBO_PK                                              */
/*==============================================================*/
create unique index CANBO_PK on CANBO (
MACB ASC
);

/*==============================================================*/
/* Index: THUOC_XA_FK                                           */
/*==============================================================*/
create index THUOC_XA_FK on CANBO (
MAXA ASC
);

/*==============================================================*/
/* Index: CO_CHUC_VU_FK                                         */
/*==============================================================*/
create index CO_CHUC_VU_FK on CANBO (
MACV ASC
);

/*==============================================================*/
/* Table: CHUCVU                                                */
/*==============================================================*/
create table CHUCVU 
(
   MACV                 integer                        not null,
   TENCV                varchar(150)                   null,
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
   MADT                 integer                        not null,
   TENDT                varchar(150)                   null,
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
   MATK                 integer                        not null,
   SOKS                 char(4)                        not null,
   NGAYCAP              date                           null,
   GHICHU               varchar(200)                   null,
   constraint PK_GIAYKHAISINH primary key (MATK, SOKS)
);

/*==============================================================*/
/* Index: GIAYKHAISINH_PK                                       */
/*==============================================================*/
create unique index GIAYKHAISINH_PK on GIAYKHAISINH (
MATK ASC,
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
   MAHUYEN              integer                        not null,
   MATINH               integer                        not null,
   TENHUYEN             varchar(150)                   null,
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
   MANK                 char(4)                        not null,
   MAQT                 integer                        not null,
   MATG                 integer                        not null,
   MADT                 integer                        not null,
   MAHK                 integer                        not null,
   MAXA                 integer                        not null,
   MAQH                 integer                        not null,
   HTNK                 varchar(50)                    null,
   TENKHAC              varchar(50)                    null,
   GIOTINH              smallint                       null,
   NGAYSINH             date                           null,
   CMDN                 varchar(12)                    null,
   MGAYCAPCM            date                           null,
   NOICAPCM             varchar(150)                   null,
   constraint PK_NHANKHAU primary key (MANK)
);

/*==============================================================*/
/* Index: NHANKHAU_PK                                           */
/*==============================================================*/
create unique index NHANKHAU_PK on NHANKHAU (
MANK ASC
);

/*==============================================================*/
/* Index: THUOC_QUAN_HE_FK                                      */
/*==============================================================*/
create index THUOC_QUAN_HE_FK on NHANKHAU (
MAQH ASC
);

/*==============================================================*/
/* Index: NHAN_KHAU_THUOC_XA_FK                                 */
/*==============================================================*/
create index NHAN_KHAU_THUOC_XA_FK on NHANKHAU (
MAXA ASC
);

/*==============================================================*/
/* Index: CO_DAN_TOC_FK                                         */
/*==============================================================*/
create index CO_DAN_TOC_FK on NHANKHAU (
MADT ASC
);

/*==============================================================*/
/* Index: CO_TON_GIAO_FK                                        */
/*==============================================================*/
create index CO_TON_GIAO_FK on NHANKHAU (
MATG ASC
);

/*==============================================================*/
/* Index: CO_QUOC_TICH_FK                                       */
/*==============================================================*/
create index CO_QUOC_TICH_FK on NHANKHAU (
MAQT ASC
);

/*==============================================================*/
/* Index: NHAN_KHAU_THUOC_HO_KHAU_FK                            */
/*==============================================================*/
create index NHAN_KHAU_THUOC_HO_KHAU_FK on NHANKHAU (
MAHK ASC
);

/*==============================================================*/
/* Table: QUANHECHUHO                                           */
/*==============================================================*/
create table QUANHECHUHO 
(
   MAQH                 integer                        not null,
   TENQUANHE            varchar(50)                    null,
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
   MAQT                 integer                        not null,
   TENQT                varchar(150)                   null,
   constraint PK_QUOCTICH primary key (MAQT)
);

/*==============================================================*/
/* Index: QUOCTICH_PK                                           */
/*==============================================================*/
create unique index QUOCTICH_PK on QUOCTICH (
MAQT ASC
);

/*==============================================================*/
/* Table: SOHOKAU                                               */
/*==============================================================*/
create table SOHOKAU 
(
   MAHK                 integer                        not null,
   MAXA                 integer                        not null,
   NGAYCAP              date                           null,
   constraint PK_SOHOKAU primary key (MAHK)
);

/*==============================================================*/
/* Index: SOHOKAU_PK                                            */
/*==============================================================*/
create unique index SOHOKAU_PK on SOHOKAU (
MAHK ASC
);

/*==============================================================*/
/* Index: SO_HO_KHAU_THUOC_XA_FK                                */
/*==============================================================*/
create index SO_HO_KHAU_THUOC_XA_FK on SOHOKAU (
MAXA ASC
);

/*==============================================================*/
/* Table: TINH                                                  */
/*==============================================================*/
create table TINH 
(
   MATINH               integer                        not null,
   TENTINH              varchar(150)                   null,
   constraint PK_TINH primary key (MATINH)
);

/*==============================================================*/
/* Index: TINH_PK                                               */
/*==============================================================*/
create unique index TINH_PK on TINH (
MATINH ASC
);

/*==============================================================*/
/* Table: TOKHAI                                                */
/*==============================================================*/
create table TOKHAI 
(
   MATK                 integer                        not null,
   MAHK                 integer                        not null,
   MANK                 char(4)                        not null,
   NHA_MANK             char(4)                        not null,
   NHA_MANK2            char(4)                        not null,
   NHA_MANK3            char(4)                        not null,
   NGAYLAPTK            date                           null,
   constraint PK_TOKHAI primary key (MATK)
);

/*==============================================================*/
/* Index: TOKHAI_PK                                             */
/*==============================================================*/
create unique index TOKHAI_PK on TOKHAI (
MATK ASC
);

/*==============================================================*/
/* Index: NGUOI_DI_KHAI_FK                                      */
/*==============================================================*/
create index NGUOI_DI_KHAI_FK on TOKHAI (
NHA_MANK2 ASC
);

/*==============================================================*/
/* Index: TO_KHAI_CO_SO_HO_KHAU_FK                              */
/*==============================================================*/
create index TO_KHAI_CO_SO_HO_KHAU_FK on TOKHAI (
MAHK ASC
);

/*==============================================================*/
/* Index: NGUOI_DUOC_LAM_GIAY_KHAI_SINH_FK                      */
/*==============================================================*/
create index NGUOI_DUOC_LAM_GIAY_KHAI_SINH_FK on TOKHAI (
MANK ASC
);

/*==============================================================*/
/* Index: CHA_FK                                                */
/*==============================================================*/
create index CHA_FK on TOKHAI (
NHA_MANK ASC
);

/*==============================================================*/
/* Index: ME_FK                                                 */
/*==============================================================*/
create index ME_FK on TOKHAI (
NHA_MANK3 ASC
);

/*==============================================================*/
/* Table: TONGIAO                                               */
/*==============================================================*/
create table TONGIAO 
(
   MATG                 integer                        not null,
   TENTG                varchar(150)                   null,
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
   MAXA                 integer                        not null,
   MAHUYEN              integer                        not null,
   TENXA                varchar(150)                   null,
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
   add constraint FK_CANBO_CO_CHUC_V_CHUCVU foreign key (MACV)
      references CHUCVU (MACV)
      on update restrict
      on delete restrict;

alter table CANBO
   add constraint FK_CANBO_THUOC_XA_XA foreign key (MAXA)
      references XA (MAXA)
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
   add constraint FK_NHANKHAU_NHAN_KHAU_SOHOKAU foreign key (MAHK)
      references SOHOKAU (MAHK)
      on update restrict
      on delete restrict;

alter table NHANKHAU
   add constraint FK_NHANKHAU_NHAN_KHAU_XA foreign key (MAXA)
      references XA (MAXA)
      on update restrict
      on delete restrict;

alter table NHANKHAU
   add constraint FK_NHANKHAU_THUOC_QUA_QUANHECH foreign key (MAQH)
      references QUANHECHUHO (MAQH)
      on update restrict
      on delete restrict;

alter table SOHOKAU
   add constraint FK_SOHOKAU_SO_HO_KHA_XA foreign key (MAXA)
      references XA (MAXA)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_CHA_NHANKHAU foreign key (NHA_MANK)
      references NHANKHAU (MANK)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_ME_NHANKHAU foreign key (NHA_MANK3)
      references NHANKHAU (MANK)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_NGUOI_DI__NHANKHAU foreign key (NHA_MANK2)
      references NHANKHAU (MANK)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_NGUOI_DUO_NHANKHAU foreign key (MANK)
      references NHANKHAU (MANK)
      on update restrict
      on delete restrict;

alter table TOKHAI
   add constraint FK_TOKHAI_TO_KHAI_C_SOHOKAU foreign key (MAHK)
      references SOHOKAU (MAHK)
      on update restrict
      on delete restrict;

alter table XA
   add constraint FK_XA_THUOC_HUY_HUYEN foreign key (MAHUYEN)
      references HUYEN (MAHUYEN)
      on update restrict
      on delete restrict;

