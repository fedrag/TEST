package org.eternity.customer;

import static org.junit.Assert.*;

import org.eternity.common.Registrar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	@Before
	public void setUp() throws Exception {
		Registrar.init();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCustomer() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testPurchase() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testIsPossibleToPayWithMileage() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testPayWithMileage() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetMileage() {
		fail("Not yet implemented"); // TODO
	}
	
	@Test
	public void testAliasing(){
		Customer customer = new Customer("CUST-01","홍길동","경기도 안양시");
		Customer anotherCustomer = customer;
		
		long price = 1000;
		customer.purchase(price);
		
		assertEquals(price*0.01, anotherCustomer.getMileage(), 0.1);
		assertEquals(0, anotherCustomer.getMileage());
	}
	
	@Test
	public void testCustomerIdentical() {
		Customer customer =  (Customer) new Customer("CUST-01", "홍길동", "경기도 안양시").persist();
		Customer anotherCustomer = Customer.find("CUST-01");
		assertSame(customer, anotherCustomer);           
	}

}
