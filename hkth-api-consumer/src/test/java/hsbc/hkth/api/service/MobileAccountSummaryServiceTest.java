package hsbc.hkth.api.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class MobileAccountSummaryServiceTest {

	String expectedResponse = "{'body':{'entities':[{'accountGroups':[{'accounts':[{'desc':'Super Ease','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-029784-288','type':'SEE','id':'001029784288~~SS~~SEE~~HKD~~Super Ease~~DDA~~2C288HKD       HKDSSSEE','balance':'-3,998.45','drCr':true,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-061928-001','type':'CUA','id':'001061928001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'9,785,575.70','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-062132-001','type':'CUA','id':'001062132001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'9,991,814.76','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-062678-001','type':'CUA','id':'001062678001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'9,941,652.77','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-063510-001','type':'CUA','id':'001063510001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'10,000,767.98','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-063742-001','type':'CUA','id':'001063742001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'10,001,445.00','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-063825-001','type':'CUA','id':'001063825001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'10,000,212.98','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-064419-001','type':'CUA','id':'001064419001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'10,010,063.00','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-064914-001','type':'CUA','id':'001064914001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'9,994,985.00','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-065077-001','type':'CUA','id':'001065077001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'9,999,800.00','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-065143-001','type':'CUA','id':'001065143001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'9,998,901.00','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-065549-001','type':'CUA','id':'001065549001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'9,995,000.00','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-065994-001','type':'CUA','id':'001065994001~~SS~~CUA~~HKD~~HKD Current~~DDA~~2C001HKD       HKDSSCUA','balance':'9,976,272.00','drCr':false,'hasAcctDtl':true},{'desc':'HSBC Premier','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-072487-888','type':'MST','id':'001072487888~~AV~~MST~~HKD~~HSBC Premier~~DDA~~2B888HKD       HKDAVMST','balance':'','drCr':false,'hasAcctDtl':false},{'desc':'HKD Savings','hasParent':true,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~HKD~~HSBC Premier HKD Savings~~DDA~~2A888HKD       HKDAVSAV','balance':'68,776,514.04','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':true,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-072487-888','type':'CUA','id':'001072487888~~AV~~CUA~~HKD~~HSBC Premier HKD Current~~DDA~~2C888HKD       HKDAVCUA','balance':'-2,617,370.80','drCr':true,'hasAcctDtl':true},{'desc':'AUD Savings','hasParent':true,'ccy':{'desc':'','code':'AUD'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~AUD~~HSBC Premier AUD Savings~~DDA~~2F888AUD       AUDAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'CAD Savings','hasParent':true,'ccy':{'desc':'','code':'CAD'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~CAD~~HSBC Premier CAD Savings~~DDA~~2F888CAD       CADAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'CHF Savings','hasParent':true,'ccy':{'desc':'','code':'CHF'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~CHF~~HSBC Premier CHF Savings~~DDA~~2F888CHF       CHFAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'RMB Savings','hasParent':true,'ccy':{'desc':'','code':'CNY'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~CNY~~HSBC Premier RMB Savings~~DDA~~2F888CNY       CNYAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'EUR Savings','hasParent':true,'ccy':{'desc':'','code':'EUR'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~EUR~~HSBC Premier EUR Savings~~DDA~~2F888EUR       EURAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'GBP Savings','hasParent':true,'ccy':{'desc':'','code':'GBP'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~GBP~~HSBC Premier GBP Savings~~DDA~~2F888GBP       GBPAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'JPY Savings','hasParent':true,'ccy':{'desc':'','code':'JPY'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~JPY~~HSBC Premier JPY Savings~~DDA~~2F888JPY       JPYAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'NZD Savings','hasParent':true,'ccy':{'desc':'','code':'NZD'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~NZD~~HSBC Premier NZD Savings~~DDA~~2F888NZD       NZDAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'SGD Savings','hasParent':true,'ccy':{'desc':'','code':'SGD'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~SGD~~HSBC Premier SGD Savings~~DDA~~2F888SGD       SGDAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'USD Savings','hasParent':true,'ccy':{'desc':'','code':'USD'},'accountNum':'001-072487-888','type':'SAV','id':'001072487888~~AV~~SAV~~USD~~HSBC Premier USD Savings~~DDA~~2F888USD       USDAVSAV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'Time Deposit','hasParent':true,'ccy':{'desc':'','code':'   '},'accountNum':'001-072487-888','type':'TMS','id':'0010724878880000~~AV~~TMS~~   ~~HSBC Premier Time Deposit~~DDA~~4T888             AVTMS','balance':'Details','drCr':false,'hasAcctDtl':true},{'desc':'Investment Services','hasParent':true,'ccy':{'desc':'','code':'HKD'},'accountNum':'001-072487-888','type':'INV','id':'001072487888~~AV~~INV~~HKD~~HSBC Premier Investment Services~~DDA~~2R888HKD       HKDAVINV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'HSBC Premier','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'004-291209-888','type':'MST','id':'004291209888~~AV~~MST~~HKD~~HSBC Premier~~DDA~~2B888HKD       HKDAVMST','balance':'','drCr':false,'hasAcctDtl':false},{'desc':'HKD Savings','hasParent':true,'ccy':{'desc':'','code':'HKD'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~HKD~~HSBC Premier HKD Savings~~DDA~~2A888HKD       HKDAVSAV','balance':'16,649,139.80','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':true,'ccy':{'desc':'','code':'HKD'},'accountNum':'004-291209-888','type':'CUA','id':'004291209888~~AV~~CUA~~HKD~~HSBC Premier HKD Current~~DDA~~2C888HKD       HKDAVCUA','balance':'40,945,115.15','drCr':false,'hasAcctDtl':true},{'desc':'AUD Savings','hasParent':true,'ccy':{'desc':'','code':'AUD'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~AUD~~HSBC Premier AUD Savings~~DDA~~2F888AUD       AUDAVSAV','balance':'928.18','drCr':false,'hasAcctDtl':true},{'desc':'CAD Savings','hasParent':true,'ccy':{'desc':'','code':'CAD'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~CAD~~HSBC Premier CAD Savings~~DDA~~2F888CAD       CADAVSAV','balance':'100,045.27','drCr':false,'hasAcctDtl':true},{'desc':'CHF Savings','hasParent':true,'ccy':{'desc':'','code':'CHF'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~CHF~~HSBC Premier CHF Savings~~DDA~~2F888CHF       CHFAVSAV','balance':'1,129.92','drCr':false,'hasAcctDtl':true},{'desc':'EUR Savings','hasParent':true,'ccy':{'desc':'','code':'EUR'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~EUR~~HSBC Premier EUR Savings~~DDA~~2F888EUR       EURAVSAV','balance':'10.34','drCr':false,'hasAcctDtl':true},{'desc':'GBP Savings','hasParent':true,'ccy':{'desc':'','code':'GBP'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~GBP~~HSBC Premier GBP Savings~~DDA~~2F888GBP       GBPAVSAV','balance':'706.49','drCr':false,'hasAcctDtl':true},{'desc':'JPY Savings','hasParent':true,'ccy':{'desc':'','code':'JPY'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~JPY~~HSBC Premier JPY Savings~~DDA~~2F888JPY       JPYAVSAV','balance':'726,817','drCr':false,'hasAcctDtl':true},{'desc':'NZD Savings','hasParent':true,'ccy':{'desc':'','code':'NZD'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~NZD~~HSBC Premier NZD Savings~~DDA~~2F888NZD       NZDAVSAV','balance':'100,593.39','drCr':false,'hasAcctDtl':true},{'desc':'SGD Savings','hasParent':true,'ccy':{'desc':'','code':'SGD'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~SGD~~HSBC Premier SGD Savings~~DDA~~2F888SGD       SGDAVSAV','balance':'10.00','drCr':false,'hasAcctDtl':true},{'desc':'USD Savings','hasParent':true,'ccy':{'desc':'','code':'USD'},'accountNum':'004-291209-888','type':'SAV','id':'004291209888~~AV~~SAV~~USD~~HSBC Premier USD Savings~~DDA~~2F888USD       USDAVSAV','balance':'82,751.56','drCr':false,'hasAcctDtl':true},{'desc':'Time Deposit','hasParent':true,'ccy':{'desc':'','code':'   '},'accountNum':'004-291209-888','type':'TMS','id':'0042912098880000~~AV~~TMS~~   ~~HSBC Premier Time Deposit~~DDA~~4T888             AVTMS','balance':'Details','drCr':false,'hasAcctDtl':true},{'desc':'Investment Services','hasParent':true,'ccy':{'desc':'','code':'HKD'},'accountNum':'004-291209-888','type':'INVS','id':'004291209888~~AV~~INV~~HKD~~HSBC Premier Investment Services~~DDA~~2R888HKD       HKDAVINV','balance':'Details','drCr':false,'hasAcctDtl':true},{'desc':'HSBC Premier','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'608-500203-888','type':'MST','id':'608500203888~~AV~~MST~~HKD~~HSBC Premier~~DDA~~2B888HKD       HKDAVMST','balance':'','drCr':false,'hasAcctDtl':false},{'desc':'HKD Savings','hasParent':true,'ccy':{'desc':'','code':'HKD'},'accountNum':'608-500203-888','type':'SAV','id':'608500203888~~AV~~SAV~~HKD~~HSBC Premier HKD Savings~~DDA~~2A888HKD       HKDAVSAV','balance':'40.00','drCr':false,'hasAcctDtl':true},{'desc':'HKD Current','hasParent':true,'ccy':{'desc':'','code':'HKD'},'accountNum':'608-500203-888','type':'CUA','id':'608500203888~~AV~~CUA~~HKD~~HSBC Premier HKD Current~~DDA~~2C888HKD       HKDAVCUA','balance':'854.00','drCr':false,'hasAcctDtl':true},{'desc':'CAD Savings','hasParent':true,'ccy':{'desc':'','code':'CAD'},'accountNum':'608-500203-888','type':'SAV','id':'608500203888~~AV~~SAV~~CAD~~HSBC Premier CAD Savings~~DDA~~2F888CAD       CADAVSAV','balance':'165.30','drCr':false,'hasAcctDtl':true},{'desc':'CHF Savings','hasParent':true,'ccy':{'desc':'','code':'CHF'},'accountNum':'608-500203-888','type':'SAV','id':'608500203888~~AV~~SAV~~CHF~~HSBC Premier CHF Savings~~DDA~~2F888CHF       CHFAVSAV','balance':'242.60','drCr':false,'hasAcctDtl':true},{'desc':'RMB Savings','hasParent':true,'ccy':{'desc':'','code':'CNY'},'accountNum':'608-500203-888','type':'SAV','id':'608500203888~~AV~~SAV~~CNY~~HSBC Premier RMB Savings~~DDA~~2F888CNY       CNYAVSAV','balance':'32.61','drCr':false,'hasAcctDtl':true},{'desc':'GBP Savings','hasParent':true,'ccy':{'desc':'','code':'GBP'},'accountNum':'608-500203-888','type':'SAV','id':'608500203888~~AV~~SAV~~GBP~~HSBC Premier GBP Savings~~DDA~~2F888GBP       GBPAVSAV','balance':'39.32','drCr':false,'hasAcctDtl':true},{'desc':'NZD Savings','hasParent':true,'ccy':{'desc':'','code':'NZD'},'accountNum':'608-500203-888','type':'SAV','id':'608500203888~~AV~~SAV~~NZD~~HSBC Premier NZD Savings~~DDA~~2F888NZD       NZDAVSAV','balance':'316.68','drCr':false,'hasAcctDtl':true},{'desc':'SGD Savings','hasParent':true,'ccy':{'desc':'','code':'SGD'},'accountNum':'608-500203-888','type':'SAV','id':'608500203888~~AV~~SAV~~SGD~~HSBC Premier SGD Savings~~DDA~~2F888SGD       SGDAVSAV','balance':'33.66','drCr':false,'hasAcctDtl':true},{'desc':'USD Savings','hasParent':true,'ccy':{'desc':'','code':'USD'},'accountNum':'608-500203-888','type':'SAV','id':'608500203888~~AV~~SAV~~USD~~HSBC Premier USD Savings~~DDA~~2F888USD       USDAVSAV','balance':'1,344.44','drCr':false,'hasAcctDtl':true},{'desc':'Time Deposit','hasParent':true,'ccy':{'desc':'','code':'   '},'accountNum':'608-500203-888','type':'TMS','id':'6085002038880000~~AV~~TMS~~   ~~HSBC Premier Time Deposit~~DDA~~4T888             AVTMS','balance':'Details','drCr':false,'hasAcctDtl':true},{'desc':'Investment Services','hasParent':true,'ccy':{'desc':'','code':'HKD'},'accountNum':'608-500203-888','type':'INV','id':'608500203888~~AV~~INV~~HKD~~HSBC Premier Investment Services~~DDA~~2R888HKD       HKDAVINV','balance':'Balance Not Available','drCr':false,'hasAcctDtl':false},{'desc':'Dual Currency Diamond Credit Card - HKD','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'6250-9800-0396-2658','type':'CR','id':'6250980003962658~~CR~~DTC~~HKD~~Dual Currency Diamond Credit Card - HKD~~DDA~~3DG  HKD       HKDCRDTC','balance':'Details','drCr':true},{'desc':'Dual Currency Diamond Credit Card - RMB','hasParent':false,'ccy':{'desc':'','code':'CNY'},'accountNum':'8383-8300-1396-2642','type':'CR','id':'8383830013962642~~CR~~DTR~~CNY~~Dual Currency Diamond Credit Card - RMB~~DDA~~3DH  CNY       CNYCRDTR','balance':'Details','drCr':false},{'desc':'HSBC Premier Credit Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'5185-4200-0481-1887','type':'CR','id':'5185420004811887~~CR~~HPR~~HKD~~HSBC Premier Credit Card~~DDA~~3HP  HKD       HKDCRHPR','balance':'Details','drCr':false},{'desc':'HSBC Premier Credit Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'5185-4200-0906-9754','type':'CR','id':'5185420009069754~~CR~~HPR~~HKD~~HSBC Premier Credit Card~~DDA~~3HP  HKD       HKDCRHPR','balance':'Details','drCr':false},{'desc':'MasterCard','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'5411-8001-0449-2603','type':'CR','id':'5411800104492603~~CR~~MAC~~HKD~~MasterCard~~DDA~~3MC  HKD       HKDCRMAC','balance':'Details','drCr':true},{'desc':'MasterCard','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'5411-8001-0452-7093','type':'CR','id':'5411800104527093~~CR~~MAC~~HKD~~MasterCard~~DDA~~3MC  HKD       HKDCRMAC','balance':'Details','drCr':true},{'desc':'MasterCard','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'5411-8002-0091-3692','type':'CR','id':'5411800200913692~~CR~~MAC~~HKD~~MasterCard~~DDA~~3MC  HKD       HKDCRMAC','balance':'Details','drCr':false},{'desc':'MasterCard','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'5411-8002-0484-2400','type':'CR','id':'5411800204842400~~CR~~MAC~~HKD~~MasterCard~~DDA~~3MC  HKD       HKDCRMAC','balance':'Details','drCr':false},{'desc':'Gold MasterCard','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'5431-2200-0043-0282','type':'CR','id':'5431220000430282~~CR~~MAG~~HKD~~Gold MasterCard~~DDA~~3MG  HKD       HKDCRMAG','balance':'Details','drCr':false},{'desc':'HSBC Advance Visa Platinum Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'4679-3200-0200-1547','type':'CR','id':'4679320002001547~~CR~~AVR~~HKD~~HSBC Advance Visa Platinum Card~~DDA~~3PA  HKD       HKDCRAVR','balance':'Details','drCr':false},{'desc':'HSBC Advance Visa Platinum Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'4679-3200-0364-2570','type':'CR','id':'4679320003642570~~CR~~AVR~~HKD~~HSBC Advance Visa Platinum Card~~DDA~~3PA  HKD       HKDCRAVR','balance':'Details','drCr':false},{'desc':'HSBC Advance Visa Platinum Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'4679-3200-0685-4065','type':'CR','id':'4679320006854065~~CR~~AVR~~HKD~~HSBC Advance Visa Platinum Card~~DDA~~3PA  HKD       HKDCRAVR','balance':'Details','drCr':true},{'desc':'HSBC Advance Visa Platinum Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'4679-3200-0909-9031','type':'CR','id':'4679320009099031~~CR~~AVR~~HKD~~HSBC Advance Visa Platinum Card~~DDA~~3PA  HKD       HKDCRAVR','balance':'Details','drCr':false},{'desc':'Visa Platinum Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'4201-8400-0013-9301','type':'CR','id':'4201840000139301~~CR~~VPC~~HKD~~Visa Platinum Card~~DDA~~3PC  HKD       HKDCRVPC','balance':'Details','drCr':false},{'desc':'Visa Platinum Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'4201-8400-0014-4269','type':'CR','id':'4201840000144269~~CR~~VPC~~HKD~~Visa Platinum Card~~DDA~~3PC  HKD       HKDCRVPC','balance':'Details','drCr':false},{'desc':'Visa Platinum Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'4201-8400-0014-4376','type':'CR','id':'4201840000144376~~CR~~VPC~~HKD~~Visa Platinum Card~~DDA~~3PC  HKD       HKDCRVPC','balance':'Details','drCr':false},{'desc':'Visa Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'4921-1102-1230-8170','type':'CR','id':'4921110212308170~~CR~~CVC~~HKD~~Visa Card~~DDA~~3VC  HKD       HKDCRCVC','balance':'Details','drCr':true},{'desc':'Visa Card','hasParent':false,'ccy':{'desc':'','code':'HKD'},'accountNum':'4921-1102-1842-5812','type':'CR','id':'4921110218425812~~CR~~CVC~~HKD~~Visa Card~~DDA~~3VC  HKD       HKDCRCVC','balance':'Details','drCr':true},{'desc':'Statement Gold','hasParent':false,'ccy':{'desc':'','code':'MACE'},'accountNum':'002-535201-260','type':'GLD','id':'002535201260~~SS~~GLD~~GLT~~Statement Gold~~DDA~~2W260GLT       GLTSSGLD','balance':'10,000,000','drCr':false,'hasAcctDtl':true},{'desc':'Statement Gold','hasParent':false,'ccy':{'desc':'','code':'MACE'},'accountNum':'068-000934-261','type':'GLD','id':'068000934261~~SS~~GLD~~GLT~~Statement Gold~~DDA~~2W261GLT       GLTSSGLD','balance':'0','drCr':false,'hasAcctDtl':true}]}]}]},'header':{'version':'1.0','errorMsg':[{'desc':'','code':'0000'}],'token':'','statusCode':'0000'}}";

	@Test
	public void mockedResponseIsCorrect() {

		// given
		MobileAccountSummaryService service = new MobileAccountSummaryService();

		// when
		String response = service.getAccountSummary();
		response = response.trim();
		response = response.replace("\"", "'");

		// then
		assertEquals(expectedResponse, response);
	}
}