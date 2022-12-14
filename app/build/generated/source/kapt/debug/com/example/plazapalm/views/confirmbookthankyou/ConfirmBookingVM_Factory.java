// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.confirmbookthankyou;

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
public final class ConfirmBookingVM_Factory implements Factory<ConfirmBookingVM> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<PreferenceFile> preferenceFileProvider;

  private final Provider<DataStoreUtil> dataStoreUtilProvider;

  public ConfirmBookingVM_Factory(Provider<Repository> repositoryProvider,
      Provider<PreferenceFile> preferenceFileProvider,
      Provider<DataStoreUtil> dataStoreUtilProvider) {
    this.repositoryProvider = repositoryProvider;
    this.preferenceFileProvider = preferenceFileProvider;
    this.dataStoreUtilProvider = dataStoreUtilProvider;
  }

  @Override
  public ConfirmBookingVM get() {
    return newInstance(repositoryProvider.get(), preferenceFileProvider.get(), dataStoreUtilProvider.get());
  }

  public static ConfirmBookingVM_Factory create(Provider<Repository> repositoryProvider,
      Provider<PreferenceFile> preferenceFileProvider,
      Provider<DataStoreUtil> dataStoreUtilProvider) {
    return new ConfirmBookingVM_Factory(repositoryProvider, preferenceFileProvider, dataStoreUtilProvider);
  }

  public static ConfirmBookingVM newInstance(Repository repository, PreferenceFile preferenceFile,
      DataStoreUtil dataStoreUtil) {
    return new ConfirmBookingVM(repository, preferenceFile, dataStoreUtil);
  }
}
