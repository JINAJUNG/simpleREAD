package com.simple.test.common;

public class Utils {

	private static final String PER_FIX = "/WEB-INF";
	private static final String LAST_FIX = ".jsp";
	private static final String SEP = "/";

	public static String getCmd(String uri) {
		int idx = uri.lastIndexOf(SEP);
		if (idx == -1) {
			return null;
		}
		return uri.substring(idx + 1);
	}

	public static String getPage(String uri) {
		return PER_FIX + uri + LAST_FIX;
	}
}
