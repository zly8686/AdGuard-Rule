package org.fordes.adg.rule;

import java.io.File;

public class Constant {

    public static final String ROOT_PATH = System.getProperty("user.dir");

    public static final String UPDATE = "# Title: ShuYiDNS\r\n# Homepage: https://github.com/zly8686/AdGuard-Rule\r\n# 更新时间于: {}（北京时间）\r\n";

    public static final String REPO = "# 每12小时同步一次、如有误杀、请手动解除加入白名单\r\n\r\n";

    public static final String LOCAL_RULE_SUFFIX = ROOT_PATH + File.separator + "rule";

    /**
     * 基本的有效性检测正则，!开头，[]包裹，非特殊标记的#号开头均视为无效规则
     */
    public static final String EFFICIENT_REGEX = "^!|^#[^#,^@,^%,^\\$]|^\\[.*\\]$";

    /**
     * 去除首尾基础修饰符号 的正则，方便对规则进行分类
     * 包含：@@、||、@@||、/ 开头，$important、/ 结尾
     */
    public static final String BASIC_MODIFY_REGEX = "^@@\\|\\||^\\|\\||^@@|\\$important$|\\s#[^#]*$";

}
