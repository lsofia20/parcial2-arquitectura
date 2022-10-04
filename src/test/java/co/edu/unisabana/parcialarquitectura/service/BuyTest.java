package co.edu.unisabana.parcialarquitectura.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BuyTest {

  private final Buy service = new Buy();

  @Test
  public void Given_data_When_makePurchase_Then_Succesful() {
    String returned = service.makePurchase(2, 3, "Books");
    assertEquals("Product sold", returned);
  }

  @Test
  public void Given_data_When_makePurchase_Then_Failed() {
    String returned = service.makePurchase(2, 0, "Books");
    assertEquals("The sale was not possible", returned);
  }

  @Test
  public void Given_equalCodes_When_makePurchase_Then_ThrowIllegalException() {
      assertThrows( IllegalSaleException.class,()->{
          service.makePurchase(2, 2, "Books");
          ;});
  }


}