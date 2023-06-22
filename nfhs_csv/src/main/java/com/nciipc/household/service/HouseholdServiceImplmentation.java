package com.nciipc.household.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nciipc.household.model.QHSEC01X;
import com.nciipc.household.model.QHSECOVER;
import com.nciipc.household.repository.QHSEC01XRepository;
import com.nciipc.household.repository.QHSECOVERRepository;

@Service
public class HouseholdServiceImplmentation implements HouseholdServiceInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7329552106213636174L;

	public static final Logger log = LoggerFactory.getLogger(HouseholdServiceImplmentation.class);

	public static final String source_qhsecover = "E:\\IIPS\\NFHS\\NFHS6 CSV Data\\NFHS6_HH_CSV\\QHSECOVER.CSV";

//	public static final String destination_qhsecover = "D:\\CDAC-Mumbai-Training\\NFHS-IIPCS -Project\\Nfhs_latest_data\\NFHS6 CSV Data\\datacopy\\ "+ LocalDate.now() +"QHSECOVER_Backup.CSV";

	public static final String source_qhsec01x = "E:\\IIPS\\NFHS\\NFHS6 CSV Data\\NFHS6_HH_CSV\\QHSEC01X.CSV";
	
	@Autowired
	private QHSECOVERRepository qhSeCoverRepository;
	
	@Autowired
	private QHSEC01XRepository qhSec01xRepository;
	
	@Override
	public void saveData_QHSECOVER() {
		log.info("In saveData_QHSECOVER() start");

		log.info("Truncate table before insertion of Data");
		try {
//			qhSeCoverRepository.truncateTable();
		} catch (Exception e) {
			log.error("Exception in truncateTable() :: {} ", e);
		}

		log.info("Inserting Data into table");
		String line = "";
		try {
			log.info("In saveData_QHSECOVER() try block");
			BufferedReader br = new BufferedReader(new FileReader(source_qhsecover));
			br.readLine();
			line = br.readLine();
			
			while (line != null) {
				String[] data = line.split(";");
				QHSECOVER qhseCover = new QHSECOVER();
				qhseCover.setQHQUEST(data[0]);
				qhseCover.setQHSTATE(data[1]);
				qhseCover.setQHDIST(data[2]);
				qhseCover.setQHPSU(data[3]);
				qhseCover.setQHNUMBER(data[4]);
				qhseCover.setQHINT(data[5]);
				qhseCover.setQHLN(data[6]);
				qhseCover.setQHTYPE(data[7]);
				qhseCover.setQHADDRESS(data[8]);
				qhseCover.setQHELIGM(data[9]);
				qhseCover.setQHCONTVISIT_1(data[10]);
				qhseCover.setQHCONTVISIT_2(data[11]);
				qhseCover.setQHCONTVISIT_3(data[12]);
				qhseCover.setQHCONTVISIT_4(data[13]);
				qhseCover.setQHCONTVISIT_5(data[14]);
				qhseCover.setQHINTD(data[15]);
				qhseCover.setQHINTM(data[16]);
				qhseCover.setQHINTY(data[17]);
				qhseCover.setQHINTNUM(data[18]);
				qhseCover.setQHRESULT(data[19]);
				qhseCover.setQHVISITS(data[20]);
				qhseCover.setQHCONSENT(data[21]);
				qhseCover.setQHMEMBER(data[22]);
				qhseCover.setQHWOMEN(data[23]);
				qhseCover.setQHMEN(data[24]);
				qhseCover.setQHRESP(data[25]);
				qhseCover.setQHSUPERV(data[26]);
				qhseCover.setQHBEGINH(data[27]);
				qhseCover.setQHBEGINM(data[28]);
				qhseCover.setQHBABIES(data[29]);
				qhseCover.setQHNOFAM(data[30]);
				qhseCover.setQHTEMP(data[31]);
				qhseCover.setQHNUMDV(data[32]);
				qhseCover.setQHENDH(data[33]);
				qhseCover.setQHENDM(data[34]);
				qhseCover.setQHLANGQ(data[35]);
				qhseCover.setQHLANGRM(data[36]);
				qhseCover.setQHLANGI(data[37]);
				qhseCover.setQHTRANSL(data[38]);
				qhseCover.setQHNURSE(data[39]);
				qhseCover.setQHFINISH(data[40]);
				qhseCover.setQHPROGV(data[41]);
				qhseCover.setQHHSTRUCT(data[42]);
				qhseCover.setQHDBS(data[43]);
				qhseCover.setQHCREFUSE(data[44]);
				qhseCover.setQHVCREFUSE_1(data[45]);
				qhseCover.setQHVCREFUSE_2(data[46]);
				qhseCover.setQHVCREFUSE_3(data[47]);
				qhseCover.setQHVCREFUSE_4(data[48]);
				qhseCover.setQHVCREFUSE_5(data[49]);

				qhSeCoverRepository.save(qhseCover);
				line = br.readLine();

			}
			br.close();
			log.info("In saveData_QHSECOVER() end");

//			log.info("To copy file from one data src to another");
//			try {
//				this.copyFile(source_qhsecover, destination_qhsecover);
//			} catch (Exception e) {
//				log.error("Exception in copyFile() :: {} ", e);
//			}
//			// Files.copy(Paths.get(source), Paths.get(destination));
		} catch (Exception e) {
			log.error("Exception in saveData_QHSECOVER() :: {} ", e);
		}
	}
	
	public void saveData_QHSEC01X() {
		log.info("In saveData_QHSEC01X() start");

		log.info("Truncate table before insertion of Data");
		try {
//			qhSeCoverRepository.truncateTable();
		} catch (Exception e) {
			log.error("Exception in truncateTable() :: {} ", e);
		}

		log.info("Inserting Data into table");
		String line = "";
		long i=0;
		try {
			log.info("In saveData_QHSEC01X() try block");
			BufferedReader br = new BufferedReader(new FileReader(source_qhsec01x));
			br.readLine();
			line = br.readLine();
			List<QHSEC01X> list=new ArrayList<QHSEC01X>();
			while (line != null) {
				String[] data = line.split(";");
				QHSEC01X obj = new QHSEC01X();
				obj.setQHQUEST(data[0]);
				obj.setQHSTATE(data[1]);
				obj.setQHDIST(data[2]);
				obj.setQHPSU(data[3]);
				obj.setQHNUMBER(data[4]);
				obj.setQHINT(data[5]);
				obj.setQHLN(data[6]);
				obj.setQHLINE_01(data[7]);
				obj.setQHLINE_02(data[8]);
				obj.setQHLINE_03(data[9]);
				obj.setQHLINE_04(data[10]);
				obj.setQHLINE_05(data[11]);
				obj.setQHLINE_06(data[12]);
				obj.setQHLINE_07(data[13]);
				obj.setQHLINE_08(data[14]);
				obj.setQHLINE_09(data[15]);
				obj.setQHLINE_10(data[16]);
				obj.setQHLINE_11(data[17]);
				obj.setQHLINE_12(data[18]);
				obj.setQHLINE_13(data[19]);
				obj.setQHLINE_14(data[20]);
				obj.setQHLINE_15(data[21]);
				obj.setQHLINE_16(data[22]);
				obj.setQHLINE_17(data[23]);
				obj.setQHLINE_18(data[24]);
				obj.setQHLINE_19(data[25]);
				obj.setQHLINE_20(data[26]);
				obj.setQHLINE_21(data[27]);
				obj.setQHLINE_22(data[28]);
				obj.setQHLINE_23(data[29]);
				obj.setQHLINE_24(data[30]);
				obj.setQHLINE_25(data[31]);
				obj.setQHLINE_26(data[32]);
				obj.setQHLINE_27(data[33]);
				obj.setQHLINE_28(data[34]);
				obj.setQHLINE_29(data[35]);
				obj.setQHLINE_30(data[36]);
				obj.setQHLINE_31(data[37]);
				obj.setQHLINE_32(data[38]);
				obj.setQHLINE_33(data[39]);
				obj.setQHLINE_34(data[40]);
				obj.setQHLINE_35(data[41]);
				obj.setQHLINE_36(data[42]);
				obj.setQHLINE_37(data[43]);
				obj.setQHLINE_38(data[44]);
				obj.setQHLINE_39(data[45]);
				obj.setQHLINE_40(data[46]);
				obj.setQHLINE_41(data[47]);
				obj.setQHLINE_42(data[48]);
				obj.setQHLINE_43(data[49]);
				obj.setQHLINE_44(data[50]);
				obj.setQHLINE_45(data[51]);
				obj.setQHLINE_46(data[52]);
				obj.setQHLINE_47(data[53]);
				obj.setQHLINE_48(data[54]);
				obj.setQHLINE_49(data[55]);
				obj.setQHLINE_50(data[56]);
				obj.setQHFIRSTN_01(data[57]);
				obj.setQHFIRSTN_02(data[58]);
				obj.setQHFIRSTN_03(data[59]);
				obj.setQHFIRSTN_04(data[60]);
				obj.setQHFIRSTN_05(data[61]);
				obj.setQHFIRSTN_06(data[62]);
				obj.setQHFIRSTN_07(data[63]);
				obj.setQHFIRSTN_08(data[64]);
				obj.setQHFIRSTN_09(data[65]);
				obj.setQHFIRSTN_10(data[66]);
				obj.setQHFIRSTN_11(data[67]);
				obj.setQHFIRSTN_12(data[68]);
				obj.setQHFIRSTN_13(data[69]);
				obj.setQHFIRSTN_14(data[70]);
				obj.setQHFIRSTN_15(data[71]);
				obj.setQHFIRSTN_16(data[72]);
				obj.setQHFIRSTN_17(data[73]);
				obj.setQHFIRSTN_18(data[74]);
				obj.setQHFIRSTN_19(data[75]);
				obj.setQHFIRSTN_20(data[76]);
				obj.setQHFIRSTN_21(data[77]);
				obj.setQHFIRSTN_22(data[78]);
				obj.setQHFIRSTN_23(data[79]);
				obj.setQHFIRSTN_24(data[80]);
				obj.setQHFIRSTN_25(data[81]);
				obj.setQHFIRSTN_26(data[82]);
				obj.setQHFIRSTN_27(data[83]);
				obj.setQHFIRSTN_28(data[84]);
				obj.setQHFIRSTN_29(data[85]);
				obj.setQHFIRSTN_30(data[86]);
				obj.setQHFIRSTN_31(data[87]);
				obj.setQHFIRSTN_32(data[88]);
				obj.setQHFIRSTN_33(data[89]);
				obj.setQHFIRSTN_34(data[90]);
				obj.setQHFIRSTN_35(data[91]);
				obj.setQHFIRSTN_36(data[92]);
				obj.setQHFIRSTN_37(data[93]);
				obj.setQHFIRSTN_38(data[94]);
				obj.setQHFIRSTN_39(data[95]);
				obj.setQHFIRSTN_40(data[96]);
				obj.setQHFIRSTN_41(data[97]);
				obj.setQHFIRSTN_42(data[98]);
				obj.setQHFIRSTN_43(data[99]);
				obj.setQHFIRSTN_44(data[100]);
				obj.setQHFIRSTN_45(data[101]);
				obj.setQHFIRSTN_46(data[102]);
				obj.setQHFIRSTN_47(data[103]);
				obj.setQHFIRSTN_48(data[104]);
				obj.setQHFIRSTN_49(data[105]);
				obj.setQHFIRSTN_50(data[106]);
				obj.setQHLASTN_01(data[107]);
				obj.setQHLASTN_02(data[108]);
				obj.setQHLASTN_03(data[109]);
				obj.setQHLASTN_04(data[110]);
				obj.setQHLASTN_05(data[111]);
				obj.setQHLASTN_06(data[112]);
				obj.setQHLASTN_07(data[113]);
				obj.setQHLASTN_08(data[114]);
				obj.setQHLASTN_09(data[115]);
				obj.setQHLASTN_10(data[116]);
				obj.setQHLASTN_11(data[117]);
				obj.setQHLASTN_12(data[118]);
				obj.setQHLASTN_13(data[119]);
				obj.setQHLASTN_14(data[120]);
				obj.setQHLASTN_15(data[121]);
				obj.setQHLASTN_16(data[122]);
				obj.setQHLASTN_17(data[123]);
				obj.setQHLASTN_18(data[124]);
				obj.setQHLASTN_19(data[125]);
				obj.setQHLASTN_20(data[126]);
				obj.setQHLASTN_21(data[127]);
				obj.setQHLASTN_22(data[128]);
				obj.setQHLASTN_23(data[129]);
				obj.setQHLASTN_24(data[130]);
				obj.setQHLASTN_25(data[131]);
				obj.setQHLASTN_26(data[132]);
				obj.setQHLASTN_27(data[133]);
				obj.setQHLASTN_28(data[134]);
				obj.setQHLASTN_29(data[135]);
				obj.setQHLASTN_30(data[136]);
				obj.setQHLASTN_31(data[137]);
				obj.setQHLASTN_32(data[138]);
				obj.setQHLASTN_33(data[139]);
				obj.setQHLASTN_34(data[140]);
				obj.setQHLASTN_35(data[141]);
				obj.setQHLASTN_36(data[142]);
				obj.setQHLASTN_37(data[143]);
				obj.setQHLASTN_38(data[144]);
				obj.setQHLASTN_39(data[145]);
				obj.setQHLASTN_40(data[146]);
				obj.setQHLASTN_41(data[147]);
				obj.setQHLASTN_42(data[148]);
				obj.setQHLASTN_43(data[149]);
				obj.setQHLASTN_44(data[150]);
				obj.setQHLASTN_45(data[151]);
				obj.setQHLASTN_46(data[152]);
				obj.setQHLASTN_47(data[153]);
				obj.setQHLASTN_48(data[154]);
				obj.setQHLASTN_49(data[155]);
				obj.setQHLASTN_50(data[156]);
				obj.setQHAGE_01(data[157]);
				obj.setQHAGE_02(data[158]);
				obj.setQHAGE_03(data[159]);
				obj.setQHAGE_04(data[160]);
				obj.setQHAGE_05(data[161]);
				obj.setQHAGE_06(data[162]);
				obj.setQHAGE_07(data[163]);
				obj.setQHAGE_08(data[164]);
				obj.setQHAGE_09(data[165]);
				obj.setQHAGE_10(data[166]);
				obj.setQHAGE_11(data[167]);
				obj.setQHAGE_12(data[168]);
				obj.setQHAGE_13(data[169]);
				obj.setQHAGE_14(data[170]);
				obj.setQHAGE_15(data[171]);
				obj.setQHAGE_16(data[172]);
				obj.setQHAGE_17(data[173]);
				obj.setQHAGE_18(data[174]);
				obj.setQHAGE_19(data[175]);
				obj.setQHAGE_20(data[176]);
				obj.setQHAGE_21(data[177]);
				obj.setQHAGE_22(data[178]);
				obj.setQHAGE_23(data[179]);
				obj.setQHAGE_24(data[180]);
				obj.setQHAGE_25(data[181]);
				obj.setQHAGE_26(data[182]);
				obj.setQHAGE_27(data[183]);
				obj.setQHAGE_28(data[184]);
				obj.setQHAGE_29(data[185]);
				obj.setQHAGE_30(data[186]);
				obj.setQHAGE_31(data[187]);
				obj.setQHAGE_32(data[188]);
				obj.setQHAGE_33(data[189]);
				obj.setQHAGE_34(data[190]);
				obj.setQHAGE_35(data[191]);
				obj.setQHAGE_36(data[192]);
				obj.setQHAGE_37(data[193]);
				obj.setQHAGE_38(data[194]);
				obj.setQHAGE_39(data[195]);
				obj.setQHAGE_40(data[196]);
				obj.setQHAGE_41(data[197]);
				obj.setQHAGE_42(data[198]);
				obj.setQHAGE_43(data[199]);
				obj.setQHAGE_44(data[200]);
				obj.setQHAGE_45(data[201]);
				obj.setQHAGE_46(data[202]);
				obj.setQHAGE_47(data[203]);
				obj.setQHAGE_48(data[204]);
				obj.setQHAGE_49(data[205]);
				obj.setQHAGE_50(data[206]);
				obj.setQHLIVES_01(data[207]);
				obj.setQHLIVES_02(data[208]);
				obj.setQHLIVES_03(data[209]);
				obj.setQHLIVES_04(data[210]);
				obj.setQHLIVES_05(data[211]);
				obj.setQHLIVES_06(data[212]);
				obj.setQHLIVES_07(data[213]);
				obj.setQHLIVES_08(data[214]);
				obj.setQHLIVES_09(data[215]);
				obj.setQHLIVES_10(data[216]);
				obj.setQHLIVES_11(data[217]);
				obj.setQHLIVES_12(data[218]);
				obj.setQHLIVES_13(data[219]);
				obj.setQHLIVES_14(data[220]);
				obj.setQHLIVES_15(data[221]);
				obj.setQHLIVES_16(data[222]);
				obj.setQHLIVES_17(data[223]);
				obj.setQHLIVES_18(data[224]);
				obj.setQHLIVES_19(data[225]);
				obj.setQHLIVES_20(data[226]);
				obj.setQHLIVES_21(data[227]);
				obj.setQHLIVES_22(data[228]);
				obj.setQHLIVES_23(data[229]);
				obj.setQHLIVES_24(data[230]);
				obj.setQHLIVES_25(data[231]);
				obj.setQHLIVES_26(data[232]);
				obj.setQHLIVES_27(data[233]);
				obj.setQHLIVES_28(data[234]);
				obj.setQHLIVES_29(data[235]);
				obj.setQHLIVES_30(data[236]);
				obj.setQHLIVES_31(data[237]);
				obj.setQHLIVES_32(data[238]);
				obj.setQHLIVES_33(data[239]);
				obj.setQHLIVES_34(data[240]);
				obj.setQHLIVES_35(data[241]);
				obj.setQHLIVES_36(data[242]);
				obj.setQHLIVES_37(data[243]);
				obj.setQHLIVES_38(data[244]);
				obj.setQHLIVES_39(data[245]);
				obj.setQHLIVES_40(data[246]);
				obj.setQHLIVES_41(data[247]);
				obj.setQHLIVES_42(data[248]);
				obj.setQHLIVES_43(data[249]);
				obj.setQHLIVES_44(data[250]);
				obj.setQHLIVES_45(data[251]);
				obj.setQHLIVES_46(data[252]);
				obj.setQHLIVES_47(data[253]);
				obj.setQHLIVES_48(data[254]);
				obj.setQHLIVES_49(data[255]);
				obj.setQHLIVES_50(data[256]);
				obj.setQHSLEPT_01(data[257]);
				obj.setQHSLEPT_02(data[258]);
				obj.setQHSLEPT_03(data[259]);
				obj.setQHSLEPT_04(data[260]);
				obj.setQHSLEPT_05(data[261]);
				obj.setQHSLEPT_06(data[262]);
				obj.setQHSLEPT_07(data[263]);
				obj.setQHSLEPT_08(data[264]);
				obj.setQHSLEPT_09(data[265]);
				obj.setQHSLEPT_10(data[266]);
				obj.setQHSLEPT_11(data[267]);
				obj.setQHSLEPT_12(data[268]);
				obj.setQHSLEPT_13(data[269]);
				obj.setQHSLEPT_14(data[270]);
				obj.setQHSLEPT_15(data[271]);
				obj.setQHSLEPT_16(data[272]);
				obj.setQHSLEPT_17(data[273]);
				obj.setQHSLEPT_18(data[274]);
				obj.setQHSLEPT_19(data[275]);
				obj.setQHSLEPT_20(data[276]);
				obj.setQHSLEPT_21(data[277]);
				obj.setQHSLEPT_22(data[278]);
				obj.setQHSLEPT_23(data[279]);
				obj.setQHSLEPT_24(data[280]);
				obj.setQHSLEPT_25(data[281]);
				obj.setQHSLEPT_26(data[282]);
				obj.setQHSLEPT_27(data[283]);
				obj.setQHSLEPT_28(data[284]);
				obj.setQHSLEPT_29(data[285]);
				obj.setQHSLEPT_30(data[286]);
				obj.setQHSLEPT_31(data[287]);
				obj.setQHSLEPT_32(data[288]);
				obj.setQHSLEPT_33(data[289]);
				obj.setQHSLEPT_34(data[290]);
				obj.setQHSLEPT_35(data[291]);
				obj.setQHSLEPT_36(data[292]);
				obj.setQHSLEPT_37(data[293]);
				obj.setQHSLEPT_38(data[294]);
				obj.setQHSLEPT_39(data[295]);
				obj.setQHSLEPT_40(data[296]);
				obj.setQHSLEPT_41(data[297]);
				obj.setQHSLEPT_42(data[298]);
				obj.setQHSLEPT_43(data[299]);
				obj.setQHSLEPT_44(data[300]);
				obj.setQHSLEPT_45(data[301]);
				obj.setQHSLEPT_46(data[302]);
				obj.setQHSLEPT_47(data[303]);
				obj.setQHSLEPT_48(data[304]);
				obj.setQHSLEPT_49(data[305]);
				obj.setQHSLEPT_50(data[306]);
				obj.setQHSEX_01(data[307]);
				obj.setQHSEX_02(data[308]);
				obj.setQHSEX_03(data[309]);
				obj.setQHSEX_04(data[310]);
				obj.setQHSEX_05(data[311]);
				obj.setQHSEX_06(data[312]);
				obj.setQHSEX_07(data[313]);
				obj.setQHSEX_08(data[314]);
				obj.setQHSEX_09(data[315]);
				obj.setQHSEX_10(data[316]);
				obj.setQHSEX_11(data[317]);
				obj.setQHSEX_12(data[318]);
				obj.setQHSEX_13(data[319]);
				obj.setQHSEX_14(data[320]);
				obj.setQHSEX_15(data[321]);
				obj.setQHSEX_16(data[322]);
				obj.setQHSEX_17(data[323]);
				obj.setQHSEX_18(data[324]);
				obj.setQHSEX_19(data[325]);
				obj.setQHSEX_20(data[326]);
				obj.setQHSEX_21(data[327]);
				obj.setQHSEX_22(data[328]);
				obj.setQHSEX_23(data[329]);
				obj.setQHSEX_24(data[330]);
				obj.setQHSEX_25(data[331]);
				obj.setQHSEX_26(data[332]);
				obj.setQHSEX_27(data[333]);
				obj.setQHSEX_28(data[334]);
				obj.setQHSEX_29(data[335]);
				obj.setQHSEX_30(data[336]);
				obj.setQHSEX_31(data[337]);
				obj.setQHSEX_32(data[338]);
				obj.setQHSEX_33(data[339]);
				obj.setQHSEX_34(data[340]);
				obj.setQHSEX_35(data[341]);
				obj.setQHSEX_36(data[342]);
				obj.setQHSEX_37(data[343]);
				obj.setQHSEX_38(data[344]);
				obj.setQHSEX_39(data[345]);
				obj.setQHSEX_40(data[346]);
				obj.setQHSEX_41(data[347]);
				obj.setQHSEX_42(data[348]);
				obj.setQHSEX_43(data[349]);
				obj.setQHSEX_44(data[350]);
				obj.setQHSEX_45(data[351]);
				obj.setQHSEX_46(data[352]);
				obj.setQHSEX_47(data[353]);
				obj.setQHSEX_48(data[354]);
				obj.setQHSEX_49(data[355]);
				obj.setQHSEX_50(data[356]);
				obj.setQHRELAT_01(data[357]);
				obj.setQHRELAT_02(data[358]);
				obj.setQHRELAT_03(data[359]);
				obj.setQHRELAT_04(data[360]);
				obj.setQHRELAT_05(data[361]);
				obj.setQHRELAT_06(data[362]);
				obj.setQHRELAT_07(data[363]);
				obj.setQHRELAT_08(data[364]);
				obj.setQHRELAT_09(data[365]);
				obj.setQHRELAT_10(data[366]);
				obj.setQHRELAT_11(data[367]);
				obj.setQHRELAT_12(data[368]);
				obj.setQHRELAT_13(data[369]);
				obj.setQHRELAT_14(data[370]);
				obj.setQHRELAT_15(data[371]);
				obj.setQHRELAT_16(data[372]);
				obj.setQHRELAT_17(data[373]);
				obj.setQHRELAT_18(data[374]);
				obj.setQHRELAT_19(data[375]);
				obj.setQHRELAT_20(data[376]);
				obj.setQHRELAT_21(data[377]);
				obj.setQHRELAT_22(data[378]);
				obj.setQHRELAT_23(data[379]);
				obj.setQHRELAT_24(data[380]);
				obj.setQHRELAT_25(data[381]);
				obj.setQHRELAT_26(data[382]);
				obj.setQHRELAT_27(data[383]);
				obj.setQHRELAT_28(data[384]);
				obj.setQHRELAT_29(data[385]);
				obj.setQHRELAT_30(data[386]);
				obj.setQHRELAT_31(data[387]);
				obj.setQHRELAT_32(data[388]);
				obj.setQHRELAT_33(data[389]);
				obj.setQHRELAT_34(data[390]);
				obj.setQHRELAT_35(data[391]);
				obj.setQHRELAT_36(data[392]);
				obj.setQHRELAT_37(data[393]);
				obj.setQHRELAT_38(data[394]);
				obj.setQHRELAT_39(data[395]);
				obj.setQHRELAT_40(data[396]);
				obj.setQHRELAT_41(data[397]);
				obj.setQHRELAT_42(data[398]);
				obj.setQHRELAT_43(data[399]);
				obj.setQHRELAT_44(data[400]);
				obj.setQHRELAT_45(data[401]);
				obj.setQHRELAT_46(data[402]);
				obj.setQHRELAT_47(data[403]);
				obj.setQHRELAT_48(data[404]);
				obj.setQHRELAT_49(data[405]);
				obj.setQHRELAT_50(data[406]);
				obj.setQHMORE_01(data[407]);
				obj.setQHMORE_02(data[408]);
				obj.setQHMORE_03(data[409]);
				obj.setQHMORE_04(data[410]);
				obj.setQHMORE_05(data[411]);
				obj.setQHMORE_06(data[412]);
				obj.setQHMORE_07(data[413]);
				obj.setQHMORE_08(data[414]);
				obj.setQHMORE_09(data[415]);
				obj.setQHMORE_10(data[416]);
				obj.setQHMORE_11(data[417]);
				obj.setQHMORE_12(data[418]);
				obj.setQHMORE_13(data[419]);
				obj.setQHMORE_14(data[420]);
				obj.setQHMORE_15(data[421]);
				obj.setQHMORE_16(data[422]);
				obj.setQHMORE_17(data[423]);
				obj.setQHMORE_18(data[424]);
				obj.setQHMORE_19(data[425]);
				obj.setQHMORE_20(data[426]);
				obj.setQHMORE_21(data[427]);
				obj.setQHMORE_22(data[428]);
				obj.setQHMORE_23(data[429]);
				obj.setQHMORE_24(data[430]);
				obj.setQHMORE_25(data[431]);
				obj.setQHMORE_26(data[432]);
				obj.setQHMORE_27(data[433]);
				obj.setQHMORE_28(data[434]);
				obj.setQHMORE_29(data[435]);
				obj.setQHMORE_30(data[436]);
				obj.setQHMORE_31(data[437]);
				obj.setQHMORE_32(data[438]);
				obj.setQHMORE_33(data[439]);
				obj.setQHMORE_34(data[440]);
				obj.setQHMORE_35(data[441]);
				obj.setQHMORE_36(data[442]);
				obj.setQHMORE_37(data[443]);
				obj.setQHMORE_38(data[444]);
				obj.setQHMORE_39(data[445]);
				obj.setQHMORE_40(data[446]);
				obj.setQHMORE_41(data[447]);
				obj.setQHMORE_42(data[448]);
				obj.setQHMORE_43(data[449]);
				obj.setQHMORE_44(data[450]);
				obj.setQHMORE_45(data[451]);
				obj.setQHMORE_46(data[452]);
				obj.setQHMORE_47(data[453]);
				obj.setQHMORE_48(data[454]);
				obj.setQHMORE_49(data[455]);
				obj.setQHMORE_50(data[456]);

				//qhSec01xRepository.save(obj);
				list.add(obj);
				line = br.readLine();
				i++;
				log.info("Object loop : "+i);
				
			}
			log.info("Size of list size : "+list.size());
			qhSec01xRepository.saveAll(list);
			br.close();
			log.info("In saveData_QHSEC01X() end");

//			log.info("To copy file from one data src to another");
//			try {
//				this.copyFile(source_qhsecover, destination_qhsecover);
//			} catch (Exception e) {
//				log.error("Exception in copyFile() :: {} ", e);
//			}
//			// Files.copy(Paths.get(source), Paths.get(destination));
		} catch (Exception e) {
			log.error("Exception in saveData_QHSEC01X() :: {} ", e);
		}
	}
	
	
	@Override
	public List<QHSECOVER> getData_QHSECOVER() {
		log.info("In getData() Service layer start");

		List<QHSECOVER> data = null;
		try {
			log.info("In getData() try block");
			data = qhSeCoverRepository.findAll();
		} catch (Exception e) {
			log.error("Exception in getData()  :: {} ", e);
		}
		return data;
	}

	/**
	 * * Java 7 way to copy a file from one location to another * @param from
	 * * @param to * @throws IOException
	 */
	public void copyFile(String from, String to) throws IOException {
		log.info("In copyFile()");
		Path src = Paths.get(from);
		Path dest = Paths.get(to);
		try {
			Files.copy(src, dest);
		} catch (Exception e) {
			log.error("Exception in Files.copy() :: {} ", e);
		}
	}

}
