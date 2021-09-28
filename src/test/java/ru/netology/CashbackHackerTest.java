package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {
    CashbackHacker cash = new CashbackHacker();

    // Проверка границ
    @Test
    public void shouldShowHowMuchToBuy() {
        assertEquals(1, cash.remain(999));
        assertEquals(999, cash.remain(1));
    }

    //Если пользователь купил ровно на 1000 рублей, то приложение не должно ему говорить, что нужно купить ещё на 1000.
    @Test
    public void shouldShouHowMushToBy() {
        assertEquals(0, cash.remain(1000));
    }

    // Если сумма круглая , то приложение не должно ему говорить,что нужно купить еще на 1000
    @Test
    public void shouldShouHowMushToBy1() {
        assertEquals(0, cash.remain(2000));
    }

    @Test
    public void shouldShouHowMushToBy2() {
        assertEquals(0, cash.remain(153000));
    }

    @Test
    public void shouldShowHowMushToBy3() {
        assertEquals(1500, cash.remain(-500));
    }
}