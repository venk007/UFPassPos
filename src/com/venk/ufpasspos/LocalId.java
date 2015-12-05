package com.venk.ufpasspos;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 省市名称转换地区编码
 * @author: Venk007
 * @date: 2015年12月4日下午11:30:59
 * 4000行的类还是第一次搞定
 * 
 * TIPS1:如果只填写省份名，则遍历整个省的地区码(省市名都不填则遍历全国)
 * TIPS2:可以不填写省份名，只填写城市名，但是朝阳群众与辽宁省朝阳市人民表示不服
 *  	  原因: city只填写"朝阳"时，会遍历朝阳区和朝阳市的地区码
 * TIPS3:例如"云南省文山壮族苗族自治州砚山县"，城市名请不要填写"砚山县"，
 * 		  而是填写二级地区"文山壮族苗族自治州"或者"文山"(模糊搜索，代码健壮性就是这么好！~)
 * TIPS4:求大xian神ren把三级区县的判断做了
 */
public class LocalId {

	public static List<String> localToId(String province, String city) {

		List<String> localId = new ArrayList<String>();

		if (province.contains("北京") || province.isEmpty()) {

			if (city.contains("东城") || city.isEmpty()) {
				localId.add("110101");       // 北京市东城区
			}
			if (city.contains("西城") || city.isEmpty()) {
				localId.add("110102");
				;       // 北京市西城区
			}
			if (city.contains("崇文") || city.isEmpty()) {
				localId.add("110103");       // 北京市崇文区
			}
			if (city.contains("宣武") || city.isEmpty()) {
				localId.add("110104");       // 北京市宣武区
			}
			if (city.contains("朝阳") || city.isEmpty()) {
				localId.add("110105");       // 北京市朝阳区
			}
			if (city.contains("丰台") || city.isEmpty()) {
				localId.add("110106");       // 北京市丰台区
			}
			if (city.contains("石景山") || city.isEmpty()) {
				localId.add("110107");       // 北京市石景山区
			}
			if (city.contains("海淀") || city.isEmpty()) {
				localId.add("110108");       // 北京市海淀区
			}
			if (city.contains("门头沟") || city.isEmpty()) {
				localId.add("110109");       // 北京市门头沟区
			}
			if (city.contains("房山") || city.isEmpty()) {
				localId.add("110111");       // 北京市房山区
			}
			if (city.contains("通州") || city.isEmpty()) {
				localId.add("110112");       // 北京市通州区
			}
			if (city.contains("顺义") || city.isEmpty()) {
				localId.add("110113");       // 北京市顺义区
			}
			if (city.contains("昌平") || city.isEmpty()) {
				localId.add("110221");       // 北京市昌平县
			}
			if (city.contains("大兴") || city.isEmpty()) {
				localId.add("110224");       // 北京市大兴县
			}
			if (city.contains("平谷") || city.isEmpty()) {
				localId.add("110226");       // 北京市平谷县
			}
			if (city.contains("怀柔") || city.isEmpty()) {
				localId.add("110227");       // 北京市怀柔县
			}
			if (city.contains("密云") || city.isEmpty()) {
				localId.add("110228");       // 北京市密云县
			}
			if (city.contains("延庆") || city.isEmpty()) {
				localId.add("110229");       // 北京市延庆县
			}
		}
		if (province.contains("天津") || province.isEmpty()) {

			if (city.contains("和平") || city.isEmpty()) {
				localId.add("120101");       // 天津市和平区
			}
			if (city.contains("河东") || city.isEmpty()) {
				localId.add("120102");       // 天津市河东区
			}
			if (city.contains("河西") || city.isEmpty()) {
				localId.add("120103");       // 天津市河西区
			}
			if (city.contains("南开") || city.isEmpty()) {
				localId.add("120104");       // 天津市南开区
			}
			if (city.contains("河北") || city.isEmpty()) {
				localId.add("120105");       // 天津市河北区
			}
			if (city.contains("红桥") || city.isEmpty()) {
				localId.add("120106");       // 天津市红桥区
			}
			if (city.contains("塘沽") || city.isEmpty()) {
				localId.add("120107");       // 天津市塘沽区
			}
			if (city.contains("汉沽") || city.isEmpty()) {
				localId.add("120108");       // 天津市汉沽区
			}
			if (city.contains("大港") || city.isEmpty()) {
				localId.add("120109");       // 天津市大港区
			}
			if (city.contains("东丽") || city.isEmpty()) {
				localId.add("120110");       // 天津市东丽区
			}
			if (city.contains("西青") || city.isEmpty()) {
				localId.add("120111");       // 天津市西青区
			}
			if (city.contains("津南") || city.isEmpty()) {
				localId.add("120112");       // 天津市津南区
			}
			if (city.contains("北辰") || city.isEmpty()) {
				localId.add("120113");       // 天津市北辰区
			}
			if (city.contains("宁河") || city.isEmpty()) {
				localId.add("120221");       // 天津市宁河县
			}
			if (city.contains("武清") || city.isEmpty()) {
				localId.add("120222");       // 天津市武清县
			}
			if (city.contains("静海") || city.isEmpty()) {
				localId.add("120223");       // 天津市静海县
			}
			if (city.contains("宝坻") || city.isEmpty()) {
				localId.add("120224");       // 天津市宝坻县
			}
			if (city.contains("蓟") || city.isEmpty()) {
				localId.add("120225");       // 天津市蓟县
			}
		}
		if (province.contains("河北") || province.isEmpty()) {

			if (city.contains("石家庄") || city.isEmpty()) {
				localId.add("130102");       // 河北省石家庄市长安区
				localId.add("130103");       // 河北省石家庄市桥东区
				localId.add("130104");       // 河北省石家庄市桥西区
				localId.add("130105");       // 河北省石家庄市新华区
				localId.add("130106");       // 河北省石家庄市郊区
				localId.add("130107");       // 河北省石家庄市井陉矿区
				localId.add("130121");       // 河北省石家庄市井陉县
				localId.add("130123");       // 河北省石家庄市正定县
				localId.add("130124");       // 河北省石家庄市栾城县
				localId.add("130125");       // 河北省石家庄市行唐县
				localId.add("130126");       // 河北省石家庄市灵寿县
				localId.add("130127");       // 河北省石家庄市高邑县
				localId.add("130128");       // 河北省石家庄市深泽县
				localId.add("130129");       // 河北省石家庄市赞皇县
				localId.add("130130");       // 河北省石家庄市无极县
				localId.add("130131");       // 河北省石家庄市平山县
				localId.add("130132");       // 河北省石家庄市元氏县
				localId.add("130133");       // 河北省石家庄市赵县
				localId.add("130181");       // 河北省石家庄市辛集市
				localId.add("130182");       // 河北省石家庄市藁城市
				localId.add("130183");       // 河北省石家庄市晋州市
				localId.add("130184");       // 河北省石家庄市新乐市
				localId.add("130185");       // 河北省石家庄市鹿泉市
			}
			if (city.contains("唐山") || city.isEmpty()) {
				localId.add("130202");       // 河北省唐山市路南区
				localId.add("130203");       // 河北省唐山市路北区
				localId.add("130204");       // 河北省唐山市古冶区
				localId.add("130205");       // 河北省唐山市开平区
				localId.add("130206");       // 河北省唐山市新区
				localId.add("130221");       // 河北省唐山市丰润县
				localId.add("130223");       // 河北省唐山市滦县
				localId.add("130224");       // 河北省唐山市滦南县
				localId.add("130225");       // 河北省唐山市乐亭县
				localId.add("130227");       // 河北省唐山市迁西县
				localId.add("130229");       // 河北省唐山市玉田县
				localId.add("130230");       // 河北省唐山市唐海县
				localId.add("130281");       // 河北省唐山市遵化市
				localId.add("130282");       // 河北省唐山市丰南市
				localId.add("130283");       // 河北省唐山市迁安市
			}
			if (city.contains("秦皇岛") || city.isEmpty()) {
				localId.add("130302");       // 河北省秦皇岛市海港区
				localId.add("130303");       // 河北省秦皇岛市山海关区
				localId.add("130304");       // 河北省秦皇岛市北戴河区
				localId.add("130321");       // 河北省秦皇岛市青龙满族自治县
				localId.add("130322");       // 河北省秦皇岛市昌黎县
				localId.add("130323");       // 河北省秦皇岛市抚宁县
				localId.add("130324");       // 河北省秦皇岛市卢龙县
			}
			if (city.contains("邯郸") || city.isEmpty()) {
				localId.add("130402");       // 河北省邯郸市邯山区
				localId.add("130403");       // 河北省邯郸市丛台区
				localId.add("130404");       // 河北省邯郸市复兴区
				localId.add("130406");       // 河北省邯郸市峰峰矿区
				localId.add("130421");       // 河北省邯郸市邯郸县
				localId.add("130423");       // 河北省邯郸市临漳县
				localId.add("130424");       // 河北省邯郸市成安县
				localId.add("130425");       // 河北省邯郸市大名县
				localId.add("130426");       // 河北省邯郸市涉县
				localId.add("130427");       // 河北省邯郸市磁县
				localId.add("130428");       // 河北省邯郸市肥乡县
				localId.add("130429");       // 河北省邯郸市永年县
				localId.add("130430");       // 河北省邯郸市邱县
				localId.add("130431");       // 河北省邯郸市鸡泽县
				localId.add("130432");       // 河北省邯郸市广平县
				localId.add("130433");       // 河北省邯郸市馆陶县
				localId.add("130434");       // 河北省邯郸市魏县
				localId.add("130435");       // 河北省邯郸市曲周县
				localId.add("130481");       // 河北省邯郸市武安市
			}
			if (city.contains("邢台") || city.isEmpty()) {
				localId.add("130502");       // 河北省邢台市桥东区
				localId.add("130503");       // 河北省邢台市桥西区
				localId.add("130521");       // 河北省邢台市邢台县
				localId.add("130522");       // 河北省邢台市临城县
				localId.add("130523");       // 河北省邢台市内丘县
				localId.add("130524");       // 河北省邢台市柏乡县
				localId.add("130525");       // 河北省邢台市隆尧县
				localId.add("130526");       // 河北省邢台市任县
				localId.add("130527");       // 河北省邢台市南和县
				localId.add("130528");       // 河北省邢台市宁晋县
				localId.add("130529");       // 河北省邢台市巨鹿县
				localId.add("130530");       // 河北省邢台市新河县
				localId.add("130531");       // 河北省邢台市广宗县
				localId.add("130532");       // 河北省邢台市平乡县
				localId.add("130533");       // 河北省邢台市威县
				localId.add("130534");       // 河北省邢台市清河县
				localId.add("130535");       // 河北省邢台市临西县
				localId.add("130581");       // 河北省邢台市南宫市
				localId.add("130582");       // 河北省邢台市沙河市
			}
			if (city.contains("保定") || city.isEmpty()) {
				localId.add("130602");       // 河北省保定市新市区
				localId.add("130603");       // 河北省保定市北市区
				localId.add("130604");       // 河北省保定市南市区
				localId.add("130621");       // 河北省保定市满城县
				localId.add("130622");       // 河北省保定市清苑县
				localId.add("130623");       // 河北省保定市涞水县
				localId.add("130624");       // 河北省保定市阜平县
				localId.add("130625");       // 河北省保定市徐水县
				localId.add("130626");       // 河北省保定市定兴县
				localId.add("130627");       // 河北省保定市唐县
				localId.add("130628");       // 河北省保定市高阳县
				localId.add("130629");       // 河北省保定市容城县
				localId.add("130630");       // 河北省保定市涞源县
				localId.add("130631");       // 河北省保定市望都县
				localId.add("130632");       // 河北省保定市安新县
				localId.add("130633");       // 河北省保定市易县
				localId.add("130634");       // 河北省保定市曲阳县
				localId.add("130635");       // 河北省保定市蠡县
				localId.add("130636");       // 河北省保定市顺平县
				localId.add("130637");       // 河北省保定市博野县
				localId.add("130638");       // 河北省保定市雄县
				localId.add("130681");       // 河北省保定市涿州市
				localId.add("130682");       // 河北省保定市定州市
				localId.add("130683");       // 河北省保定市安国市
				localId.add("130684");       // 河北省保定市高碑店市
			}
			if (city.contains("张家口") || city.isEmpty()) {
				localId.add("130702");       // 河北省张家口市桥东区
				localId.add("130703");       // 河北省张家口市桥西区
				localId.add("130705");       // 河北省张家口市宣化区
				localId.add("130706");       // 河北省张家口市下花园区
				localId.add("130721");       // 河北省张家口市宣化县
				localId.add("130722");       // 河北省张家口市张北县
				localId.add("130723");       // 河北省张家口市康保县
				localId.add("130724");       // 河北省张家口市沽源县
				localId.add("130725");       // 河北省张家口市尚义县
				localId.add("130726");       // 河北省张家口市蔚县
				localId.add("130727");       // 河北省张家口市阳原县
				localId.add("130728");       // 河北省张家口市怀安县
				localId.add("130729");       // 河北省张家口市万全县
				localId.add("130730");       // 河北省张家口市怀来县
				localId.add("130731");       // 河北省张家口市涿鹿县
				localId.add("130732");       // 河北省张家口市赤城县
				localId.add("130733");       // 河北省张家口市崇礼县
			}
			if (city.contains("承德") || city.isEmpty()) {
				localId.add("130802");       // 河北省承德市双桥区
				localId.add("130803");       // 河北省承德市双滦区
				localId.add("130804");       // 河北省承德市鹰手营子矿区
				localId.add("130821");       // 河北省承德市承德县
				localId.add("130822");       // 河北省承德市兴隆县
				localId.add("130823");       // 河北省承德市平泉县
				localId.add("130824");       // 河北省承德市滦平县
				localId.add("130825");       // 河北省承德市隆化县
				localId.add("130826");       // 河北省承德市丰宁满族自治县
				localId.add("130827");       // 河北省承德市宽城满族自治县
				localId.add("130828");       // 河北省承德市围场满族蒙古族自治县
			}
			if (city.contains("沧州") || city.isEmpty()) {
				localId.add("130902");       // 河北省沧州市新华区
				localId.add("130903");       // 河北省沧州市运河区
				localId.add("130921");       // 河北省沧州市沧县
				localId.add("130922");       // 河北省沧州市青县
				localId.add("130923");       // 河北省沧州市东光县
				localId.add("130924");       // 河北省沧州市海兴县
				localId.add("130925");       // 河北省沧州市盐山县
				localId.add("130926");       // 河北省沧州市肃宁县
				localId.add("130927");       // 河北省沧州市南皮县
				localId.add("130928");       // 河北省沧州市吴桥县
				localId.add("130929");       // 河北省沧州市献县
				localId.add("130930");       // 河北省沧州市孟村回族自治县
				localId.add("130981");       // 河北省沧州市泊头市
				localId.add("130982");       // 河北省沧州市任丘市
				localId.add("130983");       // 河北省沧州市黄骅市
				localId.add("130984");       // 河北省沧州市河间市
			}
			if (city.contains("廊坊") || city.isEmpty()) {
				localId.add("131002");       // 河北省廊坊市安次区
				localId.add("131022");       // 河北省廊坊市固安县
				localId.add("131023");       // 河北省廊坊市永清县
				localId.add("131024");       // 河北省廊坊市香河县
				localId.add("131025");       // 河北省廊坊市大城县
				localId.add("131026");       // 河北省廊坊市文安县
				localId.add("131028");       // 河北省廊坊市大厂回族自治县
				localId.add("131081");       // 河北省廊坊市霸州市
				localId.add("131082");       // 河北省廊坊市三河市
			}
			if (city.contains("衡水") || city.isEmpty()) {
				localId.add("131102");       // 河北省衡水市桃城区
				localId.add("131121");       // 河北省衡水市枣强县
				localId.add("131122");       // 河北省衡水市武邑县
				localId.add("131123");       // 河北省衡水市武强县
				localId.add("131124");       // 河北省衡水市饶阳县
				localId.add("131125");       // 河北省衡水市安平县
				localId.add("131126");       // 河北省衡水市故城县
				localId.add("131127");       // 河北省衡水市景县
				localId.add("131128");       // 河北省衡水市阜城县
				localId.add("131181");       // 河北省衡水市冀州市
				localId.add("131182");       // 河北省衡水市深州市
			}

		}
		if (province.contains("山西") || province.isEmpty()) {
			if (city.contains("太原") || city.isEmpty()) {
				localId.add("140105");       // 山西省太原市小店区
				localId.add("140106");       // 山西省太原市迎泽区
				localId.add("140107");       // 山西省太原市杏花岭区
				localId.add("140108");       // 山西省太原市尖草坪区
				localId.add("140109");       // 山西省太原市万柏林区
				localId.add("140110");       // 山西省太原市晋源区
				localId.add("140121");       // 山西省太原市清徐县
				localId.add("140122");       // 山西省太原市阳曲县
				localId.add("140123");       // 山西省太原市娄烦县
				localId.add("140181");       // 山西省太原市古交市
			}
			if (city.contains("大同") || city.isEmpty()) {
				localId.add("140202");       // 山西省大同市城区
				localId.add("140203");       // 山西省大同市矿区
				localId.add("140211");       // 山西省大同市南郊区
				localId.add("140212");       // 山西省大同市新荣区
				localId.add("140221");       // 山西省大同市阳高县
				localId.add("140222");       // 山西省大同市天镇县
				localId.add("140223");       // 山西省大同市广灵县
				localId.add("140224");       // 山西省大同市灵丘县
				localId.add("140225");       // 山西省大同市浑源县
				localId.add("140226");       // 山西省大同市左云县
				localId.add("140227");       // 山西省大同市大同县
			}
			if (city.contains("阳泉") || city.isEmpty()) {
				localId.add("140302");       // 山西省阳泉市城区
				localId.add("140303");       // 山西省阳泉市矿区
				localId.add("140311");       // 山西省阳泉市郊区
				localId.add("140321");       // 山西省阳泉市平定县
				localId.add("140322");       // 山西省阳泉市盂县
			}
			if (city.contains("长治") || city.isEmpty()) {
				localId.add("140402");       // 山西省长治市城区
				localId.add("140411");       // 山西省长治市郊区
				localId.add("140421");       // 山西省长治市长治县
				localId.add("140423");       // 山西省长治市襄垣县
				localId.add("140424");       // 山西省长治市屯留县
				localId.add("140425");       // 山西省长治市平顺县
				localId.add("140426");       // 山西省长治市黎城县
				localId.add("140427");       // 山西省长治市壶关县
				localId.add("140428");       // 山西省长治市长子县
				localId.add("140429");       // 山西省长治市武乡县
				localId.add("140430");       // 山西省长治市沁县
				localId.add("140431");       // 山西省长治市沁源县
				localId.add("140481");       // 山西省长治市潞城市
			}
			if (city.contains("晋城") || city.isEmpty()) {
				localId.add("140502");       // 山西省晋城市城区
				localId.add("140521");       // 山西省晋城市沁水县
				localId.add("140522");       // 山西省晋城市阳城县
				localId.add("140524");       // 山西省晋城市陵川县
				localId.add("140525");       // 山西省晋城市泽州县
				localId.add("140581");       // 山西省晋城市高平市
				localId.add("140600");       // 山西省晋城市朔州市
				localId.add("140601");       // 山西省晋城市市辖区
				localId.add("140602");       // 山西省晋城市朔城区
				localId.add("140603");       // 山西省晋城市平鲁区
				localId.add("140621");       // 山西省晋城市山阴县
				localId.add("140622");       // 山西省晋城市应县
				localId.add("140623");       // 山西省晋城市右玉县
				localId.add("140624");       // 山西省晋城市怀仁县
			}
			if (city.contains("忻州") || city.isEmpty()) {
				localId.add("142201");       // 山西省忻州地区忻州市
				localId.add("142202");       // 山西省忻州地区原平市
				localId.add("142222");       // 山西省忻州地区定襄县
				localId.add("142223");       // 山西省忻州地区五台县
				localId.add("142225");       // 山西省忻州地区代县
				localId.add("142226");       // 山西省忻州地区繁峙县
				localId.add("142227");       // 山西省忻州地区宁武县
				localId.add("142228");       // 山西省忻州地区静乐县
				localId.add("142229");       // 山西省忻州地区神池县
				localId.add("142230");       // 山西省忻州地区五寨县
				localId.add("142231");       // 山西省忻州地区岢岚县
				localId.add("142232");       // 山西省忻州地区河曲县
				localId.add("142233");       // 山西省忻州地区保德县
				localId.add("142234");       // 山西省忻州地区偏关县
				localId.add("142300");       // 山西省忻州地区吕梁地区
				localId.add("142301");       // 山西省忻州地区孝义市
				localId.add("142302");       // 山西省忻州地区离石市
				localId.add("142303");       // 山西省忻州地区汾阳市
				localId.add("142322");       // 山西省忻州地区文水县
				localId.add("142323");       // 山西省忻州地区交城县
				localId.add("142325");       // 山西省忻州地区兴县
				localId.add("142326");       // 山西省忻州地区临县
				localId.add("142327");       // 山西省忻州地区柳林县
				localId.add("142328");       // 山西省忻州地区石楼县
				localId.add("142329");       // 山西省忻州地区岚县
				localId.add("142330");       // 山西省忻州地区方山县
				localId.add("142332");       // 山西省忻州地区中阳县
				localId.add("142333");       // 山西省忻州地区交口县
			}
			if (city.contains("晋中") || city.isEmpty()) {
				localId.add("142401");       // 山西省晋中地区榆次市
				localId.add("142402");       // 山西省晋中地区介休市
				localId.add("142421");       // 山西省晋中地区榆社县
				localId.add("142422");       // 山西省晋中地区左权县
				localId.add("142423");       // 山西省晋中地区和顺县
				localId.add("142424");       // 山西省晋中地区昔阳县
				localId.add("142427");       // 山西省晋中地区寿阳县
				localId.add("142429");       // 山西省晋中地区太谷县
				localId.add("142430");       // 山西省晋中地区祁县
				localId.add("142431");       // 山西省晋中地区平遥县
				localId.add("142433");       // 山西省晋中地区灵石县
			}
			if (city.contains("临汾") || city.isEmpty()) {
				localId.add("142601");       // 山西省临汾地区临汾市
				localId.add("142602");       // 山西省临汾地区侯马市
				localId.add("142603");       // 山西省临汾地区霍州市
				localId.add("142621");       // 山西省临汾地区曲沃县
				localId.add("142622");       // 山西省临汾地区翼城县
				localId.add("142623");       // 山西省临汾地区襄汾县
				localId.add("142625");       // 山西省临汾地区洪洞县
				localId.add("142627");       // 山西省临汾地区古县
				localId.add("142628");       // 山西省临汾地区安泽县
				localId.add("142629");       // 山西省临汾地区浮山县
				localId.add("142630");       // 山西省临汾地区吉县
				localId.add("142631");       // 山西省临汾地区乡宁县
				localId.add("142632");       // 山西省临汾地区蒲县
				localId.add("142633");       // 山西省临汾地区大宁县
				localId.add("142634");       // 山西省临汾地区永和县
				localId.add("142635");       // 山西省临汾地区隰县
				localId.add("142636");       // 山西省临汾地区汾西县
			}
			if (city.contains("运城") || city.isEmpty()) {
				localId.add("142701");       // 山西省运城地区运城市
				localId.add("142702");       // 山西省运城地区永济市
				localId.add("142703");       // 山西省运城地区河津市
				localId.add("142723");       // 山西省运城地区芮城县
				localId.add("142724");       // 山西省运城地区临猗县
				localId.add("142725");       // 山西省运城地区万荣县
				localId.add("142726");       // 山西省运城地区新绛县
				localId.add("142727");       // 山西省运城地区稷山县
				localId.add("142729");       // 山西省运城地区闻喜县
				localId.add("142730");       // 山西省运城地区夏县
				localId.add("142731");       // 山西省运城地区绛县
				localId.add("142732");       // 山西省运城地区平陆县
				localId.add("142733");       // 山西省运城地区垣曲县
			}
		}
		if (province.contains("内蒙古") || province.isEmpty()) {
			if (city.contains("呼和浩特") || city.isEmpty()) {
				localId.add("150102");       // 内蒙古自治区呼和浩特市新城区
				localId.add("150103");       // 内蒙古自治区呼和浩特市回民区
				localId.add("150104");       // 内蒙古自治区呼和浩特市玉泉区
				localId.add("150105");       // 内蒙古自治区呼和浩特市郊区
				localId.add("150121");       // 内蒙古自治区呼和浩特市土默特左旗
				localId.add("150122");       // 内蒙古自治区呼和浩特市托克托县
				localId.add("150123");       // 内蒙古自治区呼和浩特市和林格尔县
				localId.add("150124");       // 内蒙古自治区呼和浩特市清水河县
				localId.add("150125");       // 内蒙古自治区呼和浩特市武川县
			}
			if (city.contains("包头") || city.isEmpty()) {
				localId.add("150202");       // 内蒙古自治区包头市东河区
				localId.add("150203");       // 内蒙古自治区包头市昆都伦区
				localId.add("150204");       // 内蒙古自治区包头市青山区
				localId.add("150205");       // 内蒙古自治区包头市石拐矿区
				localId.add("150206");       // 内蒙古自治区包头市白云矿区
				localId.add("150207");       // 内蒙古自治区包头市郊区
				localId.add("150221");       // 内蒙古自治区包头市土默特右旗
				localId.add("150222");       // 内蒙古自治区包头市固阳县
				localId.add("150223");       // 内蒙古自治区包头市达尔罕茂明安联合旗
			}
			if (city.contains("乌海") || city.isEmpty()) {
				localId.add("150302");       // 内蒙古自治区乌海市海勃湾区
				localId.add("150303");       // 内蒙古自治区乌海市海南区
				localId.add("150304");       // 内蒙古自治区乌海市乌达区
			}
			if (city.contains("赤峰") || city.isEmpty()) {
				localId.add("150402");       // 内蒙古自治区赤峰市红山区
				localId.add("150403");       // 内蒙古自治区赤峰市元宝山区
				localId.add("150404");       // 内蒙古自治区赤峰市松山区
				localId.add("150421");       // 内蒙古自治区赤峰市阿鲁科尔沁旗
				localId.add("150422");       // 内蒙古自治区赤峰市巴林左旗
				localId.add("150423");       // 内蒙古自治区赤峰市巴林右旗
				localId.add("150424");       // 内蒙古自治区赤峰市林西县
				localId.add("150425");       // 内蒙古自治区赤峰市克什克腾旗
				localId.add("150426");       // 内蒙古自治区赤峰市翁牛特旗
				localId.add("150428");       // 内蒙古自治区赤峰市喀喇沁旗
				localId.add("150429");       // 内蒙古自治区赤峰市宁城县
				localId.add("150430");       // 内蒙古自治区赤峰市敖汉旗
			}
			if (city.contains("呼伦贝尔") || city.isEmpty()) {
				localId.add("152101");       // 内蒙古自治区呼伦贝尔盟海拉尔市
				localId.add("152102");       // 内蒙古自治区呼伦贝尔盟满洲里市
				localId.add("152103");       // 内蒙古自治区呼伦贝尔盟扎兰屯市
				localId.add("152104");       // 内蒙古自治区呼伦贝尔盟牙克石市
				localId.add("152105");       // 内蒙古自治区呼伦贝尔盟根河市
				localId.add("152106");       // 内蒙古自治区呼伦贝尔盟额尔古纳市
				localId.add("152122");       // 内蒙古自治区呼伦贝尔盟阿荣旗
				localId.add("152123");       // 内蒙古自治区呼伦贝尔盟莫力达瓦达斡尔族自治旗
				localId.add("152127");       // 内蒙古自治区呼伦贝尔盟鄂伦春自治旗
				localId.add("152128");       // 内蒙古自治区呼伦贝尔盟鄂温克族自治旗
				localId.add("152129");       // 内蒙古自治区呼伦贝尔盟新巴尔虎右旗
				localId.add("152130");       // 内蒙古自治区呼伦贝尔盟新巴尔虎左旗
				localId.add("152131");       // 内蒙古自治区呼伦贝尔盟陈巴尔虎旗
			}
			if (city.contains("兴安") || city.isEmpty()) {
				localId.add("152201");       // 内蒙古自治区兴安盟乌兰浩特市
				localId.add("152202");       // 内蒙古自治区兴安盟阿尔山市
				localId.add("152221");       // 内蒙古自治区兴安盟科尔沁右翼前旗
				localId.add("152222");       // 内蒙古自治区兴安盟科尔沁右翼中旗
				localId.add("152223");       // 内蒙古自治区兴安盟扎赉特旗
				localId.add("152224");       // 内蒙古自治区兴安盟突泉县
			}
			if (city.contains("哲里木") || city.isEmpty()) {
				localId.add("152301");       // 内蒙古自治区哲里木盟通辽市
				localId.add("152302");       // 内蒙古自治区哲里木盟霍林郭勒市
				localId.add("152322");       // 内蒙古自治区哲里木盟科尔沁左翼中旗
				localId.add("152323");       // 内蒙古自治区哲里木盟科尔沁左翼后旗
				localId.add("152324");       // 内蒙古自治区哲里木盟开鲁县
				localId.add("152325");       // 内蒙古自治区哲里木盟库伦旗
				localId.add("152326");       // 内蒙古自治区哲里木盟奈曼旗
				localId.add("152327");       // 内蒙古自治区哲里木盟扎鲁特旗
			}
			if (city.contains("锡林郭勒") || city.isEmpty()) {
				localId.add("152501");       // 内蒙古自治区锡林郭勒盟二连浩特市
				localId.add("152502");       // 内蒙古自治区锡林郭勒盟锡林浩特市
				localId.add("152522");       // 内蒙古自治区锡林郭勒盟阿巴嘎旗
				localId.add("152523");       // 内蒙古自治区锡林郭勒盟苏尼特左旗
				localId.add("152524");       // 内蒙古自治区锡林郭勒盟苏尼特右旗
				localId.add("152525");       // 内蒙古自治区锡林郭勒盟东乌珠穆沁旗
				localId.add("152526");       // 内蒙古自治区锡林郭勒盟西乌珠穆沁旗
				localId.add("152527");       // 内蒙古自治区锡林郭勒盟太仆寺旗
				localId.add("152528");       // 内蒙古自治区锡林郭勒盟镶黄旗
				localId.add("152529");       // 内蒙古自治区锡林郭勒盟正镶白旗
				localId.add("152530");       // 内蒙古自治区锡林郭勒盟正蓝旗
				localId.add("152531");       // 内蒙古自治区锡林郭勒盟多伦县
			}
			if (city.contains("乌兰察布") || city.isEmpty()) {
				localId.add("152601");       // 内蒙古自治区乌兰察布盟集宁市
				localId.add("152602");       // 内蒙古自治区乌兰察布盟丰镇市
				localId.add("152624");       // 内蒙古自治区乌兰察布盟卓资县
				localId.add("152625");       // 内蒙古自治区乌兰察布盟化德县
				localId.add("152626");       // 内蒙古自治区乌兰察布盟商都县
				localId.add("152627");       // 内蒙古自治区乌兰察布盟兴和县
				localId.add("152629");       // 内蒙古自治区乌兰察布盟凉城县
				localId.add("152630");       // 内蒙古自治区乌兰察布盟察哈尔右翼前旗
				localId.add("152631");       // 内蒙古自治区乌兰察布盟察哈尔右翼中旗
				localId.add("152632");       // 内蒙古自治区乌兰察布盟察哈尔右翼后旗
				localId.add("152634");       // 内蒙古自治区乌兰察布盟四子王旗
			}
			if (city.contains("伊克昭") || city.isEmpty()) {
				localId.add("152701");       // 内蒙古自治区伊克昭盟东胜市
				localId.add("152722");       // 内蒙古自治区伊克昭盟达拉特旗
				localId.add("152723");       // 内蒙古自治区伊克昭盟准格尔旗
				localId.add("152724");       // 内蒙古自治区伊克昭盟鄂托克前旗
				localId.add("152725");       // 内蒙古自治区伊克昭盟鄂托克旗
				localId.add("152726");       // 内蒙古自治区伊克昭盟杭锦旗
				localId.add("152727");       // 内蒙古自治区伊克昭盟乌审旗
				localId.add("152728");       // 内蒙古自治区伊克昭盟伊金霍洛旗
			}
			if (city.contains("巴彦淖尔") || city.isEmpty()) {
				localId.add("152801");       // 内蒙古自治区巴彦淖尔盟临河市
				localId.add("152822");       // 内蒙古自治区巴彦淖尔盟五原县
				localId.add("152823");       // 内蒙古自治区巴彦淖尔盟磴口县
				localId.add("152824");       // 内蒙古自治区巴彦淖尔盟乌拉特前旗
				localId.add("152825");       // 内蒙古自治区巴彦淖尔盟乌拉特中旗
				localId.add("152826");       // 内蒙古自治区巴彦淖尔盟乌拉特后旗
				localId.add("152827");       // 内蒙古自治区巴彦淖尔盟杭锦后旗
			}
			if (city.contains("阿拉善") || city.isEmpty()) {
				localId.add("152921");       // 内蒙古自治区阿拉善盟阿拉善左旗
				localId.add("152922");       // 内蒙古自治区阿拉善盟阿拉善右旗
				localId.add("152923");       // 内蒙古自治区阿拉善盟额济纳旗
			}
		}
		if (province.contains("辽宁") || province.isEmpty()) {
			if (city.contains("沈阳") || city.isEmpty()) {
				localId.add("210102");       // 辽宁省沈阳市和平区
				localId.add("210103");       // 辽宁省沈阳市沈河区
				localId.add("210104");       // 辽宁省沈阳市大东区
				localId.add("210105");       // 辽宁省沈阳市皇姑区
				localId.add("210106");       // 辽宁省沈阳市铁西区
				localId.add("210111");       // 辽宁省沈阳市苏家屯区
				localId.add("210112");       // 辽宁省沈阳市东陵区
				localId.add("210113");       // 辽宁省沈阳市新城子区
				localId.add("210114");       // 辽宁省沈阳市于洪区
				localId.add("210122");       // 辽宁省沈阳市辽中县
				localId.add("210123");       // 辽宁省沈阳市康平县
				localId.add("210124");       // 辽宁省沈阳市法库县
				localId.add("210181");       // 辽宁省沈阳市新民市
			}
			if (city.contains("大连") || city.isEmpty()) {
				localId.add("210202");       // 辽宁省大连市中山区
				localId.add("210203");       // 辽宁省大连市西岗区
				localId.add("210204");       // 辽宁省大连市沙河口区
				localId.add("210211");       // 辽宁省大连市甘井子区
				localId.add("210212");       // 辽宁省大连市旅顺口区
				localId.add("210213");       // 辽宁省大连市金州区
				localId.add("210224");       // 辽宁省大连市长海县
				localId.add("210281");       // 辽宁省大连市瓦房店市
				localId.add("210282");       // 辽宁省大连市普兰店市
				localId.add("210283");       // 辽宁省大连市庄河市
			}
			if (city.contains("鞍山") || city.isEmpty()) {
				localId.add("210302");       // 辽宁省鞍山市铁东区
				localId.add("210303");       // 辽宁省鞍山市铁西区
				localId.add("210304");       // 辽宁省鞍山市立山区
				localId.add("210311");       // 辽宁省鞍山市千山区
				localId.add("210321");       // 辽宁省鞍山市台安县
				localId.add("210323");       // 辽宁省鞍山市岫岩满族自治县
				localId.add("210381");       // 辽宁省鞍山市海城市
			}
			if (city.contains("抚顺") || city.isEmpty()) {
				localId.add("210402");       // 辽宁省抚顺市新抚区
				localId.add("210403");       // 辽宁省抚顺市露天区
				localId.add("210404");       // 辽宁省抚顺市望花区
				localId.add("210411");       // 辽宁省抚顺市顺城区
				localId.add("210421");       // 辽宁省抚顺市抚顺县
				localId.add("210422");       // 辽宁省抚顺市新宾满族自治县
				localId.add("210423");       // 辽宁省抚顺市清原满族自治县
			}
			if (city.contains("本溪") || city.isEmpty()) {
				localId.add("210502");       // 辽宁省本溪市平山区
				localId.add("210503");       // 辽宁省本溪市溪湖区
				localId.add("210504");       // 辽宁省本溪市明山区
				localId.add("210505");       // 辽宁省本溪市南芬区
				localId.add("210521");       // 辽宁省本溪市本溪满族自治县
				localId.add("210522");       // 辽宁省本溪市桓仁满族自治县
			}
			if (city.contains("丹东") || city.isEmpty()) {
				localId.add("210602");       // 辽宁省丹东市元宝区
				localId.add("210603");       // 辽宁省丹东市振兴区
				localId.add("210604");       // 辽宁省丹东市振安区
				localId.add("210624");       // 辽宁省丹东市宽甸满族自治县
				localId.add("210681");       // 辽宁省丹东市东港市
				localId.add("210682");       // 辽宁省丹东市凤城市
			}
			if (city.contains("锦州") || city.isEmpty()) {
				localId.add("210702");       // 辽宁省锦州市古塔区
				localId.add("210703");       // 辽宁省锦州市凌河区
				localId.add("210711");       // 辽宁省锦州市太和区
				localId.add("210726");       // 辽宁省锦州市黑山县
				localId.add("210727");       // 辽宁省锦州市义县
				localId.add("210781");       // 辽宁省锦州市凌海市
				localId.add("210782");       // 辽宁省锦州市北宁市
			}
			if (city.contains("营口") || city.isEmpty()) {
				localId.add("210802");       // 辽宁省营口市站前区
				localId.add("210803");       // 辽宁省营口市西市区
				localId.add("210804");       // 辽宁省营口市鲅鱼圈区
				localId.add("210811");       // 辽宁省营口市老边区
				localId.add("210881");       // 辽宁省营口市盖州市
				localId.add("210882");       // 辽宁省营口市大石桥市
			}
			if (city.contains("阜新") || city.isEmpty()) {
				localId.add("210902");       // 辽宁省阜新市海州区
				localId.add("210903");       // 辽宁省阜新市新邱区
				localId.add("210904");       // 辽宁省阜新市太平区
				localId.add("210905");       // 辽宁省阜新市清河门区
				localId.add("210911");       // 辽宁省阜新市细河区
				localId.add("210921");       // 辽宁省阜新市阜新蒙古族自治县
				localId.add("210922");       // 辽宁省阜新市彰武县
			}
			if (city.contains("辽阳") || city.isEmpty()) {
				localId.add("211002");       // 辽宁省辽阳市白塔区
				localId.add("211003");       // 辽宁省辽阳市文圣区
				localId.add("211004");       // 辽宁省辽阳市宏伟区
				localId.add("211005");       // 辽宁省辽阳市弓长岭区
				localId.add("211011");       // 辽宁省辽阳市太子河区
				localId.add("211021");       // 辽宁省辽阳市辽阳县
				localId.add("211081");       // 辽宁省辽阳市灯塔市
			}
			if (city.contains("盘锦") || city.isEmpty()) {
				localId.add("211102");       // 辽宁省盘锦市双台子区
				localId.add("211103");       // 辽宁省盘锦市兴隆台区
				localId.add("211121");       // 辽宁省盘锦市大洼县
				localId.add("211122");       // 辽宁省盘锦市盘山县
			}
			if (city.contains("铁岭") || city.isEmpty()) {
				localId.add("211202");       // 辽宁省铁岭市银州区
				localId.add("211204");       // 辽宁省铁岭市清河区
				localId.add("211221");       // 辽宁省铁岭市铁岭县
				localId.add("211223");       // 辽宁省铁岭市西丰县
				localId.add("211224");       // 辽宁省铁岭市昌图县
				localId.add("211281");       // 辽宁省铁岭市铁法市
				localId.add("211282");       // 辽宁省铁岭市开原市
			}
			if (city.contains("朝阳") || city.isEmpty()) {
				localId.add("211302");       // 辽宁省朝阳市双塔区
				localId.add("211303");       // 辽宁省朝阳市龙城区
				localId.add("211321");       // 辽宁省朝阳市朝阳县
				localId.add("211322");       // 辽宁省朝阳市建平县
				localId.add("211324");       // 辽宁省朝阳市喀喇沁左翼蒙古族自治县
				localId.add("211381");       // 辽宁省朝阳市北票市
				localId.add("211382");       // 辽宁省朝阳市凌源市
			}
			if (city.contains("葫芦岛") || city.isEmpty()) {
				localId.add("211402");       // 辽宁省葫芦岛市连山区
				localId.add("211403");       // 辽宁省葫芦岛市龙港区
				localId.add("211404");       // 辽宁省葫芦岛市南票区
				localId.add("211421");       // 辽宁省葫芦岛市绥中县
				localId.add("211422");       // 辽宁省葫芦岛市建昌县
				localId.add("211481");       // 辽宁省葫芦岛市兴城市
			}
		}
		if (province.contains("吉林") || province.isEmpty()) {
			if (city.contains("长春") || city.isEmpty()) {
				localId.add("220102");       // 吉林省长春市南关区
				localId.add("220103");       // 吉林省长春市宽城区
				localId.add("220104");       // 吉林省长春市朝阳区
				localId.add("220105");       // 吉林省长春市二道区
				localId.add("220106");       // 吉林省长春市绿园区
				localId.add("220112");       // 吉林省长春市双阳区
				localId.add("220122");       // 吉林省长春市农安县
				localId.add("220181");       // 吉林省长春市九台市
				localId.add("220182");       // 吉林省长春市榆树市
				localId.add("220183");       // 吉林省长春市德惠市
			}
			if (city.contains("吉林") || city.isEmpty()) {
				localId.add("220202");       // 吉林省吉林市昌邑区
				localId.add("220203");       // 吉林省吉林市龙潭区
				localId.add("220204");       // 吉林省吉林市船营区
				localId.add("220211");       // 吉林省吉林市丰满区
				localId.add("220221");       // 吉林省吉林市永吉县
				localId.add("220281");       // 吉林省吉林市蛟河市
				localId.add("220282");       // 吉林省吉林市桦甸市
				localId.add("220283");       // 吉林省吉林市舒兰市
				localId.add("220284");       // 吉林省吉林市磐石市
			}
			if (city.contains("四平") || city.isEmpty()) {
				localId.add("220302");       // 吉林省四平市铁西区
				localId.add("220303");       // 吉林省四平市铁东区
				localId.add("220322");       // 吉林省四平市梨树县
				localId.add("220323");       // 吉林省四平市伊通满族自治县
				localId.add("220381");       // 吉林省四平市公主岭市
				localId.add("220382");       // 吉林省四平市双辽市
			}
			if (city.contains("辽源") || city.isEmpty()) {
				localId.add("220402");       // 吉林省辽源市龙山区
				localId.add("220403");       // 吉林省辽源市西安区
				localId.add("220421");       // 吉林省辽源市东丰县
				localId.add("220422");       // 吉林省辽源市东辽县
			}
			if (city.contains("通化") || city.isEmpty()) {
				localId.add("220502");       // 吉林省通化市东昌区
				localId.add("220503");       // 吉林省通化市二道江区
				localId.add("220521");       // 吉林省通化市通化县
				localId.add("220523");       // 吉林省通化市辉南县
				localId.add("220524");       // 吉林省通化市柳河县
				localId.add("220581");       // 吉林省通化市梅河口市
				localId.add("220582");       // 吉林省通化市集安市
			}
			if (city.contains("白山") || city.isEmpty()) {
				localId.add("220602");       // 吉林省白山市八道江区
				localId.add("220621");       // 吉林省白山市抚松县
				localId.add("220622");       // 吉林省白山市靖宇县
				localId.add("220623");       // 吉林省白山市长白朝鲜族自治县
				localId.add("220625");       // 吉林省白山市江源县
				localId.add("220681");       // 吉林省白山市临江市
			}
			if (city.contains("松原") || city.isEmpty()) {
				localId.add("220702");       // 吉林省松原市宁江区
				localId.add("220721");       // 吉林省松原市前郭尔罗斯蒙古族自治县
				localId.add("220722");       // 吉林省松原市长岭县
				localId.add("220723");       // 吉林省松原市乾安县
				localId.add("220724");       // 吉林省松原市扶余县
			}
			if (city.contains("白城") || city.isEmpty()) {
				localId.add("220802");       // 吉林省白城市洮北区
				localId.add("220821");       // 吉林省白城市镇赉县
				localId.add("220822");       // 吉林省白城市通榆县
				localId.add("220881");       // 吉林省白城市洮南市
				localId.add("220882");       // 吉林省白城市大安市
			}
			if (city.contains("延边") || city.isEmpty()) {
				localId.add("222401");       // 吉林省延边朝鲜族自治州延吉市
				localId.add("222402");       // 吉林省延边朝鲜族自治州图们市
				localId.add("222403");       // 吉林省延边朝鲜族自治州敦化市
				localId.add("222404");       // 吉林省延边朝鲜族自治州珲春市
				localId.add("222405");       // 吉林省延边朝鲜族自治州龙井市
				localId.add("222406");       // 吉林省延边朝鲜族自治州和龙市
				localId.add("222424");       // 吉林省延边朝鲜族自治州汪清县
				localId.add("222426");       // 吉林省延边朝鲜族自治州安图县
			}
		}
		if (province.contains("黑龙江") || province.isEmpty()) {
			if (city.contains("哈尔滨") || city.isEmpty()) {
				localId.add("230100");       // 黑龙江省哈尔滨市
				localId.add("230101");       // 黑龙江省哈尔滨市市辖区
				localId.add("230102");       // 黑龙江省哈尔滨市道里区
				localId.add("230103");       // 黑龙江省哈尔滨市南岗区
				localId.add("230104");       // 黑龙江省哈尔滨市道外区
				localId.add("230105");       // 黑龙江省哈尔滨市太平区
				localId.add("230106");       // 黑龙江省哈尔滨市香坊区
				localId.add("230107");       // 黑龙江省哈尔滨市动力区
				localId.add("230108");       // 黑龙江省哈尔滨市平房区
				localId.add("230121");       // 黑龙江省哈尔滨市呼兰县
				localId.add("230123");       // 黑龙江省哈尔滨市依兰县
				localId.add("230124");       // 黑龙江省哈尔滨市方正县
				localId.add("230125");       // 黑龙江省哈尔滨市宾县
				localId.add("230126");       // 黑龙江省哈尔滨市巴彦县
				localId.add("230127");       // 黑龙江省哈尔滨市木兰县
				localId.add("230128");       // 黑龙江省哈尔滨市通河县
				localId.add("230129");       // 黑龙江省哈尔滨市延寿县
				localId.add("230181");       // 黑龙江省哈尔滨市阿城市
				localId.add("230182");       // 黑龙江省哈尔滨市双城市
				localId.add("230183");       // 黑龙江省哈尔滨市尚志市
				localId.add("230184");       // 黑龙江省哈尔滨市五常市
			}
			if (city.contains("齐齐哈尔") || city.isEmpty()) {
				localId.add("230202");       // 黑龙江省齐齐哈尔市龙沙区
				localId.add("230203");       // 黑龙江省齐齐哈尔市建华区
				localId.add("230204");       // 黑龙江省齐齐哈尔市铁锋区
				localId.add("230205");       // 黑龙江省齐齐哈尔市昂昂溪区
				localId.add("230206");       // 黑龙江省齐齐哈尔市富拉尔基区
				localId.add("230207");       // 黑龙江省齐齐哈尔市碾子山区
				localId.add("230208");       // 黑龙江省齐齐哈尔市梅里斯达斡尔族区
				localId.add("230221");       // 黑龙江省齐齐哈尔市龙江县
				localId.add("230223");       // 黑龙江省齐齐哈尔市依安县
				localId.add("230224");       // 黑龙江省齐齐哈尔市泰来县
				localId.add("230225");       // 黑龙江省齐齐哈尔市甘南县
				localId.add("230227");       // 黑龙江省齐齐哈尔市富裕县
				localId.add("230229");       // 黑龙江省齐齐哈尔市克山县
				localId.add("230230");       // 黑龙江省齐齐哈尔市克东县
				localId.add("230231");       // 黑龙江省齐齐哈尔市拜泉县
				localId.add("230281");       // 黑龙江省齐齐哈尔市讷河市
			}
			if (city.contains("鸡西") || city.isEmpty()) {
				localId.add("230302");       // 黑龙江省鸡西市鸡冠区
				localId.add("230303");       // 黑龙江省鸡西市恒山区
				localId.add("230304");       // 黑龙江省鸡西市滴道区
				localId.add("230305");       // 黑龙江省鸡西市梨树区
				localId.add("230306");       // 黑龙江省鸡西市城子河区
				localId.add("230307");       // 黑龙江省鸡西市麻山区
				localId.add("230321");       // 黑龙江省鸡西市鸡东县
				localId.add("230381");       // 黑龙江省鸡西市虎林市
				localId.add("230382");       // 黑龙江省鸡西市密山市
			}
			if (city.contains("鹤岗") || city.isEmpty()) {
				localId.add("230402");       // 黑龙江省鹤岗市向阳区
				localId.add("230403");       // 黑龙江省鹤岗市工农区
				localId.add("230404");       // 黑龙江省鹤岗市南山区
				localId.add("230405");       // 黑龙江省鹤岗市兴安区
				localId.add("230406");       // 黑龙江省鹤岗市东山区
				localId.add("230407");       // 黑龙江省鹤岗市兴山区
				localId.add("230421");       // 黑龙江省鹤岗市萝北县
				localId.add("230422");       // 黑龙江省鹤岗市绥滨县
			}
			if (city.contains("双鸭山") || city.isEmpty()) {
				localId.add("230502");       // 黑龙江省双鸭山市尖山区
				localId.add("230503");       // 黑龙江省双鸭山市岭东区
				localId.add("230505");       // 黑龙江省双鸭山市四方台区
				localId.add("230506");       // 黑龙江省双鸭山市宝山区
				localId.add("230521");       // 黑龙江省双鸭山市集贤县
				localId.add("230522");       // 黑龙江省双鸭山市友谊县
				localId.add("230523");       // 黑龙江省双鸭山市宝清县
				localId.add("230524");       // 黑龙江省双鸭山市饶河县
			}
			if (city.contains("大庆") || city.isEmpty()) {
				localId.add("230602");       // 黑龙江省大庆市萨尔图区
				localId.add("230603");       // 黑龙江省大庆市龙凤区
				localId.add("230604");       // 黑龙江省大庆市让胡路区
				localId.add("230605");       // 黑龙江省大庆市红岗区
				localId.add("230606");       // 黑龙江省大庆市大同区
				localId.add("230621");       // 黑龙江省大庆市肇州县
				localId.add("230622");       // 黑龙江省大庆市肇源县
				localId.add("230623");       // 黑龙江省大庆市林甸县
				localId.add("230624");       // 黑龙江省大庆市杜尔伯特蒙古族自治县
			}
			if (city.contains("伊春") || city.isEmpty()) {
				localId.add("230702");       // 黑龙江省伊春市伊春区
				localId.add("230703");       // 黑龙江省伊春市南岔区
				localId.add("230704");       // 黑龙江省伊春市友好区
				localId.add("230705");       // 黑龙江省伊春市西林区
				localId.add("230706");       // 黑龙江省伊春市翠峦区
				localId.add("230707");       // 黑龙江省伊春市新青区
				localId.add("230708");       // 黑龙江省伊春市美溪区
				localId.add("230709");       // 黑龙江省伊春市金山屯区
				localId.add("230710");       // 黑龙江省伊春市五营区
				localId.add("230711");       // 黑龙江省伊春市乌马河区
				localId.add("230712");       // 黑龙江省伊春市汤旺河区
				localId.add("230713");       // 黑龙江省伊春市带岭区
				localId.add("230714");       // 黑龙江省伊春市乌伊岭区
				localId.add("230715");       // 黑龙江省伊春市红星区
				localId.add("230716");       // 黑龙江省伊春市上甘岭区
				localId.add("230722");       // 黑龙江省伊春市嘉荫县
				localId.add("230781");       // 黑龙江省伊春市铁力市
			}
			if (city.contains("佳木斯") || city.isEmpty()) {
				localId.add("230802");       // 黑龙江省佳木斯市永红区
				localId.add("230803");       // 黑龙江省佳木斯市向阳区
				localId.add("230804");       // 黑龙江省佳木斯市前进区
				localId.add("230805");       // 黑龙江省佳木斯市东风区
				localId.add("230811");       // 黑龙江省佳木斯市郊区
				localId.add("230822");       // 黑龙江省佳木斯市桦南县
				localId.add("230826");       // 黑龙江省佳木斯市桦川县
				localId.add("230828");       // 黑龙江省佳木斯市汤原县
				localId.add("230833");       // 黑龙江省佳木斯市抚远县
				localId.add("230881");       // 黑龙江省佳木斯市同江市
				localId.add("230882");       // 黑龙江省佳木斯市富锦市
			}
			if (city.contains("七台河") || city.isEmpty()) {
				localId.add("230902");       // 黑龙江省七台河市新兴区
				localId.add("230903");       // 黑龙江省七台河市桃山区
				localId.add("230904");       // 黑龙江省七台河市茄子河区
				localId.add("230921");       // 黑龙江省七台河市勃利县
			}
			if (city.contains("牡丹江") || city.isEmpty()) {
				localId.add("231002");       // 黑龙江省牡丹江市东安区
				localId.add("231003");       // 黑龙江省牡丹江市阳明区
				localId.add("231004");       // 黑龙江省牡丹江市爱民区
				localId.add("231005");       // 黑龙江省牡丹江市西安区
				localId.add("231024");       // 黑龙江省牡丹江市东宁县
				localId.add("231025");       // 黑龙江省牡丹江市林口县
				localId.add("231081");       // 黑龙江省牡丹江市绥芬河市
				localId.add("231083");       // 黑龙江省牡丹江市海林市
				localId.add("231084");       // 黑龙江省牡丹江市宁安市
				localId.add("231085");       // 黑龙江省牡丹江市穆棱市
			}
			if (city.contains("黑河") || city.isEmpty()) {
				localId.add("231102");       // 黑龙江省黑河市爱辉区
				localId.add("231121");       // 黑龙江省黑河市嫩江县
				localId.add("231123");       // 黑龙江省黑河市逊克县
				localId.add("231124");       // 黑龙江省黑河市孙吴县
				localId.add("231181");       // 黑龙江省黑河市北安市
				localId.add("231182");       // 黑龙江省黑河市五大连池市
			}
			if (city.contains("绥化") || city.isEmpty()) {
				localId.add("232301");       // 黑龙江省绥化地区绥化市
				localId.add("232302");       // 黑龙江省绥化地区安达市
				localId.add("232303");       // 黑龙江省绥化地区肇东市
				localId.add("232304");       // 黑龙江省绥化地区海伦市
				localId.add("232324");       // 黑龙江省绥化地区望奎县
				localId.add("232325");       // 黑龙江省绥化地区兰西县
				localId.add("232326");       // 黑龙江省绥化地区青冈县
				localId.add("232330");       // 黑龙江省绥化地区庆安县
				localId.add("232331");       // 黑龙江省绥化地区明水县
				localId.add("232332");       // 黑龙江省绥化地区绥棱县
			}
			if (city.contains("大兴安岭") || city.isEmpty()) {
				localId.add("232721");       // 黑龙江省大兴安岭地区呼玛县
				localId.add("232722");       // 黑龙江省大兴安岭地区塔河县
				localId.add("232723");       // 黑龙江省大兴安岭地区漠河县
			}
		}
		if (province.contains("上海") || province.isEmpty()) {
			if (city.contains("黄浦") || city.isEmpty()) {
				localId.add("310101");       // 上海市黄浦区
			}
			if (city.contains("南市") || city.isEmpty()) {
				localId.add("310102");       // 上海市南市区
			}
			if (city.contains("卢湾") || city.isEmpty()) {
				localId.add("310103");       // 上海市卢湾区
			}
			if (city.contains("徐汇") || city.isEmpty()) {
				localId.add("310104");       // 上海市徐汇区
			}
			if (city.contains("长宁") || city.isEmpty()) {
				localId.add("310105");       // 上海市长宁区
			}
			if (city.contains("静安") || city.isEmpty()) {
				localId.add("310106");       // 上海市静安区
			}
			if (city.contains("普陀") || city.isEmpty()) {
				localId.add("310107");       // 上海市普陀区
			}
			if (city.contains("闸北") || city.isEmpty()) {
				localId.add("310108");       // 上海市闸北区
			}
			if (city.contains("虹口") || city.isEmpty()) {
				localId.add("310109");       // 上海市虹口区
			}
			if (city.contains("杨浦") || city.isEmpty()) {
				localId.add("310110");       // 上海市杨浦区
			}
			if (city.contains("闵行") || city.isEmpty()) {
				localId.add("310112");       // 上海市闵行区
			}
			if (city.contains("宝山") || city.isEmpty()) {
				localId.add("310113");       // 上海市宝山区
			}
			if (city.contains("嘉定") || city.isEmpty()) {
				localId.add("310114");       // 上海市嘉定区
			}
			if (city.contains("浦东") || city.isEmpty()) {
				localId.add("310115");       // 上海市浦东新区
			}
			if (city.contains("金山") || city.isEmpty()) {
				localId.add("310116");       // 上海市金山区
			}
			if (city.contains("松江") || city.isEmpty()) {
				localId.add("310117");       // 上海市松江区
			}
			if (city.contains("南汇") || city.isEmpty()) {
				localId.add("310225");       // 上海市南汇县
			}
			if (city.contains("奉贤") || city.isEmpty()) {
				localId.add("310226");       // 上海市奉贤县
			}
			if (city.contains("青浦") || city.isEmpty()) {
				localId.add("310229");       // 上海市青浦县
			}
			if (city.contains("崇明") || city.isEmpty()) {
				localId.add("310230");       // 上海市崇明县
			}
		}
		if (province.contains("江苏") || province.isEmpty()) {
			if (city.contains("南京") || city.isEmpty()) {
				localId.add("320102");       // 江苏省南京市玄武区
				localId.add("320103");       // 江苏省南京市白下区
				localId.add("320104");       // 江苏省南京市秦淮区
				localId.add("320105");       // 江苏省南京市建邺区
				localId.add("320106");       // 江苏省南京市鼓楼区
				localId.add("320107");       // 江苏省南京市下关区
				localId.add("320111");       // 江苏省南京市浦口区
				localId.add("320112");       // 江苏省南京市大厂区
				localId.add("320113");       // 江苏省南京市栖霞区
				localId.add("320114");       // 江苏省南京市雨花台区
				localId.add("320121");       // 江苏省南京市江宁县
				localId.add("320122");       // 江苏省南京市江浦县
				localId.add("320123");       // 江苏省南京市六合县
				localId.add("320124");       // 江苏省南京市溧水县
				localId.add("320125");       // 江苏省南京市高淳县
			}
			if (city.contains("无锡") || city.isEmpty()) {
				localId.add("320202");       // 江苏省无锡市崇安区
				localId.add("320203");       // 江苏省无锡市南长区
				localId.add("320204");       // 江苏省无锡市北塘区
				localId.add("320211");       // 江苏省无锡市郊区
				localId.add("320281");       // 江苏省无锡市江阴市
				localId.add("320282");       // 江苏省无锡市宜兴市
				localId.add("320283");       // 江苏省无锡市锡山市
			}
			if (city.contains("徐州") || city.isEmpty()) {
				localId.add("320302");       // 江苏省徐州市鼓楼区
				localId.add("320303");       // 江苏省徐州市云龙区
				localId.add("320304");       // 江苏省徐州市九里区
				localId.add("320305");       // 江苏省徐州市贾汪区
				localId.add("320311");       // 江苏省徐州市泉山区
				localId.add("320321");       // 江苏省徐州市丰县
				localId.add("320322");       // 江苏省徐州市沛县
				localId.add("320323");       // 江苏省徐州市铜山县
				localId.add("320324");       // 江苏省徐州市睢宁县
				localId.add("320381");       // 江苏省徐州市新沂市
				localId.add("320382");       // 江苏省徐州市邳州市
			}
			if (city.contains("常州") || city.isEmpty()) {
				localId.add("320402");       // 江苏省常州市天宁区
				localId.add("320404");       // 江苏省常州市钟楼区
				localId.add("320405");       // 江苏省常州市戚墅堰区
				localId.add("320411");       // 江苏省常州市郊区
				localId.add("320481");       // 江苏省常州市溧阳市
				localId.add("320482");       // 江苏省常州市金坛市
				localId.add("320483");       // 江苏省常州市武进市
			}
			if (city.contains("苏州") || city.isEmpty()) {
				localId.add("320502");       // 江苏省苏州市沧浪区
				localId.add("320503");       // 江苏省苏州市平江区
				localId.add("320504");       // 江苏省苏州市金阊区
				localId.add("320511");       // 江苏省苏州市郊区
				localId.add("320581");       // 江苏省苏州市常熟市
				localId.add("320582");       // 江苏省苏州市张家港市
				localId.add("320583");       // 江苏省苏州市昆山市
				localId.add("320584");       // 江苏省苏州市吴江市
				localId.add("320585");       // 江苏省苏州市太仓市
				localId.add("320586");       // 江苏省苏州市吴县市
			}
			if (city.contains("南通") || city.isEmpty()) {
				localId.add("320602");       // 江苏省南通市崇川区
				localId.add("320611");       // 江苏省南通市港闸区
				localId.add("320621");       // 江苏省南通市海安县
				localId.add("320623");       // 江苏省南通市如东县
				localId.add("320681");       // 江苏省南通市启东市
				localId.add("320682");       // 江苏省南通市如皋市
				localId.add("320683");       // 江苏省南通市通州市
				localId.add("320684");       // 江苏省南通市海门市
			}
			if (city.contains("连云港") || city.isEmpty()) {
				localId.add("320703");       // 江苏省连云港市连云区
				localId.add("320704");       // 江苏省连云港市云台区
				localId.add("320705");       // 江苏省连云港市新浦区
				localId.add("320706");       // 江苏省连云港市海州区
				localId.add("320721");       // 江苏省连云港市赣榆县
				localId.add("320722");       // 江苏省连云港市东海县
				localId.add("320723");       // 江苏省连云港市灌云县
				localId.add("320724");       // 江苏省连云港市灌南县
			}
			if (city.contains("淮阴") || city.isEmpty()) {
				localId.add("320802");       // 江苏省淮阴市清河区
				localId.add("320811");       // 江苏省淮阴市清浦区
				localId.add("320821");       // 江苏省淮阴市淮阴县
				localId.add("320826");       // 江苏省淮阴市涟水县
				localId.add("320829");       // 江苏省淮阴市洪泽县
				localId.add("320830");       // 江苏省淮阴市盱眙县
				localId.add("320831");       // 江苏省淮阴市金湖县
				localId.add("320882");       // 江苏省淮阴市淮安市
			}
			if (city.contains("盐城") || city.isEmpty()) {
				localId.add("320902");       // 江苏省盐城市城区
				localId.add("320921");       // 江苏省盐城市响水县
				localId.add("320922");       // 江苏省盐城市滨海县
				localId.add("320923");       // 江苏省盐城市阜宁县
				localId.add("320924");       // 江苏省盐城市射阳县
				localId.add("320925");       // 江苏省盐城市建湖县
				localId.add("320928");       // 江苏省盐城市盐都县
				localId.add("320981");       // 江苏省盐城市东台市
				localId.add("320982");       // 江苏省盐城市大丰市
			}
			if (city.contains("扬州") || city.isEmpty()) {
				localId.add("321002");       // 江苏省扬州市广陵区
				localId.add("321011");       // 江苏省扬州市郊区
				localId.add("321023");       // 江苏省扬州市宝应县
				localId.add("321027");       // 江苏省扬州市邗江县
				localId.add("321081");       // 江苏省扬州市仪征市
				localId.add("321084");       // 江苏省扬州市高邮市
				localId.add("321088");       // 江苏省扬州市江都市
			}
			if (city.contains("镇江") || city.isEmpty()) {
				localId.add("321102");       // 江苏省镇江市京口区
				localId.add("321111");       // 江苏省镇江市润州区
				localId.add("321121");       // 江苏省镇江市丹徒县
				localId.add("321181");       // 江苏省镇江市丹阳市
				localId.add("321182");       // 江苏省镇江市扬中市
				localId.add("321183");       // 江苏省镇江市句容市
			}
			if (city.contains("泰州") || city.isEmpty()) {
				localId.add("321202");       // 江苏省泰州市海陵区
				localId.add("321203");       // 江苏省泰州市高港区
				localId.add("321281");       // 江苏省泰州市兴化市
				localId.add("321282");       // 江苏省泰州市靖江市
				localId.add("321283");       // 江苏省泰州市泰兴市
				localId.add("321284");       // 江苏省泰州市姜堰市
			}
			if (city.contains("宿迁") || city.isEmpty()) {
				localId.add("321302");       // 江苏省宿迁市宿城区
				localId.add("321321");       // 江苏省宿迁市宿豫县
				localId.add("321322");       // 江苏省宿迁市沭阳县
				localId.add("321323");       // 江苏省宿迁市泗阳县
				localId.add("321324");       // 江苏省宿迁市泗洪县
			}
		}
		if (province.contains("浙江") || province.isEmpty()) {
			if (city.contains("杭州") || city.isEmpty()) {
				localId.add("330102");       // 浙江省杭州市上城区
				localId.add("330103");       // 浙江省杭州市下城区
				localId.add("330104");       // 浙江省杭州市江干区
				localId.add("330105");       // 浙江省杭州市拱墅区
				localId.add("330106");       // 浙江省杭州市西湖区
				localId.add("330108");       // 浙江省杭州市滨江区
				localId.add("330122");       // 浙江省杭州市桐庐县
				localId.add("330127");       // 浙江省杭州市淳安县
				localId.add("330181");       // 浙江省杭州市萧山市
				localId.add("330182");       // 浙江省杭州市建德市
				localId.add("330183");       // 浙江省杭州市富阳市
				localId.add("330184");       // 浙江省杭州市余杭市
				localId.add("330185");       // 浙江省杭州市临安市
			}
			if (city.contains("宁波") || city.isEmpty()) {
				localId.add("330202");       // 浙江省宁波市镇明区
				localId.add("330203");       // 浙江省宁波市海曙区
				localId.add("330204");       // 浙江省宁波市江东区
				localId.add("330205");       // 浙江省宁波市江北区
				localId.add("330206");       // 浙江省宁波市北仑区
				localId.add("330211");       // 浙江省宁波市镇海区
				localId.add("330225");       // 浙江省宁波市象山县
				localId.add("330226");       // 浙江省宁波市宁海县
				localId.add("330227");       // 浙江省宁波市鄞县
				localId.add("330281");       // 浙江省宁波市余姚市
				localId.add("330282");       // 浙江省宁波市慈溪市
				localId.add("330283");       // 浙江省宁波市奉化市
			}
			if (city.contains("温州") || city.isEmpty()) {
				localId.add("330302");       // 浙江省温州市鹿城区
				localId.add("330303");       // 浙江省温州市龙湾区
				localId.add("330304");       // 浙江省温州市瓯海区
				localId.add("330322");       // 浙江省温州市洞头县
				localId.add("330324");       // 浙江省温州市永嘉县
				localId.add("330326");       // 浙江省温州市平阳县
				localId.add("330327");       // 浙江省温州市苍南县
				localId.add("330328");       // 浙江省温州市文成县
				localId.add("330329");       // 浙江省温州市泰顺县
				localId.add("330381");       // 浙江省温州市瑞安市
				localId.add("330382");       // 浙江省温州市乐清市
			}
			if (city.contains("嘉兴") || city.isEmpty()) {
				localId.add("330402");       // 浙江省嘉兴市秀城区
				localId.add("330411");       // 浙江省嘉兴市郊区
				localId.add("330421");       // 浙江省嘉兴市嘉善县
				localId.add("330424");       // 浙江省嘉兴市海盐县
				localId.add("330481");       // 浙江省嘉兴市海宁市
				localId.add("330482");       // 浙江省嘉兴市平湖市
				localId.add("330483");       // 浙江省嘉兴市桐乡市
			}
			if (city.contains("湖州") || city.isEmpty()) {
				localId.add("330521");       // 浙江省湖州市德清县
				localId.add("330522");       // 浙江省湖州市长兴县
				localId.add("330523");       // 浙江省湖州市安吉县
			}
			if (city.contains("绍兴") || city.isEmpty()) {
				localId.add("330602");       // 浙江省绍兴市越城区
				localId.add("330621");       // 浙江省绍兴市绍兴县
				localId.add("330624");       // 浙江省绍兴市新昌县
				localId.add("330681");       // 浙江省绍兴市诸暨市
				localId.add("330682");       // 浙江省绍兴市上虞市
				localId.add("330683");       // 浙江省绍兴市嵊州市
			}
			if (city.contains("金华") || city.isEmpty()) {
				localId.add("330702");       // 浙江省金华市婺城区
				localId.add("330721");       // 浙江省金华市金华县
				localId.add("330723");       // 浙江省金华市武义县
				localId.add("330726");       // 浙江省金华市浦江县
				localId.add("330727");       // 浙江省金华市磐安县
				localId.add("330781");       // 浙江省金华市兰溪市
				localId.add("330782");       // 浙江省金华市义乌市
				localId.add("330783");       // 浙江省金华市东阳市
				localId.add("330784");       // 浙江省金华市永康市
			}
			if (city.contains("衢州") || city.isEmpty()) {
				localId.add("330802");       // 浙江省衢州市柯城区
				localId.add("330821");       // 浙江省衢州市衢县
				localId.add("330822");       // 浙江省衢州市常山县
				localId.add("330824");       // 浙江省衢州市开化县
				localId.add("330825");       // 浙江省衢州市龙游县
				localId.add("330881");       // 浙江省衢州市江山市
			}
			if (city.contains("舟山") || city.isEmpty()) {
				localId.add("330902");       // 浙江省舟山市定海区
				localId.add("330903");       // 浙江省舟山市普陀区
				localId.add("330921");       // 浙江省舟山市岱山县
				localId.add("330922");       // 浙江省舟山市嵊泗县
			}
			if (city.contains("台州") || city.isEmpty()) {
				localId.add("331002");       // 浙江省台州市椒江区
				localId.add("331003");       // 浙江省台州市黄岩区
				localId.add("331004");       // 浙江省台州市路桥区
				localId.add("331021");       // 浙江省台州市玉环县
				localId.add("331022");       // 浙江省台州市三门县
				localId.add("331023");       // 浙江省台州市天台县
				localId.add("331024");       // 浙江省台州市仙居县
				localId.add("331081");       // 浙江省台州市温岭市
				localId.add("331082");       // 浙江省台州市临海市
			}
			if (city.contains("丽水") || city.isEmpty()) {
				localId.add("332501");       // 浙江省丽水地区丽水市
				localId.add("332502");       // 浙江省丽水地区龙泉市
				localId.add("332522");       // 浙江省丽水地区青田县
				localId.add("332523");       // 浙江省丽水地区云和县
				localId.add("332525");       // 浙江省丽水地区庆元县
				localId.add("332526");       // 浙江省丽水地区缙云县
				localId.add("332527");       // 浙江省丽水地区遂昌县
				localId.add("332528");       // 浙江省丽水地区松阳县
				localId.add("332529");       // 浙江省丽水地区景宁畲族自治县
			}
		}
		if (province.contains("安徽") || province.isEmpty()) {
			if (city.contains("合肥") || city.isEmpty()) {
				localId.add("340102");       // 安徽省合肥市东市区
				localId.add("340103");       // 安徽省合肥市中市区
				localId.add("340104");       // 安徽省合肥市西市区
				localId.add("340111");       // 安徽省合肥市郊区
				localId.add("340121");       // 安徽省合肥市长丰县
				localId.add("340122");       // 安徽省合肥市肥东县
				localId.add("340123");       // 安徽省合肥市肥西县
			}
			if (city.contains("芜湖") || city.isEmpty()) {
				localId.add("340202");       // 安徽省芜湖市镜湖区
				localId.add("340203");       // 安徽省芜湖市马塘区
				localId.add("340204");       // 安徽省芜湖市新芜区
				localId.add("340207");       // 安徽省芜湖市鸠江区
				localId.add("340221");       // 安徽省芜湖市芜湖县
				localId.add("340222");       // 安徽省芜湖市繁昌县
				localId.add("340223");       // 安徽省芜湖市南陵县
			}
			if (city.contains("蚌埠") || city.isEmpty()) {
				localId.add("340302");       // 安徽省蚌埠市东市区
				localId.add("340303");       // 安徽省蚌埠市中市区
				localId.add("340304");       // 安徽省蚌埠市西市区
				localId.add("340311");       // 安徽省蚌埠市郊区
				localId.add("340321");       // 安徽省蚌埠市怀远县
				localId.add("340322");       // 安徽省蚌埠市五河县
				localId.add("340323");       // 安徽省蚌埠市固镇县
			}
			if (city.contains("淮南") || city.isEmpty()) {
				localId.add("340402");       // 安徽省淮南市大通区
				localId.add("340403");       // 安徽省淮南市田家庵区
				localId.add("340404");       // 安徽省淮南市谢家集区
				localId.add("340405");       // 安徽省淮南市八公山区
				localId.add("340406");       // 安徽省淮南市潘集区
				localId.add("340421");       // 安徽省淮南市凤台县
			}
			if (city.contains("马鞍山") || city.isEmpty()) {
				localId.add("340502");       // 安徽省马鞍山市金家庄区
				localId.add("340503");       // 安徽省马鞍山市花山区
				localId.add("340504");       // 安徽省马鞍山市雨山区
				localId.add("340505");       // 安徽省马鞍山市向山区
				localId.add("340521");       // 安徽省马鞍山市当涂县
			}
			if (city.contains("淮北") || city.isEmpty()) {
				localId.add("340602");       // 安徽省淮北市杜集区
				localId.add("340603");       // 安徽省淮北市相山区
				localId.add("340604");       // 安徽省淮北市烈山区
				localId.add("340621");       // 安徽省淮北市濉溪县
			}
			if (city.contains("铜陵") || city.isEmpty()) {
				localId.add("340702");       // 安徽省铜陵市铜官山区
				localId.add("340703");       // 安徽省铜陵市狮子山区
				localId.add("340711");       // 安徽省铜陵市郊区
				localId.add("340721");       // 安徽省铜陵市铜陵县
			}
			if (city.contains("安庆") || city.isEmpty()) {
				localId.add("340802");       // 安徽省安庆市迎江区
				localId.add("340803");       // 安徽省安庆市大观区
				localId.add("340811");       // 安徽省安庆市郊区
				localId.add("340822");       // 安徽省安庆市怀宁县
				localId.add("340823");       // 安徽省安庆市枞阳县
				localId.add("340824");       // 安徽省安庆市潜山县
				localId.add("340825");       // 安徽省安庆市太湖县
				localId.add("340826");       // 安徽省安庆市宿松县
				localId.add("340827");       // 安徽省安庆市望江县
				localId.add("340828");       // 安徽省安庆市岳西县
				localId.add("340881");       // 安徽省安庆市桐城市
			}
			if (city.contains("黄山") || city.isEmpty()) {
				localId.add("341002");       // 安徽省黄山市屯溪区
				localId.add("341003");       // 安徽省黄山市黄山区
				localId.add("341004");       // 安徽省黄山市徽州区
				localId.add("341021");       // 安徽省黄山市歙县
				localId.add("341022");       // 安徽省黄山市休宁县
				localId.add("341023");       // 安徽省黄山市黟县
				localId.add("341024");       // 安徽省黄山市祁门县
			}
			if (city.contains("滁州") || city.isEmpty()) {
				localId.add("341102");       // 安徽省滁州市琅琊区
				localId.add("341103");       // 安徽省滁州市南谯区
				localId.add("341122");       // 安徽省滁州市来安县
				localId.add("341124");       // 安徽省滁州市全椒县
				localId.add("341125");       // 安徽省滁州市定远县
				localId.add("341126");       // 安徽省滁州市凤阳县
				localId.add("341181");       // 安徽省滁州市天长市
				localId.add("341182");       // 安徽省滁州市明光市
			}
			if (city.contains("阜阳") || city.isEmpty()) {
				localId.add("341202");       // 安徽省阜阳市颍州区
				localId.add("341203");       // 安徽省阜阳市颍东区
				localId.add("341204");       // 安徽省阜阳市颍泉区
				localId.add("341221");       // 安徽省阜阳市临泉县
				localId.add("341222");       // 安徽省阜阳市太和县
				localId.add("341223");       // 安徽省阜阳市涡阳县
				localId.add("341224");       // 安徽省阜阳市蒙城县
				localId.add("341225");       // 安徽省阜阳市阜南县
				localId.add("341226");       // 安徽省阜阳市颍上县
				localId.add("341227");       // 安徽省阜阳市利辛县
				localId.add("341281");       // 安徽省阜阳市亳州市
				localId.add("341282");       // 安徽省阜阳市界首市
			}
			if (city.contains("宿州") || city.isEmpty()) {
				localId.add("341302");       // 安徽省宿州市甬桥区
				localId.add("341321");       // 安徽省宿州市砀山县
				localId.add("341322");       // 安徽省宿州市萧县
				localId.add("341323");       // 安徽省宿州市灵璧县
				localId.add("341324");       // 安徽省宿州市泗县
			}
			if (city.contains("六安") || city.isEmpty()) {
				localId.add("342401");       // 安徽省六安地区六安市
				localId.add("342422");       // 安徽省六安地区寿县
				localId.add("342423");       // 安徽省六安地区霍邱县
				localId.add("342425");       // 安徽省六安地区舒城县
				localId.add("342426");       // 安徽省六安地区金寨县
				localId.add("342427");       // 安徽省六安地区霍山县
			}
			if (city.contains("宣城") || city.isEmpty()) {
				localId.add("342501");       // 安徽省宣城地区宣州市
				localId.add("342502");       // 安徽省宣城地区宁国市
				localId.add("342522");       // 安徽省宣城地区郎溪县
				localId.add("342523");       // 安徽省宣城地区广德县
				localId.add("342529");       // 安徽省宣城地区泾县
				localId.add("342530");       // 安徽省宣城地区旌德县
				localId.add("342531");       // 安徽省宣城地区绩溪县
			}
			if (city.contains("巢湖") || city.isEmpty()) {
				localId.add("342601");       // 安徽省巢湖地区巢湖市
				localId.add("342622");       // 安徽省巢湖地区庐江县
				localId.add("342623");       // 安徽省巢湖地区无为县
				localId.add("342625");       // 安徽省巢湖地区含山县
				localId.add("342626");       // 安徽省巢湖地区和县
			}
			if (city.contains("池州") || city.isEmpty()) {
				localId.add("342901");       // 安徽省池州地区贵池市
				localId.add("342921");       // 安徽省池州地区东至县
				localId.add("342922");       // 安徽省池州地区石台县
				localId.add("342923");       // 安徽省池州地区青阳县
			}
		}
		if (province.contains("福建") || province.isEmpty()) {
			if (city.contains("福州") || city.isEmpty()) {
				localId.add("350102");       // 福建省福州市鼓楼区
				localId.add("350103");       // 福建省福州市台江区
				localId.add("350104");       // 福建省福州市仓山区
				localId.add("350105");       // 福建省福州市马尾区
				localId.add("350111");       // 福建省福州市晋安区
				localId.add("350121");       // 福建省福州市闽侯县
				localId.add("350122");       // 福建省福州市连江县
				localId.add("350123");       // 福建省福州市罗源县
				localId.add("350124");       // 福建省福州市闽清县
				localId.add("350125");       // 福建省福州市永泰县
				localId.add("350128");       // 福建省福州市平潭县
				localId.add("350181");       // 福建省福州市福清市
				localId.add("350182");       // 福建省福州市长乐市
			}
			if (city.contains("厦门") || city.isEmpty()) {
				localId.add("350202");       // 福建省厦门市鼓浪屿区
				localId.add("350203");       // 福建省厦门市思明区
				localId.add("350204");       // 福建省厦门市开元区
				localId.add("350205");       // 福建省厦门市杏林区
				localId.add("350206");       // 福建省厦门市湖里区
				localId.add("350211");       // 福建省厦门市集美区
				localId.add("350212");       // 福建省厦门市同安区
			}
			if (city.contains("莆田") || city.isEmpty()) {
				localId.add("350302");       // 福建省莆田市城厢区
				localId.add("350303");       // 福建省莆田市涵江区
				localId.add("350321");       // 福建省莆田市莆田县
				localId.add("350322");       // 福建省莆田市仙游县
			}
			if (city.contains("三明") || city.isEmpty()) {
				localId.add("350402");       // 福建省三明市梅列区
				localId.add("350403");       // 福建省三明市三元区
				localId.add("350421");       // 福建省三明市明溪县
				localId.add("350423");       // 福建省三明市清流县
				localId.add("350424");       // 福建省三明市宁化县
				localId.add("350425");       // 福建省三明市大田县
				localId.add("350426");       // 福建省三明市尤溪县
				localId.add("350427");       // 福建省三明市沙县
				localId.add("350428");       // 福建省三明市将乐县
				localId.add("350429");       // 福建省三明市泰宁县
				localId.add("350430");       // 福建省三明市建宁县
				localId.add("350481");       // 福建省三明市永安市
			}
			if (city.contains("泉州") || city.isEmpty()) {
				localId.add("350502");       // 福建省泉州市鲤城区
				localId.add("350503");       // 福建省泉州市丰泽区
				localId.add("350504");       // 福建省泉州市洛江区
				localId.add("350521");       // 福建省泉州市惠安县
				localId.add("350524");       // 福建省泉州市安溪县
				localId.add("350525");       // 福建省泉州市永春县
				localId.add("350526");       // 福建省泉州市德化县
				localId.add("350527");       // 福建省泉州市金门县
				localId.add("350581");       // 福建省泉州市石狮市
				localId.add("350582");       // 福建省泉州市晋江市
				localId.add("350583");       // 福建省泉州市南安市
			}
			if (city.contains("漳州") || city.isEmpty()) {
				localId.add("350602");       // 福建省漳州市芗城区
				localId.add("350603");       // 福建省漳州市龙文区
				localId.add("350622");       // 福建省漳州市云霄县
				localId.add("350623");       // 福建省漳州市漳浦县
				localId.add("350624");       // 福建省漳州市诏安县
				localId.add("350625");       // 福建省漳州市长泰县
				localId.add("350626");       // 福建省漳州市东山县
				localId.add("350627");       // 福建省漳州市南靖县
				localId.add("350628");       // 福建省漳州市平和县
				localId.add("350629");       // 福建省漳州市华安县
				localId.add("350681");       // 福建省漳州市龙海市
			}
			if (city.contains("南平") || city.isEmpty()) {
				localId.add("350702");       // 福建省南平市延平区
				localId.add("350721");       // 福建省南平市顺昌县
				localId.add("350722");       // 福建省南平市浦城县
				localId.add("350723");       // 福建省南平市光泽县
				localId.add("350724");       // 福建省南平市松溪县
				localId.add("350725");       // 福建省南平市政和县
				localId.add("350781");       // 福建省南平市邵武市
				localId.add("350782");       // 福建省南平市武夷山市
				localId.add("350783");       // 福建省南平市建瓯市
				localId.add("350784");       // 福建省南平市建阳市
			}
			if (city.contains("龙岩") || city.isEmpty()) {
				localId.add("350802");       // 福建省龙岩市新罗区
				localId.add("350821");       // 福建省龙岩市长汀县
				localId.add("350822");       // 福建省龙岩市永定县
				localId.add("350823");       // 福建省龙岩市上杭县
				localId.add("350824");       // 福建省龙岩市武平县
				localId.add("350825");       // 福建省龙岩市连城县
				localId.add("350881");       // 福建省龙岩市漳平市
			}
			if (city.contains("宁德") || city.isEmpty()) {
				localId.add("352201");       // 福建省宁德地区宁德市
				localId.add("352202");       // 福建省宁德地区福安市
				localId.add("352203");       // 福建省宁德地区福鼎市
				localId.add("352225");       // 福建省宁德地区霞浦县
				localId.add("352227");       // 福建省宁德地区古田县
				localId.add("352228");       // 福建省宁德地区屏南县
				localId.add("352229");       // 福建省宁德地区寿宁县
				localId.add("352230");       // 福建省宁德地区周宁县
				localId.add("352231");       // 福建省宁德地区柘荣县
			}
		}
		if (province.contains("江西") || province.isEmpty()) {
			if (city.contains("南昌") || city.isEmpty()) {
				localId.add("360102");       // 江西省南昌市东湖区
				localId.add("360103");       // 江西省南昌市西湖区
				localId.add("360104");       // 江西省南昌市青云谱区
				localId.add("360105");       // 江西省南昌市湾里区
				localId.add("360111");       // 江西省南昌市郊区
				localId.add("360121");       // 江西省南昌市南昌县
				localId.add("360122");       // 江西省南昌市新建县
				localId.add("360123");       // 江西省南昌市安义县
				localId.add("360124");       // 江西省南昌市进贤县
			}
			if (city.contains("景德镇") || city.isEmpty()) {
				localId.add("360202");       // 江西省景德镇市昌江区
				localId.add("360203");       // 江西省景德镇市珠山区
				localId.add("360222");       // 江西省景德镇市浮梁县
				localId.add("360281");       // 江西省景德镇市乐平市
			}
			if (city.contains("萍乡") || city.isEmpty()) {
				localId.add("360302");       // 江西省萍乡市安源区
				localId.add("360313");       // 江西省萍乡市湘东区
				localId.add("360321");       // 江西省萍乡市莲花县
				localId.add("360322");       // 江西省萍乡市上栗县
				localId.add("360323");       // 江西省萍乡市芦溪县
			}
			if (city.contains("九江") || city.isEmpty()) {
				localId.add("360402");       // 江西省九江市庐山区
				localId.add("360403");       // 江西省九江市浔阳区
				localId.add("360421");       // 江西省九江市九江县
				localId.add("360423");       // 江西省九江市武宁县
				localId.add("360424");       // 江西省九江市修水县
				localId.add("360425");       // 江西省九江市永修县
				localId.add("360426");       // 江西省九江市德安县
				localId.add("360427");       // 江西省九江市星子县
				localId.add("360428");       // 江西省九江市都昌县
				localId.add("360429");       // 江西省九江市湖口县
				localId.add("360430");       // 江西省九江市彭泽县
				localId.add("360481");       // 江西省九江市瑞昌市
			}
			if (city.contains("新余") || city.isEmpty()) {
				localId.add("360502");       // 江西省新余市渝水区
				localId.add("360521");       // 江西省新余市分宜县
			}
			if (city.contains("鹰潭") || city.isEmpty()) {
				localId.add("360602");       // 江西省鹰潭市月湖区
				localId.add("360622");       // 江西省鹰潭市余江县
				localId.add("360681");       // 江西省鹰潭市贵溪市
			}
			if (city.contains("赣州") || city.isEmpty()) {
				localId.add("360702");       // 江西省赣州市章贡区
				localId.add("360721");       // 江西省赣州市赣县
				localId.add("360722");       // 江西省赣州市信丰县
				localId.add("360723");       // 江西省赣州市大余县
				localId.add("360724");       // 江西省赣州市上犹县
				localId.add("360725");       // 江西省赣州市崇义县
				localId.add("360726");       // 江西省赣州市安远县
				localId.add("360727");       // 江西省赣州市龙南县
				localId.add("360728");       // 江西省赣州市定南县
				localId.add("360729");       // 江西省赣州市全南县
				localId.add("360730");       // 江西省赣州市宁都县
				localId.add("360731");       // 江西省赣州市于都县
				localId.add("360732");       // 江西省赣州市兴国县
				localId.add("360733");       // 江西省赣州市会昌县
				localId.add("360734");       // 江西省赣州市寻乌县
				localId.add("360735");       // 江西省赣州市石城县
				localId.add("360781");       // 江西省赣州市瑞金市
				localId.add("360782");       // 江西省赣州市南康市
			}
			if (city.contains("宜春") || city.isEmpty()) {
				localId.add("362201");       // 江西省宜春地区宜春市
				localId.add("362202");       // 江西省宜春地区丰城市
				localId.add("362203");       // 江西省宜春地区樟树市
				localId.add("362204");       // 江西省宜春地区高安市
				localId.add("362226");       // 江西省宜春地区奉新县
				localId.add("362227");       // 江西省宜春地区万载县
				localId.add("362228");       // 江西省宜春地区上高县
				localId.add("362229");       // 江西省宜春地区宜丰县
				localId.add("362232");       // 江西省宜春地区靖安县
				localId.add("362233");       // 江西省宜春地区铜鼓县
			}
			if (city.contains("上饶") || city.isEmpty()) {
				localId.add("362301");       // 江西省上饶地区上饶市
				localId.add("362302");       // 江西省上饶地区德兴市
				localId.add("362321");       // 江西省上饶地区上饶县
				localId.add("362322");       // 江西省上饶地区广丰县
				localId.add("362323");       // 江西省上饶地区玉山县
				localId.add("362324");       // 江西省上饶地区铅山县
				localId.add("362325");       // 江西省上饶地区横峰县
				localId.add("362326");       // 江西省上饶地区弋阳县
				localId.add("362329");       // 江西省上饶地区余干县
				localId.add("362330");       // 江西省上饶地区波阳县
				localId.add("362331");       // 江西省上饶地区万年县
				localId.add("362334");       // 江西省上饶地区婺源县
			}
			if (city.contains("吉安") || city.isEmpty()) {
				localId.add("362401");       // 江西省吉安地区吉安市
				localId.add("362402");       // 江西省吉安地区井冈山市
				localId.add("362421");       // 江西省吉安地区吉安县
				localId.add("362422");       // 江西省吉安地区吉水县
				localId.add("362423");       // 江西省吉安地区峡江县
				localId.add("362424");       // 江西省吉安地区新干县
				localId.add("362425");       // 江西省吉安地区永丰县
				localId.add("362426");       // 江西省吉安地区泰和县
				localId.add("362427");       // 江西省吉安地区遂川县
				localId.add("362428");       // 江西省吉安地区万安县
				localId.add("362429");       // 江西省吉安地区安福县
				localId.add("362430");       // 江西省吉安地区永新县
				localId.add("362432");       // 江西省吉安地区宁冈县
			}
			if (city.contains("抚州") || city.isEmpty()) {
				localId.add("362502");       // 江西省抚州地区临川市
				localId.add("362522");       // 江西省抚州地区南城县
				localId.add("362523");       // 江西省抚州地区黎川县
				localId.add("362524");       // 江西省抚州地区南丰县
				localId.add("362525");       // 江西省抚州地区崇仁县
				localId.add("362526");       // 江西省抚州地区乐安县
				localId.add("362527");       // 江西省抚州地区宜黄县
				localId.add("362528");       // 江西省抚州地区金溪县
				localId.add("362529");       // 江西省抚州地区资溪县
				localId.add("362531");       // 江西省抚州地区东乡县
				localId.add("362532");       // 江西省抚州地区广昌县
			}
		}
		if (province.contains("山东") || province.isEmpty()) {
			if (city.contains("济南") || city.isEmpty()) {
				localId.add("370102");       // 山东省济南市历下区
				localId.add("370103");       // 山东省济南市市中区
				localId.add("370104");       // 山东省济南市槐荫区
				localId.add("370105");       // 山东省济南市天桥区
				localId.add("370112");       // 山东省济南市历城区
				localId.add("370123");       // 山东省济南市长清县
				localId.add("370124");       // 山东省济南市平阴县
				localId.add("370125");       // 山东省济南市济阳县
				localId.add("370126");       // 山东省济南市商河县
				localId.add("370181");       // 山东省济南市章丘市
			}
			if (city.contains("青岛") || city.isEmpty()) {
				localId.add("370202");       // 山东省青岛市市南区
				localId.add("370203");       // 山东省青岛市市北区
				localId.add("370205");       // 山东省青岛市四方区
				localId.add("370211");       // 山东省青岛市黄岛区
				localId.add("370212");       // 山东省青岛市崂山区
				localId.add("370213");       // 山东省青岛市李沧区
				localId.add("370214");       // 山东省青岛市城阳区
				localId.add("370281");       // 山东省青岛市胶州市
				localId.add("370282");       // 山东省青岛市即墨市
				localId.add("370283");       // 山东省青岛市平度市
				localId.add("370284");       // 山东省青岛市胶南市
				localId.add("370285");       // 山东省青岛市莱西市
			}
			if (city.contains("淄博") || city.isEmpty()) {
				localId.add("370302");       // 山东省淄博市淄川区
				localId.add("370303");       // 山东省淄博市张店区
				localId.add("370304");       // 山东省淄博市博山区
				localId.add("370305");       // 山东省淄博市临淄区
				localId.add("370306");       // 山东省淄博市周村区
				localId.add("370321");       // 山东省淄博市桓台县
				localId.add("370322");       // 山东省淄博市高青县
				localId.add("370323");       // 山东省淄博市沂源县
			}
			if (city.contains("枣庄") || city.isEmpty()) {
				localId.add("370402");       // 山东省枣庄市市中区
				localId.add("370403");       // 山东省枣庄市薛城区
				localId.add("370404");       // 山东省枣庄市峄城区
				localId.add("370405");       // 山东省枣庄市台儿庄区
				localId.add("370406");       // 山东省枣庄市山亭区
				localId.add("370481");       // 山东省枣庄市滕州市
			}
			if (city.contains("东营") || city.isEmpty()) {
				localId.add("370502");       // 山东省东营市东营区
				localId.add("370503");       // 山东省东营市河口区
				localId.add("370521");       // 山东省东营市垦利县
				localId.add("370522");       // 山东省东营市利津县
				localId.add("370523");       // 山东省东营市广饶县
			}
			if (city.contains("烟台") || city.isEmpty()) {
				localId.add("370602");       // 山东省烟台市芝罘区
				localId.add("370611");       // 山东省烟台市福山区
				localId.add("370612");       // 山东省烟台市牟平区
				localId.add("370613");       // 山东省烟台市莱山区
				localId.add("370634");       // 山东省烟台市长岛县
				localId.add("370681");       // 山东省烟台市龙口市
				localId.add("370682");       // 山东省烟台市莱阳市
				localId.add("370683");       // 山东省烟台市莱州市
				localId.add("370684");       // 山东省烟台市蓬莱市
				localId.add("370685");       // 山东省烟台市招远市
				localId.add("370686");       // 山东省烟台市栖霞市
				localId.add("370687");       // 山东省烟台市海阳市
			}
			if (city.contains("潍坊") || city.isEmpty()) {
				localId.add("370702");       // 山东省潍坊市潍城区
				localId.add("370703");       // 山东省潍坊市寒亭区
				localId.add("370704");       // 山东省潍坊市坊子区
				localId.add("370705");       // 山东省潍坊市奎文区
				localId.add("370724");       // 山东省潍坊市临朐县
				localId.add("370725");       // 山东省潍坊市昌乐县
				localId.add("370781");       // 山东省潍坊市青州市
				localId.add("370782");       // 山东省潍坊市诸城市
				localId.add("370783");       // 山东省潍坊市寿光市
				localId.add("370784");       // 山东省潍坊市安丘市
				localId.add("370785");       // 山东省潍坊市高密市
				localId.add("370786");       // 山东省潍坊市昌邑市
			}
			if (city.contains("济宁") || city.isEmpty()) {
				localId.add("370802");       // 山东省济宁市市中区
				localId.add("370811");       // 山东省济宁市任城区
				localId.add("370826");       // 山东省济宁市微山县
				localId.add("370827");       // 山东省济宁市鱼台县
				localId.add("370828");       // 山东省济宁市金乡县
				localId.add("370829");       // 山东省济宁市嘉祥县
				localId.add("370830");       // 山东省济宁市汶上县
				localId.add("370831");       // 山东省济宁市泗水县
				localId.add("370832");       // 山东省济宁市梁山县
				localId.add("370881");       // 山东省济宁市曲阜市
				localId.add("370882");       // 山东省济宁市兖州市
				localId.add("370883");       // 山东省济宁市邹城市
			}
			if (city.contains("泰安") || city.isEmpty()) {
				localId.add("370902");       // 山东省泰安市泰山区
				localId.add("370911");       // 山东省泰安市郊区
				localId.add("370921");       // 山东省泰安市宁阳县
				localId.add("370923");       // 山东省泰安市东平县
				localId.add("370982");       // 山东省泰安市新泰市
				localId.add("370983");       // 山东省泰安市肥城市
			}
			if (city.contains("威海") || city.isEmpty()) {
				localId.add("371002");       // 山东省威海市环翠区
				localId.add("371081");       // 山东省威海市文登市
				localId.add("371082");       // 山东省威海市荣成市
				localId.add("371083");       // 山东省威海市乳山市
			}
			if (city.contains("日照") || city.isEmpty()) {
				localId.add("371102");       // 山东省日照市东港区
				localId.add("371121");       // 山东省日照市五莲县
				localId.add("371122");       // 山东省日照市莒县
			}
			if (city.contains("莱芜") || city.isEmpty()) {
				localId.add("371202");       // 山东省莱芜市莱城区
				localId.add("371203");       // 山东省莱芜市钢城区
			}
			if (city.contains("临沂") || city.isEmpty()) {
				localId.add("371302");       // 山东省临沂市兰山区
				localId.add("371311");       // 山东省临沂市罗庄区
				localId.add("371312");       // 山东省临沂市河东区
				localId.add("371321");       // 山东省临沂市沂南县
				localId.add("371322");       // 山东省临沂市郯城县
				localId.add("371323");       // 山东省临沂市沂水县
				localId.add("371324");       // 山东省临沂市苍山县
				localId.add("371325");       // 山东省临沂市费县
				localId.add("371326");       // 山东省临沂市平邑县
				localId.add("371327");       // 山东省临沂市莒南县
				localId.add("371328");       // 山东省临沂市蒙阴县
				localId.add("371329");       // 山东省临沂市临沭县
			}
			if (city.contains("德州") || city.isEmpty()) {
				localId.add("371402");       // 山东省德州市德城区
				localId.add("371421");       // 山东省德州市陵县
				localId.add("371422");       // 山东省德州市宁津县
				localId.add("371423");       // 山东省德州市庆云县
				localId.add("371424");       // 山东省德州市临邑县
				localId.add("371425");       // 山东省德州市齐河县
				localId.add("371426");       // 山东省德州市平原县
				localId.add("371427");       // 山东省德州市夏津县
				localId.add("371428");       // 山东省德州市武城县
				localId.add("371481");       // 山东省德州市乐陵市
				localId.add("371482");       // 山东省德州市禹城市
			}
			if (city.contains("聊城") || city.isEmpty()) {
				localId.add("371502");       // 山东省聊城市东昌府区
				localId.add("371521");       // 山东省聊城市阳谷县
				localId.add("371522");       // 山东省聊城市莘县
				localId.add("371523");       // 山东省聊城市茌平县
				localId.add("371524");       // 山东省聊城市东阿县
				localId.add("371525");       // 山东省聊城市冠县
				localId.add("371526");       // 山东省聊城市高唐县
				localId.add("371581");       // 山东省聊城市临清市
			}
			if (city.contains("滨州") || city.isEmpty()) {
				localId.add("372301");       // 山东省滨州地区滨州市
				localId.add("372321");       // 山东省滨州地区惠民县
				localId.add("372323");       // 山东省滨州地区阳信县
				localId.add("372324");       // 山东省滨州地区无棣县
				localId.add("372325");       // 山东省滨州地区沾化县
				localId.add("372328");       // 山东省滨州地区博兴县
				localId.add("372330");       // 山东省滨州地区邹平县
			}
			if (city.contains("菏泽") || city.isEmpty()) {
				localId.add("372901");       // 山东省菏泽地区菏泽市
				localId.add("372922");       // 山东省菏泽地区曹县
				localId.add("372923");       // 山东省菏泽地区定陶县
				localId.add("372924");       // 山东省菏泽地区成武县
				localId.add("372925");       // 山东省菏泽地区单县
				localId.add("372926");       // 山东省菏泽地区巨野县
				localId.add("372928");       // 山东省菏泽地区郓城县
				localId.add("372929");       // 山东省菏泽地区鄄城县
				localId.add("372930");       // 山东省菏泽地区东明县
			}
		}
		if (province.contains("河南") || province.isEmpty()) {
			if (city.contains("郑州") || city.isEmpty()) {
				localId.add("410102");       // 河南省郑州市中原区
				localId.add("410103");       // 河南省郑州市二七区
				localId.add("410104");       // 河南省郑州市管城回族区
				localId.add("410105");       // 河南省郑州市金水区
				localId.add("410106");       // 河南省郑州市上街区
				localId.add("410108");       // 河南省郑州市邙山区
				localId.add("410122");       // 河南省郑州市中牟县
				localId.add("410181");       // 河南省郑州市巩义市
				localId.add("410182");       // 河南省郑州市荥阳市
				localId.add("410183");       // 河南省郑州市新密市
				localId.add("410184");       // 河南省郑州市新郑市
				localId.add("410185");       // 河南省郑州市登封市
			}
			if (city.contains("开封") || city.isEmpty()) {
				localId.add("410202");       // 河南省开封市龙亭区
				localId.add("410203");       // 河南省开封市顺河回族区
				localId.add("410204");       // 河南省开封市鼓楼区
				localId.add("410205");       // 河南省开封市南关区
				localId.add("410211");       // 河南省开封市郊区
				localId.add("410221");       // 河南省开封市杞县
				localId.add("410222");       // 河南省开封市通许县
				localId.add("410223");       // 河南省开封市尉氏县
				localId.add("410224");       // 河南省开封市开封县
				localId.add("410225");       // 河南省开封市兰考县
			}
			if (city.contains("洛阳") || city.isEmpty()) {
				localId.add("410302");       // 河南省洛阳市老城区
				localId.add("410303");       // 河南省洛阳市西工区
				localId.add("410304");       // 河南省洛阳市廛河回族区
				localId.add("410305");       // 河南省洛阳市涧西区
				localId.add("410306");       // 河南省洛阳市吉利区
				localId.add("410311");       // 河南省洛阳市郊区
				localId.add("410322");       // 河南省洛阳市孟津县
				localId.add("410323");       // 河南省洛阳市新安县
				localId.add("410324");       // 河南省洛阳市栾川县
				localId.add("410325");       // 河南省洛阳市嵩县
				localId.add("410326");       // 河南省洛阳市汝阳县
				localId.add("410327");       // 河南省洛阳市宜阳县
				localId.add("410328");       // 河南省洛阳市洛宁县
				localId.add("410329");       // 河南省洛阳市伊川县
				localId.add("410381");       // 河南省洛阳市偃师市
			}
			if (city.contains("平顶山") || city.isEmpty()) {
				localId.add("410402");       // 河南省平顶山市新华区
				localId.add("410403");       // 河南省平顶山市卫东区
				localId.add("410404");       // 河南省平顶山市石龙区
				localId.add("410411");       // 河南省平顶山市湛河区
				localId.add("410421");       // 河南省平顶山市宝丰县
				localId.add("410422");       // 河南省平顶山市叶县
				localId.add("410423");       // 河南省平顶山市鲁山县
				localId.add("410425");       // 河南省平顶山市郏县
				localId.add("410481");       // 河南省平顶山市舞钢市
				localId.add("410482");       // 河南省平顶山市汝州市
			}
			if (city.contains("安阳") || city.isEmpty()) {
				localId.add("410502");       // 河南省安阳市文峰区
				localId.add("410503");       // 河南省安阳市北关区
				localId.add("410504");       // 河南省安阳市铁西区
				localId.add("410511");       // 河南省安阳市郊区
				localId.add("410522");       // 河南省安阳市安阳县
				localId.add("410523");       // 河南省安阳市汤阴县
				localId.add("410526");       // 河南省安阳市滑县
				localId.add("410527");       // 河南省安阳市内黄县
				localId.add("410581");       // 河南省安阳市林州市
			}
			if (city.contains("鹤壁") || city.isEmpty()) {
				localId.add("410602");       // 河南省鹤壁市鹤山区
				localId.add("410603");       // 河南省鹤壁市山城区
				localId.add("410611");       // 河南省鹤壁市郊区
				localId.add("410621");       // 河南省鹤壁市浚县
				localId.add("410622");       // 河南省鹤壁市淇县
			}
			if (city.contains("新乡") || city.isEmpty()) {
				localId.add("410702");       // 河南省新乡市红旗区
				localId.add("410703");       // 河南省新乡市新华区
				localId.add("410704");       // 河南省新乡市北站区
				localId.add("410711");       // 河南省新乡市郊区
				localId.add("410721");       // 河南省新乡市新乡县
				localId.add("410724");       // 河南省新乡市获嘉县
				localId.add("410725");       // 河南省新乡市原阳县
				localId.add("410726");       // 河南省新乡市延津县
				localId.add("410727");       // 河南省新乡市封丘县
				localId.add("410728");       // 河南省新乡市长垣县
				localId.add("410781");       // 河南省新乡市卫辉市
				localId.add("410782");       // 河南省新乡市辉县市
			}
			if (city.contains("焦作") || city.isEmpty()) {
				localId.add("410802");       // 河南省焦作市解放区
				localId.add("410803");       // 河南省焦作市中站区
				localId.add("410804");       // 河南省焦作市马村区
				localId.add("410811");       // 河南省焦作市山阳区
				localId.add("410821");       // 河南省焦作市修武县
				localId.add("410822");       // 河南省焦作市博爱县
				localId.add("410823");       // 河南省焦作市武陟县
				localId.add("410825");       // 河南省焦作市温县
				localId.add("410881");       // 河南省焦作市济源市
				localId.add("410882");       // 河南省焦作市沁阳市
				localId.add("410883");       // 河南省焦作市孟州市
			}
			if (city.contains("濮阳") || city.isEmpty()) {
				localId.add("410902");       // 河南省濮阳市市区
				localId.add("410922");       // 河南省濮阳市清丰县
				localId.add("410923");       // 河南省濮阳市南乐县
				localId.add("410926");       // 河南省濮阳市范县
				localId.add("410927");       // 河南省濮阳市台前县
				localId.add("410928");       // 河南省濮阳市濮阳县
			}
			if (city.contains("许昌") || city.isEmpty()) {
				localId.add("411002");       // 河南省许昌市魏都区
				localId.add("411023");       // 河南省许昌市许昌县
				localId.add("411024");       // 河南省许昌市鄢陵县
				localId.add("411025");       // 河南省许昌市襄城县
				localId.add("411081");       // 河南省许昌市禹州市
				localId.add("411082");       // 河南省许昌市长葛市
			}
			if (city.contains("漯河") || city.isEmpty()) {
				localId.add("411102");       // 河南省漯河市源汇区
				localId.add("411121");       // 河南省漯河市舞阳县
				localId.add("411122");       // 河南省漯河市临颍县
				localId.add("411123");       // 河南省漯河市郾城县
			}
			if (city.contains("三门峡") || city.isEmpty()) {
				localId.add("411202");       // 河南省三门峡市湖滨区
				localId.add("411221");       // 河南省三门峡市渑池县
				localId.add("411222");       // 河南省三门峡市陕县
				localId.add("411224");       // 河南省三门峡市卢氏县
				localId.add("411281");       // 河南省三门峡市义马市
				localId.add("411282");       // 河南省三门峡市灵宝市
			}
			if (city.contains("南阳") || city.isEmpty()) {
				localId.add("411302");       // 河南省南阳市宛城区
				localId.add("411303");       // 河南省南阳市卧龙区
				localId.add("411321");       // 河南省南阳市南召县
				localId.add("411322");       // 河南省南阳市方城县
				localId.add("411323");       // 河南省南阳市西峡县
				localId.add("411324");       // 河南省南阳市镇平县
				localId.add("411325");       // 河南省南阳市内乡县
				localId.add("411326");       // 河南省南阳市淅川县
				localId.add("411327");       // 河南省南阳市社旗县
				localId.add("411328");       // 河南省南阳市唐河县
				localId.add("411329");       // 河南省南阳市新野县
				localId.add("411330");       // 河南省南阳市桐柏县
				localId.add("411381");       // 河南省南阳市邓州市
			}
			if (city.contains("商丘") || city.isEmpty()) {
				localId.add("411402");       // 河南省商丘市梁园区
				localId.add("411403");       // 河南省商丘市睢阳区
				localId.add("411421");       // 河南省商丘市民权县
				localId.add("411422");       // 河南省商丘市睢县
				localId.add("411423");       // 河南省商丘市宁陵县
				localId.add("411424");       // 河南省商丘市柘城县
				localId.add("411425");       // 河南省商丘市虞城县
				localId.add("411426");       // 河南省商丘市夏邑县
				localId.add("411481");       // 河南省商丘市永城市
			}
			if (city.contains("信阳") || city.isEmpty()) {
				localId.add("411502");       // 河南省信阳市师河区
				localId.add("411503");       // 河南省信阳市平桥区
				localId.add("411521");       // 河南省信阳市罗山县
				localId.add("411522");       // 河南省信阳市光山县
				localId.add("411523");       // 河南省信阳市新县
				localId.add("411524");       // 河南省信阳市商城县
				localId.add("411525");       // 河南省信阳市固始县
				localId.add("411526");       // 河南省信阳市潢川县
				localId.add("411527");       // 河南省信阳市淮滨县
				localId.add("411528");       // 河南省信阳市息县
			}
			if (city.contains("周口") || city.isEmpty()) {
				localId.add("412701");       // 河南省周口地区周口市
				localId.add("412702");       // 河南省周口地区项城市
				localId.add("412721");       // 河南省周口地区扶沟县
				localId.add("412722");       // 河南省周口地区西华县
				localId.add("412723");       // 河南省周口地区商水县
				localId.add("412724");       // 河南省周口地区太康县
				localId.add("412725");       // 河南省周口地区鹿邑县
				localId.add("412726");       // 河南省周口地区郸城县
				localId.add("412727");       // 河南省周口地区淮阳县
				localId.add("412728");       // 河南省周口地区沈丘县
			}
			if (city.contains("驻马店") || city.isEmpty()) {
				localId.add("412801");       // 河南省驻马店地区驻马店市
				localId.add("412821");       // 河南省驻马店地区确山县
				localId.add("412822");       // 河南省驻马店地区泌阳县
				localId.add("412823");       // 河南省驻马店地区遂平县
				localId.add("412824");       // 河南省驻马店地区西平县
				localId.add("412825");       // 河南省驻马店地区上蔡县
				localId.add("412826");       // 河南省驻马店地区汝南县
				localId.add("412827");       // 河南省驻马店地区平舆县
				localId.add("412828");       // 河南省驻马店地区新蔡县
				localId.add("412829");       // 河南省驻马店地区正阳县
			}
		}
		if (province.contains("湖北") || province.isEmpty()) {
			if (city.contains("武汉") || city.isEmpty()) {
				localId.add("420102");       // 湖北省武汉市江岸区
				localId.add("420103");       // 湖北省武汉市江汉区
				localId.add("420104");       // 湖北省武汉市乔口区
				localId.add("420105");       // 湖北省武汉市汉阳区
				localId.add("420106");       // 湖北省武汉市武昌区
				localId.add("420107");       // 湖北省武汉市青山区
				localId.add("420111");       // 湖北省武汉市洪山区
				localId.add("420112");       // 湖北省武汉市东西湖区
				localId.add("420113");       // 湖北省武汉市汉南区
				localId.add("420114");       // 湖北省武汉市蔡甸区
				localId.add("420115");       // 湖北省武汉市江夏区
				localId.add("420116");       // 湖北省武汉市黄陂区
				localId.add("420117");       // 湖北省武汉市新洲区
			}
			if (city.contains("黄石") || city.isEmpty()) {
				localId.add("420202");       // 湖北省黄石市黄石港区
				localId.add("420203");       // 湖北省黄石市石灰窑区
				localId.add("420204");       // 湖北省黄石市下陆区
				localId.add("420205");       // 湖北省黄石市铁山区
				localId.add("420222");       // 湖北省黄石市阳新县
				localId.add("420281");       // 湖北省黄石市大冶市
			}
			if (city.contains("十堰") || city.isEmpty()) {
				localId.add("420302");       // 湖北省十堰市茅箭区
				localId.add("420303");       // 湖北省十堰市张湾区
				localId.add("420321");       // 湖北省十堰市郧县
				localId.add("420322");       // 湖北省十堰市郧西县
				localId.add("420323");       // 湖北省十堰市竹山县
				localId.add("420324");       // 湖北省十堰市竹溪县
				localId.add("420325");       // 湖北省十堰市房县
				localId.add("420381");       // 湖北省十堰市丹江口市
			}
			if (city.contains("宜昌") || city.isEmpty()) {
				localId.add("420502");       // 湖北省宜昌市西陵区
				localId.add("420503");       // 湖北省宜昌市伍家岗区
				localId.add("420504");       // 湖北省宜昌市点军区
				localId.add("420505");       // 湖北省宜昌市虎亭区
				localId.add("420521");       // 湖北省宜昌市宜昌县
				localId.add("420525");       // 湖北省宜昌市远安县
				localId.add("420526");       // 湖北省宜昌市兴山县
				localId.add("420527");       // 湖北省宜昌市秭归县
				localId.add("420528");       // 湖北省宜昌市长阳土家族自治县
				localId.add("420529");       // 湖北省宜昌市五峰土家族自治县
				localId.add("420581");       // 湖北省宜昌市宜都市
				localId.add("420582");       // 湖北省宜昌市当阳市
				localId.add("420583");       // 湖北省宜昌市枝江市
			}
			if (city.contains("襄樊") || city.isEmpty()) {
				localId.add("420602");       // 湖北省襄樊市襄城区
				localId.add("420606");       // 湖北省襄樊市樊城区
				localId.add("420621");       // 湖北省襄樊市襄阳县
				localId.add("420624");       // 湖北省襄樊市南漳县
				localId.add("420625");       // 湖北省襄樊市谷城县
				localId.add("420626");       // 湖北省襄樊市保康县
				localId.add("420682");       // 湖北省襄樊市老河口市
				localId.add("420683");       // 湖北省襄樊市枣阳市
				localId.add("420684");       // 湖北省襄樊市宜城市
			}
			if (city.contains("鄂州") || city.isEmpty()) {
				localId.add("420702");       // 湖北省鄂州市梁子湖区
				localId.add("420703");       // 湖北省鄂州市华容区
				localId.add("420704");       // 湖北省鄂州市鄂城区
			}
			if (city.contains("荆门") || city.isEmpty()) {
				localId.add("420802");       // 湖北省荆门市东宝区
				localId.add("420821");       // 湖北省荆门市京山县
				localId.add("420822");       // 湖北省荆门市沙洋县
				localId.add("420881");       // 湖北省荆门市钟祥市
			}
			if (city.contains("孝感") || city.isEmpty()) {
				localId.add("420902");       // 湖北省孝感市孝南区
				localId.add("420921");       // 湖北省孝感市孝昌县
				localId.add("420922");       // 湖北省孝感市大悟县
				localId.add("420923");       // 湖北省孝感市云梦县
				localId.add("420981");       // 湖北省孝感市应城市
				localId.add("420982");       // 湖北省孝感市安陆市
				localId.add("420983");       // 湖北省孝感市广水市
				localId.add("420984");       // 湖北省孝感市汉川市
			}
			if (city.contains("荆州") || city.isEmpty()) {
				localId.add("421002");       // 湖北省荆州市沙市区
				localId.add("421003");       // 湖北省荆州市荆州区
				localId.add("421022");       // 湖北省荆州市公安县
				localId.add("421023");       // 湖北省荆州市监利县
				localId.add("421024");       // 湖北省荆州市江陵县
				localId.add("421081");       // 湖北省荆州市石首市
				localId.add("421083");       // 湖北省荆州市洪湖市
				localId.add("421087");       // 湖北省荆州市松滋市
			}
			if (city.contains("黄冈") || city.isEmpty()) {
				localId.add("421102");       // 湖北省黄冈市黄州区
				localId.add("421121");       // 湖北省黄冈市团风县
				localId.add("421122");       // 湖北省黄冈市红安县
				localId.add("421123");       // 湖北省黄冈市罗田县
				localId.add("421124");       // 湖北省黄冈市英山县
				localId.add("421125");       // 湖北省黄冈市浠水县
				localId.add("421126");       // 湖北省黄冈市蕲春县
				localId.add("421127");       // 湖北省黄冈市黄梅县
				localId.add("421181");       // 湖北省黄冈市麻城市
				localId.add("421182");       // 湖北省黄冈市武穴市
			}
			if (city.contains("咸宁") || city.isEmpty()) {
				localId.add("421202");       // 湖北省咸宁市咸安区
				localId.add("421221");       // 湖北省咸宁市嘉鱼县
				localId.add("421222");       // 湖北省咸宁市通城县
				localId.add("421223");       // 湖北省咸宁市崇阳县
				localId.add("421224");       // 湖北省咸宁市通山县
			}
			if (city.contains("恩施") || city.isEmpty()) {
				localId.add("422801");       // 湖北省恩施土家族苗族自治州恩施县
				localId.add("422802");       // 湖北省恩施土家族苗族自治州利川市
				localId.add("422822");       // 湖北省恩施土家族苗族自治州建始县
				localId.add("422823");       // 湖北省恩施土家族苗族自治州巴东县
				localId.add("422825");       // 湖北省恩施土家族苗族自治州宣恩县
				localId.add("422826");       // 湖北省恩施土家族苗族自治州咸丰县
				localId.add("422827");       // 湖北省恩施土家族苗族自治州来凤县
				localId.add("422828");       // 湖北省恩施土家族苗族自治州鹤峰县
			}
			if (city.contains("随州") || city.isEmpty()) {
				localId.add("429001");       // 湖北省随州市
			}
			if (city.contains("仙桃") || city.isEmpty()) {
				localId.add("429004");       // 湖北省仙桃市
			}
			if (city.contains("潜江") || city.isEmpty()) {
				localId.add("429005");       // 湖北省潜江市
			}
			if (city.contains("天门") || city.isEmpty()) {
				localId.add("429006");       // 湖北省天门市
			}
			if (city.contains("神农架") || city.isEmpty()) {
				localId.add("429021");       // 湖北省神农架林区
			}
		}
		if (province.contains("湖南") || province.isEmpty()) {
			if (city.contains("长沙") || city.isEmpty()) {
				localId.add("430102");       // 湖南省长沙市芙蓉区
				localId.add("430103");       // 湖南省长沙市天心区
				localId.add("430104");       // 湖南省长沙市岳麓区
				localId.add("430105");       // 湖南省长沙市开福区
				localId.add("430111");       // 湖南省长沙市雨花区
				localId.add("430121");       // 湖南省长沙市长沙县
				localId.add("430122");       // 湖南省长沙市望城县
				localId.add("430124");       // 湖南省长沙市宁乡县
				localId.add("430181");       // 湖南省长沙市浏阳市
			}
			if (city.contains("株洲") || city.isEmpty()) {
				localId.add("430202");       // 湖南省株洲市荷塘区
				localId.add("430203");       // 湖南省株洲市芦淞区
				localId.add("430204");       // 湖南省株洲市石峰区
				localId.add("430211");       // 湖南省株洲市天元区
				localId.add("430221");       // 湖南省株洲市株洲县
				localId.add("430223");       // 湖南省株洲市攸县
				localId.add("430224");       // 湖南省株洲市茶陵县
				localId.add("430225");       // 湖南省株洲市炎陵县
				localId.add("430281");       // 湖南省株洲市醴陵市
			}
			if (city.contains("湘潭") || city.isEmpty()) {
				localId.add("430302");       // 湖南省湘潭市雨湖区
				localId.add("430304");       // 湖南省湘潭市岳塘区
				localId.add("430321");       // 湖南省湘潭市湘潭县
				localId.add("430381");       // 湖南省湘潭市湘乡市
				localId.add("430382");       // 湖南省湘潭市韶山市
			}
			if (city.contains("衡阳") || city.isEmpty()) {
				localId.add("430402");       // 湖南省衡阳市江东区
				localId.add("430403");       // 湖南省衡阳市城南区
				localId.add("430404");       // 湖南省衡阳市城北区
				localId.add("430411");       // 湖南省衡阳市郊区
				localId.add("430412");       // 湖南省衡阳市南岳区
				localId.add("430421");       // 湖南省衡阳市衡阳县
				localId.add("430422");       // 湖南省衡阳市衡南县
				localId.add("430423");       // 湖南省衡阳市衡山县
				localId.add("430424");       // 湖南省衡阳市衡东县
				localId.add("430426");       // 湖南省衡阳市祁东县
				localId.add("430481");       // 湖南省衡阳市耒阳市
				localId.add("430482");       // 湖南省衡阳市常宁市
			}
			if (city.contains("邵阳") || city.isEmpty()) {
				localId.add("430502");       // 湖南省邵阳市双清区
				localId.add("430503");       // 湖南省邵阳市大祥区
				localId.add("430511");       // 湖南省邵阳市北塔区
				localId.add("430521");       // 湖南省邵阳市邵东县
				localId.add("430522");       // 湖南省邵阳市新邵县
				localId.add("430523");       // 湖南省邵阳市邵阳县
				localId.add("430524");       // 湖南省邵阳市隆回县
				localId.add("430525");       // 湖南省邵阳市洞口县
				localId.add("430527");       // 湖南省邵阳市绥宁县
				localId.add("430528");       // 湖南省邵阳市新宁县
				localId.add("430529");       // 湖南省邵阳市城步苗族自治县
				localId.add("430581");       // 湖南省邵阳市武冈市
			}
			if (city.contains("岳阳") || city.isEmpty()) {
				localId.add("430602");       // 湖南省岳阳市岳阳楼区
				localId.add("430603");       // 湖南省岳阳市云溪区
				localId.add("430611");       // 湖南省岳阳市君山区
				localId.add("430621");       // 湖南省岳阳市岳阳县
				localId.add("430623");       // 湖南省岳阳市华容县
				localId.add("430624");       // 湖南省岳阳市湘阴县
				localId.add("430626");       // 湖南省岳阳市平江县
				localId.add("430681");       // 湖南省岳阳市汨罗市
				localId.add("430682");       // 湖南省岳阳市临湘市
			}
			if (city.contains("常德") || city.isEmpty()) {
				localId.add("430702");       // 湖南省常德市武陵区
				localId.add("430703");       // 湖南省常德市鼎城区
				localId.add("430721");       // 湖南省常德市安乡县
				localId.add("430722");       // 湖南省常德市汉寿县
				localId.add("430723");       // 湖南省常德市澧县
				localId.add("430724");       // 湖南省常德市临澧县
				localId.add("430725");       // 湖南省常德市桃源县
				localId.add("430726");       // 湖南省常德市石门县
				localId.add("430781");       // 湖南省常德市津市市
			}
			if (city.contains("张家界") || city.isEmpty()) {
				localId.add("430802");       // 湖南省张家界市永定区
				localId.add("430811");       // 湖南省张家界市武陵源区
				localId.add("430821");       // 湖南省张家界市慈利县
				localId.add("430822");       // 湖南省张家界市桑植县
			}
			if (city.contains("益阳") || city.isEmpty()) {
				localId.add("430902");       // 湖南省益阳市资阳区
				localId.add("430903");       // 湖南省益阳市赫山区
				localId.add("430921");       // 湖南省益阳市南县
				localId.add("430922");       // 湖南省益阳市桃江县
				localId.add("430923");       // 湖南省益阳市安化县
				localId.add("430981");       // 湖南省益阳市沅江市
			}
			if (city.contains("郴州") || city.isEmpty()) {
				localId.add("431002");       // 湖南省郴州市北湖区
				localId.add("431003");       // 湖南省郴州市苏仙区
				localId.add("431021");       // 湖南省郴州市桂阳县
				localId.add("431022");       // 湖南省郴州市宜章县
				localId.add("431023");       // 湖南省郴州市永兴县
				localId.add("431024");       // 湖南省郴州市嘉禾县
				localId.add("431025");       // 湖南省郴州市临武县
				localId.add("431026");       // 湖南省郴州市汝城县
				localId.add("431027");       // 湖南省郴州市桂东县
				localId.add("431028");       // 湖南省郴州市安仁县
				localId.add("431081");       // 湖南省郴州市资兴市
			}
			if (city.contains("永州") || city.isEmpty()) {
				localId.add("431102");       // 湖南省永州市芝山区
				localId.add("431103");       // 湖南省永州市冷水滩区
				localId.add("431121");       // 湖南省永州市祁阳县
				localId.add("431122");       // 湖南省永州市东安县
				localId.add("431123");       // 湖南省永州市双牌县
				localId.add("431124");       // 湖南省永州市道县
				localId.add("431125");       // 湖南省永州市江永县
				localId.add("431126");       // 湖南省永州市宁远县
				localId.add("431127");       // 湖南省永州市蓝山县
				localId.add("431128");       // 湖南省永州市新田县
				localId.add("431129");       // 湖南省永州市江华瑶族自治县
			}
			if (city.contains("怀化") || city.isEmpty()) {
				localId.add("431202");       // 湖南省怀化市鹤城区
				localId.add("431221");       // 湖南省怀化市中方县
				localId.add("431222");       // 湖南省怀化市沅陵县
				localId.add("431223");       // 湖南省怀化市辰溪县
				localId.add("431224");       // 湖南省怀化市溆浦县
				localId.add("431225");       // 湖南省怀化市会同县
				localId.add("431226");       // 湖南省怀化市麻阳苗族自治县
				localId.add("431227");       // 湖南省怀化市新晃侗族自治县
				localId.add("431228");       // 湖南省怀化市芷江侗族自治县
				localId.add("431229");       // 湖南省怀化市靖州苗族侗族自治县
				localId.add("431230");       // 湖南省怀化市通道侗族自治县
				localId.add("431281");       // 湖南省怀化市洪江市
			}
			if (city.contains("娄底") || city.isEmpty()) {
				localId.add("432501");       // 湖南省娄底地区娄底市
				localId.add("432502");       // 湖南省娄底地区冷水江市
				localId.add("432503");       // 湖南省娄底地区涟源市
				localId.add("432522");       // 湖南省娄底地区双峰县
				localId.add("432524");       // 湖南省娄底地区新化县
			}
			if (city.contains("怀化") || city.isEmpty()) {
				localId.add("433001");       // 湖南省怀化市
			}
			if (city.contains("湘西") || city.isEmpty()) {
				localId.add("433101");       // 湖南省湘西土家族苗族自治州吉首市
				localId.add("433122");       // 湖南省湘西土家族苗族自治州泸溪县
				localId.add("433123");       // 湖南省湘西土家族苗族自治州凤凰县
				localId.add("433124");       // 湖南省湘西土家族苗族自治州花垣县
				localId.add("433125");       // 湖南省湘西土家族苗族自治州保靖县
				localId.add("433126");       // 湖南省湘西土家族苗族自治州古丈县
				localId.add("433127");       // 湖南省湘西土家族苗族自治州永顺县
				localId.add("433130");       // 湖南省湘西土家族苗族自治州龙山县
			}
		}
		if (province.contains("广东") || province.isEmpty()) {
			if (city.contains("广州") || city.isEmpty()) {
				localId.add("440102");       // 广东省广州市东山区
				localId.add("440103");       // 广东省广州市荔湾区
				localId.add("440104");       // 广东省广州市越秀区
				localId.add("440105");       // 广东省广州市海珠区
				localId.add("440106");       // 广东省广州市天河区
				localId.add("440107");       // 广东省广州市芳村区
				localId.add("440111");       // 广东省广州市白云区
				localId.add("440112");       // 广东省广州市黄埔区
				localId.add("440181");       // 广东省广州市番禺市
				localId.add("440182");       // 广东省广州市花都市
				localId.add("440183");       // 广东省广州市增城市
				localId.add("440184");       // 广东省广州市从化市
			}
			if (city.contains("韶关") || city.isEmpty()) {
				localId.add("440202");       // 广东省韶关市北江区
				localId.add("440203");       // 广东省韶关市武江区
				localId.add("440204");       // 广东省韶关市浈江区
				localId.add("440221");       // 广东省韶关市曲江县
				localId.add("440222");       // 广东省韶关市始兴县
				localId.add("440224");       // 广东省韶关市仁化县
				localId.add("440229");       // 广东省韶关市翁源县
				localId.add("440232");       // 广东省韶关市乳源瑶族自治县
				localId.add("440233");       // 广东省韶关市新丰县
				localId.add("440281");       // 广东省韶关市乐昌市
				localId.add("440282");       // 广东省韶关市南雄市
			}
			if (city.contains("深圳") || city.isEmpty()) {
				localId.add("440302");       // 广东省深圳市盐田区
				localId.add("440303");       // 广东省深圳市罗湖区
				localId.add("440304");       // 广东省深圳市福田区
				localId.add("440305");       // 广东省深圳市南山区
				localId.add("440306");       // 广东省深圳市宝安区
				localId.add("440307");       // 广东省深圳市龙岗区
				localId.add("440308");       // 广东省深圳市盐田区
				localId.add("440400");       // 广东省珠海市
				localId.add("440401");       // 广东省珠海市市辖区
				localId.add("440402");       // 广东省珠海市香洲区
				localId.add("440421");       // 广东省珠海市斗门县
			}
			if (city.contains("汕头") || city.isEmpty()) {
				localId.add("440506");       // 广东省汕头市达濠区
				localId.add("440507");       // 广东省汕头市龙湖区
				localId.add("440508");       // 广东省汕头市金园区
				localId.add("440509");       // 广东省汕头市升平区
				localId.add("440510");       // 广东省汕头市河浦区
				localId.add("440523");       // 广东省汕头市南澳县
				localId.add("440582");       // 广东省汕头市潮阳市
				localId.add("440583");       // 广东省汕头市澄海市
			}
			if (city.contains("佛山") || city.isEmpty()) {
				localId.add("440602");       // 广东省佛山市城区
				localId.add("440603");       // 广东省佛山市石湾区
				localId.add("440681");       // 广东省佛山市顺德市
				localId.add("440682");       // 广东省佛山市南海市
				localId.add("440683");       // 广东省佛山市三水市
				localId.add("440684");       // 广东省佛山市高明市
			}
			if (city.contains("江门") || city.isEmpty()) {
				localId.add("440703");       // 广东省江门市蓬江区
				localId.add("440704");       // 广东省江门市江海区
				localId.add("440781");       // 广东省江门市台山市
				localId.add("440782");       // 广东省江门市新会市
				localId.add("440783");       // 广东省江门市开平市
				localId.add("440784");       // 广东省江门市鹤山市
				localId.add("440785");       // 广东省江门市恩平市
			}
			if (city.contains("湛江") || city.isEmpty()) {
				localId.add("440802");       // 广东省湛江市赤坎区
				localId.add("440803");       // 广东省湛江市霞山区
				localId.add("440804");       // 广东省湛江市坡头区
				localId.add("440811");       // 广东省湛江市麻章区
				localId.add("440823");       // 广东省湛江市遂溪县
				localId.add("440825");       // 广东省湛江市徐闻县
				localId.add("440881");       // 广东省湛江市廉江市
				localId.add("440882");       // 广东省湛江市雷州市
				localId.add("440883");       // 广东省湛江市吴川市
			}
			if (city.contains("茂名") || city.isEmpty()) {
				localId.add("440902");       // 广东省茂名市茂南区
				localId.add("440923");       // 广东省茂名市电白县
				localId.add("440981");       // 广东省茂名市高州市
				localId.add("440982");       // 广东省茂名市化州市
				localId.add("440983");       // 广东省茂名市信宜市
			}
			if (city.contains("肇庆") || city.isEmpty()) {
				localId.add("441202");       // 广东省肇庆市端州区
				localId.add("441203");       // 广东省肇庆市鼎湖区
				localId.add("441223");       // 广东省肇庆市广宁县
				localId.add("441224");       // 广东省肇庆市怀集县
				localId.add("441225");       // 广东省肇庆市封开县
				localId.add("441226");       // 广东省肇庆市德庆县
				localId.add("441283");       // 广东省肇庆市高要市
				localId.add("441284");       // 广东省肇庆市四会市
			}
			if (city.contains("惠州") || city.isEmpty()) {
				localId.add("441302");       // 广东省惠州市惠城区
				localId.add("441322");       // 广东省惠州市博罗县
				localId.add("441323");       // 广东省惠州市惠东县
				localId.add("441324");       // 广东省惠州市龙门县
				localId.add("441381");       // 广东省惠州市惠阳市
			}
			if (city.contains("梅州") || city.isEmpty()) {
				localId.add("441402");       // 广东省梅州市梅江区
				localId.add("441421");       // 广东省梅州市梅县
				localId.add("441422");       // 广东省梅州市大埔县
				localId.add("441423");       // 广东省梅州市丰顺县
				localId.add("441424");       // 广东省梅州市五华县
				localId.add("441426");       // 广东省梅州市平远县
				localId.add("441427");       // 广东省梅州市蕉岭县
				localId.add("441481");       // 广东省梅州市兴宁市
			}
			if (city.contains("汕尾") || city.isEmpty()) {
				localId.add("441502");       // 广东省汕尾市城区
				localId.add("441521");       // 广东省汕尾市海丰县
				localId.add("441523");       // 广东省汕尾市陆河县
				localId.add("441581");       // 广东省汕尾市陆丰市
			}
			if (city.contains("河源") || city.isEmpty()) {
				localId.add("441602");       // 广东省河源市源城区
				localId.add("441621");       // 广东省河源市紫金县
				localId.add("441622");       // 广东省河源市龙川县
				localId.add("441623");       // 广东省河源市连平县
				localId.add("441624");       // 广东省河源市和平县
				localId.add("441625");       // 广东省河源市东源县
			}
			if (city.contains("阳江") || city.isEmpty()) {
				localId.add("441702");       // 广东省阳江市江城区
				localId.add("441721");       // 广东省阳江市阳西县
				localId.add("441723");       // 广东省阳江市阳东县
				localId.add("441781");       // 广东省阳江市阳春市
			}
			if (city.contains("清远") || city.isEmpty()) {
				localId.add("441802");       // 广东省清远市清城区
				localId.add("441821");       // 广东省清远市佛冈县
				localId.add("441823");       // 广东省清远市阳山县
				localId.add("441825");       // 广东省清远市连山壮族瑶族自治县
				localId.add("441826");       // 广东省清远市连南瑶族自治县
				localId.add("441827");       // 广东省清远市清新县
				localId.add("441881");       // 广东省清远市英德市
				localId.add("441882");       // 广东省清远市连州市
			}
			if (city.contains("东莞") || city.isEmpty()) {
				localId.add("441901");       // 广东省东莞市市辖区
			}
			if (city.contains("中山") || city.isEmpty()) {
				localId.add("442001");       // 广东省中山市市辖区
			}
			if (city.contains("潮州") || city.isEmpty()) {
				localId.add("445102");       // 广东省潮州市湘桥区
				localId.add("445121");       // 广东省潮州市潮安县
				localId.add("445122");       // 广东省潮州市饶平县
			}
			if (city.contains("揭阳") || city.isEmpty()) {
				localId.add("445202");       // 广东省揭阳市榕城区
				localId.add("445221");       // 广东省揭阳市揭东县
				localId.add("445222");       // 广东省揭阳市揭西县
				localId.add("445224");       // 广东省揭阳市惠来县
				localId.add("445281");       // 广东省揭阳市普宁市
			}
			if (city.contains("云浮") || city.isEmpty()) {
				localId.add("445302");       // 广东省云浮市云城区
				localId.add("445321");       // 广东省云浮市新兴县
				localId.add("445322");       // 广东省云浮市郁南县
				localId.add("445323");       // 广东省云浮市云安县
				localId.add("445381");       // 广东省云浮市罗定市
			}
		}
		if (province.contains("广西") || province.isEmpty()) {

			if (city.contains("南宁") || city.isEmpty()) {
				localId.add("450102");       // 广西壮族自治区南宁市兴宁区
				localId.add("450103");       // 广西壮族自治区南宁市新城区
				localId.add("450104");       // 广西壮族自治区南宁市城北区
				localId.add("450105");       // 广西壮族自治区南宁市江南区
				localId.add("450106");       // 广西壮族自治区南宁市永新区
				localId.add("450111");       // 广西壮族自治区南宁市市郊区
				localId.add("450121");       // 广西壮族自治区南宁市邕宁县
				localId.add("450122");       // 广西壮族自治区南宁市武鸣县
			}
			if (city.contains("柳州") || city.isEmpty()) {
				localId.add("450202");       // 广西壮族自治区柳州市城中区
				localId.add("450203");       // 广西壮族自治区柳州市鱼峰区
				localId.add("450204");       // 广西壮族自治区柳州市柳南区
				localId.add("450205");       // 广西壮族自治区柳州市柳北区
				localId.add("450211");       // 广西壮族自治区柳州市市郊区
				localId.add("450221");       // 广西壮族自治区柳州市柳江县
				localId.add("450222");       // 广西壮族自治区柳州市柳城县
			}
			if (city.contains("桂林") || city.isEmpty()) {
				localId.add("450302");       // 广西壮族自治区桂林市秀峰区
				localId.add("450303");       // 广西壮族自治区桂林市叠彩区
				localId.add("450304");       // 广西壮族自治区桂林市象山区
				localId.add("450305");       // 广西壮族自治区桂林市七星区
				localId.add("450311");       // 广西壮族自治区桂林市雁山区
				localId.add("450321");       // 广西壮族自治区桂林市阳朔县
				localId.add("450322");       // 广西壮族自治区桂林市临桂县
				localId.add("450323");       // 广西壮族自治区桂林市灵川县
				localId.add("450324");       // 广西壮族自治区桂林市全州县
				localId.add("450325");       // 广西壮族自治区桂林市兴安县
				localId.add("450326");       // 广西壮族自治区桂林市永福县
				localId.add("450327");       // 广西壮族自治区桂林市灌阳县
				localId.add("450328");       // 广西壮族自治区桂林市龙胜各族自治县
				localId.add("450329");       // 广西壮族自治区桂林市资源县
				localId.add("450330");       // 广西壮族自治区桂林市平乐县
				localId.add("450331");       // 广西壮族自治区桂林市荔浦县
				localId.add("450332");       // 广西壮族自治区桂林市恭城瑶族自治县
			}
			if (city.contains("梧州") || city.isEmpty()) {
				localId.add("450403");       // 广西壮族自治区梧州市万秀区
				localId.add("450404");       // 广西壮族自治区梧州市蝶山区
				localId.add("450411");       // 广西壮族自治区梧州市市郊区
				localId.add("450421");       // 广西壮族自治区梧州市苍梧县
				localId.add("450422");       // 广西壮族自治区梧州市藤县
				localId.add("450423");       // 广西壮族自治区梧州市蒙山县
				localId.add("450481");       // 广西壮族自治区梧州市岑溪市
			}
			if (city.contains("北海") || city.isEmpty()) {
				localId.add("450502");       // 广西壮族自治区北海市海城区
				localId.add("450503");       // 广西壮族自治区北海市银海区
				localId.add("450512");       // 广西壮族自治区北海市铁山港区
				localId.add("450521");       // 广西壮族自治区北海市合浦县
			}
			if (city.contains("防城港") || city.isEmpty()) {
				localId.add("450602");       // 广西壮族自治区防城港市港口区
				localId.add("450603");       // 广西壮族自治区防城港市防城区
				localId.add("450621");       // 广西壮族自治区防城港市上思县
				localId.add("450681");       // 广西壮族自治区防城港市东兴市
			}
			if (city.contains("钦州") || city.isEmpty()) {
				localId.add("450702");       // 广西壮族自治区钦州市钦南区
				localId.add("450703");       // 广西壮族自治区钦州市钦北区
				localId.add("450721");       // 广西壮族自治区钦州市灵山县
				localId.add("450722");       // 广西壮族自治区钦州市浦北县
			}
			if (city.contains("贵港") || city.isEmpty()) {
				localId.add("450802");       // 广西壮族自治区贵港市港北区
				localId.add("450803");       // 广西壮族自治区贵港市港南区
				localId.add("450821");       // 广西壮族自治区贵港市平南县
				localId.add("450881");       // 广西壮族自治区贵港市桂平市
			}
			if (city.contains("玉林") || city.isEmpty()) {
				localId.add("450902");       // 广西壮族自治区玉林市玉州区
				localId.add("450921");       // 广西壮族自治区玉林市容县
				localId.add("450922");       // 广西壮族自治区玉林市陆川县
				localId.add("450923");       // 广西壮族自治区玉林市博白县
				localId.add("450924");       // 广西壮族自治区玉林市兴业县
				localId.add("450981");       // 广西壮族自治区玉林市北流市
			}
			if (city.contains("南宁") || city.isEmpty()) {
				localId.add("452101");       // 广西壮族自治区南宁地区凭祥市
				localId.add("452122");       // 广西壮族自治区南宁地区横县
				localId.add("452123");       // 广西壮族自治区南宁地区宾阳县
				localId.add("452124");       // 广西壮族自治区南宁地区上林县
				localId.add("452126");       // 广西壮族自治区南宁地区隆安县
				localId.add("452127");       // 广西壮族自治区南宁地区马山县
				localId.add("452128");       // 广西壮族自治区南宁地区扶绥县
				localId.add("452129");       // 广西壮族自治区南宁地区崇左县
				localId.add("452130");       // 广西壮族自治区南宁地区大新县
				localId.add("452131");       // 广西壮族自治区南宁地区天等县
				localId.add("452132");       // 广西壮族自治区南宁地区宁明县
				localId.add("452133");       // 广西壮族自治区南宁地区龙州县
			}
			if (city.contains("柳州") || city.isEmpty()) {
				localId.add("452201");       // 广西壮族自治区柳州地区合山市
				localId.add("452223");       // 广西壮族自治区柳州地区鹿寨县
				localId.add("452224");       // 广西壮族自治区柳州地区象州县
				localId.add("452225");       // 广西壮族自治区柳州地区武宣县
				localId.add("452226");       // 广西壮族自治区柳州地区来宾县
				localId.add("452227");       // 广西壮族自治区柳州地区融安县
				localId.add("452228");       // 广西壮族自治区柳州地区三江侗族自治县
				localId.add("452229");       // 广西壮族自治区柳州地区融水苗族自治县
				localId.add("452230");       // 广西壮族自治区柳州地区金秀瑶族自治县
				localId.add("452231");       // 广西壮族自治区柳州地区忻城县
			}
			if (city.contains("贺州") || city.isEmpty()) {
				localId.add("452402");       // 广西壮族自治区贺州地区贺州市
				localId.add("452424");       // 广西壮族自治区贺州地区昭平县
				localId.add("452427");       // 广西壮族自治区贺州地区钟山县
				localId.add("452428");       // 广西壮族自治区贺州地区富川瑶族自治县
			}
			if (city.contains("百色") || city.isEmpty()) {
				localId.add("452601");       // 广西壮族自治区百色地区百色市
				localId.add("452622");       // 广西壮族自治区百色地区田阳县
				localId.add("452623");       // 广西壮族自治区百色地区田东县
				localId.add("452624");       // 广西壮族自治区百色地区平果县
				localId.add("452625");       // 广西壮族自治区百色地区德保县
				localId.add("452626");       // 广西壮族自治区百色地区靖西县
				localId.add("452627");       // 广西壮族自治区百色地区那坡县
				localId.add("452628");       // 广西壮族自治区百色地区凌云县
				localId.add("452629");       // 广西壮族自治区百色地区乐业县
				localId.add("452630");       // 广西壮族自治区百色地区田林县
				localId.add("452631");       // 广西壮族自治区百色地区隆林各族自治县
				localId.add("452632");       // 广西壮族自治区百色地区西林县
			}
			if (city.contains("河池") || city.isEmpty()) {
				localId.add("452701");       // 广西壮族自治区河池地区河池市
				localId.add("452702");       // 广西壮族自治区河池地区宜州市
				localId.add("452723");       // 广西壮族自治区河池地区罗城仫佬族自治县
				localId.add("452724");       // 广西壮族自治区河池地区环江毛南族自治县
				localId.add("452725");       // 广西壮族自治区河池地区南丹县
				localId.add("452726");       // 广西壮族自治区河池地区天峨县
				localId.add("452727");       // 广西壮族自治区河池地区凤山县
				localId.add("452728");       // 广西壮族自治区河池地区东兰县
				localId.add("452729");       // 广西壮族自治区河池地区巴马瑶族自治县
				localId.add("452730");       // 广西壮族自治区河池地区都安瑶族自治县
				localId.add("452731");       // 广西壮族自治区河池地区大化瑶族自治县
			}
		}
		if (province.contains("海南") || province.isEmpty()) {
			if (city.contains("三亚") || city.isEmpty()) {
				localId.add("460001");       // 海南省三亚市通什市
				localId.add("460002");       // 海南省三亚市琼海市
				localId.add("460003");       // 海南省三亚市儋州市
				localId.add("460004");       // 海南省三亚市琼山市
				localId.add("460005");       // 海南省三亚市文昌市
				localId.add("460006");       // 海南省三亚市万宁市
				localId.add("460007");       // 海南省三亚市东方市
				localId.add("460025");       // 海南省三亚市定安县
				localId.add("460026");       // 海南省三亚市屯昌县
				localId.add("460027");       // 海南省三亚市澄迈县
				localId.add("460028");       // 海南省三亚市临高县
				localId.add("460030");       // 海南省三亚市白沙黎族自治县
				localId.add("460031");       // 海南省三亚市昌江黎族自治县
				localId.add("460033");       // 海南省三亚市乐东黎族自治县
				localId.add("460034");       // 海南省三亚市陵水黎族自治县
				localId.add("460035");       // 海南省三亚市保亭黎族苗族自治县
				localId.add("460036");       // 海南省三亚市琼中黎族苗族自治县
			}
			if (city.contains("西沙") || city.isEmpty()) {
				localId.add("460037");       // 海南省西沙群岛
			}
			if (city.contains("南沙") || city.isEmpty()) {
				localId.add("460038");       // 海南省南沙群岛
			}
			if (city.contains("中沙") || city.isEmpty()) {
				localId.add("460039");       // 海南省中沙群岛的岛礁及其海域
			}
			if (city.contains("海口") || city.isEmpty()) {
				localId.add("460102");       // 海南省海口市振东区
				localId.add("460103");       // 海南省海口市新华区
				localId.add("460104");       // 海南省海口市秀英区
			}
			if (city.contains("三亚") || city.isEmpty()) {
				localId.add("460201");       // 海南省三亚市市辖区
			}
		}
		if (province.contains("重庆") || province.isEmpty()) {
			if (city.contains("万州") || city.isEmpty()) {
				localId.add("500101");       // 重庆市万州区
			}
			if (city.contains("涪陵") || city.isEmpty()) {
				localId.add("500102");       // 重庆市涪陵区
			}
			if (city.contains("渝中") || city.isEmpty()) {
				localId.add("500103");       // 重庆市渝中区
			}
			if (city.contains("大渡口") || city.isEmpty()) {
				localId.add("500104");       // 重庆市大渡口区
			}
			if (city.contains("江北") || city.isEmpty()) {
				localId.add("500105");       // 重庆市江北区
			}
			if (city.contains("沙坪坝") || city.isEmpty()) {
				localId.add("500106");       // 重庆市沙坪坝区
			}
			if (city.contains("九龙坡") || city.isEmpty()) {
				localId.add("500107");       // 重庆市九龙坡区
			}
			if (city.contains("南岸") || city.isEmpty()) {
				localId.add("500108");       // 重庆市南岸区
			}
			if (city.contains("北碚") || city.isEmpty()) {
				localId.add("500109");       // 重庆市北碚区
			}
			if (city.contains("万盛") || city.isEmpty()) {
				localId.add("500110");       // 重庆市万盛区
			}
			if (city.contains("双桥") || city.isEmpty()) {
				localId.add("500111");       // 重庆市双桥区
			}
			if (city.contains("渝北") || city.isEmpty()) {
				localId.add("500112");       // 重庆市渝北区
			}
			if (city.contains("巴南") || city.isEmpty()) {
				localId.add("500113");       // 重庆市巴南区
			}
			if (city.contains("长寿") || city.isEmpty()) {
				localId.add("500221");       // 重庆市长寿县
			}
			if (city.contains("綦江") || city.isEmpty()) {
				localId.add("500222");       // 重庆市綦江县
			}
			if (city.contains("潼南") || city.isEmpty()) {
				localId.add("500223");       // 重庆市潼南县
			}
			if (city.contains("铜梁") || city.isEmpty()) {
				localId.add("500224");       // 重庆市铜梁县
			}
			if (city.contains("大足") || city.isEmpty()) {
				localId.add("500225");       // 重庆市大足县
			}
			if (city.contains("荣昌") || city.isEmpty()) {
				localId.add("500226");       // 重庆市荣昌县
			}
			if (city.contains("璧山") || city.isEmpty()) {
				localId.add("500227");       // 重庆市璧山县
			}
			if (city.contains("梁平") || city.isEmpty()) {
				localId.add("500228");       // 重庆市梁平县
			}
			if (city.contains("城口") || city.isEmpty()) {
				localId.add("500229");       // 重庆市城口县
			}
			if (city.contains("丰都") || city.isEmpty()) {
				localId.add("500230");       // 重庆市丰都县
			}
			if (city.contains("垫江") || city.isEmpty()) {
				localId.add("500231");       // 重庆市垫江县
			}
			if (city.contains("武隆") || city.isEmpty()) {
				localId.add("500232");       // 重庆市武隆县
			}
			if (city.contains("忠县") || city.isEmpty()) {
				localId.add("500233");       // 重庆市忠县
			}
			if (city.contains("开") || city.isEmpty()) {
				localId.add("500234");       // 重庆市开县
			}
			if (city.contains("云阳") || city.isEmpty()) {
				localId.add("500235");       // 重庆市云阳县
			}
			if (city.contains("奉节") || city.isEmpty()) {
				localId.add("500236");       // 重庆市奉节县
			}
			if (city.contains("巫山") || city.isEmpty()) {
				localId.add("500237");       // 重庆市巫山县
			}
			if (city.contains("巫溪") || city.isEmpty()) {
				localId.add("500238");       // 重庆市巫溪县
			}
			if (city.contains("黔江") || city.isEmpty()) {
				localId.add("500239");       // 重庆市黔江土家族苗族自治县
			}
			if (city.contains("石柱") || city.isEmpty()) {
				localId.add("500240");       // 重庆市石柱土家族自治县
			}
			if (city.contains("秀山") || city.isEmpty()) {
				localId.add("500241");       // 重庆市秀山土家族苗族自治县
			}
			if (city.contains("酉阳") || city.isEmpty()) {
				localId.add("500242");       // 重庆市酉阳土家族苗族自治县
			}
			if (city.contains("彭水") || city.isEmpty()) {
				localId.add("500243");       // 重庆市彭水苗族土家族自治县
			}
			if (city.contains("江津") || city.isEmpty()) {
				localId.add("500381");       // 重庆市江津市
			}
			if (city.contains("合川") || city.isEmpty()) {
				localId.add("500382");       // 重庆市合川市
			}
			if (city.contains("永川") || city.isEmpty()) {
				localId.add("500383");       // 重庆市永川市
			}
			if (city.contains("南川") || city.isEmpty()) {
				localId.add("500384");       // 重庆市南川市
			}
		}
		if (province.contains("四川") || province.isEmpty()) {
			if (city.contains("成都") || city.isEmpty()) {
				localId.add("510104");       // 四川省成都市锦江区
				localId.add("510105");       // 四川省成都市青羊区
				localId.add("510106");       // 四川省成都市金牛区
				localId.add("510107");       // 四川省成都市武侯区
				localId.add("510108");       // 四川省成都市成华区
				localId.add("510112");       // 四川省成都市龙泉驿区
				localId.add("510113");       // 四川省成都市青白江区
				localId.add("510121");       // 四川省成都市金堂县
				localId.add("510122");       // 四川省成都市双流县
				localId.add("510123");       // 四川省成都市温江县
				localId.add("510124");       // 四川省成都市郫县
				localId.add("510125");       // 四川省成都市新都县
				localId.add("510129");       // 四川省成都市大邑县
				localId.add("510131");       // 四川省成都市蒲江县
				localId.add("510132");       // 四川省成都市新津县
				localId.add("510181");       // 四川省成都市都江堰市
				localId.add("510182");       // 四川省成都市彭州市
				localId.add("510183");       // 四川省成都市邛崃市
				localId.add("510184");       // 四川省成都市崇州市
			}
			if (city.contains("自贡") || city.isEmpty()) {
				localId.add("510302");       // 四川省自贡市自流井区
				localId.add("510303");       // 四川省自贡市贡井区
				localId.add("510304");       // 四川省自贡市大安区
				localId.add("510311");       // 四川省自贡市沿滩区
				localId.add("510321");       // 四川省自贡市荣县
				localId.add("510322");       // 四川省自贡市富顺县
			}
			if (city.contains("攀枝花") || city.isEmpty()) {
				localId.add("510402");       // 四川省攀枝花市东区
				localId.add("510403");       // 四川省攀枝花市西区
				localId.add("510411");       // 四川省攀枝花市仁和区
				localId.add("510421");       // 四川省攀枝花市米易县
				localId.add("510422");       // 四川省攀枝花市盐边县
			}
			if (city.contains("泸州") || city.isEmpty()) {
				localId.add("510502");       // 四川省泸州市江阳区
				localId.add("510503");       // 四川省泸州市纳溪区
				localId.add("510504");       // 四川省泸州市龙马潭区
				localId.add("510521");       // 四川省泸州市泸县
				localId.add("510522");       // 四川省泸州市合江县
				localId.add("510524");       // 四川省泸州市叙永县
				localId.add("510525");       // 四川省泸州市古蔺县
			}
			if (city.contains("德阳") || city.isEmpty()) {
				localId.add("510603");       // 四川省德阳市旌阳区
				localId.add("510623");       // 四川省德阳市中江县
				localId.add("510626");       // 四川省德阳市罗江县
				localId.add("510681");       // 四川省德阳市广汉市
				localId.add("510682");       // 四川省德阳市什邡市
				localId.add("510683");       // 四川省德阳市绵竹市
			}
			if (city.contains("绵阳") || city.isEmpty()) {
				localId.add("510703");       // 四川省绵阳市涪城区
				localId.add("510704");       // 四川省绵阳市游仙区
				localId.add("510722");       // 四川省绵阳市三台县
				localId.add("510723");       // 四川省绵阳市盐亭县
				localId.add("510724");       // 四川省绵阳市安县
				localId.add("510725");       // 四川省绵阳市梓潼县
				localId.add("510726");       // 四川省绵阳市北川县
				localId.add("510727");       // 四川省绵阳市平武县
				localId.add("510781");       // 四川省绵阳市江油市
			}
			if (city.contains("广元") || city.isEmpty()) {
				localId.add("510802");       // 四川省广元市市中区
				localId.add("510811");       // 四川省广元市元坝区
				localId.add("510812");       // 四川省广元市朝天区
				localId.add("510821");       // 四川省广元市旺苍县
				localId.add("510822");       // 四川省广元市青川县
				localId.add("510823");       // 四川省广元市剑阁县
				localId.add("510824");       // 四川省广元市苍溪县
			}
			if (city.contains("遂宁") || city.isEmpty()) {
				localId.add("510902");       // 四川省遂宁市市中区
				localId.add("510921");       // 四川省遂宁市蓬溪县
				localId.add("510922");       // 四川省遂宁市射洪县
				localId.add("510923");       // 四川省遂宁市大英县
			}
			if (city.contains("内江") || city.isEmpty()) {
				localId.add("511002");       // 四川省内江市市中区
				localId.add("511011");       // 四川省内江市东兴区
				localId.add("511024");       // 四川省内江市威远县
				localId.add("511025");       // 四川省内江市资中县
				localId.add("511028");       // 四川省内江市隆昌县
			}
			if (city.contains("乐山") || city.isEmpty()) {
				localId.add("511102");       // 四川省乐山市市中区
				localId.add("511111");       // 四川省乐山市沙湾区
				localId.add("511112");       // 四川省乐山市五通桥区
				localId.add("511113");       // 四川省乐山市金口河区
				localId.add("511123");       // 四川省乐山市犍为县
				localId.add("511124");       // 四川省乐山市井研县
				localId.add("511126");       // 四川省乐山市夹江县
				localId.add("511129");       // 四川省乐山市沐川县
				localId.add("511132");       // 四川省乐山市峨边彝族自治县
				localId.add("511133");       // 四川省乐山市马边彝族自治县
				localId.add("511181");       // 四川省乐山市峨眉山市
			}
			if (city.contains("南充") || city.isEmpty()) {
				localId.add("511302");       // 四川省南充市顺庆区
				localId.add("511303");       // 四川省南充市高坪区
				localId.add("511304");       // 四川省南充市嘉陵区
				localId.add("511321");       // 四川省南充市南部县
				localId.add("511322");       // 四川省南充市营山县
				localId.add("511323");       // 四川省南充市蓬安县
				localId.add("511324");       // 四川省南充市仪陇县
				localId.add("511325");       // 四川省南充市西充县
				localId.add("511381");       // 四川省南充市阆中市
			}
			if (city.contains("宜宾") || city.isEmpty()) {
				localId.add("511502");       // 四川省宜宾市翠屏区
				localId.add("511521");       // 四川省宜宾市宜宾县
				localId.add("511522");       // 四川省宜宾市南溪县
				localId.add("511523");       // 四川省宜宾市江安县
				localId.add("511524");       // 四川省宜宾市长宁县
				localId.add("511525");       // 四川省宜宾市高县
				localId.add("511526");       // 四川省宜宾市珙县
				localId.add("511527");       // 四川省宜宾市筠连县
				localId.add("511528");       // 四川省宜宾市兴文县
				localId.add("511529");       // 四川省宜宾市屏山县
			}
			if (city.contains("广安") || city.isEmpty()) {
				localId.add("511602");       // 四川省广安市广安区
				localId.add("511621");       // 四川省广安市岳池县
				localId.add("511622");       // 四川省广安市武胜县
				localId.add("511623");       // 四川省广安市邻水县
				localId.add("511681");       // 四川省广安市华蓥市
			}
			if (city.contains("达川") || city.isEmpty()) {
				localId.add("513001");       // 四川省达川地区达川市
				localId.add("513002");       // 四川省达川地区万源市
				localId.add("513021");       // 四川省达川地区达县
				localId.add("513022");       // 四川省达川地区宣汉县
				localId.add("513023");       // 四川省达川地区开江县
				localId.add("513029");       // 四川省达川地区大竹县
				localId.add("513030");       // 四川省达川地区渠县
			}
			if (city.contains("雅安") || city.isEmpty()) {
				localId.add("513101");       // 四川省雅安地区雅安市
				localId.add("513122");       // 四川省雅安地区名山县
				localId.add("513123");       // 四川省雅安地区荥经县
				localId.add("513124");       // 四川省雅安地区汉源县
				localId.add("513125");       // 四川省雅安地区石棉县
				localId.add("513126");       // 四川省雅安地区天全县
				localId.add("513127");       // 四川省雅安地区芦山县
				localId.add("513128");       // 四川省雅安地区宝兴县
			}
			if (city.contains("阿坝") || city.isEmpty()) {
				localId.add("513221");       // 四川省阿坝藏族羌族自治州汶川县
				localId.add("513222");       // 四川省阿坝藏族羌族自治州理县
				localId.add("513223");       // 四川省阿坝藏族羌族自治州茂县
				localId.add("513224");       // 四川省阿坝藏族羌族自治州松潘县
				localId.add("513225");       // 四川省阿坝藏族羌族自治州九寨沟县
				localId.add("513226");       // 四川省阿坝藏族羌族自治州金川县
				localId.add("513227");       // 四川省阿坝藏族羌族自治州小金县
				localId.add("513228");       // 四川省阿坝藏族羌族自治州黑水县
				localId.add("513229");       // 四川省阿坝藏族羌族自治州马尔康县
				localId.add("513230");       // 四川省阿坝藏族羌族自治州壤塘县
				localId.add("513231");       // 四川省阿坝藏族羌族自治州阿坝县
				localId.add("513232");       // 四川省阿坝藏族羌族自治州若尔盖县
				localId.add("513233");       // 四川省阿坝藏族羌族自治州红原县
			}
			if (city.contains("省甘孜") || city.isEmpty()) {
				localId.add("513321");       // 四川省甘孜藏族自治州康定县
				localId.add("513322");       // 四川省甘孜藏族自治州泸定县
				localId.add("513323");       // 四川省甘孜藏族自治州丹巴县
				localId.add("513324");       // 四川省甘孜藏族自治州九龙县
				localId.add("513325");       // 四川省甘孜藏族自治州雅江县
				localId.add("513326");       // 四川省甘孜藏族自治州道孚县
				localId.add("513327");       // 四川省甘孜藏族自治州炉霍县
				localId.add("513328");       // 四川省甘孜藏族自治州甘孜县
				localId.add("513329");       // 四川省甘孜藏族自治州新龙县
				localId.add("513330");       // 四川省甘孜藏族自治州德格县
				localId.add("513331");       // 四川省甘孜藏族自治州白玉县
				localId.add("513332");       // 四川省甘孜藏族自治州石渠县
				localId.add("513333");       // 四川省甘孜藏族自治州色达县
				localId.add("513334");       // 四川省甘孜藏族自治州理塘县
				localId.add("513335");       // 四川省甘孜藏族自治州巴塘县
				localId.add("513336");       // 四川省甘孜藏族自治州乡城县
				localId.add("513337");       // 四川省甘孜藏族自治州稻城县
				localId.add("513338");       // 四川省甘孜藏族自治州得荣县
			}
			if (city.contains("凉山") || city.isEmpty()) {
				localId.add("513401");       // 四川省凉山彝族自治州西昌市
				localId.add("513422");       // 四川省凉山彝族自治州木里藏族自治县
				localId.add("513423");       // 四川省凉山彝族自治州盐源县
				localId.add("513424");       // 四川省凉山彝族自治州德昌县
				localId.add("513425");       // 四川省凉山彝族自治州会理县
				localId.add("513426");       // 四川省凉山彝族自治州会东县
				localId.add("513427");       // 四川省凉山彝族自治州宁南县
				localId.add("513428");       // 四川省凉山彝族自治州普格县
				localId.add("513429");       // 四川省凉山彝族自治州布拖县
				localId.add("513430");       // 四川省凉山彝族自治州金阳县
				localId.add("513431");       // 四川省凉山彝族自治州昭觉县
				localId.add("513432");       // 四川省凉山彝族自治州喜德县
				localId.add("513433");       // 四川省凉山彝族自治州冕宁县
				localId.add("513434");       // 四川省凉山彝族自治州越西县
				localId.add("513435");       // 四川省凉山彝族自治州甘洛县
				localId.add("513436");       // 四川省凉山彝族自治州美姑县
				localId.add("513437");       // 四川省凉山彝族自治州雷波县
			}
			if (city.contains("巴中") || city.isEmpty()) {
				localId.add("513701");       // 四川省巴中地区巴中市
				localId.add("513721");       // 四川省巴中地区通江县
				localId.add("513722");       // 四川省巴中地区南江县
				localId.add("513723");       // 四川省巴中地区平昌县
			}
			if (city.contains("眉山") || city.isEmpty()) {
				localId.add("513821");       // 四川省眉山地区眉山县
				localId.add("513822");       // 四川省眉山地区仁寿县
				localId.add("513823");       // 四川省眉山地区彭山县
				localId.add("513824");       // 四川省眉山地区洪雅县
				localId.add("513825");       // 四川省眉山地区丹棱县
				localId.add("513826");       // 四川省眉山地区青神县
				localId.add("513900");       // 四川省眉山地区资阳地区
				localId.add("513901");       // 四川省眉山地区资阳市
				localId.add("513902");       // 四川省眉山地区简阳市
				localId.add("513921");       // 四川省眉山地区安岳县
				localId.add("513922");       // 四川省眉山地区乐至县
			}
		}
		if (province.contains("贵州") || province.isEmpty()) {
			if (city.contains("贵阳") || city.isEmpty()) {
				localId.add("520102");       // 贵州省贵阳市南明区
				localId.add("520103");       // 贵州省贵阳市云岩区
				localId.add("520111");       // 贵州省贵阳市花溪区
				localId.add("520112");       // 贵州省贵阳市乌当区
				localId.add("520113");       // 贵州省贵阳市白云区
				localId.add("520121");       // 贵州省贵阳市开阳县
				localId.add("520122");       // 贵州省贵阳市息烽县
				localId.add("520123");       // 贵州省贵阳市修文县
				localId.add("520181");       // 贵州省贵阳市清镇市
			}
			if (city.contains("六盘水") || city.isEmpty()) {
				localId.add("520201");       // 贵州省六盘水市钟山区
				localId.add("520202");       // 贵州省六盘水市盘县特区
				localId.add("520203");       // 贵州省六盘水市六枝特区
				localId.add("520221");       // 贵州省六盘水市水城县
			}
			if (city.contains("遵义") || city.isEmpty()) {
				localId.add("520302");       // 贵州省遵义市红花岗区
				localId.add("520321");       // 贵州省遵义市遵义县
				localId.add("520322");       // 贵州省遵义市桐梓县
				localId.add("520323");       // 贵州省遵义市绥阳县
				localId.add("520324");       // 贵州省遵义市正安县
				localId.add("520325");       // 贵州省遵义市道真仡佬族苗族自治县
				localId.add("520326");       // 贵州省遵义市务川仡佬族苗族自治县
				localId.add("520327");       // 贵州省遵义市凤冈县
				localId.add("520328");       // 贵州省遵义市湄潭县
				localId.add("520329");       // 贵州省遵义市余庆县
				localId.add("520330");       // 贵州省遵义市习水县
				localId.add("520381");       // 贵州省遵义市赤水市
				localId.add("520382");       // 贵州省遵义市仁怀市
			}
			if (city.contains("铜仁") || city.isEmpty()) {
				localId.add("522201");       // 贵州省铜仁地区铜仁市
				localId.add("522222");       // 贵州省铜仁地区江口县
				localId.add("522223");       // 贵州省铜仁地区玉屏侗族自治县
				localId.add("522224");       // 贵州省铜仁地区石阡县
				localId.add("522225");       // 贵州省铜仁地区思南县
				localId.add("522226");       // 贵州省铜仁地区印江土家族苗族自治县
				localId.add("522227");       // 贵州省铜仁地区德江县
				localId.add("522228");       // 贵州省铜仁地区沿河土家族自治县
				localId.add("522229");       // 贵州省铜仁地区松桃苗族自治县
				localId.add("522230");       // 贵州省铜仁地区万山特区
			}
			if (city.contains("黔西南") || city.isEmpty()) {
				localId.add("522301");       // 贵州省黔西南布依族苗族自治州兴义市
				localId.add("522322");       // 贵州省黔西南布依族苗族自治州兴仁县
				localId.add("522323");       // 贵州省黔西南布依族苗族自治州普安县
				localId.add("522324");       // 贵州省黔西南布依族苗族自治州晴隆县
				localId.add("522325");       // 贵州省黔西南布依族苗族自治州贞丰县
				localId.add("522326");       // 贵州省黔西南布依族苗族自治州望谟县
				localId.add("522327");       // 贵州省黔西南布依族苗族自治州册亨县
				localId.add("522328");       // 贵州省黔西南布依族苗族自治州安龙县
			}
			if (city.contains("毕节") || city.isEmpty()) {
				localId.add("522401");       // 贵州省毕节地区毕节市
				localId.add("522422");       // 贵州省毕节地区大方县
				localId.add("522423");       // 贵州省毕节地区黔西县
				localId.add("522424");       // 贵州省毕节地区金沙县
				localId.add("522425");       // 贵州省毕节地区织金县
				localId.add("522426");       // 贵州省毕节地区纳雍县
				localId.add("522427");       // 贵州省毕节地区威宁彝族回族苗族自治县
				localId.add("522428");       // 贵州省毕节地区赫章县
			}
			if (city.contains("安顺") || city.isEmpty()) {
				localId.add("522501");       // 贵州省安顺地区安顺市
				localId.add("522526");       // 贵州省安顺地区平坝县
				localId.add("522527");       // 贵州省安顺地区普定县
				localId.add("522528");       // 贵州省安顺地区关岭布依族苗族自治县
				localId.add("522529");       // 贵州省安顺地区镇宁布依族苗族自治县
				localId.add("522530");       // 贵州省安顺地区紫云苗族布依族自治县
			}
			if (city.contains("黔东南") || city.isEmpty()) {
				localId.add("522601");       // 贵州省黔东南苗族侗族自治州凯里市
				localId.add("522622");       // 贵州省黔东南苗族侗族自治州黄平县
				localId.add("522623");       // 贵州省黔东南苗族侗族自治州施秉县
				localId.add("522624");       // 贵州省黔东南苗族侗族自治州三穗县
				localId.add("522625");       // 贵州省黔东南苗族侗族自治州镇远县
				localId.add("522626");       // 贵州省黔东南苗族侗族自治州岑巩县
				localId.add("522627");       // 贵州省黔东南苗族侗族自治州天柱县
				localId.add("522628");       // 贵州省黔东南苗族侗族自治州锦屏县
				localId.add("522629");       // 贵州省黔东南苗族侗族自治州剑河县
				localId.add("522630");       // 贵州省黔东南苗族侗族自治州台江县
				localId.add("522631");       // 贵州省黔东南苗族侗族自治州黎平县
				localId.add("522632");       // 贵州省黔东南苗族侗族自治州榕江县
				localId.add("522633");       // 贵州省黔东南苗族侗族自治州从江县
				localId.add("522634");       // 贵州省黔东南苗族侗族自治州雷山县
				localId.add("522635");       // 贵州省黔东南苗族侗族自治州麻江县
				localId.add("522636");       // 贵州省黔东南苗族侗族自治州丹寨县
			}
			if (city.contains("黔南") || city.isEmpty()) {
				localId.add("522701");       // 贵州省黔南布依族苗族自治州都匀市
				localId.add("522702");       // 贵州省黔南布依族苗族自治州福泉市
				localId.add("522722");       // 贵州省黔南布依族苗族自治州荔波县
				localId.add("522723");       // 贵州省黔南布依族苗族自治州贵定县
				localId.add("522725");       // 贵州省黔南布依族苗族自治州瓮安县
				localId.add("522726");       // 贵州省黔南布依族苗族自治州独山县
				localId.add("522727");       // 贵州省黔南布依族苗族自治州平塘县
				localId.add("522728");       // 贵州省黔南布依族苗族自治州罗甸县
				localId.add("522729");       // 贵州省黔南布依族苗族自治州长顺县
				localId.add("522730");       // 贵州省黔南布依族苗族自治州龙里县
				localId.add("522731");       // 贵州省黔南布依族苗族自治州惠水县
				localId.add("522732");       // 贵州省黔南布依族苗族自治州三都水族自治县
			}
		}
		if (province.contains("云南") || province.isEmpty()) {
			if (city.contains("昆明") || city.isEmpty()) {
				localId.add("530102");       // 云南省昆明市五华区
				localId.add("530103");       // 云南省昆明市盘龙区
				localId.add("530111");       // 云南省昆明市官渡区
				localId.add("530112");       // 云南省昆明市西山区
				localId.add("530113");       // 云南省昆明市东川区
				localId.add("530121");       // 云南省昆明市呈贡县
				localId.add("530122");       // 云南省昆明市晋宁县
				localId.add("530124");       // 云南省昆明市富民县
				localId.add("530125");       // 云南省昆明市宜良县
				localId.add("530126");       // 云南省昆明市石林彝族自治县
				localId.add("530127");       // 云南省昆明市嵩明县
				localId.add("530128");       // 云南省昆明市禄劝彝族苗族自治县
				localId.add("530129");       // 云南省昆明市寻甸回族彝族自治县
				localId.add("530181");       // 云南省昆明市安宁市
			}
			if (city.contains("曲靖") || city.isEmpty()) {
				localId.add("530302");       // 云南省曲靖市麒麟区
				localId.add("530321");       // 云南省曲靖市马龙县
				localId.add("530322");       // 云南省曲靖市陆良县
				localId.add("530323");       // 云南省曲靖市师宗县
				localId.add("530324");       // 云南省曲靖市罗平县
				localId.add("530325");       // 云南省曲靖市富源县
				localId.add("530326");       // 云南省曲靖市会泽县
				localId.add("530328");       // 云南省曲靖市沾益县
				localId.add("530381");       // 云南省曲靖市宣威市
			}
			if (city.contains("玉溪") || city.isEmpty()) {
				localId.add("530402");       // 云南省玉溪市红塔区
				localId.add("530421");       // 云南省玉溪市江川县
				localId.add("530422");       // 云南省玉溪市澄江县
				localId.add("530423");       // 云南省玉溪市通海县
				localId.add("530424");       // 云南省玉溪市华宁县
				localId.add("530425");       // 云南省玉溪市易门县
				localId.add("530426");       // 云南省玉溪市峨山彝族自治县
				localId.add("530427");       // 云南省玉溪市新平彝族傣族自治县
				localId.add("530428");       // 云南省玉溪市元江哈尼族彝族傣族自治县
			}
			if (city.contains("昭通") || city.isEmpty()) {
				localId.add("532101");       // 云南省昭通地区昭通市
				localId.add("532122");       // 云南省昭通地区鲁甸县
				localId.add("532123");       // 云南省昭通地区巧家县
				localId.add("532124");       // 云南省昭通地区盐津县
				localId.add("532125");       // 云南省昭通地区大关县
				localId.add("532126");       // 云南省昭通地区永善县
				localId.add("532127");       // 云南省昭通地区绥江县
				localId.add("532128");       // 云南省昭通地区镇雄县
				localId.add("532129");       // 云南省昭通地区彝良县
				localId.add("532130");       // 云南省昭通地区威信县
				localId.add("532131");       // 云南省昭通地区水富县
			}
			if (city.contains("楚雄") || city.isEmpty()) {
				localId.add("532301");       // 云南省楚雄彝族自治州楚雄市
				localId.add("532322");       // 云南省楚雄彝族自治州双柏县
				localId.add("532323");       // 云南省楚雄彝族自治州牟定县
				localId.add("532324");       // 云南省楚雄彝族自治州南华县
				localId.add("532325");       // 云南省楚雄彝族自治州姚安县
				localId.add("532326");       // 云南省楚雄彝族自治州大姚县
				localId.add("532327");       // 云南省楚雄彝族自治州永仁县
				localId.add("532328");       // 云南省楚雄彝族自治州元谋县
				localId.add("532329");       // 云南省楚雄彝族自治州武定县
				localId.add("532331");       // 云南省楚雄彝族自治州禄丰县
			}
			if (city.contains("红河") || city.isEmpty()) {
				localId.add("532501");       // 云南省红河哈尼族彝族自治州个旧市
				localId.add("532502");       // 云南省红河哈尼族彝族自治州开远市
				localId.add("532522");       // 云南省红河哈尼族彝族自治州蒙自县
				localId.add("532523");       // 云南省红河哈尼族彝族自治州屏边苗族自治县
				localId.add("532524");       // 云南省红河哈尼族彝族自治州建水县
				localId.add("532525");       // 云南省红河哈尼族彝族自治州石屏县
				localId.add("532526");       // 云南省红河哈尼族彝族自治州弥勒县
				localId.add("532527");       // 云南省红河哈尼族彝族自治州泸西县
				localId.add("532528");       // 云南省红河哈尼族彝族自治州元阳县
				localId.add("532529");       // 云南省红河哈尼族彝族自治州红河县
				localId.add("532530");       // 云南省红河哈尼族彝族自治州金平苗族瑶族傣族自治县
				localId.add("532531");       // 云南省红河哈尼族彝族自治州绿春县
				localId.add("532532");       // 云南省红河哈尼族彝族自治州河口瑶族自治县
			}
			if (city.contains("文山") || city.isEmpty()) {
				localId.add("532621");       // 云南省文山壮族苗族自治州文山县
				localId.add("532622");       // 云南省文山壮族苗族自治州砚山县
				localId.add("532623");       // 云南省文山壮族苗族自治州西畴县
				localId.add("532624");       // 云南省文山壮族苗族自治州麻栗坡县
				localId.add("532625");       // 云南省文山壮族苗族自治州马关县
				localId.add("532626");       // 云南省文山壮族苗族自治州丘北县
				localId.add("532627");       // 云南省文山壮族苗族自治州广南县
				localId.add("532628");       // 云南省文山壮族苗族自治州富宁县
			}
			if (city.contains("思茅") || city.isEmpty()) {
				localId.add("532701");       // 云南省思茅地区思茅市
				localId.add("532722");       // 云南省思茅地区普洱哈尼族彝族自治县
				localId.add("532723");       // 云南省思茅地区墨江哈尼族自治县
				localId.add("532724");       // 云南省思茅地区景东彝族自治县
				localId.add("532725");       // 云南省思茅地区景谷傣族彝族自治县
				localId.add("532726");       // 云南省思茅地区镇沅彝族哈尼族拉祜族自治县
				localId.add("532727");       // 云南省思茅地区江城哈尼族彝族自治县
				localId.add("532728");       // 云南省思茅地区孟连傣族拉祜族佤族自治县
				localId.add("532729");       // 云南省思茅地区澜沧拉祜族自治县
				localId.add("532730");       // 云南省思茅地区西盟佤族自治县
			}
			if (city.contains("西双版纳") || city.isEmpty()) {
				localId.add("532801");       // 云南省西双版纳傣族自治州景洪市
				localId.add("532822");       // 云南省西双版纳傣族自治州勐海县
				localId.add("532823");       // 云南省西双版纳傣族自治州勐腊县
			}
			if (city.contains("大理") || city.isEmpty()) {
				localId.add("532922");       // 云南省大理白族自治州漾濞彝族自治县
				localId.add("532923");       // 云南省大理白族自治州祥云县
				localId.add("532924");       // 云南省大理白族自治州宾川县
				localId.add("532925");       // 云南省大理白族自治州弥渡县
				localId.add("532926");       // 云南省大理白族自治州南涧彝族自治县
				localId.add("532927");       // 云南省大理白族自治州巍山彝族回族自治县
				localId.add("532928");       // 云南省大理白族自治州永平县
				localId.add("532929");       // 云南省大理白族自治州云龙县
				localId.add("532930");       // 云南省大理白族自治州洱源县
				localId.add("532931");       // 云南省大理白族自治州剑川县
				localId.add("532932");       // 云南省大理白族自治州鹤庆县
			}
			if (city.contains("保山") || city.isEmpty()) {
				localId.add("533001");       // 云南省保山地区保山市
				localId.add("533022");       // 云南省保山地区施甸县
				localId.add("533023");       // 云南省保山地区腾冲县
				localId.add("533024");       // 云南省保山地区龙陵县
				localId.add("533025");       // 云南省保山地区昌宁县
			}
			if (city.contains("德宏") || city.isEmpty()) {
				localId.add("533101");       // 云南省德宏傣族景颇族自治州畹町市
				localId.add("533102");       // 云南省德宏傣族景颇族自治州瑞丽市
				localId.add("533103");       // 云南省德宏傣族景颇族自治州潞西市
				localId.add("533122");       // 云南省德宏傣族景颇族自治州梁河县
				localId.add("533123");       // 云南省德宏傣族景颇族自治州盈江县
				localId.add("533124");       // 云南省德宏傣族景颇族自治州陇川县
			}
			if (city.contains("丽江") || city.isEmpty()) {
				localId.add("533221");       // 云南省丽江地区丽江纳西族自治县
				localId.add("533222");       // 云南省丽江地区永胜县
				localId.add("533223");       // 云南省丽江地区华坪县
				localId.add("533224");       // 云南省丽江地区宁蒗彝族自治县
			}
			if (city.contains("傈僳族") || city.isEmpty()) {
				localId.add("533321");       // 云南省怒江傈僳族自治州泸水县
				localId.add("533323");       // 云南省怒江傈僳族自治州福贡县
				localId.add("533324");       // 云南省怒江傈僳族自治州贡山独龙族怒族自治县
				localId.add("533325");       // 云南省怒江傈僳族自治州兰坪白族普米族自治县
			}
			if (city.contains("迪庆") || city.isEmpty()) {
				localId.add("533400");       // 云南省迪庆藏族自治州
				localId.add("533421");       // 云南省迪庆藏族自治州中甸县
				localId.add("533422");       // 云南省迪庆藏族自治州德钦县
				localId.add("533423");       // 云南省迪庆藏族自治州维西傈僳族自治县
			}
			if (city.contains("临沧") || city.isEmpty()) {
				localId.add("533521");       // 云南省临沧地区临沧县
				localId.add("533522");       // 云南省临沧地区凤庆县
				localId.add("533523");       // 云南省临沧地区云县
				localId.add("533524");       // 云南省临沧地区永德县
				localId.add("533525");       // 云南省临沧地区镇康县
				localId.add("533526");       // 云南省临沧地区双江拉祜族佤族布朗族傣族自治县
				localId.add("533527");       // 云南省临沧地区耿马傣族佤族自治县
				localId.add("533528");       // 云南省临沧地区沧源佤族自治县
			}
		}
		if (province.contains("西藏") || province.isEmpty()) {
			if (city.contains("拉萨") || city.isEmpty()) {
				localId.add("540102");       // 西藏自治区拉萨市城关区
				localId.add("540121");       // 西藏自治区拉萨市林周县
				localId.add("540122");       // 西藏自治区拉萨市当雄县
				localId.add("540123");       // 西藏自治区拉萨市尼木县
				localId.add("540124");       // 西藏自治区拉萨市曲水县
				localId.add("540125");       // 西藏自治区拉萨市堆龙德庆县
				localId.add("540126");       // 西藏自治区拉萨市达孜县
				localId.add("540127");       // 西藏自治区拉萨市墨竹工卡县
			}
			if (city.contains("昌都") || city.isEmpty()) {
				localId.add("542121");       // 西藏自治区昌都地区昌都县
				localId.add("542122");       // 西藏自治区昌都地区江达县
				localId.add("542123");       // 西藏自治区昌都地区贡觉县
				localId.add("542124");       // 西藏自治区昌都地区类乌齐县
				localId.add("542125");       // 西藏自治区昌都地区丁青县
				localId.add("542126");       // 西藏自治区昌都地区察雅县
				localId.add("542127");       // 西藏自治区昌都地区八宿县
				localId.add("542128");       // 西藏自治区昌都地区左贡县
				localId.add("542129");       // 西藏自治区昌都地区芒康县
				localId.add("542132");       // 西藏自治区昌都地区洛隆县
				localId.add("542133");       // 西藏自治区昌都地区边坝县
				localId.add("542134");       // 西藏自治区昌都地区盐井县
				localId.add("542135");       // 西藏自治区昌都地区碧土县
				localId.add("542136");       // 西藏自治区昌都地区妥坝县
				localId.add("542137");       // 西藏自治区昌都地区生达县
			}
			if (city.contains("山南") || city.isEmpty()) {
				localId.add("542221");       // 西藏自治区山南地区乃东县
				localId.add("542222");       // 西藏自治区山南地区扎囊县
				localId.add("542223");       // 西藏自治区山南地区贡嘎县
				localId.add("542224");       // 西藏自治区山南地区桑日县
				localId.add("542225");       // 西藏自治区山南地区琼结县
				localId.add("542226");       // 西藏自治区山南地区曲松县
				localId.add("542227");       // 西藏自治区山南地区措美县
				localId.add("542228");       // 西藏自治区山南地区洛扎县
				localId.add("542229");       // 西藏自治区山南地区加查县
				localId.add("542231");       // 西藏自治区山南地区隆子县
				localId.add("542232");       // 西藏自治区山南地区错那县
				localId.add("542233");       // 西藏自治区山南地区浪卡子县
			}
			if (city.contains("日喀则") || city.isEmpty()) {
				localId.add("542301");       // 西藏自治区日喀则地区日喀则市
				localId.add("542322");       // 西藏自治区日喀则地区南木林县
				localId.add("542323");       // 西藏自治区日喀则地区江孜县
				localId.add("542324");       // 西藏自治区日喀则地区定日县
				localId.add("542325");       // 西藏自治区日喀则地区萨迦县
				localId.add("542326");       // 西藏自治区日喀则地区拉孜县
				localId.add("542327");       // 西藏自治区日喀则地区昂仁县
				localId.add("542328");       // 西藏自治区日喀则地区谢通门县
				localId.add("542329");       // 西藏自治区日喀则地区白朗县
				localId.add("542330");       // 西藏自治区日喀则地区仁布县
				localId.add("542331");       // 西藏自治区日喀则地区康马县
				localId.add("542332");       // 西藏自治区日喀则地区定结县
				localId.add("542333");       // 西藏自治区日喀则地区仲巴县
				localId.add("542334");       // 西藏自治区日喀则地区亚东县
				localId.add("542335");       // 西藏自治区日喀则地区吉隆县
				localId.add("542336");       // 西藏自治区日喀则地区聂拉木县
				localId.add("542337");       // 西藏自治区日喀则地区萨嘎县
				localId.add("542338");       // 西藏自治区日喀则地区岗巴县
			}
			if (city.contains("那曲") || city.isEmpty()) {
				localId.add("542421");       // 西藏自治区那曲地区那曲县
				localId.add("542422");       // 西藏自治区那曲地区嘉黎县
				localId.add("542423");       // 西藏自治区那曲地区比如县
				localId.add("542424");       // 西藏自治区那曲地区聂荣县
				localId.add("542425");       // 西藏自治区那曲地区安多县
				localId.add("542426");       // 西藏自治区那曲地区申扎县
				localId.add("542427");       // 西藏自治区那曲地区索县
				localId.add("542428");       // 西藏自治区那曲地区班戈县
				localId.add("542429");       // 西藏自治区那曲地区巴青县
				localId.add("542430");       // 西藏自治区那曲地区尼玛县
			}
			if (city.contains("阿里") || city.isEmpty()) {
				localId.add("542521");       // 西藏自治区阿里地区普兰县
				localId.add("542522");       // 西藏自治区阿里地区札达县
				localId.add("542523");       // 西藏自治区阿里地区噶尔县
				localId.add("542524");       // 西藏自治区阿里地区日土县
				localId.add("542525");       // 西藏自治区阿里地区革吉县
				localId.add("542526");       // 西藏自治区阿里地区改则县
				localId.add("542527");       // 西藏自治区阿里地区措勤县
				localId.add("542528");       // 西藏自治区阿里地区隆格尔县
			}
			if (city.contains("林芝") || city.isEmpty()) {
				localId.add("542621");       // 西藏自治区林芝地区林芝县
				localId.add("542622");       // 西藏自治区林芝地区工布江达县
				localId.add("542623");       // 西藏自治区林芝地区米林县
				localId.add("542624");       // 西藏自治区林芝地区墨脱县
				localId.add("542625");       // 西藏自治区林芝地区波密县
				localId.add("542626");       // 西藏自治区林芝地区察隅县
				localId.add("542627");       // 西藏自治区林芝地区朗县
			}
		}
		if (province.contains("陕西") || province.isEmpty()) {
			if (city.contains("西安") || city.isEmpty()) {
				localId.add("610102");       // 陕西省西安市新城区
				localId.add("610103");       // 陕西省西安市碑林区
				localId.add("610104");       // 陕西省西安市莲湖区
				localId.add("610111");       // 陕西省西安市灞桥区
				localId.add("610112");       // 陕西省西安市未央区
				localId.add("610113");       // 陕西省西安市雁塔区
				localId.add("610114");       // 陕西省西安市阎良区
				localId.add("610115");       // 陕西省西安市临潼区
				localId.add("610121");       // 陕西省西安市长安县
				localId.add("610122");       // 陕西省西安市蓝田县
				localId.add("610124");       // 陕西省西安市周至县
				localId.add("610125");       // 陕西省西安市户县
				localId.add("610126");       // 陕西省西安市高陵县
			}
			if (city.contains("铜川") || city.isEmpty()) {
				localId.add("610202");       // 陕西省铜川市城区
				localId.add("610203");       // 陕西省铜川市郊区
				localId.add("610221");       // 陕西省铜川市耀县
				localId.add("610222");       // 陕西省铜川市宜君县
			}
			if (city.contains("宝鸡") || city.isEmpty()) {
				localId.add("610302");       // 陕西省宝鸡市渭滨区
				localId.add("610303");       // 陕西省宝鸡市金台区
				localId.add("610321");       // 陕西省宝鸡市宝鸡县
				localId.add("610322");       // 陕西省宝鸡市凤翔县
				localId.add("610323");       // 陕西省宝鸡市岐山县
				localId.add("610324");       // 陕西省宝鸡市扶风县
				localId.add("610326");       // 陕西省宝鸡市眉县
				localId.add("610327");       // 陕西省宝鸡市陇县
				localId.add("610328");       // 陕西省宝鸡市千阳县
				localId.add("610329");       // 陕西省宝鸡市麟游县
				localId.add("610330");       // 陕西省宝鸡市凤县
				localId.add("610331");       // 陕西省宝鸡市太白县
			}
			if (city.contains("咸阳") || city.isEmpty()) {
				localId.add("610402");       // 陕西省咸阳市秦都区
				localId.add("610403");       // 陕西省咸阳市杨陵区
				localId.add("610404");       // 陕西省咸阳市渭城区
				localId.add("610422");       // 陕西省咸阳市三原县
				localId.add("610423");       // 陕西省咸阳市泾阳县
				localId.add("610424");       // 陕西省咸阳市乾县
				localId.add("610425");       // 陕西省咸阳市礼泉县
				localId.add("610426");       // 陕西省咸阳市永寿县
				localId.add("610427");       // 陕西省咸阳市彬县
				localId.add("610428");       // 陕西省咸阳市长武县
				localId.add("610429");       // 陕西省咸阳市旬邑县
				localId.add("610430");       // 陕西省咸阳市淳化县
				localId.add("610431");       // 陕西省咸阳市武功县
				localId.add("610481");       // 陕西省咸阳市兴平市
			}
			if (city.contains("渭南") || city.isEmpty()) {
				localId.add("610502");       // 陕西省渭南市临渭区
				localId.add("610521");       // 陕西省渭南市华县
				localId.add("610522");       // 陕西省渭南市潼关县
				localId.add("610523");       // 陕西省渭南市大荔县
				localId.add("610524");       // 陕西省渭南市合阳县
				localId.add("610525");       // 陕西省渭南市澄城县
				localId.add("610526");       // 陕西省渭南市蒲城县
				localId.add("610527");       // 陕西省渭南市白水县
				localId.add("610528");       // 陕西省渭南市富平县
				localId.add("610581");       // 陕西省渭南市韩城市
				localId.add("610582");       // 陕西省渭南市华阴市
			}
			if (city.contains("延安") || city.isEmpty()) {
				localId.add("610602");       // 陕西省延安市宝塔区
				localId.add("610621");       // 陕西省延安市延长县
				localId.add("610622");       // 陕西省延安市延川县
				localId.add("610623");       // 陕西省延安市子长县
				localId.add("610624");       // 陕西省延安市安塞县
				localId.add("610625");       // 陕西省延安市志丹县
				localId.add("610626");       // 陕西省延安市吴旗县
				localId.add("610627");       // 陕西省延安市甘泉县
				localId.add("610628");       // 陕西省延安市富县
				localId.add("610629");       // 陕西省延安市洛川县
				localId.add("610630");       // 陕西省延安市宜川县
				localId.add("610631");       // 陕西省延安市黄龙县
				localId.add("610632");       // 陕西省延安市黄陵县
			}
			if (city.contains("汉中") || city.isEmpty()) {
				localId.add("610702");       // 陕西省汉中市汉台区
				localId.add("610721");       // 陕西省汉中市南郑县
				localId.add("610722");       // 陕西省汉中市城固县
				localId.add("610723");       // 陕西省汉中市洋县
				localId.add("610724");       // 陕西省汉中市西乡县
				localId.add("610725");       // 陕西省汉中市勉县
				localId.add("610726");       // 陕西省汉中市宁强县
				localId.add("610727");       // 陕西省汉中市略阳县
				localId.add("610728");       // 陕西省汉中市镇巴县
				localId.add("610729");       // 陕西省汉中市留坝县
				localId.add("610730");       // 陕西省汉中市佛坪县
			}
			if (city.contains("安康") || city.isEmpty()) {
				localId.add("612401");       // 陕西省安康地区安康市
				localId.add("612422");       // 陕西省安康地区汉阴县
				localId.add("612423");       // 陕西省安康地区石泉县
				localId.add("612424");       // 陕西省安康地区宁陕县
				localId.add("612425");       // 陕西省安康地区紫阳县
				localId.add("612426");       // 陕西省安康地区岚皋县
				localId.add("612427");       // 陕西省安康地区平利县
				localId.add("612428");       // 陕西省安康地区镇坪县
				localId.add("612429");       // 陕西省安康地区旬阳县
				localId.add("612430");       // 陕西省安康地区白河县
			}
			if (city.contains("商洛") || city.isEmpty()) {
				localId.add("612501");       // 陕西省商洛地区商州市
				localId.add("612522");       // 陕西省商洛地区洛南县
				localId.add("612523");       // 陕西省商洛地区丹凤县
				localId.add("612524");       // 陕西省商洛地区商南县
				localId.add("612525");       // 陕西省商洛地区山阳县
				localId.add("612526");       // 陕西省商洛地区镇安县
				localId.add("612527");       // 陕西省商洛地区柞水县
			}
			if (city.contains("榆林") || city.isEmpty()) {
				localId.add("612701");       // 陕西省榆林地区榆林市
				localId.add("612722");       // 陕西省榆林地区神木县
				localId.add("612723");       // 陕西省榆林地区府谷县
				localId.add("612724");       // 陕西省榆林地区横山县
				localId.add("612725");       // 陕西省榆林地区靖边县
				localId.add("612726");       // 陕西省榆林地区定边县
				localId.add("612727");       // 陕西省榆林地区绥德县
				localId.add("612728");       // 陕西省榆林地区米脂县
				localId.add("612729");       // 陕西省榆林地区佳县
				localId.add("612730");       // 陕西省榆林地区吴堡县
				localId.add("612731");       // 陕西省榆林地区清涧县
				localId.add("612732");       // 陕西省榆林地区子洲县
			}
		}
		if (province.contains("甘肃") || province.isEmpty()) {
			if (city.contains("兰州") || city.isEmpty()) {
				localId.add("620102");       // 甘肃省兰州市城关区
				localId.add("620103");       // 甘肃省兰州市七里河区
				localId.add("620104");       // 甘肃省兰州市西固区
				localId.add("620105");       // 甘肃省兰州市安宁区
				localId.add("620111");       // 甘肃省兰州市红古区
				localId.add("620121");       // 甘肃省兰州市永登县
				localId.add("620122");       // 甘肃省兰州市皋兰县
				localId.add("620123");       // 甘肃省兰州市榆中县
			}
			if (city.contains("嘉峪关") || city.isEmpty()) {
				localId.add("620300");       // 甘肃省嘉峪关市金昌市
				localId.add("620301");       // 甘肃省嘉峪关市市辖区
				localId.add("620302");       // 甘肃省嘉峪关市金川区
				localId.add("620321");       // 甘肃省嘉峪关市永昌县
			}
			if (city.contains("白银") || city.isEmpty()) {
				localId.add("620402");       // 甘肃省白银市白银区
				localId.add("620403");       // 甘肃省白银市平川区
				localId.add("620421");       // 甘肃省白银市靖远县
				localId.add("620422");       // 甘肃省白银市会宁县
				localId.add("620423");       // 甘肃省白银市景泰县
			}
			if (city.contains("天水") || city.isEmpty()) {
				localId.add("620502");       // 甘肃省天水市秦城区
				localId.add("620503");       // 甘肃省天水市北道区
				localId.add("620521");       // 甘肃省天水市清水县
				localId.add("620522");       // 甘肃省天水市秦安县
				localId.add("620523");       // 甘肃省天水市甘谷县
				localId.add("620524");       // 甘肃省天水市武山县
				localId.add("620525");       // 甘肃省天水市张家川回族自治县
			}
			if (city.contains("酒泉") || city.isEmpty()) {
				localId.add("622101");       // 甘肃省酒泉地区玉门市
				localId.add("622102");       // 甘肃省酒泉地区酒泉市
				localId.add("622103");       // 甘肃省酒泉地区敦煌市
				localId.add("622123");       // 甘肃省酒泉地区金塔县
				localId.add("622124");       // 甘肃省酒泉地区肃北蒙古族自治县
				localId.add("622125");       // 甘肃省酒泉地区阿克塞哈萨克族自治县
				localId.add("622126");       // 甘肃省酒泉地区安西县
			}
			if (city.contains("张掖") || city.isEmpty()) {
				localId.add("622201");       // 甘肃省张掖地区张掖市
				localId.add("622222");       // 甘肃省张掖地区肃南裕固族自治县
				localId.add("622223");       // 甘肃省张掖地区民乐县
				localId.add("622224");       // 甘肃省张掖地区临泽县
				localId.add("622225");       // 甘肃省张掖地区高台县
				localId.add("622226");       // 甘肃省张掖地区山丹县
			}
			if (city.contains("武威") || city.isEmpty()) {
				localId.add("622301");       // 甘肃省武威地区武威市
				localId.add("622322");       // 甘肃省武威地区民勤县
				localId.add("622323");       // 甘肃省武威地区古浪县
				localId.add("622326");       // 甘肃省武威地区天祝藏族自治县
			}
			if (city.contains("定西") || city.isEmpty()) {
				localId.add("622421");       // 甘肃省定西地区定西县
				localId.add("622424");       // 甘肃省定西地区通渭县
				localId.add("622425");       // 甘肃省定西地区陇西县
				localId.add("622426");       // 甘肃省定西地区渭源县
				localId.add("622427");       // 甘肃省定西地区临洮县
				localId.add("622428");       // 甘肃省定西地区漳县
				localId.add("622429");       // 甘肃省定西地区岷县
			}
			if (city.contains("陇南") || city.isEmpty()) {
				localId.add("622621");       // 甘肃省陇南地区武都县
				localId.add("622623");       // 甘肃省陇南地区宕昌县
				localId.add("622624");       // 甘肃省陇南地区成县
				localId.add("622625");       // 甘肃省陇南地区康县
				localId.add("622626");       // 甘肃省陇南地区文县
				localId.add("622627");       // 甘肃省陇南地区西和县
				localId.add("622628");       // 甘肃省陇南地区礼县
				localId.add("622629");       // 甘肃省陇南地区两当县
				localId.add("622630");       // 甘肃省陇南地区徽县
			}
			if (city.contains("平凉") || city.isEmpty()) {
				localId.add("622701");       // 甘肃省平凉地区平凉市
				localId.add("622722");       // 甘肃省平凉地区泾川县
				localId.add("622723");       // 甘肃省平凉地区灵台县
				localId.add("622724");       // 甘肃省平凉地区崇信县
				localId.add("622725");       // 甘肃省平凉地区华亭县
				localId.add("622726");       // 甘肃省平凉地区庄浪县
				localId.add("622727");       // 甘肃省平凉地区静宁县
			}
			if (city.contains("庆阳") || city.isEmpty()) {
				localId.add("622801");       // 甘肃省庆阳地区西峰市
				localId.add("622821");       // 甘肃省庆阳地区庆阳县
				localId.add("622822");       // 甘肃省庆阳地区环县
				localId.add("622823");       // 甘肃省庆阳地区华池县
				localId.add("622824");       // 甘肃省庆阳地区合水县
				localId.add("622825");       // 甘肃省庆阳地区正宁县
				localId.add("622826");       // 甘肃省庆阳地区宁县
				localId.add("622827");       // 甘肃省庆阳地区镇原县
			}
			if (city.contains("临夏") || city.isEmpty()) {
				localId.add("622901");       // 甘肃省临夏回族自治州临夏市
				localId.add("622921");       // 甘肃省临夏回族自治州临夏县
				localId.add("622922");       // 甘肃省临夏回族自治州康乐县
				localId.add("622923");       // 甘肃省临夏回族自治州永靖县
				localId.add("622924");       // 甘肃省临夏回族自治州广河县
				localId.add("622925");       // 甘肃省临夏回族自治州和政县
				localId.add("622926");       // 甘肃省临夏回族自治州东乡族自治县
				localId.add("622927");       // 甘肃省临夏回族自治州积石山保安族东乡族撒拉族自治县
			}
			if (city.contains("甘南") || city.isEmpty()) {
				localId.add("623001");       // 甘肃省甘南藏族自治州合作市
				localId.add("623021");       // 甘肃省甘南藏族自治州临潭县
				localId.add("623022");       // 甘肃省甘南藏族自治州卓尼县
				localId.add("623023");       // 甘肃省甘南藏族自治州舟曲县
				localId.add("623024");       // 甘肃省甘南藏族自治州迭部县
				localId.add("623025");       // 甘肃省甘南藏族自治州玛曲县
				localId.add("623026");       // 甘肃省甘南藏族自治州碌曲县
				localId.add("623027");       // 甘肃省甘南藏族自治州夏河县
			}
		}
		if (province.contains("青海") || province.isEmpty()) {
			if (city.contains("西宁") || city.isEmpty()) {
				localId.add("630102");       // 青海省西宁市城东区
				localId.add("630103");       // 青海省西宁市城中区
				localId.add("630104");       // 青海省西宁市城西区
				localId.add("630105");       // 青海省西宁市城北区
				localId.add("630121");       // 青海省西宁市大通回族土族自治县
			}
			if (city.contains("海东") || city.isEmpty()) {
				localId.add("632121");       // 青海省海东地区平安县
				localId.add("632122");       // 青海省海东地区民和回族土族自治县
				localId.add("632123");       // 青海省海东地区乐都县
				localId.add("632124");       // 青海省海东地区湟中县
				localId.add("632125");       // 青海省海东地区湟源县
				localId.add("632126");       // 青海省海东地区互助土族自治县
				localId.add("632127");       // 青海省海东地区化隆回族自治县
				localId.add("632128");       // 青海省海东地区循化撒拉族自治县
			}
			if (city.contains("海北") || city.isEmpty()) {
				localId.add("632221");       // 青海省海北藏族自治州门源回族自治县
				localId.add("632222");       // 青海省海北藏族自治州祁连县
				localId.add("632223");       // 青海省海北藏族自治州海晏县
				localId.add("632224");       // 青海省海北藏族自治州刚察县
			}
			if (city.contains("黄南") || city.isEmpty()) {
				localId.add("632321");       // 青海省黄南藏族自治州同仁县
				localId.add("632322");       // 青海省黄南藏族自治州尖扎县
				localId.add("632323");       // 青海省黄南藏族自治州泽库县
				localId.add("632324");       // 青海省黄南藏族自治州河南蒙古族自治县
			}
			if (city.contains("海南") || city.isEmpty()) {
				localId.add("632521");       // 青海省海南藏族自治州共和县
				localId.add("632522");       // 青海省海南藏族自治州同德县
				localId.add("632523");       // 青海省海南藏族自治州贵德县
				localId.add("632524");       // 青海省海南藏族自治州兴海县
				localId.add("632525");       // 青海省海南藏族自治州贵南县
			}
			if (city.contains("果洛") || city.isEmpty()) {
				localId.add("632621");       // 青海省果洛藏族自治州玛沁县
				localId.add("632622");       // 青海省果洛藏族自治州班玛县
				localId.add("632623");       // 青海省果洛藏族自治州甘德县
				localId.add("632624");       // 青海省果洛藏族自治州达日县
				localId.add("632625");       // 青海省果洛藏族自治州久治县
				localId.add("632626");       // 青海省果洛藏族自治州玛多县
			}
			if (city.contains("玉树") || city.isEmpty()) {
				localId.add("632721");       // 青海省玉树藏族自治州玉树县
				localId.add("632722");       // 青海省玉树藏族自治州杂多县
				localId.add("632723");       // 青海省玉树藏族自治州称多县
				localId.add("632724");       // 青海省玉树藏族自治州治多县
				localId.add("632725");       // 青海省玉树藏族自治州囊谦县
				localId.add("632726");       // 青海省玉树藏族自治州曲麻莱县
			}
			if (city.contains("海西") || city.isEmpty()) {
				localId.add("632801");       // 青海省海西蒙古族藏族自治州格尔木市
				localId.add("632802");       // 青海省海西蒙古族藏族自治州德令哈市
				localId.add("632821");       // 青海省海西蒙古族藏族自治州乌兰县
				localId.add("632822");       // 青海省海西蒙古族藏族自治州都兰县
				localId.add("632823");       // 青海省海西蒙古族藏族自治州天峻县
			}
		}
		if (province.contains("宁夏") || province.isEmpty()) {
			if (city.contains("银川") || city.isEmpty()) {
				localId.add("640102");       // 宁夏回族自治区银川市城区
				localId.add("640103");       // 宁夏回族自治区银川市新城区
				localId.add("640111");       // 宁夏回族自治区银川市郊区
				localId.add("640121");       // 宁夏回族自治区银川市永宁县
				localId.add("640122");       // 宁夏回族自治区银川市贺兰县
			}
			if (city.contains("石嘴山") || city.isEmpty()) {
				localId.add("640202");       // 宁夏回族自治区石嘴山市大武口区
				localId.add("640203");       // 宁夏回族自治区石嘴山市石嘴山区
				localId.add("640204");       // 宁夏回族自治区石嘴山市石炭井区
				localId.add("640221");       // 宁夏回族自治区石嘴山市平罗县
				localId.add("640222");       // 宁夏回族自治区石嘴山市陶乐县
				localId.add("640223");       // 宁夏回族自治区石嘴山市惠农县
			}
			if (city.contains("吴忠") || city.isEmpty()) {
				localId.add("640302");       // 宁夏回族自治区吴忠市利通区
				localId.add("640321");       // 宁夏回族自治区吴忠市中卫县
				localId.add("640322");       // 宁夏回族自治区吴忠市中宁县
				localId.add("640323");       // 宁夏回族自治区吴忠市盐池县
				localId.add("640324");       // 宁夏回族自治区吴忠市同心县
				localId.add("640381");       // 宁夏回族自治区吴忠市青铜峡市
				localId.add("640382");       // 宁夏回族自治区吴忠市灵武市
			}
			if (city.contains("固原") || city.isEmpty()) {
				localId.add("642221");       // 宁夏回族自治区固原地区固原县
				localId.add("642222");       // 宁夏回族自治区固原地区海原县
				localId.add("642223");       // 宁夏回族自治区固原地区西吉县
				localId.add("642224");       // 宁夏回族自治区固原地区隆德县
				localId.add("642225");       // 宁夏回族自治区固原地区泾源县
				localId.add("642226");       // 宁夏回族自治区固原地区彭阳县
			}
		}
		if (province.contains("新疆") || province.isEmpty()) {
			if (city.contains("乌鲁木齐") || city.isEmpty()) {
				localId.add("650102");       // 新疆维吾尔族自治区乌鲁木齐市天山区
				localId.add("650103");       // 新疆维吾尔族自治区乌鲁木齐市沙依巴克区
				localId.add("650104");       // 新疆维吾尔族自治区乌鲁木齐市新市区
				localId.add("650105");       // 新疆维吾尔族自治区乌鲁木齐市水磨沟区
				localId.add("650106");       // 新疆维吾尔族自治区乌鲁木齐市头屯河区
				localId.add("650107");       // 新疆维吾尔族自治区乌鲁木齐市南山矿区
				localId.add("650108");       // 新疆维吾尔族自治区乌鲁木齐市东山区
				localId.add("650121");       // 新疆维吾尔族自治区乌鲁木齐市乌鲁木齐县
			}
			if (city.contains("克拉玛依") || city.isEmpty()) {
				localId.add("650202");       // 新疆维吾尔族自治区克拉玛依市独山子区
				localId.add("650203");       // 新疆维吾尔族自治区克拉玛依市克拉玛依区
				localId.add("650204");       // 新疆维吾尔族自治区克拉玛依市白碱滩区
				localId.add("650205");       // 新疆维吾尔族自治区克拉玛依市乌尔禾区
			}
			if (city.contains("吐鲁番") || city.isEmpty()) {
				localId.add("652101");       // 新疆维吾尔族自治区吐鲁番地区吐鲁番市
				localId.add("652122");       // 新疆维吾尔族自治区吐鲁番地区鄯善县
				localId.add("652123");       // 新疆维吾尔族自治区吐鲁番地区托克逊县
			}
			if (city.contains("哈密") || city.isEmpty()) {
				localId.add("652201");       // 新疆维吾尔族自治区哈密地区哈密市
				localId.add("652222");       // 新疆维吾尔族自治区哈密地区巴里坤哈萨克自治县
				localId.add("652223");       // 新疆维吾尔族自治区哈密地区伊吾县
			}
			if (city.contains("昌吉") || city.isEmpty()) {
				localId.add("652301");       // 新疆维吾尔族自治区昌吉回族自治州昌吉市
				localId.add("652302");       // 新疆维吾尔族自治区昌吉回族自治州阜康市
				localId.add("652303");       // 新疆维吾尔族自治区昌吉回族自治州米泉市
				localId.add("652323");       // 新疆维吾尔族自治区昌吉回族自治州呼图壁县
				localId.add("652324");       // 新疆维吾尔族自治区昌吉回族自治州玛纳斯县
				localId.add("652325");       // 新疆维吾尔族自治区昌吉回族自治州奇台县
				localId.add("652327");       // 新疆维吾尔族自治区昌吉回族自治州吉木萨尔县
				localId.add("652328");       // 新疆维吾尔族自治区昌吉回族自治州木垒哈萨克自治县
			}
			if (city.contains("博尔塔拉") || city.isEmpty()) {
				localId.add("652701");       // 新疆维吾尔族自治区博尔塔拉蒙古自治州博乐市
				localId.add("652722");       // 新疆维吾尔族自治区博尔塔拉蒙古自治州精河县
				localId.add("652723");       // 新疆维吾尔族自治区博尔塔拉蒙古自治州温泉县
			}
			if (city.contains("巴音郭楞") || city.isEmpty()) {
				localId.add("652801");       // 新疆维吾尔族自治区巴音郭楞蒙古自治州库尔勒市
				localId.add("652822");       // 新疆维吾尔族自治区巴音郭楞蒙古自治州轮台县
				localId.add("652823");       // 新疆维吾尔族自治区巴音郭楞蒙古自治州尉犁县
				localId.add("652824");       // 新疆维吾尔族自治区巴音郭楞蒙古自治州若羌县
				localId.add("652825");       // 新疆维吾尔族自治区巴音郭楞蒙古自治州且末县
				localId.add("652826");       // 新疆维吾尔族自治区巴音郭楞蒙古自治州焉耆回族自治县
				localId.add("652827");       // 新疆维吾尔族自治区巴音郭楞蒙古自治州和静县
				localId.add("652828");       // 新疆维吾尔族自治区巴音郭楞蒙古自治州和硕县
				localId.add("652829");       // 新疆维吾尔族自治区巴音郭楞蒙古自治州博湖县
			}
			if (city.contains("阿克苏") || city.isEmpty()) {
				localId.add("652901");       // 新疆维吾尔族自治区阿克苏地区阿克苏市
				localId.add("652922");       // 新疆维吾尔族自治区阿克苏地区温宿县
				localId.add("652923");       // 新疆维吾尔族自治区阿克苏地区库车县
				localId.add("652924");       // 新疆维吾尔族自治区阿克苏地区沙雅县
				localId.add("652925");       // 新疆维吾尔族自治区阿克苏地区新和县
				localId.add("652926");       // 新疆维吾尔族自治区阿克苏地区拜城县
				localId.add("652927");       // 新疆维吾尔族自治区阿克苏地区乌什县
				localId.add("652928");       // 新疆维吾尔族自治区阿克苏地区阿瓦提县
				localId.add("652929");       // 新疆维吾尔族自治区阿克苏地区柯坪县
			}
			if (city.contains("克孜勒苏") || city.isEmpty()) {
				localId.add("653000");       // 新疆维吾尔族自治区克孜勒苏柯尔克孜自治州
				localId.add("653001");       // 新疆维吾尔族自治区克孜勒苏柯尔克孜自治州阿图什市
				localId.add("653022");       // 新疆维吾尔族自治区克孜勒苏柯尔克孜自治州阿克陶县
				localId.add("653023");       // 新疆维吾尔族自治区克孜勒苏柯尔克孜自治州阿合奇县
				localId.add("653024");       // 新疆维吾尔族自治区克孜勒苏柯尔克孜自治州乌恰县
			}
			if (city.contains("喀什") || city.isEmpty()) {
				localId.add("653101");       // 新疆维吾尔族自治区喀什地区喀什市
				localId.add("653121");       // 新疆维吾尔族自治区喀什地区疏附县
				localId.add("653122");       // 新疆维吾尔族自治区喀什地区疏勒县
				localId.add("653123");       // 新疆维吾尔族自治区喀什地区英吉沙县
				localId.add("653124");       // 新疆维吾尔族自治区喀什地区泽普县
				localId.add("653125");       // 新疆维吾尔族自治区喀什地区莎车县
				localId.add("653126");       // 新疆维吾尔族自治区喀什地区叶城县
				localId.add("653127");       // 新疆维吾尔族自治区喀什地区麦盖提县
				localId.add("653128");       // 新疆维吾尔族自治区喀什地区岳普湖县
				localId.add("653129");       // 新疆维吾尔族自治区喀什地区伽师县
				localId.add("653130");       // 新疆维吾尔族自治区喀什地区巴楚县
				localId.add("653131");       // 新疆维吾尔族自治区喀什地区塔什库尔干塔吉克自治县
			}
			if (city.contains("和田") || city.isEmpty()) {
				localId.add("653201");       // 新疆维吾尔族自治区和田地区和田市
				localId.add("653221");       // 新疆维吾尔族自治区和田地区和田县
				localId.add("653222");       // 新疆维吾尔族自治区和田地区墨玉县
				localId.add("653223");       // 新疆维吾尔族自治区和田地区皮山县
				localId.add("653224");       // 新疆维吾尔族自治区和田地区洛浦县
				localId.add("653225");       // 新疆维吾尔族自治区和田地区策勒县
				localId.add("653226");       // 新疆维吾尔族自治区和田地区于田县
				localId.add("653227");       // 新疆维吾尔族自治区和田地区民丰县
			}
			if (city.contains("伊犁哈萨克") || city.isEmpty()) {
				localId.add("654001");       // 新疆维吾尔族自治区伊犁哈萨克自治州奎屯市
				localId.add("654100");       // 新疆维吾尔族自治区伊犁哈萨克自治州伊犁地区
				localId.add("654101");       // 新疆维吾尔族自治区伊犁哈萨克自治州伊宁市
				localId.add("654121");       // 新疆维吾尔族自治区伊犁哈萨克自治州伊宁县
				localId.add("654122");       // 新疆维吾尔族自治区伊犁哈萨克自治州察布查尔锡伯自治县
				localId.add("654123");       // 新疆维吾尔族自治区伊犁哈萨克自治州霍城县
				localId.add("654124");       // 新疆维吾尔族自治区伊犁哈萨克自治州巩留县
				localId.add("654125");       // 新疆维吾尔族自治区伊犁哈萨克自治州新源县
				localId.add("654126");       // 新疆维吾尔族自治区伊犁哈萨克自治州昭苏县
				localId.add("654127");       // 新疆维吾尔族自治区伊犁哈萨克自治州特克斯县
				localId.add("654128");       // 新疆维吾尔族自治区伊犁哈萨克自治州尼勒克县
			}
			if (city.contains("塔城") || city.isEmpty()) {
				localId.add("654201");       // 新疆维吾尔族自治区塔城地区塔城市
				localId.add("654202");       // 新疆维吾尔族自治区塔城地区乌苏市
				localId.add("654221");       // 新疆维吾尔族自治区塔城地区额敏县
				localId.add("654223");       // 新疆维吾尔族自治区塔城地区沙湾县
				localId.add("654224");       // 新疆维吾尔族自治区塔城地区托里县
				localId.add("654225");       // 新疆维吾尔族自治区塔城地区裕民县
				localId.add("654226");       // 新疆维吾尔族自治区塔城地区和布克赛尔蒙古自治县
			}
			if (city.contains("阿勒泰") || city.isEmpty()) {
				localId.add("654301");       // 新疆维吾尔族自治区阿勒泰地区阿勒泰市
				localId.add("654321");       // 新疆维吾尔族自治区阿勒泰地区布尔津县
				localId.add("654322");       // 新疆维吾尔族自治区阿勒泰地区富蕴县
				localId.add("654323");       // 新疆维吾尔族自治区阿勒泰地区福海县
				localId.add("654324");       // 新疆维吾尔族自治区阿勒泰地区哈巴河县
				localId.add("654325");       // 新疆维吾尔族自治区阿勒泰地区青河县
				localId.add("654326");       // 新疆维吾尔族自治区阿勒泰地区吉木乃县
				localId.add("659000");       // 新疆维吾尔族自治区直辖县级行政单位
			}
			if (city.contains("石河子") || city.isEmpty()) {
				localId.add("659001");       // 新疆维吾尔族自治区石河子市
			}
		}

		if(localId.isEmpty()){
			System.out.println("省市名称有误，请检查后重试");
			System.exit(0);
		}
		/**
		 * Complete!~ 2015/12/05 17:51
		 */
		
		return localId;
	}

}
