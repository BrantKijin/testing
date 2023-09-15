package sample.cafekiosk.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import sample.cafekiosk.unit.berverage.Americano;

class CafeKioskTest {

	@Test
	void add_manual_test(){
		CafeKiosk cafeKiosk = new CafeKiosk();
		cafeKiosk.add(new Americano());

		System.out.println(">>> 담긴 음료 수 :"+ cafeKiosk.getBeverages().size());
		System.out.println(">>> 담긴 음료:"+ cafeKiosk.getBeverages().get(0).getName() );
	}

	@Test
	void add(){
		CafeKiosk cafeKiosk = new CafeKiosk();
		cafeKiosk.add(new Americano());

		Assertions.assertThat(cafeKiosk.getBeverages().size()).isEqualTo(1);
		Assertions.assertThat(cafeKiosk.getBeverages().get(0).getName()).isEqualTo("아메리카노");
	}

	@Test
	void addSeveralBeverages(){
		CafeKiosk cafeKiosk = new CafeKiosk();
		Americano americano = new Americano();
		cafeKiosk.add(americano, 2);
		
		Assertions.assertThat(cafeKiosk.getBeverages()).hasSize(1);
		Assertions.assertThat(cafeKiosk.getBeverages().get(0).getName()).isEqualTo("아메리카노");
	}
}