// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.bookingdetails;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BookingDetailsVM_Factory implements Factory<BookingDetailsVM> {
  @Override
  public BookingDetailsVM get() {
    return newInstance();
  }

  public static BookingDetailsVM_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BookingDetailsVM newInstance() {
    return new BookingDetailsVM();
  }

  private static final class InstanceHolder {
    private static final BookingDetailsVM_Factory INSTANCE = new BookingDetailsVM_Factory();
  }
}
