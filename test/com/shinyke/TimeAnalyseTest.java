/**
 * Copyright (c) 2016 21CN.COM . All rights reserved.<br>
 * <p>
 * Description: TimeNLP<br>
 * <p>
 * Modified log:<br>
 * ------------------------------------------------------<br>
 * Ver.		Date		Author			Description<br>
 * ------------------------------------------------------<br>
 * 1.0		2016年5月4日		kexm		created.<br>
 */
package com.shinyke;

import com.time.nlp.TimeNormalizer;
import com.time.nlp.TimeUnit;
import org.junit.Test;

import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * 测试类
 * <p>
 *
 * @author <a href="mailto:kexm@corp.21cn.com">kexm</a>
 * @version 1.0
 * @since 2016年5月4日
 */
public class TimeAnalyseTest {

    @Test
    public void testTimeNLP() throws URISyntaxException {
        TimeNormalizer normalizer = new TimeNormalizer();
        normalizer.setPreferFuture(true);
        String content = "事故经过与现场(1) 　　1999年12月9日,湖南省某双氧水厂刚刚完成了生产系统检修,于11时40分开车生产。12时10分,双氧水车间氢气过滤器忽然冒出黑烟。经查是氢化釜内的触媒发生燃烧,当即该车间停车待修。 　　这边检修尚未开始,远离此处30m之外的氧气充装站于15时25分突然发生爆炸。正在作业的2名工人均被烧伤,其中许某的胸腹烧伤面积达49%以上。 　　充氧站的主要任务是把工厂生产出来的氧气经过压氧机抽吸、升压装入高压气瓶中,然后向外出售或自用。出事后现场一片狼藉,1#压氧机分离瓶被炸开；从分离瓶出口到1#充氧线左、右操作阀、压力表、安全放空阀等全被炸烂了；长21m高压铜管炸开7处,断口呈高温熔化状；现场的墙上有火焰喷烧的痕迹；距压氧机分离瓶爆炸处6m的正面白墙下方还有一大滩”来历不明”的水……。 　　根据当时现场附近人员的讲述,他们听到了2次爆炸声,间隔的时间很短,先是充氧室,然后是压氧机房；还看到爆炸时的红火光；首先从外面赶到现场的人,还注意到出事后的室内弥漫着“白雾”。 　　当时谁也没想过,发生在不同生产系统的这2次爆炸之间有什么联系。 两组意见正相反(2) 　　事故发生后,该厂先后来了2个事故调查组,面对同一个事故和完全相同的现场,得出2个完全相反的结论。 　　12月10日来厂调查组(以下简称“甲组”)一致认定,事故是“违章超压运行”所造成的“物理性爆炸”。他们要求工厂迅速恢复生产,“考虑到设备陈旧,工厂应适当降低系统压力”。 　　12月11日来厂的另一个调查组(以下简称“乙组”)却提出:这很可能是一次“化学性爆炸”。工厂必须立即停止一切开车准备工作,着手查清事故的真正原因,排除隐患。 　　甲组的理由,爆炸发生在压氧机分离瓶出口处到1#充氧阀之间。这正是工人操作部位,也是系统压力最高、承压能力较薄弱处。这里的操作人员曾有过超压充装,提高装瓶速度的做法。甲组的意见,得到工厂上下绝大多数人的认同。 　　乙组的理由,充氧管线内的运行介质应是99%以上的氧气。氧是氧化剂,完全不同于氢气、甲烷、石油液化气等可燃性气体,它的超压爆炸是不会起火燃烧的,除非这其中混入了可燃物质。再说超压爆炸在一个完全相通的容器或系统里,一旦有了排放口,压力得到释放,爆炸就会停止。不可能像这样在一根完全相通的高压铜管上一连炸出7个独立的大洞。 　　甲组认为,工厂出示的当天电解车间当班操作分析记录明明白白地写着:送气时间11时40分,氧气纯度99.0%,氢气纯度99.07%。一连3h记录的数据完全一致。报表有分析人员签名,而且还有当班调度员、电解操作员姓名。报表填写格式完全符合规范。该厂具备了对气体纯度分析监测装置,有详细制度,而且安排专人定时测定。出事当班分析记录完整无缺。气体纯度完全符合国家规定的质量标准。 　　乙组根据出事当班调度员反映,充氧站原来是抽吸大氧气囊的气体(来自空分制氧车间),在15时20分,转换抽吸小氧气囊的气体(来自电解水车间)。转换之后5min,爆炸就发生了。所以乙组仍提出了对充装的氧气纯度的怀疑。 　　该双氧水厂氢气、氧气主要流程图见图1。 　　图1 某双氧水厂氢气、氧气主要流程图 无声之处胜有声(3) 　　当乙组得知,出事后系统尚未进行放空置换,仍然保持着事故之前的原状,于是要求工厂对系统各个部位气体重新取样分析。 　　工厂在分析气样时,出现异常的爆炸。气体取样瓶炸得粉碎,险些伤人。这引起所有在场人员的警觉。工厂根据乙组的提议,终止厂内所有人员的工作,全部撤离厂区；取样气体分别送往附近2个化工企业做分析。 　　2个厂分析结果误差很小,故取其均值列数据如表1： 　　表1 气样分析结果 氧气瓶号码氧气纯度气源 948312 292727 451502 713349 561142 33418798.5% 97.5% 94.2% 82.1% 82.0% 80.9%大气囊 大气囊 大气囊、小气囊 小气囊 小气囊 小气囊 　　小气囊的剩余氧气纯度70.6%； 　　氧气柜氧气纯度70.0%； 　　氢气柜气样氢气纯度88.0%。 　　这一串看来十分枯燥的数字,却胜过了辩论的千言万语。谁也不用再说什么,大家心底透亮：眼下的全厂和该厂所在的整个镇区已千钧一发。生产区4个300m3的贮气柜,数十支高压气瓶……,全部充满了十分危险的爆炸性混合气体。一下敲打、一点火花、一次快速的阀门开闭……,都会引起惊天动地的大爆炸! 　　所谓工人超压运行,完全是冤枉。爆炸就发生在他们打开阀门的那一瞬间。爆炸后室内的“白雾”,白墙下方“来历不明”的大滩水,这都是氢、氧混合大爆炸的产物! (赵铸新)";
        normalizer.parse(content);
        TimeUnit[] unit = normalizer.getTimeUnit();
        System.out.println(unit.length);
    }


