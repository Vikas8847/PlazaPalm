// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.advancesettings.editfontpage;

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
public final class EditFrontPageVM_Factory implements Factory<EditFrontPageVM> {
  @Override
  public EditFrontPageVM get() {
    return newInstance();
  }

  public static EditFrontPageVM_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EditFrontPageVM newInstance() {
    return new EditFrontPageVM();
  }

  private static final class InstanceHolder {
    private static final EditFrontPageVM_Factory INSTANCE = new EditFrontPageVM_Factory();
  }
}
