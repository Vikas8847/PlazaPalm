// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.premiumviews;

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
public final class PremiumEditProVM_Factory implements Factory<PremiumEditProVM> {
  @Override
  public PremiumEditProVM get() {
    return newInstance();
  }

  public static PremiumEditProVM_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PremiumEditProVM newInstance() {
    return new PremiumEditProVM();
  }

  private static final class InstanceHolder {
    private static final PremiumEditProVM_Factory INSTANCE = new PremiumEditProVM_Factory();
  }
}
