package org.eternity.customer;

import java.math.BigDecimal;

public class Money {
  private final BigDecimal amount;

  public Money(BigDecimal amount) {
    this.amount = amount;
  }
 
  public Money(long amount) {
    this(new BigDecimal(amount));
  }

  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
            
    if (!(object instanceof Money)) {
      return false;
    }           
            
    return amount.equals(((Money)object).amount);
  }

  public int hashCode() {
    return amount.hashCode();
  }


  /**
   * 불변객체로 만들기 위해 add로 바뀌어질 필드값을 바뀐상태의 필드값을 생성인자로 객체를 생성해 넘겨줌.
   **** */
//  public Money add(Money added) {
//	    this.amount = this.amount.add(added.amount);
//	    return this;
//	  }

  public Money add(Money added) {
	  return new Money(this.amount.add(added.amount));
  }
  
  public String toString() {
    return amount.toString();
  }
}
