// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views;

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
public final class MainVM_Factory implements Factory<MainVM> {
  @Override
  public MainVM get() {
    return newInstance();
  }

  public static MainVM_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MainVM newInstance() {
    return new MainVM();
  }

  private static final class InstanceHolder {
    private static final MainVM_Factory INSTANCE = new MainVM_Factory();
  }
}
