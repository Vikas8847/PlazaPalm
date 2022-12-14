// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.selectcategory;

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
public final class SelectCategoryViewModel_Factory implements Factory<SelectCategoryViewModel> {
  private final Provider<DataStoreUtil> dataStoreUtilProvider;

  private final Provider<CacheUtil> cacheUtilProvider;

  private final Provider<PreferenceFile> prefProvider;

  private final Provider<Repository> repositoryProvider;

  public SelectCategoryViewModel_Factory(Provider<DataStoreUtil> dataStoreUtilProvider,
      Provider<CacheUtil> cacheUtilProvider, Provider<PreferenceFile> prefProvider,
      Provider<Repository> repositoryProvider) {
    this.dataStoreUtilProvider = dataStoreUtilProvider;
    this.cacheUtilProvider = cacheUtilProvider;
    this.prefProvider = prefProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SelectCategoryViewModel get() {
    return newInstance(dataStoreUtilProvider.get(), cacheUtilProvider.get(), prefProvider.get(), repositoryProvider.get());
  }

  public static SelectCategoryViewModel_Factory create(
      Provider<DataStoreUtil> dataStoreUtilProvider, Provider<CacheUtil> cacheUtilProvider,
      Provider<PreferenceFile> prefProvider, Provider<Repository> repositoryProvider) {
    return new SelectCategoryViewModel_Factory(dataStoreUtilProvider, cacheUtilProvider, prefProvider, repositoryProvider);
  }

  public static SelectCategoryViewModel newInstance(DataStoreUtil dataStoreUtil,
      CacheUtil cacheUtil, PreferenceFile pref, Repository repository) {
    return new SelectCategoryViewModel(dataStoreUtil, cacheUtil, pref, repository);
  }
}
