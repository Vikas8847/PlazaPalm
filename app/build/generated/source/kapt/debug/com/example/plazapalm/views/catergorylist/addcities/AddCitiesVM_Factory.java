// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.catergorylist.addcities;

import com.example.plazapalm.pref.PreferenceFile;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddCitiesVM_Factory implements Factory<AddCitiesVM> {
  private final Provider<PreferenceFile> prefProvider;

  public AddCitiesVM_Factory(Provider<PreferenceFile> prefProvider) {
    this.prefProvider = prefProvider;
  }

  @Override
  public AddCitiesVM get() {
    return newInstance(prefProvider.get());
  }

  public static AddCitiesVM_Factory create(Provider<PreferenceFile> prefProvider) {
    return new AddCitiesVM_Factory(prefProvider);
  }

  public static AddCitiesVM newInstance(PreferenceFile pref) {
    return new AddCitiesVM(pref);
  }
}
