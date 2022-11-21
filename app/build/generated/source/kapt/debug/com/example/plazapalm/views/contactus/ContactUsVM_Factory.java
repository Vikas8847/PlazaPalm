// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.contactus;

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
public final class ContactUsVM_Factory implements Factory<ContactUsVM> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<CacheUtil> cacheUtilProvider;

  private final Provider<PreferenceFile> prefProvider;

  public ContactUsVM_Factory(Provider<Repository> repositoryProvider,
      Provider<CacheUtil> cacheUtilProvider, Provider<PreferenceFile> prefProvider) {
    this.repositoryProvider = repositoryProvider;
    this.cacheUtilProvider = cacheUtilProvider;
    this.prefProvider = prefProvider;
  }

  @Override
  public ContactUsVM get() {
    return newInstance(repositoryProvider.get(), cacheUtilProvider.get(), prefProvider.get());
  }

  public static ContactUsVM_Factory create(Provider<Repository> repositoryProvider,
      Provider<CacheUtil> cacheUtilProvider, Provider<PreferenceFile> prefProvider) {
    return new ContactUsVM_Factory(repositoryProvider, cacheUtilProvider, prefProvider);
  }

  public static ContactUsVM newInstance(Repository repository, CacheUtil cacheUtil,
      PreferenceFile pref) {
    return new ContactUsVM(repository, cacheUtil, pref);
  }
}
