// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.addphotos;

import com.example.plazapalm.datastore.DataStoreUtil;
import com.example.plazapalm.networkcalls.Repository;
import com.example.plazapalm.pref.PreferenceFile;
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
public final class AddPhotosFragment_MembersInjector implements MembersInjector<AddPhotosFragment> {
  private final Provider<DataStoreUtil> dataStoreUtilProvider;

  private final Provider<PreferenceFile> prefProvider;

  private final Provider<Repository> repositoryProvider;

  public AddPhotosFragment_MembersInjector(Provider<DataStoreUtil> dataStoreUtilProvider,
      Provider<PreferenceFile> prefProvider, Provider<Repository> repositoryProvider) {
    this.dataStoreUtilProvider = dataStoreUtilProvider;
    this.prefProvider = prefProvider;
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<AddPhotosFragment> create(
      Provider<DataStoreUtil> dataStoreUtilProvider, Provider<PreferenceFile> prefProvider,
      Provider<Repository> repositoryProvider) {
    return new AddPhotosFragment_MembersInjector(dataStoreUtilProvider, prefProvider, repositoryProvider);
  }

  @Override
  public void injectMembers(AddPhotosFragment instance) {
    injectDataStoreUtil(instance, dataStoreUtilProvider.get());
    injectPref(instance, prefProvider.get());
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("com.example.plazapalm.views.addphotos.AddPhotosFragment.dataStoreUtil")
  public static void injectDataStoreUtil(AddPhotosFragment instance, DataStoreUtil dataStoreUtil) {
    instance.dataStoreUtil = dataStoreUtil;
  }

  @InjectedFieldSignature("com.example.plazapalm.views.addphotos.AddPhotosFragment.pref")
  public static void injectPref(AddPhotosFragment instance, PreferenceFile pref) {
    instance.pref = pref;
  }

  @InjectedFieldSignature("com.example.plazapalm.views.addphotos.AddPhotosFragment.repository")
  public static void injectRepository(AddPhotosFragment instance, Repository repository) {
    instance.repository = repository;
  }
}
