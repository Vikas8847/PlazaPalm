// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.viewprofile;

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
public final class ViewProfileVM_Factory implements Factory<ViewProfileVM> {
  @Override
  public ViewProfileVM get() {
    return newInstance();
  }

  public static ViewProfileVM_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ViewProfileVM newInstance() {
    return new ViewProfileVM();
  }

  private static final class InstanceHolder {
    private static final ViewProfileVM_Factory INSTANCE = new ViewProfileVM_Factory();
  }
}
