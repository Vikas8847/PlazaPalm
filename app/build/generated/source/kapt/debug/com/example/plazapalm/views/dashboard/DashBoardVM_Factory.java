// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.dashboard;

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
public final class DashBoardVM_Factory implements Factory<DashBoardVM> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<DataStoreUtil> dataStoreUtilProvider;

  private final Provider<PreferenceFile> prefProvider;

  public DashBoardVM_Factory(Provider<Repository> repositoryProvider,
      Provider<DataStoreUtil> dataStoreUtilProvider, Provider<PreferenceFile> prefProvider) {
    this.repositoryProvider = repositoryProvider;
    this.dataStoreUtilProvider = dataStoreUtilProvider;
    this.prefProvider = prefProvider;
  }

  @Override
  public DashBoardVM get() {
    return newInstance(repositoryProvider.get(), dataStoreUtilProvider.get(), prefProvider.get());
  }

  public static DashBoardVM_Factory create(Provider<Repository> repositoryProvider,
      Provider<DataStoreUtil> dataStoreUtilProvider, Provider<PreferenceFile> prefProvider) {
    return new DashBoardVM_Factory(repositoryProvider, dataStoreUtilProvider, prefProvider);
  }

  public static DashBoardVM newInstance(Repository repository, DataStoreUtil dataStoreUtil,
      PreferenceFile pref) {
    return new DashBoardVM(repository, dataStoreUtil, pref);
  }
}