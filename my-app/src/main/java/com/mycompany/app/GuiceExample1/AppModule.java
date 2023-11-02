package com.mycompany.app.GuiceExample1;

import com.google.inject.AbstractModule;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.Provides;

import java.time.LocalTime;

public class AppModule extends  AbstractModule {
    @Override
    protected void configure() {
      //  bind(Discount.class).toProvider(DiscountProvider.class) ;
    }

    @Provides
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
