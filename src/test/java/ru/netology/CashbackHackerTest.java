package ru.netology;


import org.testng.annotations.Test;

import static org.testng.Assert.*;


class CashbackHackerTest {
    CashbackHacker cash = new CashbackHacker();

    // Показывает сколько докупить
    @Test
    public void shouldBuyMore() {
        assertEquals(cash.remain(900), 100);

    }

    // Показывает сколько докупить
    @Test
    public void shouldBuyMore1() {
        assertEquals(cash.remain(850), 150);
    }

    // Проверка границы
    @Test
    public void shouldBuyMoreCheckingBorders() {
        assertEquals(cash.remain(999), 1);
    }

    //Если сумма 1000 то он будет предлагать все равно докупить, чтобы округлить сумму до 2000 и тд.
    @Test
    public void shouldNotBuyMoreCheckingBorder() {
        assertEquals(cash.remain(1000),0);
        assertEquals(cash.remain(1000), 1000);
        assertEquals(cash.remain(2000), 1000);

    }

    // Тест на отрицательное значение
    @Test
    public void should() {
        assertEquals(cash.remain(-500), 1500);
    }

}