package com.pgdca.resultmanagement.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CommonUtilTest {

	@Test
	public void test_getFullName() {
		assertThat(CommonUtil.getFullName(null, null, null)).isNullOrEmpty();
		assertThat(CommonUtil.getFullName("First", null, null)).isEqualTo("First");
		assertThat(CommonUtil.getFullName(null, "Middle", null)).isEqualTo("Middle");
		assertThat(CommonUtil.getFullName(null, null, "Last")).isEqualTo("Last");
		assertThat(CommonUtil.getFullName("null", null, null)).isEqualTo("null");
		assertThat(CommonUtil.getFullName(null, "null", null)).isEqualTo("null");
		assertThat(CommonUtil.getFullName(null, null, "null")).isEqualTo("null");
		assertThat(CommonUtil.getFullName("John", "Mino", "Cooper")).isEqualTo("John Mino Cooper");
	}
}
