package java_strengthen;

public class J190StringBuffer {
	public static void main(String[] args) {

		String str = "";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("字符串增加十万次，所用时间" + (end - start) + "毫秒");

		StringBuilder sb = new StringBuilder("");
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder增加十万次所用时间" + (end - start) + "毫秒");

		StringBuffer sbf = new StringBuffer("");
		System.out.println("空字符串的占有空间" + sbf.capacity());

		sbf = new StringBuffer("xyz");
		System.out.println("xyz字符串的占有空间" + sbf.capacity());

		sbf.append("1234567890123456");
		System.out.println("xyz字符串增加16个字符后的占有空间" + sbf.capacity());

		sbf.append("a");
		System.out.println("再增加1个字符后的占有空间" + sbf.capacity());

	}
}
