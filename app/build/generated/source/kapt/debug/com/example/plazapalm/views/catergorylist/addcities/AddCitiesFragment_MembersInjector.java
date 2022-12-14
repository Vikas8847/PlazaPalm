// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.catergorylist.addcities;

import com.example.plazapalm.pref.PreferenceFile;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddCitiesFragment_MembersInjector implements MembersInjector<AddCitiesFragment> {
  private final Provider<PreferenceFile> prefProvider;

  public AddCitiesFragment_MembersInjector(Provider<PreferenceFile> prefProvider) {
    this.prefProvider = prefProvider;
  }

  public static MembersInjector<AddCitiesFragment> create(Provider<PreferenceFile> prefProvider) {
    return new AddCitiesFragment_MembersInjector(prefProvider);
  }

  @Override
  public void injectMembers(AddCitiesFragment instance) {
    injectPref(instance, prefProvider.get());
  }

  @InjectedFieldSignature("com.example.plazapalm.views.catergorylist.addcities.AddCitiesFragment.pref")
  public static void injectPref(AddCitiesFragment instance, PreferenceFile pref) {
    instance.pref = pref;
  }
}
