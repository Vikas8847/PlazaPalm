// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.splash;

import com.example.plazapalm.datastore.DataStoreUtil;
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
public final class SplashFragment_MembersInjector implements MembersInjector<SplashFragment> {
  private final Provider<DataStoreUtil> dataStoreUtilProvider;

  public SplashFragment_MembersInjector(Provider<DataStoreUtil> dataStoreUtilProvider) {
    this.dataStoreUtilProvider = dataStoreUtilProvider;
  }

  public static MembersInjector<SplashFragment> create(
      Provider<DataStoreUtil> dataStoreUtilProvider) {
    return new SplashFragment_MembersInjector(dataStoreUtilProvider);
  }

  @Override
  public void injectMembers(SplashFragment instance) {
    injectDataStoreUtil(instance, dataStoreUtilProvider.get());
  }

  @InjectedFieldSignature("com.example.plazapalm.views.splash.SplashFragment.dataStoreUtil")
  public static void injectDataStoreUtil(SplashFragment instance, DataStoreUtil dataStoreUtil) {
    instance.dataStoreUtil = dataStoreUtil;
  }
}