    /**
     * 修改TimeExp.m文件的内容
     */
    @Test
    public void editTimeExp() {
        String path = TimeNormalizer.class.getResource("").getPath();
        String classPath = path.substring(0, path.indexOf("/com/time"));
        System.out.println(classPath + "/TimeExp.m");
        /**写TimeExp*/
        Pattern p = Pattern.compile("((前|昨|今|明|后)(天|日)?(早|晚)(晨|上|间)?)|(\\d+个?[年月日天][以之]?[前后])|(\\d+个?半?(小时|钟头|h|H))|(半个?(小时|钟头))|(\\d+(分钟|min))|([13]刻钟)|((上|这|本|下)+(周|星期)([一二三四五六七天日]|[1-7])?)|((周|星期)([一二三四五六七天日]|[1-7]))|((早|晚)?([0-2]?[0-9](点|时)半)(am|AM|pm|PM)?)|((早|晚)?(\\d+[:：]\\d+([:：]\\d+)*)\\s*(am|AM|pm|PM)?)|((早|晚)?([0-2]?[0-9](点|时)[13一三]刻)(am|AM|pm|PM)?)|((早|晚)?(\\d+[时点](\\d+)?分?(\\d+秒?)?)\\s*(am|AM|pm|PM)?)|(大+(前|后)天)|(([零一二三四五六七八九十百千万]+|\\d+)世)|([0-9]?[0-9]?[0-9]{2}\\.((10)|(11)|(12)|([1-9]))\\.((?<!\\\\d))([0-3][0-9]|[1-9]))|(现在)|(届时)|(这个月)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)日)|(晚些时候)|(今年)|(长期)|(以前)|(过去)|(时期)|(时代)|(当时)|(近来)|(([零一二三四五六七八九十百千万]+|\\d+)夜)|(当前)|(日(数|多|多少|好几|几|差不多|近|前|后|上|左右))|((\\d+)点)|(今年([零一二三四五六七八九十百千万]+|\\d+))|(\\d+[:：]\\d+(分|))|((\\d+):(\\d+))|(\\d+/\\d+/\\d+)|(未来)|((充满美丽、希望、挑战的)?未来)|(最近)|(早上)|(早(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(日前)|(新世纪)|(小时)|(([0-3][0-9]|[1-9])(日|号))|(明天)|(\\d+)月|(([0-3][0-9]|[1-9])[日号])|((数|多|多少|好几|几|差不多|近|前|后|上|左右)周)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)([零一二三四五六七八九十百千万]+|\\d+)年)|(每[年月日天小时分秒钟]+)|((\\d+分)+(\\d+秒)?)|([一二三四五六七八九十]+来?[岁年])|([新?|\\d*]世纪末?)|((\\d+)时)|(世纪)|(([零一二三四五六七八九十百千万]+|\\d+)岁)|(今年)|([星期周]+[一二三四五六七])|(星期([零一二三四五六七八九十百千万]+|\\d+))|(([零一二三四五六七八九十百千万]+|\\d+)年)|([本后昨当新后明今去前那这][一二三四五六七八九十]?[年月日天])|(早|早晨|早上|上午|中午|午后|下午|晚上|晚间|夜里|夜|凌晨|深夜)|(回归前后)|((\\d+点)+(\\d+分)?(\\d+秒)?左右?)|((\\d+)年代)|(本月(\\d+))|(第(\\d+)天)|((\\d+)岁)|((\\d+)年(\\d+)月)|([去今明]?[年月](底|末))|(([零一二三四五六七八九十百千万]+|\\d+)世纪)|(昨天(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|(年度)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)星期)|(年底)|([下个本]+赛季)|(\\d+)月(\\d+)日|(\\d+)月(\\d+)|(今年(\\d+)月(\\d+)日)|((\\d+)月(\\d+)日(数|多|多少|好几|几|差不多|近|前|后|上|左右)午(\\d+)时)|(今年晚些时候)|(两个星期)|(过去(数|多|多少|好几|几|差不多|近|前|后|上|左右)周)|(本赛季)|(半个(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(稍晚)|((\\d+)号晚(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(今(数|多|多少|好几|几|差不多|近|前|后|上|左右)(\\d+)年)|(这个时候)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)个小时)|(最(数|多|多少|好几|几|差不多|近|前|后|上|左右)(数|多|多少|好几|几|差不多|近|前|后|上|左右)年)|(凌晨)|((\\d+)年(\\d+)月(\\d+)日)|((\\d+)个月)|(今天早(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(第[一二三四五六七八九十\\d+]+季)|(当地时间)|(今(数|多|多少|好几|几|差不多|近|前|后|上|左右)([零一二三四五六七八九十百千万]+|\\d+)年)|(早晨)|(一段时间)|([本上]周[一二三四五六七])|(凌晨(\\d+)点)|(去年(\\d+)月(\\d+)日)|(年关)|(如今)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)小时)|(当晚)|((\\d+)日晚(\\d+)时)|(([零一二三四五六七八九十百千万]+|\\d+)(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|(每年(\\d+)月(\\d+)日)|((\\d+)月)|(农历)|(两个小时)|(本周([零一二三四五六七八九十百千万]+|\\d+))|(长久)|(清晨)|((\\d+)号晚)|(春节)|(星期日)|(圣诞)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)段)|(现年)|(当日)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)分钟)|(\\d+(天|日|周|月|年)(后|前))|((文艺复兴|巴洛克|前苏联|前一|暴力和专制|成年时期|古罗马|我们所处的敏感)+时期)|((\\d+)[年月天])|(清早)|(两年)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|(昨天(数|多|多少|好几|几|差不多|近|前|后|上|左右)午(\\d+)时)|(([零一二三四五六七八九十百千万]+|\\d+)(数|多|多少|好几|几|差不多|近|前|后|上|左右)年)|(今(数|多|多少|好几|几|差不多|近|前|后|上|左右)(\\d+))|(圣诞节)|(学期)|(\\d+来?分钟)|(过去(数|多|多少|好几|几|差不多|近|前|后|上|左右)年)|(星期天)|(夜间)|((\\d+)日凌晨)|(([零一二三四五六七八九十百千万]+|\\d+)月底)|(当天)|((\\d+)日)|(((10)|(11)|(12)|([1-9]))月)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)(数|多|多少|好几|几|差不多|近|前|后|上|左右)年)|(今年(\\d+)月份)|(晚(数|多|多少|好几|几|差不多|近|前|后|上|左右)(\\d+)时)|(连[年月日夜])|((\\d+)年(\\d+)月(\\d+)日(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|((一|二|两|三|四|五|六|七|八|九|十|百|千|万|几|多|上|\\d+)+个?(天|日|周|月|年)(后|前|半))|((胜利的)日子)|(青春期)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)年)|(早(数|多|多少|好几|几|差不多|近|前|后|上|左右)([零一二三四五六七八九十百千万]+|\\d+)点(数|多|多少|好几|几|差不多|近|前|后|上|左右))|([0-9]{4}年)|(周末)|(([零一二三四五六七八九十百千万]+|\\d+)个(数|多|多少|好几|几|差不多|近|前|后|上|左右)小时)|(([(小学)|初中?|高中?|大学?|研][一二三四五六七八九十]?(\\d+)?)?[上下]半?学期)|(([零一二三四五六七八九十百千万]+|\\d+)时期)|(午间)|(次年)|(这时候)|(农历新年)|([春夏秋冬](天|季))|((\\d+)天)|(元宵节)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)分)|((\\d+)月(\\d+)日(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|(晚(数|多|多少|好几|几|差不多|近|前|后|上|左右)(\\d+)时(\\d+)分)|(傍晚)|(周([零一二三四五六七八九十百千万]+|\\d+))|((数|多|多少|好几|几|差不多|近|前|后|上|左右)午(\\d+)时(\\d+)分)|(同日)|((\\d+)年(\\d+)月底)|((\\d+)分钟)|((\\d+)世纪)|(冬季)|(国庆)|(年代)|(([零一二三四五六七八九十百千万]+|\\d+)年半)|(今年年底)|(新年)|(本周)|(当地时间星期([零一二三四五六七八九十百千万]+|\\d+))|(([零一二三四五六七八九十百千万]+|\\d+)(数|多|多少|好几|几|差不多|近|前|后|上|左右)岁)|(半小时)|(每周)|((重要|最后)?时刻)|(([零一二三四五六七八九十百千万]+|\\d+)期间)|(周日)|(晚(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(今后)|(([零一二三四五六七八九十百千万]+|\\d+)段时间)|(明年)|([12][09][0-9]{2}(年度?))|(([零一二三四五六七八九十百千万]+|\\d+)生)|(今天凌晨)|(过去(\\d+)年)|(元月)|((\\d+)月(\\d+)日凌晨)|([前去今明后新]+年)|(\\d+)月(\\d+)(日?)|(夏天)|((\\d+)日凌晨(\\d+)时许)|((\\d+)月(\\d+)日)|((\\d+)点半)|(去年底)|(最后一[天刻])|(最(数|多|多少|好几|几|差不多|近|前|后|上|左右)(数|多|多少|好几|几|差不多|近|前|后|上|左右)个月)|(圣诞节?)|(下?个?(星期|周)(一|二|三|四|五|六|七|天))|((\\d+)(数|多|多少|好几|几|差不多|近|前|后|上|左右)年)|(当天(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|(每年的(\\d+)月(\\d+)日)|((\\d+)日晚(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(星期([零一二三四五六七八九十百千万]+|\\d+)晚)|(深夜)|(现如今)|([上中下]+午)|(昨晚)|(近年)|(今天清晨)|(中旬)|(星期([零一二三四五六七八九十百千万]+|\\d+)早)|(([零一二三四五六七八九十百千万]+|\\d+)战期间)|(星期)|(昨天晚(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(较早时)|(个(数|多|多少|好几|几|差不多|近|前|后|上|左右)小时)|((民主高中|我们所处的|复仇主义和其它危害人类的灾难性疾病盛行的|快速承包电影主权的|恢复自我美德|人类审美力基础设施|饱受暴力、野蛮、流血、仇恨、嫉妒的|童年|艰苦的童年)+时代)|(元旦)|(([零一二三四五六七八九十百千万]+|\\d+)个礼拜)|(昨日)|([年月]初)|((\\d+)年的(\\d+)月)|(每年)|(([零一二三四五六七八九十百千万]+|\\d+)月份)|(今年(\\d+)月(\\d+)号)|(今年([零一二三四五六七八九十百千万]+|\\d+)月)|((\\d+)月底)|(未来(\\d+)年)|(第([零一二三四五六七八九十百千万]+|\\d+)季)|(\\d?多年)|(([零一二三四五六七八九十百千万]+|\\d+)个星期)|((\\d+)年([零一二三四五六七八九十百千万]+|\\d+)月)|([下上中]午)|(早(数|多|多少|好几|几|差不多|近|前|后|上|左右)(\\d+)点)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)月)|(([零一二三四五六七八九十百千万]+|\\d+)个(数|多|多少|好几|几|差不多|近|前|后|上|左右)月)|(同([零一二三四五六七八九十百千万]+|\\d+)天)|((\\d+)号凌晨)|(夜里)|(两个(数|多|多少|好几|几|差不多|近|前|后|上|左右)小时)|(昨天)|(罗马时代)|(目(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(([零一二三四五六七八九十百千万]+|\\d+)月)|((\\d+)年(\\d+)月(\\d+)号)|(((10)|(11)|(12)|([1-9]))月份?)|([12][0-9]世纪)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)([零一二三四五六七八九十百千万]+|\\d+)天)|(工作日)|(稍后)|((\\d+)号(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|(未来([零一二三四五六七八九十百千万]+|\\d+)年)|(([零一二三四五六七八九十百千万]+|\\d+)日(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|(最(数|多|多少|好几|几|差不多|近|前|后|上|左右)([零一二三四五六七八九十百千万]+|\\d+)刻)|(很久)|((\\d+)(数|多|多少|好几|几|差不多|近|前|后|上|左右)岁)|(去年(\\d+)月(\\d+)号)|(两个月)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)午(\\d+)时)|(古代)|(两天)|(\\d+个?(小时|星期))|((\\d+)年半)|(较早)|(([零一二三四五六七八九十百千万]+|\\d+)个小时)|(星期([零一二三四五六七八九十百千万]+|\\d+)(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|(时刻)|((\\d+天)+(\\d+点)?(\\d+分)?(\\d+秒)?)|((\\d+)日([零一二三四五六七八九十百千万]+|\\d+)时)|(([零一二三四五六七八九十百千万]+|\\d+)早)|(([零一二三四五六七八九十百千万]+|\\d+)日)|(去年(\\d+)月)|(过去([零一二三四五六七八九十百千万]+|\\d+)年)|((\\d+)个星期)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)(数|多|多少|好几|几|差不多|近|前|后|上|左右)天)|(执政期间)|([当前昨今明后春夏秋冬]+天)|(去年(\\d+)月份)|(今(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(两星期)|(([零一二三四五六七八九十百千万]+|\\d+)年代)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)天)|(昔日)|(两个半月)|([印尼|北京|美国]?当地时间)|(连日)|(本月(\\d+)日)|(第([零一二三四五六七八九十百千万]+|\\d+)天)|((\\d+)点(\\d+)分)|([长近多]年)|((\\d+)日(数|多|多少|好几|几|差不多|近|前|后|上|左右)午(\\d+)时)|(那时)|(冷战时代)|(([零一二三四五六七八九十百千万]+|\\d+)天)|(这个星期)|(去年)|(昨天傍晚)|(近期)|(星期([零一二三四五六七八九十百千万]+|\\d+)早些时候)|((\\d+)([零一二三四五六七八九十百千万]+|\\d+)年)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)两个月)|((\\d+)个小时)|(([零一二三四五六七八九十百千万]+|\\d+)个月)|(当年)|(本月)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)([零一二三四五六七八九十百千万]+|\\d+)个月)|((\\d+)点(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(目前)|(去年([零一二三四五六七八九十百千万]+|\\d+)月)|((\\d+)时(\\d+)分)|(每月)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)段时间)|((\\d+)日晚)|(早(数|多|多少|好几|几|差不多|近|前|后|上|左右)(\\d+)点(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(下旬)|((\\d+)月份)|(逐年)|(稍(数|多|多少|好几|几|差不多|近|前|后|上|左右))|((\\d+)年)|(月底)|(这个月)|((\\d+)年(\\d+)个月)|(\\d+大寿)|(周([零一二三四五六七八九十百千万]+|\\d+)早(数|多|多少|好几|几|差不多|近|前|后|上|左右))|(半年)|(今日)|(末日)|(昨天深夜)|(今年(\\d+)月)|((\\d+)月(\\d+)号)|((\\d+)日夜)|((早些|某个|晚间|本星期早些|前些)+时候)|(同年)|((北京|那个|更长的|最终冲突的)时间)|(每个月)|(一早)|((\\d+)来?[岁年])|((数|多|多少|好几|几|差不多|近|前|后|上|左右)个月)|([鼠牛虎兔龙蛇马羊猴鸡狗猪]年)|(季度)|(早些时候)|(今天)|(每天)|(年半)|(下(个)?月)|(午后)|((\\d+)日(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|((数|多|多少|好几|几|差不多|近|前|后|上|左右)个星期)|(今天(数|多|多少|好几|几|差不多|近|前|后|上|左右)午)|(同[一二三四五六七八九十][年|月|天])|(T\\d+:\\d+:\\d+)|(\\d+/\\d+/\\d+:\\d+:\\d+.\\d+)|(\\?\\?\\?\\?-\\?\\?-\\?\\?T\\d+:\\d+:\\d+)|(\\d+-\\d+-\\d+T\\d+:\\d+:\\d+)|(\\d+/\\d+/\\d+ \\d+:\\d+:\\d+.\\d+)|(\\d+-\\d+-\\d+|[0-9]{8})|(((\\d+)年)?((10)|(11)|(12)|([1-9]))月(\\d+))|((\\d[\\.\\-])?((10)|(11)|(12)|([1-9]))[\\.\\-](\\d+))");
        try {
            TimeNormalizer.writeModel(p, classPath + "/TimeExp.m");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegex() {
        String[] rs = new String[]{
                "同[一二三四五六七八九十][年|月|天]"
        };
        for (String r : rs) {
            Pattern p = Pattern.compile(r);
            String s = "二周年";
            Matcher m = p.matcher(s);
//			System.out.println(m.find());
            if (m.find()) {
                System.out.println(r);
            }
        }

    }
}
