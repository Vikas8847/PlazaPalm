// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.myprofile.calendar;

import com.example.plazapalm.datastore.DataStoreUtil;
import com.example.plazapalm.networkcalls.Repository;
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
public final class CalendarVM_Factory implements Factory<CalendarVM> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<PreferenceFile> prefProvider;

  private final Provider<DataStoreUtil> dataStoreProvider;

  public CalendarVM_Factory(Provider<Repository> repositoryProvider,
      Provider<PreferenceFile> prefProvider, Provider<DataStoreUtil> dataStoreProvider) {
    this.repositoryProvider = repositoryProvider;
    this.prefProvider = prefProvider;
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public CalendarVM get() {
    return newInstance(repositoryProvider.get(), prefProvider.get(), dataStoreProvider.get());
  }

  public static CalendarVM_Factory create(Provider<Repository> repositoryProvider,
      Provider<PreferenceFile> prefProvider, Provider<DataStoreUtil> dataStoreProvider) {
    return new CalendarVM_Factory(repositoryProvider, prefProvider, dataStoreProvider);
  }

  public static CalendarVM newInstance(Repository repository, PreferenceFile pref,
      DataStoreUtil dataStore) {
    return new CalendarVM(repository, pref, dataStore);
  }
}
