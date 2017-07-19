package java_strengthen;

import java.util.Arrays;

import org.junit.Test;

public class Regular_expression {
	public static void main(String[] args) {
		// 验证qq号码
		String str = "6356365822";
		String regex = "[1-9][0-9]{4,9}";
		String regex1 = "[123456789][0-9]+";
		System.out.println(str.matches(regex));
		System.out.println(str.matches(regex1));

		String str2 = "hello world";
		String regex2 = "\\w\\b";// 判断是否是空格分开的单词
		System.out.println(str2.matches(regex2));

		String str3 = "12366668888";
		String regex3 = "[1][3,5,8][0-9]{9}";
		System.out.println(str3.matches(regex3));

		String str4 = "23456@qq.com";
		String regex4 = "\\w+@\\w+(\\.+[com,cn]+){1,2}";
		System.out.println(str4.matches(regex4));

		String str5 = "i am ok";
		String[] regex5 = str5.split(" ");
		System.out.println(Arrays.toString(regex5));

		String str6 = "i .a.m ok";
		String[] regex6 = str6.split("\\.");
		System.out.println(Arrays.toString(regex6));

		String str7 = "i    am   ok  how     about   you  ";
		String[] regex7 = str7.split(" +");
		System.out.println(Arrays.toString(regex7));

		String str8 = "\\172.21.100.215\\文件下载\\大数据阶段\\CM\\CM-11班笔记及视频\\day2";
		String[] regex8 = str8.split("\\\\");
		System.out.println(Arrays.toString(regex8));

		String str9 = "我的账号是1234二二124240876";
		String regex9 = str9.replaceAll("\\d", "*");
		System.out.println(regex9);
		System.out.println(System.getProperties());
		System.out.println(System.getenv());
	}
}
