package com.nciipc.household.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="household_qhsecover")
public class QHSECOVER {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="qhsecover_id", nullable=false)
	private Long id;
	
	@Column
	private String QHQUEST, QHSTATE, QHDIST, QHPSU, QHNUMBER, QHINT, QHLN, QHTYPE, QHADDRESS, QHELIGM, QHCONTVISIT_1,
			QHCONTVISIT_2, QHCONTVISIT_3, QHCONTVISIT_4, QHCONTVISIT_5, QHINTD, QHINTM, QHINTY, QHINTNUM, QHRESULT,
			QHVISITS, QHCONSENT, QHMEMBER, QHWOMEN, QHMEN, QHRESP, QHSUPERV, QHBEGINH, QHBEGINM, QHBABIES, QHNOFAM,
			QHTEMP, QHNUMDV, QHENDH, QHENDM, QHLANGQ, QHLANGRM, QHLANGI, QHTRANSL, QHNURSE, QHFINISH, QHPROGV,
			QHHSTRUCT, QHDBS, QHCREFUSE, QHVCREFUSE_1, QHVCREFUSE_2, QHVCREFUSE_3, QHVCREFUSE_4, QHVCREFUSE_5;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQHQUEST() {
		return QHQUEST;
	}

	public void setQHQUEST(String qHQUEST) {
		QHQUEST = qHQUEST;
	}

	public String getQHSTATE() {
		return QHSTATE;
	}

	public void setQHSTATE(String qHSTATE) {
		QHSTATE = qHSTATE;
	}

	public String getQHDIST() {
		return QHDIST;
	}

	public void setQHDIST(String qHDIST) {
		QHDIST = qHDIST;
	}

	public String getQHPSU() {
		return QHPSU;
	}

	public void setQHPSU(String qHPSU) {
		QHPSU = qHPSU;
	}

	public String getQHNUMBER() {
		return QHNUMBER;
	}

	public void setQHNUMBER(String qHNUMBER) {
		QHNUMBER = qHNUMBER;
	}

	public String getQHINT() {
		return QHINT;
	}

	public void setQHINT(String qHINT) {
		QHINT = qHINT;
	}

	public String getQHLN() {
		return QHLN;
	}

	public void setQHLN(String qHLN) {
		QHLN = qHLN;
	}

	public String getQHTYPE() {
		return QHTYPE;
	}

	public void setQHTYPE(String qHTYPE) {
		QHTYPE = qHTYPE;
	}

	public String getQHADDRESS() {
		return QHADDRESS;
	}

	public void setQHADDRESS(String qHADDRESS) {
		QHADDRESS = qHADDRESS;
	}

	public String getQHELIGM() {
		return QHELIGM;
	}

	public void setQHELIGM(String qHELIGM) {
		QHELIGM = qHELIGM;
	}

	public String getQHCONTVISIT_1() {
		return QHCONTVISIT_1;
	}

	public void setQHCONTVISIT_1(String qHCONTVISIT_1) {
		QHCONTVISIT_1 = qHCONTVISIT_1;
	}

	public String getQHCONTVISIT_2() {
		return QHCONTVISIT_2;
	}

	public void setQHCONTVISIT_2(String qHCONTVISIT_2) {
		QHCONTVISIT_2 = qHCONTVISIT_2;
	}

	public String getQHCONTVISIT_3() {
		return QHCONTVISIT_3;
	}

	public void setQHCONTVISIT_3(String qHCONTVISIT_3) {
		QHCONTVISIT_3 = qHCONTVISIT_3;
	}

	public String getQHCONTVISIT_4() {
		return QHCONTVISIT_4;
	}

	public void setQHCONTVISIT_4(String qHCONTVISIT_4) {
		QHCONTVISIT_4 = qHCONTVISIT_4;
	}

	public String getQHCONTVISIT_5() {
		return QHCONTVISIT_5;
	}

	public void setQHCONTVISIT_5(String qHCONTVISIT_5) {
		QHCONTVISIT_5 = qHCONTVISIT_5;
	}

	public String getQHINTD() {
		return QHINTD;
	}

	public void setQHINTD(String qHINTD) {
		QHINTD = qHINTD;
	}

	public String getQHINTM() {
		return QHINTM;
	}

	public void setQHINTM(String qHINTM) {
		QHINTM = qHINTM;
	}

	public String getQHINTY() {
		return QHINTY;
	}

	public void setQHINTY(String qHINTY) {
		QHINTY = qHINTY;
	}

	public String getQHINTNUM() {
		return QHINTNUM;
	}

	public void setQHINTNUM(String qHINTNUM) {
		QHINTNUM = qHINTNUM;
	}

	public String getQHRESULT() {
		return QHRESULT;
	}

	public void setQHRESULT(String qHRESULT) {
		QHRESULT = qHRESULT;
	}

	public String getQHVISITS() {
		return QHVISITS;
	}

	public void setQHVISITS(String qHVISITS) {
		QHVISITS = qHVISITS;
	}

	public String getQHCONSENT() {
		return QHCONSENT;
	}

	public void setQHCONSENT(String qHCONSENT) {
		QHCONSENT = qHCONSENT;
	}

	public String getQHMEMBER() {
		return QHMEMBER;
	}

	public void setQHMEMBER(String qHMEMBER) {
		QHMEMBER = qHMEMBER;
	}

	public String getQHWOMEN() {
		return QHWOMEN;
	}

	public void setQHWOMEN(String qHWOMEN) {
		QHWOMEN = qHWOMEN;
	}

	public String getQHMEN() {
		return QHMEN;
	}

	public void setQHMEN(String qHMEN) {
		QHMEN = qHMEN;
	}

	public String getQHRESP() {
		return QHRESP;
	}

	public void setQHRESP(String qHRESP) {
		QHRESP = qHRESP;
	}

	public String getQHSUPERV() {
		return QHSUPERV;
	}

	public void setQHSUPERV(String qHSUPERV) {
		QHSUPERV = qHSUPERV;
	}

	public String getQHBEGINH() {
		return QHBEGINH;
	}

	public void setQHBEGINH(String qHBEGINH) {
		QHBEGINH = qHBEGINH;
	}

	public String getQHBEGINM() {
		return QHBEGINM;
	}

	public void setQHBEGINM(String qHBEGINM) {
		QHBEGINM = qHBEGINM;
	}

	public String getQHBABIES() {
		return QHBABIES;
	}

	public void setQHBABIES(String qHBABIES) {
		QHBABIES = qHBABIES;
	}

	public String getQHNOFAM() {
		return QHNOFAM;
	}

	public void setQHNOFAM(String qHNOFAM) {
		QHNOFAM = qHNOFAM;
	}

	public String getQHTEMP() {
		return QHTEMP;
	}

	public void setQHTEMP(String qHTEMP) {
		QHTEMP = qHTEMP;
	}

	public String getQHNUMDV() {
		return QHNUMDV;
	}

	public void setQHNUMDV(String qHNUMDV) {
		QHNUMDV = qHNUMDV;
	}

	public String getQHENDH() {
		return QHENDH;
	}

	public void setQHENDH(String qHENDH) {
		QHENDH = qHENDH;
	}

	public String getQHENDM() {
		return QHENDM;
	}

	public void setQHENDM(String qHENDM) {
		QHENDM = qHENDM;
	}

	public String getQHLANGQ() {
		return QHLANGQ;
	}

	public void setQHLANGQ(String qHLANGQ) {
		QHLANGQ = qHLANGQ;
	}

	public String getQHLANGRM() {
		return QHLANGRM;
	}

	public void setQHLANGRM(String qHLANGRM) {
		QHLANGRM = qHLANGRM;
	}

	public String getQHLANGI() {
		return QHLANGI;
	}

	public void setQHLANGI(String qHLANGI) {
		QHLANGI = qHLANGI;
	}

	public String getQHTRANSL() {
		return QHTRANSL;
	}

	public void setQHTRANSL(String qHTRANSL) {
		QHTRANSL = qHTRANSL;
	}

	public String getQHNURSE() {
		return QHNURSE;
	}

	public void setQHNURSE(String qHNURSE) {
		QHNURSE = qHNURSE;
	}

	public String getQHFINISH() {
		return QHFINISH;
	}

	public void setQHFINISH(String qHFINISH) {
		QHFINISH = qHFINISH;
	}

	public String getQHPROGV() {
		return QHPROGV;
	}

	public void setQHPROGV(String qHPROGV) {
		QHPROGV = qHPROGV;
	}

	public String getQHHSTRUCT() {
		return QHHSTRUCT;
	}

	public void setQHHSTRUCT(String qHHSTRUCT) {
		QHHSTRUCT = qHHSTRUCT;
	}

	public String getQHDBS() {
		return QHDBS;
	}

	public void setQHDBS(String qHDBS) {
		QHDBS = qHDBS;
	}

	public String getQHCREFUSE() {
		return QHCREFUSE;
	}

	public void setQHCREFUSE(String qHCREFUSE) {
		QHCREFUSE = qHCREFUSE;
	}

	public String getQHVCREFUSE_1() {
		return QHVCREFUSE_1;
	}

	public void setQHVCREFUSE_1(String qHVCREFUSE_1) {
		QHVCREFUSE_1 = qHVCREFUSE_1;
	}

	public String getQHVCREFUSE_2() {
		return QHVCREFUSE_2;
	}

	public void setQHVCREFUSE_2(String qHVCREFUSE_2) {
		QHVCREFUSE_2 = qHVCREFUSE_2;
	}

	public String getQHVCREFUSE_3() {
		return QHVCREFUSE_3;
	}

	public void setQHVCREFUSE_3(String qHVCREFUSE_3) {
		QHVCREFUSE_3 = qHVCREFUSE_3;
	}

	public String getQHVCREFUSE_4() {
		return QHVCREFUSE_4;
	}

	public void setQHVCREFUSE_4(String qHVCREFUSE_4) {
		QHVCREFUSE_4 = qHVCREFUSE_4;
	}

	public String getQHVCREFUSE_5() {
		return QHVCREFUSE_5;
	}

	public void setQHVCREFUSE_5(String qHVCREFUSE_5) {
		QHVCREFUSE_5 = qHVCREFUSE_5;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "QHSECOVER [id=" + id + ", QHQUEST=" + QHQUEST + ", QHSTATE=" + QHSTATE + ", QHDIST=" + QHDIST
				+ ", QHPSU=" + QHPSU + ", QHNUMBER=" + QHNUMBER + ", QHINT=" + QHINT + ", QHLN=" + QHLN + ", QHTYPE="
				+ QHTYPE + ", QHADDRESS=" + QHADDRESS + ", QHELIGM=" + QHELIGM + ", QHCONTVISIT_1=" + QHCONTVISIT_1
				+ ", QHCONTVISIT_2=" + QHCONTVISIT_2 + ", QHCONTVISIT_3=" + QHCONTVISIT_3 + ", QHCONTVISIT_4="
				+ QHCONTVISIT_4 + ", QHCONTVISIT_5=" + QHCONTVISIT_5 + ", QHINTD=" + QHINTD + ", QHINTM=" + QHINTM
				+ ", QHINTY=" + QHINTY + ", QHINTNUM=" + QHINTNUM + ", QHRESULT=" + QHRESULT + ", QHVISITS=" + QHVISITS
				+ ", QHCONSENT=" + QHCONSENT + ", QHMEMBER=" + QHMEMBER + ", QHWOMEN=" + QHWOMEN + ", QHMEN=" + QHMEN
				+ ", QHRESP=" + QHRESP + ", QHSUPERV=" + QHSUPERV + ", QHBEGINH=" + QHBEGINH + ", QHBEGINM=" + QHBEGINM
				+ ", QHBABIES=" + QHBABIES + ", QHNOFAM=" + QHNOFAM + ", QHTEMP=" + QHTEMP + ", QHNUMDV=" + QHNUMDV
				+ ", QHENDH=" + QHENDH + ", QHENDM=" + QHENDM + ", QHLANGQ=" + QHLANGQ + ", QHLANGRM=" + QHLANGRM
				+ ", QHLANGI=" + QHLANGI + ", QHTRANSL=" + QHTRANSL + ", QHNURSE=" + QHNURSE + ", QHFINISH=" + QHFINISH
				+ ", QHPROGV=" + QHPROGV + ", QHHSTRUCT=" + QHHSTRUCT + ", QHDBS=" + QHDBS + ", QHCREFUSE=" + QHCREFUSE
				+ ", QHVCREFUSE_1=" + QHVCREFUSE_1 + ", QHVCREFUSE_2=" + QHVCREFUSE_2 + ", QHVCREFUSE_3=" + QHVCREFUSE_3
				+ ", QHVCREFUSE_4=" + QHVCREFUSE_4 + ", QHVCREFUSE_5=" + QHVCREFUSE_5 + ", getId()=" + getId()
				+ ", getQHQUEST()=" + getQHQUEST() + ", getQHSTATE()=" + getQHSTATE() + ", getQHDIST()=" + getQHDIST()
				+ ", getQHPSU()=" + getQHPSU() + ", getQHNUMBER()=" + getQHNUMBER() + ", getQHINT()=" + getQHINT()
				+ ", getQHLN()=" + getQHLN() + ", getQHTYPE()=" + getQHTYPE() + ", getQHADDRESS()=" + getQHADDRESS()
				+ ", getQHELIGM()=" + getQHELIGM() + ", getQHCONTVISIT_1()=" + getQHCONTVISIT_1()
				+ ", getQHCONTVISIT_2()=" + getQHCONTVISIT_2() + ", getQHCONTVISIT_3()=" + getQHCONTVISIT_3()
				+ ", getQHCONTVISIT_4()=" + getQHCONTVISIT_4() + ", getQHCONTVISIT_5()=" + getQHCONTVISIT_5()
				+ ", getQHINTD()=" + getQHINTD() + ", getQHINTM()=" + getQHINTM() + ", getQHINTY()=" + getQHINTY()
				+ ", getQHINTNUM()=" + getQHINTNUM() + ", getQHRESULT()=" + getQHRESULT() + ", getQHVISITS()="
				+ getQHVISITS() + ", getQHCONSENT()=" + getQHCONSENT() + ", getQHMEMBER()=" + getQHMEMBER()
				+ ", getQHWOMEN()=" + getQHWOMEN() + ", getQHMEN()=" + getQHMEN() + ", getQHRESP()=" + getQHRESP()
				+ ", getQHSUPERV()=" + getQHSUPERV() + ", getQHBEGINH()=" + getQHBEGINH() + ", getQHBEGINM()="
				+ getQHBEGINM() + ", getQHBABIES()=" + getQHBABIES() + ", getQHNOFAM()=" + getQHNOFAM()
				+ ", getQHTEMP()=" + getQHTEMP() + ", getQHNUMDV()=" + getQHNUMDV() + ", getQHENDH()=" + getQHENDH()
				+ ", getQHENDM()=" + getQHENDM() + ", getQHLANGQ()=" + getQHLANGQ() + ", getQHLANGRM()=" + getQHLANGRM()
				+ ", getQHLANGI()=" + getQHLANGI() + ", getQHTRANSL()=" + getQHTRANSL() + ", getQHNURSE()="
				+ getQHNURSE() + ", getQHFINISH()=" + getQHFINISH() + ", getQHPROGV()=" + getQHPROGV()
				+ ", getQHHSTRUCT()=" + getQHHSTRUCT() + ", getQHDBS()=" + getQHDBS() + ", getQHCREFUSE()="
				+ getQHCREFUSE() + ", getQHVCREFUSE_1()=" + getQHVCREFUSE_1() + ", getQHVCREFUSE_2()="
				+ getQHVCREFUSE_2() + ", getQHVCREFUSE_3()=" + getQHVCREFUSE_3() + ", getQHVCREFUSE_4()="
				+ getQHVCREFUSE_4() + ", getQHVCREFUSE_5()=" + getQHVCREFUSE_5() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}