package com.mycompany.app.GuiceExample1;

import jakarta.inject.Provider;

import java.time.LocalTime;

public class DiscountProvider implements Provider<Discount> {
    @Override
    public Discount get() {
        int hour = LocalTime.now().getHour();

        if (isEarlyMorning(hour)) {
            return new DiscountType1();
        } else if (isLateAtNight(hour)) {
            return new DiscountType2();
        }
        return new NoDiscount();
    }
    private boolean isEarlyMorning(int currentHour) {
        return (currentHour >= 5 && currentHour <= 9);
    }

    private boolean isLateAtNight(int currentHour) {
        return (currentHour >= 0 && currentHour <= 4);
    }
}
