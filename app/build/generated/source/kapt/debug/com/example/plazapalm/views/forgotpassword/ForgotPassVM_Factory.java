// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.forgotpassword;

import com.example.plazapalm.networkcalls.CacheUtil;
import com.example.plazapalm.networkcalls.Repository;
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
public final class ForgotPassVM_Factory implements Factory<ForgotPassVM> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<CacheUtil> cacheUtilProvider;

  public ForgotPassVM_Factory(Provider<Repository> repositoryProvider,
      Provider<CacheUtil> cacheUtilProvider) {
    this.repositoryProvider = repositoryProvider;
    this.cacheUtilProvider = cacheUtilProvider;
  }

  @Override
  public ForgotPassVM get() {
    return newInstance(repositoryProvider.get(), cacheUtilProvider.get());
  }

  public static ForgotPassVM_Factory create(Provider<Repository> repositoryProvider,
      Provider<CacheUtil> cacheUtilProvider) {
    return new ForgotPassVM_Factory(repositoryProvider, cacheUtilProvider);
  }

  public static ForgotPassVM newInstance(Repository repository, CacheUtil cacheUtil) {
    return new ForgotPassVM(repository, cacheUtil);
  }
}
