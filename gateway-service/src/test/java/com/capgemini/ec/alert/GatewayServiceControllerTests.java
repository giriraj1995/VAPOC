package com.capgemini.ec.alert;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.capgemini.ec.gateway.api.ServiceCallController;

@RunWith(MockitoJUnitRunner.class)
public class GatewayServiceControllerTests {

	@Mock
	private ServiceCallController ac;
	@Mock
	private HttpServletRequest request;
	
	@Test
	public void TestHelathCheck() throws Exception {

	}

}
