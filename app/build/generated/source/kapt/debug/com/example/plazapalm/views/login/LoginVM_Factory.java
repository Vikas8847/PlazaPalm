// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.login;

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
public final class LoginVM_Factory implements Factory<LoginVM> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<DataStoreUtil> dataStoreProvider;

  private final Provider<CacheUtil> cacheUtilProvider;

  private final Provider<PreferenceFile> preferencesProvider;

  public LoginVM_Factory(Provider<Repository> repositoryProvider,
      Provider<DataStoreUtil> dataStoreProvider, Provider<CacheUtil> cacheUtilProvider,
      Provider<PreferenceFile> preferencesProvider) {
    this.repositoryProvider = repositoryProvider;
    this.dataStoreProvider = dataStoreProvider;
    this.cacheUtilProvider = cacheUtilProvider;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public LoginVM get() {
    return newInstance(repositoryProvider.get(), dataStoreProvider.get(), cacheUtilProvider.get(), preferencesProvider.get());
  }

  public static LoginVM_Factory create(Provider<Repository> repositoryProvider,
      Provider<DataStoreUtil> dataStoreProvider, Provider<CacheUtil> cacheUtilProvider,
      Provider<PreferenceFile> preferencesProvider) {
    return new LoginVM_Factory(repositoryProvider, dataStoreProvider, cacheUtilProvider, preferencesProvider);
  }

  public static LoginVM newInstance(Repository repository, DataStoreUtil dataStore,
      CacheUtil cacheUtil, PreferenceFile preferences) {
    return new LoginVM(repository, dataStore, cacheUtil, preferences);
  }
}