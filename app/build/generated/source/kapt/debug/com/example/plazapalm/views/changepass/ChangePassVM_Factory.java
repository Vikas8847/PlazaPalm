// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.changepass;

import com.example.plazapalm.datastore.DataStoreUtil;
import com.example.plazapalm.networkcalls.CacheUtil;
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
public final class ChangePassVM_Factory implements Factory<ChangePassVM> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<CacheUtil> cacheUtilProvider;

  private final Provider<PreferenceFile> preferencesProvider;

  private final Provider<DataStoreUtil> dataStoreProvider;

  public ChangePassVM_Factory(Provider<Repository> repositoryProvider,
      Provider<CacheUtil> cacheUtilProvider, Provider<PreferenceFile> preferencesProvider,
      Provider<DataStoreUtil> dataStoreProvider) {
    this.repositoryProvider = repositoryProvider;
    this.cacheUtilProvider = cacheUtilProvider;
    this.preferencesProvider = preferencesProvider;
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public ChangePassVM get() {
    return newInstance(repositoryProvider.get(), cacheUtilProvider.get(), preferencesProvider.get(), dataStoreProvider.get());
  }

  public static ChangePassVM_Factory create(Provider<Repository> repositoryProvider,
      Provider<CacheUtil> cacheUtilProvider, Provider<PreferenceFile> preferencesProvider,
      Provider<DataStoreUtil> dataStoreProvider) {
    return new ChangePassVM_Factory(repositoryProvider, cacheUtilProvider, preferencesProvider, dataStoreProvider);
  }

  public static ChangePassVM newInstance(Repository repository, CacheUtil cacheUtil,
      PreferenceFile preferences, DataStoreUtil dataStore) {
    return new ChangePassVM(repository, cacheUtil, preferences, dataStore);
  }
}
