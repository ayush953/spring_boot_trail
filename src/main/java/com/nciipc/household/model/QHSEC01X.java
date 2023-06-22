package com.nciipc.household.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "household_qhsec01x")
public class QHSEC01X {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "qhsec01x_id", nullable = false)
	private Long id;

	@Column
	private String QHQUEST, QHSTATE, QHDIST, QHPSU, QHNUMBER, QHINT, QHLN, QHLINE_01, QHLINE_02, QHLINE_03, QHLINE_04,
			QHLINE_05, QHLINE_06, QHLINE_07, QHLINE_08, QHLINE_09, QHLINE_10, QHLINE_11, QHLINE_12, QHLINE_13,
			QHLINE_14, QHLINE_15, QHLINE_16, QHLINE_17, QHLINE_18, QHLINE_19, QHLINE_20, QHLINE_21, QHLINE_22,
			QHLINE_23, QHLINE_24, QHLINE_25, QHLINE_26, QHLINE_27, QHLINE_28, QHLINE_29, QHLINE_30, QHLINE_31,
			QHLINE_32, QHLINE_33, QHLINE_34, QHLINE_35, QHLINE_36, QHLINE_37, QHLINE_38, QHLINE_39, QHLINE_40,
			QHLINE_41, QHLINE_42, QHLINE_43, QHLINE_44, QHLINE_45, QHLINE_46, QHLINE_47, QHLINE_48, QHLINE_49,
			QHLINE_50, QHFIRSTN_01, QHFIRSTN_02, QHFIRSTN_03, QHFIRSTN_04, QHFIRSTN_05, QHFIRSTN_06, QHFIRSTN_07,
			QHFIRSTN_08, QHFIRSTN_09, QHFIRSTN_10, QHFIRSTN_11, QHFIRSTN_12, QHFIRSTN_13, QHFIRSTN_14, QHFIRSTN_15,
			QHFIRSTN_16, QHFIRSTN_17, QHFIRSTN_18, QHFIRSTN_19, QHFIRSTN_20, QHFIRSTN_21, QHFIRSTN_22, QHFIRSTN_23,
			QHFIRSTN_24, QHFIRSTN_25, QHFIRSTN_26, QHFIRSTN_27, QHFIRSTN_28, QHFIRSTN_29, QHFIRSTN_30, QHFIRSTN_31,
			QHFIRSTN_32, QHFIRSTN_33, QHFIRSTN_34, QHFIRSTN_35, QHFIRSTN_36, QHFIRSTN_37, QHFIRSTN_38, QHFIRSTN_39,
			QHFIRSTN_40, QHFIRSTN_41, QHFIRSTN_42, QHFIRSTN_43, QHFIRSTN_44, QHFIRSTN_45, QHFIRSTN_46, QHFIRSTN_47,
			QHFIRSTN_48, QHFIRSTN_49, QHFIRSTN_50, QHLASTN_01, QHLASTN_02, QHLASTN_03, QHLASTN_04, QHLASTN_05,
			QHLASTN_06, QHLASTN_07, QHLASTN_08, QHLASTN_09, QHLASTN_10, QHLASTN_11, QHLASTN_12, QHLASTN_13, QHLASTN_14,
			QHLASTN_15, QHLASTN_16, QHLASTN_17, QHLASTN_18, QHLASTN_19, QHLASTN_20, QHLASTN_21, QHLASTN_22, QHLASTN_23,
			QHLASTN_24, QHLASTN_25, QHLASTN_26, QHLASTN_27, QHLASTN_28, QHLASTN_29, QHLASTN_30, QHLASTN_31, QHLASTN_32,
			QHLASTN_33, QHLASTN_34, QHLASTN_35, QHLASTN_36, QHLASTN_37, QHLASTN_38, QHLASTN_39, QHLASTN_40, QHLASTN_41,
			QHLASTN_42, QHLASTN_43, QHLASTN_44, QHLASTN_45, QHLASTN_46, QHLASTN_47, QHLASTN_48, QHLASTN_49, QHLASTN_50,
			QHAGE_01, QHAGE_02, QHAGE_03, QHAGE_04, QHAGE_05, QHAGE_06, QHAGE_07, QHAGE_08, QHAGE_09, QHAGE_10,
			QHAGE_11, QHAGE_12, QHAGE_13, QHAGE_14, QHAGE_15, QHAGE_16, QHAGE_17, QHAGE_18, QHAGE_19, QHAGE_20,
			QHAGE_21, QHAGE_22, QHAGE_23, QHAGE_24, QHAGE_25, QHAGE_26, QHAGE_27, QHAGE_28, QHAGE_29, QHAGE_30,
			QHAGE_31, QHAGE_32, QHAGE_33, QHAGE_34, QHAGE_35, QHAGE_36, QHAGE_37, QHAGE_38, QHAGE_39, QHAGE_40,
			QHAGE_41, QHAGE_42, QHAGE_43, QHAGE_44, QHAGE_45, QHAGE_46, QHAGE_47, QHAGE_48, QHAGE_49, QHAGE_50,
			QHLIVES_01, QHLIVES_02, QHLIVES_03, QHLIVES_04, QHLIVES_05, QHLIVES_06, QHLIVES_07, QHLIVES_08, QHLIVES_09,
			QHLIVES_10, QHLIVES_11, QHLIVES_12, QHLIVES_13, QHLIVES_14, QHLIVES_15, QHLIVES_16, QHLIVES_17, QHLIVES_18,
			QHLIVES_19, QHLIVES_20, QHLIVES_21, QHLIVES_22, QHLIVES_23, QHLIVES_24, QHLIVES_25, QHLIVES_26, QHLIVES_27,
			QHLIVES_28, QHLIVES_29, QHLIVES_30, QHLIVES_31, QHLIVES_32, QHLIVES_33, QHLIVES_34, QHLIVES_35, QHLIVES_36,
			QHLIVES_37, QHLIVES_38, QHLIVES_39, QHLIVES_40, QHLIVES_41, QHLIVES_42, QHLIVES_43, QHLIVES_44, QHLIVES_45,
			QHLIVES_46, QHLIVES_47, QHLIVES_48, QHLIVES_49, QHLIVES_50, QHSLEPT_01, QHSLEPT_02, QHSLEPT_03, QHSLEPT_04,
			QHSLEPT_05, QHSLEPT_06, QHSLEPT_07, QHSLEPT_08, QHSLEPT_09, QHSLEPT_10, QHSLEPT_11, QHSLEPT_12, QHSLEPT_13,
			QHSLEPT_14, QHSLEPT_15, QHSLEPT_16, QHSLEPT_17, QHSLEPT_18, QHSLEPT_19, QHSLEPT_20, QHSLEPT_21, QHSLEPT_22,
			QHSLEPT_23, QHSLEPT_24, QHSLEPT_25, QHSLEPT_26, QHSLEPT_27, QHSLEPT_28, QHSLEPT_29, QHSLEPT_30, QHSLEPT_31,
			QHSLEPT_32, QHSLEPT_33, QHSLEPT_34, QHSLEPT_35, QHSLEPT_36, QHSLEPT_37, QHSLEPT_38, QHSLEPT_39, QHSLEPT_40,
			QHSLEPT_41, QHSLEPT_42, QHSLEPT_43, QHSLEPT_44, QHSLEPT_45, QHSLEPT_46, QHSLEPT_47, QHSLEPT_48, QHSLEPT_49,
			QHSLEPT_50, QHSEX_01, QHSEX_02, QHSEX_03, QHSEX_04, QHSEX_05, QHSEX_06, QHSEX_07, QHSEX_08, QHSEX_09,
			QHSEX_10, QHSEX_11, QHSEX_12, QHSEX_13, QHSEX_14, QHSEX_15, QHSEX_16, QHSEX_17, QHSEX_18, QHSEX_19,
			QHSEX_20, QHSEX_21, QHSEX_22, QHSEX_23, QHSEX_24, QHSEX_25, QHSEX_26, QHSEX_27, QHSEX_28, QHSEX_29,
			QHSEX_30, QHSEX_31, QHSEX_32, QHSEX_33, QHSEX_34, QHSEX_35, QHSEX_36, QHSEX_37, QHSEX_38, QHSEX_39,
			QHSEX_40, QHSEX_41, QHSEX_42, QHSEX_43, QHSEX_44, QHSEX_45, QHSEX_46, QHSEX_47, QHSEX_48, QHSEX_49,
			QHSEX_50, QHRELAT_01, QHRELAT_02, QHRELAT_03, QHRELAT_04, QHRELAT_05, QHRELAT_06, QHRELAT_07, QHRELAT_08,
			QHRELAT_09, QHRELAT_10, QHRELAT_11, QHRELAT_12, QHRELAT_13, QHRELAT_14, QHRELAT_15, QHRELAT_16, QHRELAT_17,
			QHRELAT_18, QHRELAT_19, QHRELAT_20, QHRELAT_21, QHRELAT_22, QHRELAT_23, QHRELAT_24, QHRELAT_25, QHRELAT_26,
			QHRELAT_27, QHRELAT_28, QHRELAT_29, QHRELAT_30, QHRELAT_31, QHRELAT_32, QHRELAT_33, QHRELAT_34, QHRELAT_35,
			QHRELAT_36, QHRELAT_37, QHRELAT_38, QHRELAT_39, QHRELAT_40, QHRELAT_41, QHRELAT_42, QHRELAT_43, QHRELAT_44,
			QHRELAT_45, QHRELAT_46, QHRELAT_47, QHRELAT_48, QHRELAT_49, QHRELAT_50, QHMORE_01, QHMORE_02, QHMORE_03,
			QHMORE_04, QHMORE_05, QHMORE_06, QHMORE_07, QHMORE_08, QHMORE_09, QHMORE_10, QHMORE_11, QHMORE_12,
			QHMORE_13, QHMORE_14, QHMORE_15, QHMORE_16, QHMORE_17, QHMORE_18, QHMORE_19, QHMORE_20, QHMORE_21,
			QHMORE_22, QHMORE_23, QHMORE_24, QHMORE_25, QHMORE_26, QHMORE_27, QHMORE_28, QHMORE_29, QHMORE_30,
			QHMORE_31, QHMORE_32, QHMORE_33, QHMORE_34, QHMORE_35, QHMORE_36, QHMORE_37, QHMORE_38, QHMORE_39,
			QHMORE_40, QHMORE_41, QHMORE_42, QHMORE_43, QHMORE_44, QHMORE_45, QHMORE_46, QHMORE_47, QHMORE_48,
			QHMORE_49, QHMORE_50;

	public void setId(Long id) {
		this.id = id;
	}

	public void setQHQUEST(String qHQUEST) {
		QHQUEST = qHQUEST;
	}

	public void setQHSTATE(String qHSTATE) {
		QHSTATE = qHSTATE;
	}

	public void setQHDIST(String qHDIST) {
		QHDIST = qHDIST;
	}

	public void setQHPSU(String qHPSU) {
		QHPSU = qHPSU;
	}

	public void setQHNUMBER(String qHNUMBER) {
		QHNUMBER = qHNUMBER;
	}

	public void setQHINT(String qHINT) {
		QHINT = qHINT;
	}

	public void setQHLN(String qHLN) {
		QHLN = qHLN;
	}

	public void setQHLINE_01(String qHLINE_01) {
		QHLINE_01 = qHLINE_01;
	}

	public void setQHLINE_02(String qHLINE_02) {
		QHLINE_02 = qHLINE_02;
	}

	public void setQHLINE_03(String qHLINE_03) {
		QHLINE_03 = qHLINE_03;
	}

	public void setQHLINE_04(String qHLINE_04) {
		QHLINE_04 = qHLINE_04;
	}

	public void setQHLINE_05(String qHLINE_05) {
		QHLINE_05 = qHLINE_05;
	}

	public void setQHLINE_06(String qHLINE_06) {
		QHLINE_06 = qHLINE_06;
	}

	public void setQHLINE_07(String qHLINE_07) {
		QHLINE_07 = qHLINE_07;
	}

	public void setQHLINE_08(String qHLINE_08) {
		QHLINE_08 = qHLINE_08;
	}

	public void setQHLINE_09(String qHLINE_09) {
		QHLINE_09 = qHLINE_09;
	}

	public void setQHLINE_10(String qHLINE_10) {
		QHLINE_10 = qHLINE_10;
	}

	public void setQHLINE_11(String qHLINE_11) {
		QHLINE_11 = qHLINE_11;
	}

	public void setQHLINE_12(String qHLINE_12) {
		QHLINE_12 = qHLINE_12;
	}

	public void setQHLINE_13(String qHLINE_13) {
		QHLINE_13 = qHLINE_13;
	}

	public void setQHLINE_14(String qHLINE_14) {
		QHLINE_14 = qHLINE_14;
	}

	public void setQHLINE_15(String qHLINE_15) {
		QHLINE_15 = qHLINE_15;
	}

	public void setQHLINE_16(String qHLINE_16) {
		QHLINE_16 = qHLINE_16;
	}

	public void setQHLINE_17(String qHLINE_17) {
		QHLINE_17 = qHLINE_17;
	}

	public void setQHLINE_18(String qHLINE_18) {
		QHLINE_18 = qHLINE_18;
	}

	public void setQHLINE_19(String qHLINE_19) {
		QHLINE_19 = qHLINE_19;
	}

	public void setQHLINE_20(String qHLINE_20) {
		QHLINE_20 = qHLINE_20;
	}

	public void setQHLINE_21(String qHLINE_21) {
		QHLINE_21 = qHLINE_21;
	}

	public void setQHLINE_22(String qHLINE_22) {
		QHLINE_22 = qHLINE_22;
	}

	public void setQHLINE_23(String qHLINE_23) {
		QHLINE_23 = qHLINE_23;
	}

	public void setQHLINE_24(String qHLINE_24) {
		QHLINE_24 = qHLINE_24;
	}

	public void setQHLINE_25(String qHLINE_25) {
		QHLINE_25 = qHLINE_25;
	}

	public void setQHLINE_26(String qHLINE_26) {
		QHLINE_26 = qHLINE_26;
	}

	public void setQHLINE_27(String qHLINE_27) {
		QHLINE_27 = qHLINE_27;
	}

	public void setQHLINE_28(String qHLINE_28) {
		QHLINE_28 = qHLINE_28;
	}

	public void setQHLINE_29(String qHLINE_29) {
		QHLINE_29 = qHLINE_29;
	}

	public void setQHLINE_30(String qHLINE_30) {
		QHLINE_30 = qHLINE_30;
	}

	public void setQHLINE_31(String qHLINE_31) {
		QHLINE_31 = qHLINE_31;
	}

	public void setQHLINE_32(String qHLINE_32) {
		QHLINE_32 = qHLINE_32;
	}

	public void setQHLINE_33(String qHLINE_33) {
		QHLINE_33 = qHLINE_33;
	}

	public void setQHLINE_34(String qHLINE_34) {
		QHLINE_34 = qHLINE_34;
	}

	public void setQHLINE_35(String qHLINE_35) {
		QHLINE_35 = qHLINE_35;
	}

	public void setQHLINE_36(String qHLINE_36) {
		QHLINE_36 = qHLINE_36;
	}

	public void setQHLINE_37(String qHLINE_37) {
		QHLINE_37 = qHLINE_37;
	}

	public void setQHLINE_38(String qHLINE_38) {
		QHLINE_38 = qHLINE_38;
	}

	public void setQHLINE_39(String qHLINE_39) {
		QHLINE_39 = qHLINE_39;
	}

	public void setQHLINE_40(String qHLINE_40) {
		QHLINE_40 = qHLINE_40;
	}

	public void setQHLINE_41(String qHLINE_41) {
		QHLINE_41 = qHLINE_41;
	}

	public void setQHLINE_42(String qHLINE_42) {
		QHLINE_42 = qHLINE_42;
	}

	public void setQHLINE_43(String qHLINE_43) {
		QHLINE_43 = qHLINE_43;
	}

	public void setQHLINE_44(String qHLINE_44) {
		QHLINE_44 = qHLINE_44;
	}

	public void setQHLINE_45(String qHLINE_45) {
		QHLINE_45 = qHLINE_45;
	}

	public void setQHLINE_46(String qHLINE_46) {
		QHLINE_46 = qHLINE_46;
	}

	public void setQHLINE_47(String qHLINE_47) {
		QHLINE_47 = qHLINE_47;
	}

	public void setQHLINE_48(String qHLINE_48) {
		QHLINE_48 = qHLINE_48;
	}

	public void setQHLINE_49(String qHLINE_49) {
		QHLINE_49 = qHLINE_49;
	}

	public void setQHLINE_50(String qHLINE_50) {
		QHLINE_50 = qHLINE_50;
	}

	public void setQHFIRSTN_01(String qHFIRSTN_01) {
		QHFIRSTN_01 = qHFIRSTN_01;
	}

	public void setQHFIRSTN_02(String qHFIRSTN_02) {
		QHFIRSTN_02 = qHFIRSTN_02;
	}

	public void setQHFIRSTN_03(String qHFIRSTN_03) {
		QHFIRSTN_03 = qHFIRSTN_03;
	}

	public void setQHFIRSTN_04(String qHFIRSTN_04) {
		QHFIRSTN_04 = qHFIRSTN_04;
	}

	public void setQHFIRSTN_05(String qHFIRSTN_05) {
		QHFIRSTN_05 = qHFIRSTN_05;
	}

	public void setQHFIRSTN_06(String qHFIRSTN_06) {
		QHFIRSTN_06 = qHFIRSTN_06;
	}

	public void setQHFIRSTN_07(String qHFIRSTN_07) {
		QHFIRSTN_07 = qHFIRSTN_07;
	}

	public void setQHFIRSTN_08(String qHFIRSTN_08) {
		QHFIRSTN_08 = qHFIRSTN_08;
	}

	public void setQHFIRSTN_09(String qHFIRSTN_09) {
		QHFIRSTN_09 = qHFIRSTN_09;
	}

	public void setQHFIRSTN_10(String qHFIRSTN_10) {
		QHFIRSTN_10 = qHFIRSTN_10;
	}

	public void setQHFIRSTN_11(String qHFIRSTN_11) {
		QHFIRSTN_11 = qHFIRSTN_11;
	}

	public void setQHFIRSTN_12(String qHFIRSTN_12) {
		QHFIRSTN_12 = qHFIRSTN_12;
	}

	public void setQHFIRSTN_13(String qHFIRSTN_13) {
		QHFIRSTN_13 = qHFIRSTN_13;
	}

	public void setQHFIRSTN_14(String qHFIRSTN_14) {
		QHFIRSTN_14 = qHFIRSTN_14;
	}

	public void setQHFIRSTN_15(String qHFIRSTN_15) {
		QHFIRSTN_15 = qHFIRSTN_15;
	}

	public void setQHFIRSTN_16(String qHFIRSTN_16) {
		QHFIRSTN_16 = qHFIRSTN_16;
	}

	public void setQHFIRSTN_17(String qHFIRSTN_17) {
		QHFIRSTN_17 = qHFIRSTN_17;
	}

	public void setQHFIRSTN_18(String qHFIRSTN_18) {
		QHFIRSTN_18 = qHFIRSTN_18;
	}

	public void setQHFIRSTN_19(String qHFIRSTN_19) {
		QHFIRSTN_19 = qHFIRSTN_19;
	}

	public void setQHFIRSTN_20(String qHFIRSTN_20) {
		QHFIRSTN_20 = qHFIRSTN_20;
	}

	public void setQHFIRSTN_21(String qHFIRSTN_21) {
		QHFIRSTN_21 = qHFIRSTN_21;
	}

	public void setQHFIRSTN_22(String qHFIRSTN_22) {
		QHFIRSTN_22 = qHFIRSTN_22;
	}

	public void setQHFIRSTN_23(String qHFIRSTN_23) {
		QHFIRSTN_23 = qHFIRSTN_23;
	}

	public void setQHFIRSTN_24(String qHFIRSTN_24) {
		QHFIRSTN_24 = qHFIRSTN_24;
	}

	public void setQHFIRSTN_25(String qHFIRSTN_25) {
		QHFIRSTN_25 = qHFIRSTN_25;
	}

	public void setQHFIRSTN_26(String qHFIRSTN_26) {
		QHFIRSTN_26 = qHFIRSTN_26;
	}

	public void setQHFIRSTN_27(String qHFIRSTN_27) {
		QHFIRSTN_27 = qHFIRSTN_27;
	}

	public void setQHFIRSTN_28(String qHFIRSTN_28) {
		QHFIRSTN_28 = qHFIRSTN_28;
	}

	public void setQHFIRSTN_29(String qHFIRSTN_29) {
		QHFIRSTN_29 = qHFIRSTN_29;
	}

	public void setQHFIRSTN_30(String qHFIRSTN_30) {
		QHFIRSTN_30 = qHFIRSTN_30;
	}

	public void setQHFIRSTN_31(String qHFIRSTN_31) {
		QHFIRSTN_31 = qHFIRSTN_31;
	}

	public void setQHFIRSTN_32(String qHFIRSTN_32) {
		QHFIRSTN_32 = qHFIRSTN_32;
	}

	public void setQHFIRSTN_33(String qHFIRSTN_33) {
		QHFIRSTN_33 = qHFIRSTN_33;
	}

	public void setQHFIRSTN_34(String qHFIRSTN_34) {
		QHFIRSTN_34 = qHFIRSTN_34;
	}

	public void setQHFIRSTN_35(String qHFIRSTN_35) {
		QHFIRSTN_35 = qHFIRSTN_35;
	}

	public void setQHFIRSTN_36(String qHFIRSTN_36) {
		QHFIRSTN_36 = qHFIRSTN_36;
	}

	public void setQHFIRSTN_37(String qHFIRSTN_37) {
		QHFIRSTN_37 = qHFIRSTN_37;
	}

	public void setQHFIRSTN_38(String qHFIRSTN_38) {
		QHFIRSTN_38 = qHFIRSTN_38;
	}

	public void setQHFIRSTN_39(String qHFIRSTN_39) {
		QHFIRSTN_39 = qHFIRSTN_39;
	}

	public void setQHFIRSTN_40(String qHFIRSTN_40) {
		QHFIRSTN_40 = qHFIRSTN_40;
	}

	public void setQHFIRSTN_41(String qHFIRSTN_41) {
		QHFIRSTN_41 = qHFIRSTN_41;
	}

	public void setQHFIRSTN_42(String qHFIRSTN_42) {
		QHFIRSTN_42 = qHFIRSTN_42;
	}

	public void setQHFIRSTN_43(String qHFIRSTN_43) {
		QHFIRSTN_43 = qHFIRSTN_43;
	}

	public void setQHFIRSTN_44(String qHFIRSTN_44) {
		QHFIRSTN_44 = qHFIRSTN_44;
	}

	public void setQHFIRSTN_45(String qHFIRSTN_45) {
		QHFIRSTN_45 = qHFIRSTN_45;
	}

	public void setQHFIRSTN_46(String qHFIRSTN_46) {
		QHFIRSTN_46 = qHFIRSTN_46;
	}

	public void setQHFIRSTN_47(String qHFIRSTN_47) {
		QHFIRSTN_47 = qHFIRSTN_47;
	}

	public void setQHFIRSTN_48(String qHFIRSTN_48) {
		QHFIRSTN_48 = qHFIRSTN_48;
	}

	public void setQHFIRSTN_49(String qHFIRSTN_49) {
		QHFIRSTN_49 = qHFIRSTN_49;
	}

	public void setQHFIRSTN_50(String qHFIRSTN_50) {
		QHFIRSTN_50 = qHFIRSTN_50;
	}

	public void setQHLASTN_01(String qHLASTN_01) {
		QHLASTN_01 = qHLASTN_01;
	}

	public void setQHLASTN_02(String qHLASTN_02) {
		QHLASTN_02 = qHLASTN_02;
	}

	public void setQHLASTN_03(String qHLASTN_03) {
		QHLASTN_03 = qHLASTN_03;
	}

	public void setQHLASTN_04(String qHLASTN_04) {
		QHLASTN_04 = qHLASTN_04;
	}

	public void setQHLASTN_05(String qHLASTN_05) {
		QHLASTN_05 = qHLASTN_05;
	}

	public void setQHLASTN_06(String qHLASTN_06) {
		QHLASTN_06 = qHLASTN_06;
	}

	public void setQHLASTN_07(String qHLASTN_07) {
		QHLASTN_07 = qHLASTN_07;
	}

	public void setQHLASTN_08(String qHLASTN_08) {
		QHLASTN_08 = qHLASTN_08;
	}

	public void setQHLASTN_09(String qHLASTN_09) {
		QHLASTN_09 = qHLASTN_09;
	}

	public void setQHLASTN_10(String qHLASTN_10) {
		QHLASTN_10 = qHLASTN_10;
	}

	public void setQHLASTN_11(String qHLASTN_11) {
		QHLASTN_11 = qHLASTN_11;
	}

	public void setQHLASTN_12(String qHLASTN_12) {
		QHLASTN_12 = qHLASTN_12;
	}

	public void setQHLASTN_13(String qHLASTN_13) {
		QHLASTN_13 = qHLASTN_13;
	}

	public void setQHLASTN_14(String qHLASTN_14) {
		QHLASTN_14 = qHLASTN_14;
	}

	public void setQHLASTN_15(String qHLASTN_15) {
		QHLASTN_15 = qHLASTN_15;
	}

	public void setQHLASTN_16(String qHLASTN_16) {
		QHLASTN_16 = qHLASTN_16;
	}

	public void setQHLASTN_17(String qHLASTN_17) {
		QHLASTN_17 = qHLASTN_17;
	}

	public void setQHLASTN_18(String qHLASTN_18) {
		QHLASTN_18 = qHLASTN_18;
	}

	public void setQHLASTN_19(String qHLASTN_19) {
		QHLASTN_19 = qHLASTN_19;
	}

	public void setQHLASTN_20(String qHLASTN_20) {
		QHLASTN_20 = qHLASTN_20;
	}

	public void setQHLASTN_21(String qHLASTN_21) {
		QHLASTN_21 = qHLASTN_21;
	}

	public void setQHLASTN_22(String qHLASTN_22) {
		QHLASTN_22 = qHLASTN_22;
	}

	public void setQHLASTN_23(String qHLASTN_23) {
		QHLASTN_23 = qHLASTN_23;
	}

	public void setQHLASTN_24(String qHLASTN_24) {
		QHLASTN_24 = qHLASTN_24;
	}

	public void setQHLASTN_25(String qHLASTN_25) {
		QHLASTN_25 = qHLASTN_25;
	}

	public void setQHLASTN_26(String qHLASTN_26) {
		QHLASTN_26 = qHLASTN_26;
	}

	public void setQHLASTN_27(String qHLASTN_27) {
		QHLASTN_27 = qHLASTN_27;
	}

	public void setQHLASTN_28(String qHLASTN_28) {
		QHLASTN_28 = qHLASTN_28;
	}

	public void setQHLASTN_29(String qHLASTN_29) {
		QHLASTN_29 = qHLASTN_29;
	}

	public void setQHLASTN_30(String qHLASTN_30) {
		QHLASTN_30 = qHLASTN_30;
	}

	public void setQHLASTN_31(String qHLASTN_31) {
		QHLASTN_31 = qHLASTN_31;
	}

	public void setQHLASTN_32(String qHLASTN_32) {
		QHLASTN_32 = qHLASTN_32;
	}

	public void setQHLASTN_33(String qHLASTN_33) {
		QHLASTN_33 = qHLASTN_33;
	}

	public void setQHLASTN_34(String qHLASTN_34) {
		QHLASTN_34 = qHLASTN_34;
	}

	public void setQHLASTN_35(String qHLASTN_35) {
		QHLASTN_35 = qHLASTN_35;
	}

	public void setQHLASTN_36(String qHLASTN_36) {
		QHLASTN_36 = qHLASTN_36;
	}

	public void setQHLASTN_37(String qHLASTN_37) {
		QHLASTN_37 = qHLASTN_37;
	}

	public void setQHLASTN_38(String qHLASTN_38) {
		QHLASTN_38 = qHLASTN_38;
	}

	public void setQHLASTN_39(String qHLASTN_39) {
		QHLASTN_39 = qHLASTN_39;
	}

	public void setQHLASTN_40(String qHLASTN_40) {
		QHLASTN_40 = qHLASTN_40;
	}

	public void setQHLASTN_41(String qHLASTN_41) {
		QHLASTN_41 = qHLASTN_41;
	}

	public void setQHLASTN_42(String qHLASTN_42) {
		QHLASTN_42 = qHLASTN_42;
	}

	public void setQHLASTN_43(String qHLASTN_43) {
		QHLASTN_43 = qHLASTN_43;
	}

	public void setQHLASTN_44(String qHLASTN_44) {
		QHLASTN_44 = qHLASTN_44;
	}

	public void setQHLASTN_45(String qHLASTN_45) {
		QHLASTN_45 = qHLASTN_45;
	}

	public void setQHLASTN_46(String qHLASTN_46) {
		QHLASTN_46 = qHLASTN_46;
	}

	public void setQHLASTN_47(String qHLASTN_47) {
		QHLASTN_47 = qHLASTN_47;
	}

	public void setQHLASTN_48(String qHLASTN_48) {
		QHLASTN_48 = qHLASTN_48;
	}

	public void setQHLASTN_49(String qHLASTN_49) {
		QHLASTN_49 = qHLASTN_49;
	}

	public void setQHLASTN_50(String qHLASTN_50) {
		QHLASTN_50 = qHLASTN_50;
	}

	public void setQHAGE_01(String qHAGE_01) {
		QHAGE_01 = qHAGE_01;
	}

	public void setQHAGE_02(String qHAGE_02) {
		QHAGE_02 = qHAGE_02;
	}

	public void setQHAGE_03(String qHAGE_03) {
		QHAGE_03 = qHAGE_03;
	}

	public void setQHAGE_04(String qHAGE_04) {
		QHAGE_04 = qHAGE_04;
	}

	public void setQHAGE_05(String qHAGE_05) {
		QHAGE_05 = qHAGE_05;
	}

	public void setQHAGE_06(String qHAGE_06) {
		QHAGE_06 = qHAGE_06;
	}

	public void setQHAGE_07(String qHAGE_07) {
		QHAGE_07 = qHAGE_07;
	}

	public void setQHAGE_08(String qHAGE_08) {
		QHAGE_08 = qHAGE_08;
	}

	public void setQHAGE_09(String qHAGE_09) {
		QHAGE_09 = qHAGE_09;
	}

	public void setQHAGE_10(String qHAGE_10) {
		QHAGE_10 = qHAGE_10;
	}

	public void setQHAGE_11(String qHAGE_11) {
		QHAGE_11 = qHAGE_11;
	}

	public void setQHAGE_12(String qHAGE_12) {
		QHAGE_12 = qHAGE_12;
	}

	public void setQHAGE_13(String qHAGE_13) {
		QHAGE_13 = qHAGE_13;
	}

	public void setQHAGE_14(String qHAGE_14) {
		QHAGE_14 = qHAGE_14;
	}

	public void setQHAGE_15(String qHAGE_15) {
		QHAGE_15 = qHAGE_15;
	}

	public void setQHAGE_16(String qHAGE_16) {
		QHAGE_16 = qHAGE_16;
	}

	public void setQHAGE_17(String qHAGE_17) {
		QHAGE_17 = qHAGE_17;
	}

	public void setQHAGE_18(String qHAGE_18) {
		QHAGE_18 = qHAGE_18;
	}

	public void setQHAGE_19(String qHAGE_19) {
		QHAGE_19 = qHAGE_19;
	}

	public void setQHAGE_20(String qHAGE_20) {
		QHAGE_20 = qHAGE_20;
	}

	public void setQHAGE_21(String qHAGE_21) {
		QHAGE_21 = qHAGE_21;
	}

	public void setQHAGE_22(String qHAGE_22) {
		QHAGE_22 = qHAGE_22;
	}

	public void setQHAGE_23(String qHAGE_23) {
		QHAGE_23 = qHAGE_23;
	}

	public void setQHAGE_24(String qHAGE_24) {
		QHAGE_24 = qHAGE_24;
	}

	public void setQHAGE_25(String qHAGE_25) {
		QHAGE_25 = qHAGE_25;
	}

	public void setQHAGE_26(String qHAGE_26) {
		QHAGE_26 = qHAGE_26;
	}

	public void setQHAGE_27(String qHAGE_27) {
		QHAGE_27 = qHAGE_27;
	}

	public void setQHAGE_28(String qHAGE_28) {
		QHAGE_28 = qHAGE_28;
	}

	public void setQHAGE_29(String qHAGE_29) {
		QHAGE_29 = qHAGE_29;
	}

	public void setQHAGE_30(String qHAGE_30) {
		QHAGE_30 = qHAGE_30;
	}

	public void setQHAGE_31(String qHAGE_31) {
		QHAGE_31 = qHAGE_31;
	}

	public void setQHAGE_32(String qHAGE_32) {
		QHAGE_32 = qHAGE_32;
	}

	public void setQHAGE_33(String qHAGE_33) {
		QHAGE_33 = qHAGE_33;
	}

	public void setQHAGE_34(String qHAGE_34) {
		QHAGE_34 = qHAGE_34;
	}

	public void setQHAGE_35(String qHAGE_35) {
		QHAGE_35 = qHAGE_35;
	}

	public void setQHAGE_36(String qHAGE_36) {
		QHAGE_36 = qHAGE_36;
	}

	public void setQHAGE_37(String qHAGE_37) {
		QHAGE_37 = qHAGE_37;
	}

	public void setQHAGE_38(String qHAGE_38) {
		QHAGE_38 = qHAGE_38;
	}

	public void setQHAGE_39(String qHAGE_39) {
		QHAGE_39 = qHAGE_39;
	}

	public void setQHAGE_40(String qHAGE_40) {
		QHAGE_40 = qHAGE_40;
	}

	public void setQHAGE_41(String qHAGE_41) {
		QHAGE_41 = qHAGE_41;
	}

	public void setQHAGE_42(String qHAGE_42) {
		QHAGE_42 = qHAGE_42;
	}

	public void setQHAGE_43(String qHAGE_43) {
		QHAGE_43 = qHAGE_43;
	}

	public void setQHAGE_44(String qHAGE_44) {
		QHAGE_44 = qHAGE_44;
	}

	public void setQHAGE_45(String qHAGE_45) {
		QHAGE_45 = qHAGE_45;
	}

	public void setQHAGE_46(String qHAGE_46) {
		QHAGE_46 = qHAGE_46;
	}

	public void setQHAGE_47(String qHAGE_47) {
		QHAGE_47 = qHAGE_47;
	}

	public void setQHAGE_48(String qHAGE_48) {
		QHAGE_48 = qHAGE_48;
	}

	public void setQHAGE_49(String qHAGE_49) {
		QHAGE_49 = qHAGE_49;
	}

	public void setQHAGE_50(String qHAGE_50) {
		QHAGE_50 = qHAGE_50;
	}

	public void setQHLIVES_01(String qHLIVES_01) {
		QHLIVES_01 = qHLIVES_01;
	}

	public void setQHLIVES_02(String qHLIVES_02) {
		QHLIVES_02 = qHLIVES_02;
	}

	public void setQHLIVES_03(String qHLIVES_03) {
		QHLIVES_03 = qHLIVES_03;
	}

	public void setQHLIVES_04(String qHLIVES_04) {
		QHLIVES_04 = qHLIVES_04;
	}

	public void setQHLIVES_05(String qHLIVES_05) {
		QHLIVES_05 = qHLIVES_05;
	}

	public void setQHLIVES_06(String qHLIVES_06) {
		QHLIVES_06 = qHLIVES_06;
	}

	public void setQHLIVES_07(String qHLIVES_07) {
		QHLIVES_07 = qHLIVES_07;
	}

	public void setQHLIVES_08(String qHLIVES_08) {
		QHLIVES_08 = qHLIVES_08;
	}

	public void setQHLIVES_09(String qHLIVES_09) {
		QHLIVES_09 = qHLIVES_09;
	}

	public void setQHLIVES_10(String qHLIVES_10) {
		QHLIVES_10 = qHLIVES_10;
	}

	public void setQHLIVES_11(String qHLIVES_11) {
		QHLIVES_11 = qHLIVES_11;
	}

	public void setQHLIVES_12(String qHLIVES_12) {
		QHLIVES_12 = qHLIVES_12;
	}

	public void setQHLIVES_13(String qHLIVES_13) {
		QHLIVES_13 = qHLIVES_13;
	}

	public void setQHLIVES_14(String qHLIVES_14) {
		QHLIVES_14 = qHLIVES_14;
	}

	public void setQHLIVES_15(String qHLIVES_15) {
		QHLIVES_15 = qHLIVES_15;
	}

	public void setQHLIVES_16(String qHLIVES_16) {
		QHLIVES_16 = qHLIVES_16;
	}

	public void setQHLIVES_17(String qHLIVES_17) {
		QHLIVES_17 = qHLIVES_17;
	}

	public void setQHLIVES_18(String qHLIVES_18) {
		QHLIVES_18 = qHLIVES_18;
	}

	public void setQHLIVES_19(String qHLIVES_19) {
		QHLIVES_19 = qHLIVES_19;
	}

	public void setQHLIVES_20(String qHLIVES_20) {
		QHLIVES_20 = qHLIVES_20;
	}

	public void setQHLIVES_21(String qHLIVES_21) {
		QHLIVES_21 = qHLIVES_21;
	}

	public void setQHLIVES_22(String qHLIVES_22) {
		QHLIVES_22 = qHLIVES_22;
	}

	public void setQHLIVES_23(String qHLIVES_23) {
		QHLIVES_23 = qHLIVES_23;
	}

	public void setQHLIVES_24(String qHLIVES_24) {
		QHLIVES_24 = qHLIVES_24;
	}

	public void setQHLIVES_25(String qHLIVES_25) {
		QHLIVES_25 = qHLIVES_25;
	}

	public void setQHLIVES_26(String qHLIVES_26) {
		QHLIVES_26 = qHLIVES_26;
	}

	public void setQHLIVES_27(String qHLIVES_27) {
		QHLIVES_27 = qHLIVES_27;
	}

	public void setQHLIVES_28(String qHLIVES_28) {
		QHLIVES_28 = qHLIVES_28;
	}

	public void setQHLIVES_29(String qHLIVES_29) {
		QHLIVES_29 = qHLIVES_29;
	}

	public void setQHLIVES_30(String qHLIVES_30) {
		QHLIVES_30 = qHLIVES_30;
	}

	public void setQHLIVES_31(String qHLIVES_31) {
		QHLIVES_31 = qHLIVES_31;
	}

	public void setQHLIVES_32(String qHLIVES_32) {
		QHLIVES_32 = qHLIVES_32;
	}

	public void setQHLIVES_33(String qHLIVES_33) {
		QHLIVES_33 = qHLIVES_33;
	}

	public void setQHLIVES_34(String qHLIVES_34) {
		QHLIVES_34 = qHLIVES_34;
	}

	public void setQHLIVES_35(String qHLIVES_35) {
		QHLIVES_35 = qHLIVES_35;
	}

	public void setQHLIVES_36(String qHLIVES_36) {
		QHLIVES_36 = qHLIVES_36;
	}

	public void setQHLIVES_37(String qHLIVES_37) {
		QHLIVES_37 = qHLIVES_37;
	}

	public void setQHLIVES_38(String qHLIVES_38) {
		QHLIVES_38 = qHLIVES_38;
	}

	public void setQHLIVES_39(String qHLIVES_39) {
		QHLIVES_39 = qHLIVES_39;
	}

	public void setQHLIVES_40(String qHLIVES_40) {
		QHLIVES_40 = qHLIVES_40;
	}

	public void setQHLIVES_41(String qHLIVES_41) {
		QHLIVES_41 = qHLIVES_41;
	}

	public void setQHLIVES_42(String qHLIVES_42) {
		QHLIVES_42 = qHLIVES_42;
	}

	public void setQHLIVES_43(String qHLIVES_43) {
		QHLIVES_43 = qHLIVES_43;
	}

	public void setQHLIVES_44(String qHLIVES_44) {
		QHLIVES_44 = qHLIVES_44;
	}

	public void setQHLIVES_45(String qHLIVES_45) {
		QHLIVES_45 = qHLIVES_45;
	}

	public void setQHLIVES_46(String qHLIVES_46) {
		QHLIVES_46 = qHLIVES_46;
	}

	public void setQHLIVES_47(String qHLIVES_47) {
		QHLIVES_47 = qHLIVES_47;
	}

	public void setQHLIVES_48(String qHLIVES_48) {
		QHLIVES_48 = qHLIVES_48;
	}

	public void setQHLIVES_49(String qHLIVES_49) {
		QHLIVES_49 = qHLIVES_49;
	}

	public void setQHLIVES_50(String qHLIVES_50) {
		QHLIVES_50 = qHLIVES_50;
	}

	public void setQHSLEPT_01(String qHSLEPT_01) {
		QHSLEPT_01 = qHSLEPT_01;
	}

	public void setQHSLEPT_02(String qHSLEPT_02) {
		QHSLEPT_02 = qHSLEPT_02;
	}

	public void setQHSLEPT_03(String qHSLEPT_03) {
		QHSLEPT_03 = qHSLEPT_03;
	}

	public void setQHSLEPT_04(String qHSLEPT_04) {
		QHSLEPT_04 = qHSLEPT_04;
	}

	public void setQHSLEPT_05(String qHSLEPT_05) {
		QHSLEPT_05 = qHSLEPT_05;
	}

	public void setQHSLEPT_06(String qHSLEPT_06) {
		QHSLEPT_06 = qHSLEPT_06;
	}

	public void setQHSLEPT_07(String qHSLEPT_07) {
		QHSLEPT_07 = qHSLEPT_07;
	}

	public void setQHSLEPT_08(String qHSLEPT_08) {
		QHSLEPT_08 = qHSLEPT_08;
	}

	public void setQHSLEPT_09(String qHSLEPT_09) {
		QHSLEPT_09 = qHSLEPT_09;
	}

	public void setQHSLEPT_10(String qHSLEPT_10) {
		QHSLEPT_10 = qHSLEPT_10;
	}

	public void setQHSLEPT_11(String qHSLEPT_11) {
		QHSLEPT_11 = qHSLEPT_11;
	}

	public void setQHSLEPT_12(String qHSLEPT_12) {
		QHSLEPT_12 = qHSLEPT_12;
	}

	public void setQHSLEPT_13(String qHSLEPT_13) {
		QHSLEPT_13 = qHSLEPT_13;
	}

	public void setQHSLEPT_14(String qHSLEPT_14) {
		QHSLEPT_14 = qHSLEPT_14;
	}

	public void setQHSLEPT_15(String qHSLEPT_15) {
		QHSLEPT_15 = qHSLEPT_15;
	}

	public void setQHSLEPT_16(String qHSLEPT_16) {
		QHSLEPT_16 = qHSLEPT_16;
	}

	public void setQHSLEPT_17(String qHSLEPT_17) {
		QHSLEPT_17 = qHSLEPT_17;
	}

	public void setQHSLEPT_18(String qHSLEPT_18) {
		QHSLEPT_18 = qHSLEPT_18;
	}

	public void setQHSLEPT_19(String qHSLEPT_19) {
		QHSLEPT_19 = qHSLEPT_19;
	}

	public void setQHSLEPT_20(String qHSLEPT_20) {
		QHSLEPT_20 = qHSLEPT_20;
	}

	public void setQHSLEPT_21(String qHSLEPT_21) {
		QHSLEPT_21 = qHSLEPT_21;
	}

	public void setQHSLEPT_22(String qHSLEPT_22) {
		QHSLEPT_22 = qHSLEPT_22;
	}

	public void setQHSLEPT_23(String qHSLEPT_23) {
		QHSLEPT_23 = qHSLEPT_23;
	}

	public void setQHSLEPT_24(String qHSLEPT_24) {
		QHSLEPT_24 = qHSLEPT_24;
	}

	public void setQHSLEPT_25(String qHSLEPT_25) {
		QHSLEPT_25 = qHSLEPT_25;
	}

	public void setQHSLEPT_26(String qHSLEPT_26) {
		QHSLEPT_26 = qHSLEPT_26;
	}

	public void setQHSLEPT_27(String qHSLEPT_27) {
		QHSLEPT_27 = qHSLEPT_27;
	}

	public void setQHSLEPT_28(String qHSLEPT_28) {
		QHSLEPT_28 = qHSLEPT_28;
	}

	public void setQHSLEPT_29(String qHSLEPT_29) {
		QHSLEPT_29 = qHSLEPT_29;
	}

	public void setQHSLEPT_30(String qHSLEPT_30) {
		QHSLEPT_30 = qHSLEPT_30;
	}

	public void setQHSLEPT_31(String qHSLEPT_31) {
		QHSLEPT_31 = qHSLEPT_31;
	}

	public void setQHSLEPT_32(String qHSLEPT_32) {
		QHSLEPT_32 = qHSLEPT_32;
	}

	public void setQHSLEPT_33(String qHSLEPT_33) {
		QHSLEPT_33 = qHSLEPT_33;
	}

	public void setQHSLEPT_34(String qHSLEPT_34) {
		QHSLEPT_34 = qHSLEPT_34;
	}

	public void setQHSLEPT_35(String qHSLEPT_35) {
		QHSLEPT_35 = qHSLEPT_35;
	}

	public void setQHSLEPT_36(String qHSLEPT_36) {
		QHSLEPT_36 = qHSLEPT_36;
	}

	public void setQHSLEPT_37(String qHSLEPT_37) {
		QHSLEPT_37 = qHSLEPT_37;
	}

	public void setQHSLEPT_38(String qHSLEPT_38) {
		QHSLEPT_38 = qHSLEPT_38;
	}

	public void setQHSLEPT_39(String qHSLEPT_39) {
		QHSLEPT_39 = qHSLEPT_39;
	}

	public void setQHSLEPT_40(String qHSLEPT_40) {
		QHSLEPT_40 = qHSLEPT_40;
	}

	public void setQHSLEPT_41(String qHSLEPT_41) {
		QHSLEPT_41 = qHSLEPT_41;
	}

	public void setQHSLEPT_42(String qHSLEPT_42) {
		QHSLEPT_42 = qHSLEPT_42;
	}

	public void setQHSLEPT_43(String qHSLEPT_43) {
		QHSLEPT_43 = qHSLEPT_43;
	}

	public void setQHSLEPT_44(String qHSLEPT_44) {
		QHSLEPT_44 = qHSLEPT_44;
	}

	public void setQHSLEPT_45(String qHSLEPT_45) {
		QHSLEPT_45 = qHSLEPT_45;
	}

	public void setQHSLEPT_46(String qHSLEPT_46) {
		QHSLEPT_46 = qHSLEPT_46;
	}

	public void setQHSLEPT_47(String qHSLEPT_47) {
		QHSLEPT_47 = qHSLEPT_47;
	}

	public void setQHSLEPT_48(String qHSLEPT_48) {
		QHSLEPT_48 = qHSLEPT_48;
	}

	public void setQHSLEPT_49(String qHSLEPT_49) {
		QHSLEPT_49 = qHSLEPT_49;
	}

	public void setQHSLEPT_50(String qHSLEPT_50) {
		QHSLEPT_50 = qHSLEPT_50;
	}

	public void setQHSEX_01(String qHSEX_01) {
		QHSEX_01 = qHSEX_01;
	}

	public void setQHSEX_02(String qHSEX_02) {
		QHSEX_02 = qHSEX_02;
	}

	public void setQHSEX_03(String qHSEX_03) {
		QHSEX_03 = qHSEX_03;
	}

	public void setQHSEX_04(String qHSEX_04) {
		QHSEX_04 = qHSEX_04;
	}

	public void setQHSEX_05(String qHSEX_05) {
		QHSEX_05 = qHSEX_05;
	}

	public void setQHSEX_06(String qHSEX_06) {
		QHSEX_06 = qHSEX_06;
	}

	public void setQHSEX_07(String qHSEX_07) {
		QHSEX_07 = qHSEX_07;
	}

	public void setQHSEX_08(String qHSEX_08) {
		QHSEX_08 = qHSEX_08;
	}

	public void setQHSEX_09(String qHSEX_09) {
		QHSEX_09 = qHSEX_09;
	}

	public void setQHSEX_10(String qHSEX_10) {
		QHSEX_10 = qHSEX_10;
	}

	public void setQHSEX_11(String qHSEX_11) {
		QHSEX_11 = qHSEX_11;
	}

	public void setQHSEX_12(String qHSEX_12) {
		QHSEX_12 = qHSEX_12;
	}

	public void setQHSEX_13(String qHSEX_13) {
		QHSEX_13 = qHSEX_13;
	}

	public void setQHSEX_14(String qHSEX_14) {
		QHSEX_14 = qHSEX_14;
	}

	public void setQHSEX_15(String qHSEX_15) {
		QHSEX_15 = qHSEX_15;
	}

	public void setQHSEX_16(String qHSEX_16) {
		QHSEX_16 = qHSEX_16;
	}

	public void setQHSEX_17(String qHSEX_17) {
		QHSEX_17 = qHSEX_17;
	}

	public void setQHSEX_18(String qHSEX_18) {
		QHSEX_18 = qHSEX_18;
	}

	public void setQHSEX_19(String qHSEX_19) {
		QHSEX_19 = qHSEX_19;
	}

	public void setQHSEX_20(String qHSEX_20) {
		QHSEX_20 = qHSEX_20;
	}

	public void setQHSEX_21(String qHSEX_21) {
		QHSEX_21 = qHSEX_21;
	}

	public void setQHSEX_22(String qHSEX_22) {
		QHSEX_22 = qHSEX_22;
	}

	public void setQHSEX_23(String qHSEX_23) {
		QHSEX_23 = qHSEX_23;
	}

	public void setQHSEX_24(String qHSEX_24) {
		QHSEX_24 = qHSEX_24;
	}

	public void setQHSEX_25(String qHSEX_25) {
		QHSEX_25 = qHSEX_25;
	}

	public void setQHSEX_26(String qHSEX_26) {
		QHSEX_26 = qHSEX_26;
	}

	public void setQHSEX_27(String qHSEX_27) {
		QHSEX_27 = qHSEX_27;
	}

	public void setQHSEX_28(String qHSEX_28) {
		QHSEX_28 = qHSEX_28;
	}

	public void setQHSEX_29(String qHSEX_29) {
		QHSEX_29 = qHSEX_29;
	}

	public void setQHSEX_30(String qHSEX_30) {
		QHSEX_30 = qHSEX_30;
	}

	public void setQHSEX_31(String qHSEX_31) {
		QHSEX_31 = qHSEX_31;
	}

	public void setQHSEX_32(String qHSEX_32) {
		QHSEX_32 = qHSEX_32;
	}

	public void setQHSEX_33(String qHSEX_33) {
		QHSEX_33 = qHSEX_33;
	}

	public void setQHSEX_34(String qHSEX_34) {
		QHSEX_34 = qHSEX_34;
	}

	public void setQHSEX_35(String qHSEX_35) {
		QHSEX_35 = qHSEX_35;
	}

	public void setQHSEX_36(String qHSEX_36) {
		QHSEX_36 = qHSEX_36;
	}

	public void setQHSEX_37(String qHSEX_37) {
		QHSEX_37 = qHSEX_37;
	}

	public void setQHSEX_38(String qHSEX_38) {
		QHSEX_38 = qHSEX_38;
	}

	public void setQHSEX_39(String qHSEX_39) {
		QHSEX_39 = qHSEX_39;
	}

	public void setQHSEX_40(String qHSEX_40) {
		QHSEX_40 = qHSEX_40;
	}

	public void setQHSEX_41(String qHSEX_41) {
		QHSEX_41 = qHSEX_41;
	}

	public void setQHSEX_42(String qHSEX_42) {
		QHSEX_42 = qHSEX_42;
	}

	public void setQHSEX_43(String qHSEX_43) {
		QHSEX_43 = qHSEX_43;
	}

	public void setQHSEX_44(String qHSEX_44) {
		QHSEX_44 = qHSEX_44;
	}

	public void setQHSEX_45(String qHSEX_45) {
		QHSEX_45 = qHSEX_45;
	}

	public void setQHSEX_46(String qHSEX_46) {
		QHSEX_46 = qHSEX_46;
	}

	public void setQHSEX_47(String qHSEX_47) {
		QHSEX_47 = qHSEX_47;
	}

	public void setQHSEX_48(String qHSEX_48) {
		QHSEX_48 = qHSEX_48;
	}

	public void setQHSEX_49(String qHSEX_49) {
		QHSEX_49 = qHSEX_49;
	}

	public void setQHSEX_50(String qHSEX_50) {
		QHSEX_50 = qHSEX_50;
	}

	public void setQHRELAT_01(String qHRELAT_01) {
		QHRELAT_01 = qHRELAT_01;
	}

	public void setQHRELAT_02(String qHRELAT_02) {
		QHRELAT_02 = qHRELAT_02;
	}

	public void setQHRELAT_03(String qHRELAT_03) {
		QHRELAT_03 = qHRELAT_03;
	}

	public void setQHRELAT_04(String qHRELAT_04) {
		QHRELAT_04 = qHRELAT_04;
	}

	public void setQHRELAT_05(String qHRELAT_05) {
		QHRELAT_05 = qHRELAT_05;
	}

	public void setQHRELAT_06(String qHRELAT_06) {
		QHRELAT_06 = qHRELAT_06;
	}

	public void setQHRELAT_07(String qHRELAT_07) {
		QHRELAT_07 = qHRELAT_07;
	}

	public void setQHRELAT_08(String qHRELAT_08) {
		QHRELAT_08 = qHRELAT_08;
	}

	public void setQHRELAT_09(String qHRELAT_09) {
		QHRELAT_09 = qHRELAT_09;
	}

	public void setQHRELAT_10(String qHRELAT_10) {
		QHRELAT_10 = qHRELAT_10;
	}

	public void setQHRELAT_11(String qHRELAT_11) {
		QHRELAT_11 = qHRELAT_11;
	}

	public void setQHRELAT_12(String qHRELAT_12) {
		QHRELAT_12 = qHRELAT_12;
	}

	public void setQHRELAT_13(String qHRELAT_13) {
		QHRELAT_13 = qHRELAT_13;
	}

	public void setQHRELAT_14(String qHRELAT_14) {
		QHRELAT_14 = qHRELAT_14;
	}

	public void setQHRELAT_15(String qHRELAT_15) {
		QHRELAT_15 = qHRELAT_15;
	}

	public void setQHRELAT_16(String qHRELAT_16) {
		QHRELAT_16 = qHRELAT_16;
	}

	public void setQHRELAT_17(String qHRELAT_17) {
		QHRELAT_17 = qHRELAT_17;
	}

	public void setQHRELAT_18(String qHRELAT_18) {
		QHRELAT_18 = qHRELAT_18;
	}

	public void setQHRELAT_19(String qHRELAT_19) {
		QHRELAT_19 = qHRELAT_19;
	}

	public void setQHRELAT_20(String qHRELAT_20) {
		QHRELAT_20 = qHRELAT_20;
	}

	public void setQHRELAT_21(String qHRELAT_21) {
		QHRELAT_21 = qHRELAT_21;
	}

	public void setQHRELAT_22(String qHRELAT_22) {
		QHRELAT_22 = qHRELAT_22;
	}

	public void setQHRELAT_23(String qHRELAT_23) {
		QHRELAT_23 = qHRELAT_23;
	}

	public void setQHRELAT_24(String qHRELAT_24) {
		QHRELAT_24 = qHRELAT_24;
	}

	public void setQHRELAT_25(String qHRELAT_25) {
		QHRELAT_25 = qHRELAT_25;
	}

	public void setQHRELAT_26(String qHRELAT_26) {
		QHRELAT_26 = qHRELAT_26;
	}

	public void setQHRELAT_27(String qHRELAT_27) {
		QHRELAT_27 = qHRELAT_27;
	}

	public void setQHRELAT_28(String qHRELAT_28) {
		QHRELAT_28 = qHRELAT_28;
	}

	public void setQHRELAT_29(String qHRELAT_29) {
		QHRELAT_29 = qHRELAT_29;
	}

	public void setQHRELAT_30(String qHRELAT_30) {
		QHRELAT_30 = qHRELAT_30;
	}

	public void setQHRELAT_31(String qHRELAT_31) {
		QHRELAT_31 = qHRELAT_31;
	}

	public void setQHRELAT_32(String qHRELAT_32) {
		QHRELAT_32 = qHRELAT_32;
	}

	public void setQHRELAT_33(String qHRELAT_33) {
		QHRELAT_33 = qHRELAT_33;
	}

	public void setQHRELAT_34(String qHRELAT_34) {
		QHRELAT_34 = qHRELAT_34;
	}

	public void setQHRELAT_35(String qHRELAT_35) {
		QHRELAT_35 = qHRELAT_35;
	}

	public void setQHRELAT_36(String qHRELAT_36) {
		QHRELAT_36 = qHRELAT_36;
	}

	public void setQHRELAT_37(String qHRELAT_37) {
		QHRELAT_37 = qHRELAT_37;
	}

	public void setQHRELAT_38(String qHRELAT_38) {
		QHRELAT_38 = qHRELAT_38;
	}

	public void setQHRELAT_39(String qHRELAT_39) {
		QHRELAT_39 = qHRELAT_39;
	}

	public void setQHRELAT_40(String qHRELAT_40) {
		QHRELAT_40 = qHRELAT_40;
	}

	public void setQHRELAT_41(String qHRELAT_41) {
		QHRELAT_41 = qHRELAT_41;
	}

	public void setQHRELAT_42(String qHRELAT_42) {
		QHRELAT_42 = qHRELAT_42;
	}

	public void setQHRELAT_43(String qHRELAT_43) {
		QHRELAT_43 = qHRELAT_43;
	}

	public void setQHRELAT_44(String qHRELAT_44) {
		QHRELAT_44 = qHRELAT_44;
	}

	public void setQHRELAT_45(String qHRELAT_45) {
		QHRELAT_45 = qHRELAT_45;
	}

	public void setQHRELAT_46(String qHRELAT_46) {
		QHRELAT_46 = qHRELAT_46;
	}

	public void setQHRELAT_47(String qHRELAT_47) {
		QHRELAT_47 = qHRELAT_47;
	}

	public void setQHRELAT_48(String qHRELAT_48) {
		QHRELAT_48 = qHRELAT_48;
	}

	public void setQHRELAT_49(String qHRELAT_49) {
		QHRELAT_49 = qHRELAT_49;
	}

	public void setQHRELAT_50(String qHRELAT_50) {
		QHRELAT_50 = qHRELAT_50;
	}

	public void setQHMORE_01(String qHMORE_01) {
		QHMORE_01 = qHMORE_01;
	}

	public void setQHMORE_02(String qHMORE_02) {
		QHMORE_02 = qHMORE_02;
	}

	public void setQHMORE_03(String qHMORE_03) {
		QHMORE_03 = qHMORE_03;
	}

	public void setQHMORE_04(String qHMORE_04) {
		QHMORE_04 = qHMORE_04;
	}

	public void setQHMORE_05(String qHMORE_05) {
		QHMORE_05 = qHMORE_05;
	}

	public void setQHMORE_06(String qHMORE_06) {
		QHMORE_06 = qHMORE_06;
	}

	public void setQHMORE_07(String qHMORE_07) {
		QHMORE_07 = qHMORE_07;
	}

	public void setQHMORE_08(String qHMORE_08) {
		QHMORE_08 = qHMORE_08;
	}

	public void setQHMORE_09(String qHMORE_09) {
		QHMORE_09 = qHMORE_09;
	}

	public void setQHMORE_10(String qHMORE_10) {
		QHMORE_10 = qHMORE_10;
	}

	public void setQHMORE_11(String qHMORE_11) {
		QHMORE_11 = qHMORE_11;
	}

	public void setQHMORE_12(String qHMORE_12) {
		QHMORE_12 = qHMORE_12;
	}

	public void setQHMORE_13(String qHMORE_13) {
		QHMORE_13 = qHMORE_13;
	}

	public void setQHMORE_14(String qHMORE_14) {
		QHMORE_14 = qHMORE_14;
	}

	public void setQHMORE_15(String qHMORE_15) {
		QHMORE_15 = qHMORE_15;
	}

	public void setQHMORE_16(String qHMORE_16) {
		QHMORE_16 = qHMORE_16;
	}

	public void setQHMORE_17(String qHMORE_17) {
		QHMORE_17 = qHMORE_17;
	}

	public void setQHMORE_18(String qHMORE_18) {
		QHMORE_18 = qHMORE_18;
	}

	public void setQHMORE_19(String qHMORE_19) {
		QHMORE_19 = qHMORE_19;
	}

	public void setQHMORE_20(String qHMORE_20) {
		QHMORE_20 = qHMORE_20;
	}

	public void setQHMORE_21(String qHMORE_21) {
		QHMORE_21 = qHMORE_21;
	}

	public void setQHMORE_22(String qHMORE_22) {
		QHMORE_22 = qHMORE_22;
	}

	public void setQHMORE_23(String qHMORE_23) {
		QHMORE_23 = qHMORE_23;
	}

	public void setQHMORE_24(String qHMORE_24) {
		QHMORE_24 = qHMORE_24;
	}

	public void setQHMORE_25(String qHMORE_25) {
		QHMORE_25 = qHMORE_25;
	}

	public void setQHMORE_26(String qHMORE_26) {
		QHMORE_26 = qHMORE_26;
	}

	public void setQHMORE_27(String qHMORE_27) {
		QHMORE_27 = qHMORE_27;
	}

	public void setQHMORE_28(String qHMORE_28) {
		QHMORE_28 = qHMORE_28;
	}

	public void setQHMORE_29(String qHMORE_29) {
		QHMORE_29 = qHMORE_29;
	}

	public void setQHMORE_30(String qHMORE_30) {
		QHMORE_30 = qHMORE_30;
	}

	public void setQHMORE_31(String qHMORE_31) {
		QHMORE_31 = qHMORE_31;
	}

	public void setQHMORE_32(String qHMORE_32) {
		QHMORE_32 = qHMORE_32;
	}

	public void setQHMORE_33(String qHMORE_33) {
		QHMORE_33 = qHMORE_33;
	}

	public void setQHMORE_34(String qHMORE_34) {
		QHMORE_34 = qHMORE_34;
	}

	public void setQHMORE_35(String qHMORE_35) {
		QHMORE_35 = qHMORE_35;
	}

	public void setQHMORE_36(String qHMORE_36) {
		QHMORE_36 = qHMORE_36;
	}

	public void setQHMORE_37(String qHMORE_37) {
		QHMORE_37 = qHMORE_37;
	}

	public void setQHMORE_38(String qHMORE_38) {
		QHMORE_38 = qHMORE_38;
	}

	public void setQHMORE_39(String qHMORE_39) {
		QHMORE_39 = qHMORE_39;
	}

	public void setQHMORE_40(String qHMORE_40) {
		QHMORE_40 = qHMORE_40;
	}

	public void setQHMORE_41(String qHMORE_41) {
		QHMORE_41 = qHMORE_41;
	}

	public void setQHMORE_42(String qHMORE_42) {
		QHMORE_42 = qHMORE_42;
	}

	public void setQHMORE_43(String qHMORE_43) {
		QHMORE_43 = qHMORE_43;
	}

	public void setQHMORE_44(String qHMORE_44) {
		QHMORE_44 = qHMORE_44;
	}

	public void setQHMORE_45(String qHMORE_45) {
		QHMORE_45 = qHMORE_45;
	}

	public void setQHMORE_46(String qHMORE_46) {
		QHMORE_46 = qHMORE_46;
	}

	public void setQHMORE_47(String qHMORE_47) {
		QHMORE_47 = qHMORE_47;
	}

	public void setQHMORE_48(String qHMORE_48) {
		QHMORE_48 = qHMORE_48;
	}

	public void setQHMORE_49(String qHMORE_49) {
		QHMORE_49 = qHMORE_49;
	}

	public void setQHMORE_50(String qHMORE_50) {
		QHMORE_50 = qHMORE_50;
	}

	@Override
	public String toString() {
		return "QHSEC01X [id=" + id + ", QHQUEST=" + QHQUEST + ", QHSTATE=" + QHSTATE + ", QHDIST=" + QHDIST
				+ ", QHPSU=" + QHPSU + ", QHNUMBER=" + QHNUMBER + ", QHINT=" + QHINT + ", QHLN=" + QHLN + ", QHLINE_01="
				+ QHLINE_01 + ", QHLINE_02=" + QHLINE_02 + ", QHLINE_03=" + QHLINE_03 + ", QHLINE_04=" + QHLINE_04
				+ ", QHLINE_05=" + QHLINE_05 + ", QHLINE_06=" + QHLINE_06 + ", QHLINE_07=" + QHLINE_07 + ", QHLINE_08="
				+ QHLINE_08 + ", QHLINE_09=" + QHLINE_09 + ", QHLINE_10=" + QHLINE_10 + ", QHLINE_11=" + QHLINE_11
				+ ", QHLINE_12=" + QHLINE_12 + ", QHLINE_13=" + QHLINE_13 + ", QHLINE_14=" + QHLINE_14 + ", QHLINE_15="
				+ QHLINE_15 + ", QHLINE_16=" + QHLINE_16 + ", QHLINE_17=" + QHLINE_17 + ", QHLINE_18=" + QHLINE_18
				+ ", QHLINE_19=" + QHLINE_19 + ", QHLINE_20=" + QHLINE_20 + ", QHLINE_21=" + QHLINE_21 + ", QHLINE_22="
				+ QHLINE_22 + ", QHLINE_23=" + QHLINE_23 + ", QHLINE_24=" + QHLINE_24 + ", QHLINE_25=" + QHLINE_25
				+ ", QHLINE_26=" + QHLINE_26 + ", QHLINE_27=" + QHLINE_27 + ", QHLINE_28=" + QHLINE_28 + ", QHLINE_29="
				+ QHLINE_29 + ", QHLINE_30=" + QHLINE_30 + ", QHLINE_31=" + QHLINE_31 + ", QHLINE_32=" + QHLINE_32
				+ ", QHLINE_33=" + QHLINE_33 + ", QHLINE_34=" + QHLINE_34 + ", QHLINE_35=" + QHLINE_35 + ", QHLINE_36="
				+ QHLINE_36 + ", QHLINE_37=" + QHLINE_37 + ", QHLINE_38=" + QHLINE_38 + ", QHLINE_39=" + QHLINE_39
				+ ", QHLINE_40=" + QHLINE_40 + ", QHLINE_41=" + QHLINE_41 + ", QHLINE_42=" + QHLINE_42 + ", QHLINE_43="
				+ QHLINE_43 + ", QHLINE_44=" + QHLINE_44 + ", QHLINE_45=" + QHLINE_45 + ", QHLINE_46=" + QHLINE_46
				+ ", QHLINE_47=" + QHLINE_47 + ", QHLINE_48=" + QHLINE_48 + ", QHLINE_49=" + QHLINE_49 + ", QHLINE_50="
				+ QHLINE_50 + ", QHFIRSTN_01=" + QHFIRSTN_01 + ", QHFIRSTN_02=" + QHFIRSTN_02 + ", QHFIRSTN_03="
				+ QHFIRSTN_03 + ", QHFIRSTN_04=" + QHFIRSTN_04 + ", QHFIRSTN_05=" + QHFIRSTN_05 + ", QHFIRSTN_06="
				+ QHFIRSTN_06 + ", QHFIRSTN_07=" + QHFIRSTN_07 + ", QHFIRSTN_08=" + QHFIRSTN_08 + ", QHFIRSTN_09="
				+ QHFIRSTN_09 + ", QHFIRSTN_10=" + QHFIRSTN_10 + ", QHFIRSTN_11=" + QHFIRSTN_11 + ", QHFIRSTN_12="
				+ QHFIRSTN_12 + ", QHFIRSTN_13=" + QHFIRSTN_13 + ", QHFIRSTN_14=" + QHFIRSTN_14 + ", QHFIRSTN_15="
				+ QHFIRSTN_15 + ", QHFIRSTN_16=" + QHFIRSTN_16 + ", QHFIRSTN_17=" + QHFIRSTN_17 + ", QHFIRSTN_18="
				+ QHFIRSTN_18 + ", QHFIRSTN_19=" + QHFIRSTN_19 + ", QHFIRSTN_20=" + QHFIRSTN_20 + ", QHFIRSTN_21="
				+ QHFIRSTN_21 + ", QHFIRSTN_22=" + QHFIRSTN_22 + ", QHFIRSTN_23=" + QHFIRSTN_23 + ", QHFIRSTN_24="
				+ QHFIRSTN_24 + ", QHFIRSTN_25=" + QHFIRSTN_25 + ", QHFIRSTN_26=" + QHFIRSTN_26 + ", QHFIRSTN_27="
				+ QHFIRSTN_27 + ", QHFIRSTN_28=" + QHFIRSTN_28 + ", QHFIRSTN_29=" + QHFIRSTN_29 + ", QHFIRSTN_30="
				+ QHFIRSTN_30 + ", QHFIRSTN_31=" + QHFIRSTN_31 + ", QHFIRSTN_32=" + QHFIRSTN_32 + ", QHFIRSTN_33="
				+ QHFIRSTN_33 + ", QHFIRSTN_34=" + QHFIRSTN_34 + ", QHFIRSTN_35=" + QHFIRSTN_35 + ", QHFIRSTN_36="
				+ QHFIRSTN_36 + ", QHFIRSTN_37=" + QHFIRSTN_37 + ", QHFIRSTN_38=" + QHFIRSTN_38 + ", QHFIRSTN_39="
				+ QHFIRSTN_39 + ", QHFIRSTN_40=" + QHFIRSTN_40 + ", QHFIRSTN_41=" + QHFIRSTN_41 + ", QHFIRSTN_42="
				+ QHFIRSTN_42 + ", QHFIRSTN_43=" + QHFIRSTN_43 + ", QHFIRSTN_44=" + QHFIRSTN_44 + ", QHFIRSTN_45="
				+ QHFIRSTN_45 + ", QHFIRSTN_46=" + QHFIRSTN_46 + ", QHFIRSTN_47=" + QHFIRSTN_47 + ", QHFIRSTN_48="
				+ QHFIRSTN_48 + ", QHFIRSTN_49=" + QHFIRSTN_49 + ", QHFIRSTN_50=" + QHFIRSTN_50 + ", QHLASTN_01="
				+ QHLASTN_01 + ", QHLASTN_02=" + QHLASTN_02 + ", QHLASTN_03=" + QHLASTN_03 + ", QHLASTN_04="
				+ QHLASTN_04 + ", QHLASTN_05=" + QHLASTN_05 + ", QHLASTN_06=" + QHLASTN_06 + ", QHLASTN_07="
				+ QHLASTN_07 + ", QHLASTN_08=" + QHLASTN_08 + ", QHLASTN_09=" + QHLASTN_09 + ", QHLASTN_10="
				+ QHLASTN_10 + ", QHLASTN_11=" + QHLASTN_11 + ", QHLASTN_12=" + QHLASTN_12 + ", QHLASTN_13="
				+ QHLASTN_13 + ", QHLASTN_14=" + QHLASTN_14 + ", QHLASTN_15=" + QHLASTN_15 + ", QHLASTN_16="
				+ QHLASTN_16 + ", QHLASTN_17=" + QHLASTN_17 + ", QHLASTN_18=" + QHLASTN_18 + ", QHLASTN_19="
				+ QHLASTN_19 + ", QHLASTN_20=" + QHLASTN_20 + ", QHLASTN_21=" + QHLASTN_21 + ", QHLASTN_22="
				+ QHLASTN_22 + ", QHLASTN_23=" + QHLASTN_23 + ", QHLASTN_24=" + QHLASTN_24 + ", QHLASTN_25="
				+ QHLASTN_25 + ", QHLASTN_26=" + QHLASTN_26 + ", QHLASTN_27=" + QHLASTN_27 + ", QHLASTN_28="
				+ QHLASTN_28 + ", QHLASTN_29=" + QHLASTN_29 + ", QHLASTN_30=" + QHLASTN_30 + ", QHLASTN_31="
				+ QHLASTN_31 + ", QHLASTN_32=" + QHLASTN_32 + ", QHLASTN_33=" + QHLASTN_33 + ", QHLASTN_34="
				+ QHLASTN_34 + ", QHLASTN_35=" + QHLASTN_35 + ", QHLASTN_36=" + QHLASTN_36 + ", QHLASTN_37="
				+ QHLASTN_37 + ", QHLASTN_38=" + QHLASTN_38 + ", QHLASTN_39=" + QHLASTN_39 + ", QHLASTN_40="
				+ QHLASTN_40 + ", QHLASTN_41=" + QHLASTN_41 + ", QHLASTN_42=" + QHLASTN_42 + ", QHLASTN_43="
				+ QHLASTN_43 + ", QHLASTN_44=" + QHLASTN_44 + ", QHLASTN_45=" + QHLASTN_45 + ", QHLASTN_46="
				+ QHLASTN_46 + ", QHLASTN_47=" + QHLASTN_47 + ", QHLASTN_48=" + QHLASTN_48 + ", QHLASTN_49="
				+ QHLASTN_49 + ", QHLASTN_50=" + QHLASTN_50 + ", QHAGE_01=" + QHAGE_01 + ", QHAGE_02=" + QHAGE_02
				+ ", QHAGE_03=" + QHAGE_03 + ", QHAGE_04=" + QHAGE_04 + ", QHAGE_05=" + QHAGE_05 + ", QHAGE_06="
				+ QHAGE_06 + ", QHAGE_07=" + QHAGE_07 + ", QHAGE_08=" + QHAGE_08 + ", QHAGE_09=" + QHAGE_09
				+ ", QHAGE_10=" + QHAGE_10 + ", QHAGE_11=" + QHAGE_11 + ", QHAGE_12=" + QHAGE_12 + ", QHAGE_13="
				+ QHAGE_13 + ", QHAGE_14=" + QHAGE_14 + ", QHAGE_15=" + QHAGE_15 + ", QHAGE_16=" + QHAGE_16
				+ ", QHAGE_17=" + QHAGE_17 + ", QHAGE_18=" + QHAGE_18 + ", QHAGE_19=" + QHAGE_19 + ", QHAGE_20="
				+ QHAGE_20 + ", QHAGE_21=" + QHAGE_21 + ", QHAGE_22=" + QHAGE_22 + ", QHAGE_23=" + QHAGE_23
				+ ", QHAGE_24=" + QHAGE_24 + ", QHAGE_25=" + QHAGE_25 + ", QHAGE_26=" + QHAGE_26 + ", QHAGE_27="
				+ QHAGE_27 + ", QHAGE_28=" + QHAGE_28 + ", QHAGE_29=" + QHAGE_29 + ", QHAGE_30=" + QHAGE_30
				+ ", QHAGE_31=" + QHAGE_31 + ", QHAGE_32=" + QHAGE_32 + ", QHAGE_33=" + QHAGE_33 + ", QHAGE_34="
				+ QHAGE_34 + ", QHAGE_35=" + QHAGE_35 + ", QHAGE_36=" + QHAGE_36 + ", QHAGE_37=" + QHAGE_37
				+ ", QHAGE_38=" + QHAGE_38 + ", QHAGE_39=" + QHAGE_39 + ", QHAGE_40=" + QHAGE_40 + ", QHAGE_41="
				+ QHAGE_41 + ", QHAGE_42=" + QHAGE_42 + ", QHAGE_43=" + QHAGE_43 + ", QHAGE_44=" + QHAGE_44
				+ ", QHAGE_45=" + QHAGE_45 + ", QHAGE_46=" + QHAGE_46 + ", QHAGE_47=" + QHAGE_47 + ", QHAGE_48="
				+ QHAGE_48 + ", QHAGE_49=" + QHAGE_49 + ", QHAGE_50=" + QHAGE_50 + ", QHLIVES_01=" + QHLIVES_01
				+ ", QHLIVES_02=" + QHLIVES_02 + ", QHLIVES_03=" + QHLIVES_03 + ", QHLIVES_04=" + QHLIVES_04
				+ ", QHLIVES_05=" + QHLIVES_05 + ", QHLIVES_06=" + QHLIVES_06 + ", QHLIVES_07=" + QHLIVES_07
				+ ", QHLIVES_08=" + QHLIVES_08 + ", QHLIVES_09=" + QHLIVES_09 + ", QHLIVES_10=" + QHLIVES_10
				+ ", QHLIVES_11=" + QHLIVES_11 + ", QHLIVES_12=" + QHLIVES_12 + ", QHLIVES_13=" + QHLIVES_13
				+ ", QHLIVES_14=" + QHLIVES_14 + ", QHLIVES_15=" + QHLIVES_15 + ", QHLIVES_16=" + QHLIVES_16
				+ ", QHLIVES_17=" + QHLIVES_17 + ", QHLIVES_18=" + QHLIVES_18 + ", QHLIVES_19=" + QHLIVES_19
				+ ", QHLIVES_20=" + QHLIVES_20 + ", QHLIVES_21=" + QHLIVES_21 + ", QHLIVES_22=" + QHLIVES_22
				+ ", QHLIVES_23=" + QHLIVES_23 + ", QHLIVES_24=" + QHLIVES_24 + ", QHLIVES_25=" + QHLIVES_25
				+ ", QHLIVES_26=" + QHLIVES_26 + ", QHLIVES_27=" + QHLIVES_27 + ", QHLIVES_28=" + QHLIVES_28
				+ ", QHLIVES_29=" + QHLIVES_29 + ", QHLIVES_30=" + QHLIVES_30 + ", QHLIVES_31=" + QHLIVES_31
				+ ", QHLIVES_32=" + QHLIVES_32 + ", QHLIVES_33=" + QHLIVES_33 + ", QHLIVES_34=" + QHLIVES_34
				+ ", QHLIVES_35=" + QHLIVES_35 + ", QHLIVES_36=" + QHLIVES_36 + ", QHLIVES_37=" + QHLIVES_37
				+ ", QHLIVES_38=" + QHLIVES_38 + ", QHLIVES_39=" + QHLIVES_39 + ", QHLIVES_40=" + QHLIVES_40
				+ ", QHLIVES_41=" + QHLIVES_41 + ", QHLIVES_42=" + QHLIVES_42 + ", QHLIVES_43=" + QHLIVES_43
				+ ", QHLIVES_44=" + QHLIVES_44 + ", QHLIVES_45=" + QHLIVES_45 + ", QHLIVES_46=" + QHLIVES_46
				+ ", QHLIVES_47=" + QHLIVES_47 + ", QHLIVES_48=" + QHLIVES_48 + ", QHLIVES_49=" + QHLIVES_49
				+ ", QHLIVES_50=" + QHLIVES_50 + ", QHSLEPT_01=" + QHSLEPT_01 + ", QHSLEPT_02=" + QHSLEPT_02
				+ ", QHSLEPT_03=" + QHSLEPT_03 + ", QHSLEPT_04=" + QHSLEPT_04 + ", QHSLEPT_05=" + QHSLEPT_05
				+ ", QHSLEPT_06=" + QHSLEPT_06 + ", QHSLEPT_07=" + QHSLEPT_07 + ", QHSLEPT_08=" + QHSLEPT_08
				+ ", QHSLEPT_09=" + QHSLEPT_09 + ", QHSLEPT_10=" + QHSLEPT_10 + ", QHSLEPT_11=" + QHSLEPT_11
				+ ", QHSLEPT_12=" + QHSLEPT_12 + ", QHSLEPT_13=" + QHSLEPT_13 + ", QHSLEPT_14=" + QHSLEPT_14
				+ ", QHSLEPT_15=" + QHSLEPT_15 + ", QHSLEPT_16=" + QHSLEPT_16 + ", QHSLEPT_17=" + QHSLEPT_17
				+ ", QHSLEPT_18=" + QHSLEPT_18 + ", QHSLEPT_19=" + QHSLEPT_19 + ", QHSLEPT_20=" + QHSLEPT_20
				+ ", QHSLEPT_21=" + QHSLEPT_21 + ", QHSLEPT_22=" + QHSLEPT_22 + ", QHSLEPT_23=" + QHSLEPT_23
				+ ", QHSLEPT_24=" + QHSLEPT_24 + ", QHSLEPT_25=" + QHSLEPT_25 + ", QHSLEPT_26=" + QHSLEPT_26
				+ ", QHSLEPT_27=" + QHSLEPT_27 + ", QHSLEPT_28=" + QHSLEPT_28 + ", QHSLEPT_29=" + QHSLEPT_29
				+ ", QHSLEPT_30=" + QHSLEPT_30 + ", QHSLEPT_31=" + QHSLEPT_31 + ", QHSLEPT_32=" + QHSLEPT_32
				+ ", QHSLEPT_33=" + QHSLEPT_33 + ", QHSLEPT_34=" + QHSLEPT_34 + ", QHSLEPT_35=" + QHSLEPT_35
				+ ", QHSLEPT_36=" + QHSLEPT_36 + ", QHSLEPT_37=" + QHSLEPT_37 + ", QHSLEPT_38=" + QHSLEPT_38
				+ ", QHSLEPT_39=" + QHSLEPT_39 + ", QHSLEPT_40=" + QHSLEPT_40 + ", QHSLEPT_41=" + QHSLEPT_41
				+ ", QHSLEPT_42=" + QHSLEPT_42 + ", QHSLEPT_43=" + QHSLEPT_43 + ", QHSLEPT_44=" + QHSLEPT_44
				+ ", QHSLEPT_45=" + QHSLEPT_45 + ", QHSLEPT_46=" + QHSLEPT_46 + ", QHSLEPT_47=" + QHSLEPT_47
				+ ", QHSLEPT_48=" + QHSLEPT_48 + ", QHSLEPT_49=" + QHSLEPT_49 + ", QHSLEPT_50=" + QHSLEPT_50
				+ ", QHSEX_01=" + QHSEX_01 + ", QHSEX_02=" + QHSEX_02 + ", QHSEX_03=" + QHSEX_03 + ", QHSEX_04="
				+ QHSEX_04 + ", QHSEX_05=" + QHSEX_05 + ", QHSEX_06=" + QHSEX_06 + ", QHSEX_07=" + QHSEX_07
				+ ", QHSEX_08=" + QHSEX_08 + ", QHSEX_09=" + QHSEX_09 + ", QHSEX_10=" + QHSEX_10 + ", QHSEX_11="
				+ QHSEX_11 + ", QHSEX_12=" + QHSEX_12 + ", QHSEX_13=" + QHSEX_13 + ", QHSEX_14=" + QHSEX_14
				+ ", QHSEX_15=" + QHSEX_15 + ", QHSEX_16=" + QHSEX_16 + ", QHSEX_17=" + QHSEX_17 + ", QHSEX_18="
				+ QHSEX_18 + ", QHSEX_19=" + QHSEX_19 + ", QHSEX_20=" + QHSEX_20 + ", QHSEX_21=" + QHSEX_21
				+ ", QHSEX_22=" + QHSEX_22 + ", QHSEX_23=" + QHSEX_23 + ", QHSEX_24=" + QHSEX_24 + ", QHSEX_25="
				+ QHSEX_25 + ", QHSEX_26=" + QHSEX_26 + ", QHSEX_27=" + QHSEX_27 + ", QHSEX_28=" + QHSEX_28
				+ ", QHSEX_29=" + QHSEX_29 + ", QHSEX_30=" + QHSEX_30 + ", QHSEX_31=" + QHSEX_31 + ", QHSEX_32="
				+ QHSEX_32 + ", QHSEX_33=" + QHSEX_33 + ", QHSEX_34=" + QHSEX_34 + ", QHSEX_35=" + QHSEX_35
				+ ", QHSEX_36=" + QHSEX_36 + ", QHSEX_37=" + QHSEX_37 + ", QHSEX_38=" + QHSEX_38 + ", QHSEX_39="
				+ QHSEX_39 + ", QHSEX_40=" + QHSEX_40 + ", QHSEX_41=" + QHSEX_41 + ", QHSEX_42=" + QHSEX_42
				+ ", QHSEX_43=" + QHSEX_43 + ", QHSEX_44=" + QHSEX_44 + ", QHSEX_45=" + QHSEX_45 + ", QHSEX_46="
				+ QHSEX_46 + ", QHSEX_47=" + QHSEX_47 + ", QHSEX_48=" + QHSEX_48 + ", QHSEX_49=" + QHSEX_49
				+ ", QHSEX_50=" + QHSEX_50 + ", QHRELAT_01=" + QHRELAT_01 + ", QHRELAT_02=" + QHRELAT_02
				+ ", QHRELAT_03=" + QHRELAT_03 + ", QHRELAT_04=" + QHRELAT_04 + ", QHRELAT_05=" + QHRELAT_05
				+ ", QHRELAT_06=" + QHRELAT_06 + ", QHRELAT_07=" + QHRELAT_07 + ", QHRELAT_08=" + QHRELAT_08
				+ ", QHRELAT_09=" + QHRELAT_09 + ", QHRELAT_10=" + QHRELAT_10 + ", QHRELAT_11=" + QHRELAT_11
				+ ", QHRELAT_12=" + QHRELAT_12 + ", QHRELAT_13=" + QHRELAT_13 + ", QHRELAT_14=" + QHRELAT_14
				+ ", QHRELAT_15=" + QHRELAT_15 + ", QHRELAT_16=" + QHRELAT_16 + ", QHRELAT_17=" + QHRELAT_17
				+ ", QHRELAT_18=" + QHRELAT_18 + ", QHRELAT_19=" + QHRELAT_19 + ", QHRELAT_20=" + QHRELAT_20
				+ ", QHRELAT_21=" + QHRELAT_21 + ", QHRELAT_22=" + QHRELAT_22 + ", QHRELAT_23=" + QHRELAT_23
				+ ", QHRELAT_24=" + QHRELAT_24 + ", QHRELAT_25=" + QHRELAT_25 + ", QHRELAT_26=" + QHRELAT_26
				+ ", QHRELAT_27=" + QHRELAT_27 + ", QHRELAT_28=" + QHRELAT_28 + ", QHRELAT_29=" + QHRELAT_29
				+ ", QHRELAT_30=" + QHRELAT_30 + ", QHRELAT_31=" + QHRELAT_31 + ", QHRELAT_32=" + QHRELAT_32
				+ ", QHRELAT_33=" + QHRELAT_33 + ", QHRELAT_34=" + QHRELAT_34 + ", QHRELAT_35=" + QHRELAT_35
				+ ", QHRELAT_36=" + QHRELAT_36 + ", QHRELAT_37=" + QHRELAT_37 + ", QHRELAT_38=" + QHRELAT_38
				+ ", QHRELAT_39=" + QHRELAT_39 + ", QHRELAT_40=" + QHRELAT_40 + ", QHRELAT_41=" + QHRELAT_41
				+ ", QHRELAT_42=" + QHRELAT_42 + ", QHRELAT_43=" + QHRELAT_43 + ", QHRELAT_44=" + QHRELAT_44
				+ ", QHRELAT_45=" + QHRELAT_45 + ", QHRELAT_46=" + QHRELAT_46 + ", QHRELAT_47=" + QHRELAT_47
				+ ", QHRELAT_48=" + QHRELAT_48 + ", QHRELAT_49=" + QHRELAT_49 + ", QHRELAT_50=" + QHRELAT_50
				+ ", QHMORE_01=" + QHMORE_01 + ", QHMORE_02=" + QHMORE_02 + ", QHMORE_03=" + QHMORE_03 + ", QHMORE_04="
				+ QHMORE_04 + ", QHMORE_05=" + QHMORE_05 + ", QHMORE_06=" + QHMORE_06 + ", QHMORE_07=" + QHMORE_07
				+ ", QHMORE_08=" + QHMORE_08 + ", QHMORE_09=" + QHMORE_09 + ", QHMORE_10=" + QHMORE_10 + ", QHMORE_11="
				+ QHMORE_11 + ", QHMORE_12=" + QHMORE_12 + ", QHMORE_13=" + QHMORE_13 + ", QHMORE_14=" + QHMORE_14
				+ ", QHMORE_15=" + QHMORE_15 + ", QHMORE_16=" + QHMORE_16 + ", QHMORE_17=" + QHMORE_17 + ", QHMORE_18="
				+ QHMORE_18 + ", QHMORE_19=" + QHMORE_19 + ", QHMORE_20=" + QHMORE_20 + ", QHMORE_21=" + QHMORE_21
				+ ", QHMORE_22=" + QHMORE_22 + ", QHMORE_23=" + QHMORE_23 + ", QHMORE_24=" + QHMORE_24 + ", QHMORE_25="
				+ QHMORE_25 + ", QHMORE_26=" + QHMORE_26 + ", QHMORE_27=" + QHMORE_27 + ", QHMORE_28=" + QHMORE_28
				+ ", QHMORE_29=" + QHMORE_29 + ", QHMORE_30=" + QHMORE_30 + ", QHMORE_31=" + QHMORE_31 + ", QHMORE_32="
				+ QHMORE_32 + ", QHMORE_33=" + QHMORE_33 + ", QHMORE_34=" + QHMORE_34 + ", QHMORE_35=" + QHMORE_35
				+ ", QHMORE_36=" + QHMORE_36 + ", QHMORE_37=" + QHMORE_37 + ", QHMORE_38=" + QHMORE_38 + ", QHMORE_39="
				+ QHMORE_39 + ", QHMORE_40=" + QHMORE_40 + ", QHMORE_41=" + QHMORE_41 + ", QHMORE_42=" + QHMORE_42
				+ ", QHMORE_43=" + QHMORE_43 + ", QHMORE_44=" + QHMORE_44 + ", QHMORE_45=" + QHMORE_45 + ", QHMORE_46="
				+ QHMORE_46 + ", QHMORE_47=" + QHMORE_47 + ", QHMORE_48=" + QHMORE_48 + ", QHMORE_49=" + QHMORE_49
				+ ", QHMORE_50=" + QHMORE_50 + "]";
	}

		
}
