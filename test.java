// Spring Boot integration test with real DB (H2 or Testcontainers)
// @SpringBootTest @AutoConfigureMockMvc 
// class OrderApiIntegrationTest {
// @Autowired MockMvc mockMvc;
// @Test void shouldReturn201_whenOrderCreated() throws Exception {
//  mockMvc.perform(post("/api/v1/orders").contentType(APPLICATION_JSON) .content(""" {"productId":"p1","quantity":2}""")) .andExpect(status(). isCreated())
// .andExpect(jsonPath("$.id").isNotEmpty())
// .andExpect(jsonPath("$.status").value("PENDING")); } }

// JUnit 5 + Mockito example
// @ExtendWith(MockitoExtension.class) 
// class OrderServiceTest {
// @Mock OrderRepository orderRepo; 
// @Mock PaymentGateway gateway;
//  @InjectMocks OrderService service; 
// @Test void shouldPlaceOrder_whenPaymentSucceeds() { 
// Arrange
// given(gateway.charge(any())).willReturn(Success.of("txn-99")); 
// Act
// PlaceOrderResult result = service.placeOrder(validRequest);
// Assert
// assertThat(result.isSuccess()).isTrue();
// verify(orderRepo).save(any(Order.class)); } }

// Selenium / Playwright style (Java) class CheckoutE2ETest {
// @Test
// void userCanCompleteCheckout() { 
// driver.get("https://staging.example.com");
// page.locator("[data-testid=add-to-cart]").click();
// page.locator("[data-testid=checkout]").click(); page.fill("#card-number",
// "4242 4242 4242 4242"); page.locator("[data-testid=place-order]").click();
// assertThat(page.locator(".order-confirmation")).isVisible(); } }