// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.advancesettings.editmap;

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
public final class AdvanceSettingMapVM_Factory implements Factory<AdvanceSettingMapVM> {
  @Override
  public AdvanceSettingMapVM get() {
    return newInstance();
  }

  public static AdvanceSettingMapVM_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AdvanceSettingMapVM newInstance() {
    return new AdvanceSettingMapVM();
  }

  private static final class InstanceHolder {
    private static final AdvanceSettingMapVM_Factory INSTANCE = new AdvanceSettingMapVM_Factory();
  }
}
