// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.report;

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
public final class ReportVM_Factory implements Factory<ReportVM> {
  private final Provider<DataStoreUtil> dataStoreUtilProvider;

  private final Provider<CacheUtil> cacheUtilProvider;

  private final Provider<Repository> repositoryProvider;

  private final Provider<PreferenceFile> prefProvider;

  public ReportVM_Factory(Provider<DataStoreUtil> dataStoreUtilProvider,
      Provider<CacheUtil> cacheUtilProvider, Provider<Repository> repositoryProvider,
      Provider<PreferenceFile> prefProvider) {
    this.dataStoreUtilProvider = dataStoreUtilProvider;
    this.cacheUtilProvider = cacheUtilProvider;
    this.repositoryProvider = repositoryProvider;
    this.prefProvider = prefProvider;
  }

  @Override
  public ReportVM get() {
    return newInstance(dataStoreUtilProvider.get(), cacheUtilProvider.get(), repositoryProvider.get(), prefProvider.get());
  }

  public static ReportVM_Factory create(Provider<DataStoreUtil> dataStoreUtilProvider,
      Provider<CacheUtil> cacheUtilProvider, Provider<Repository> repositoryProvider,
      Provider<PreferenceFile> prefProvider) {
    return new ReportVM_Factory(dataStoreUtilProvider, cacheUtilProvider, repositoryProvider, prefProvider);
  }

  public static ReportVM newInstance(DataStoreUtil dataStoreUtil, CacheUtil cacheUtil,
      Repository repository, PreferenceFile pref) {
    return new ReportVM(dataStoreUtil, cacheUtil, repository, pref);
  }
}
