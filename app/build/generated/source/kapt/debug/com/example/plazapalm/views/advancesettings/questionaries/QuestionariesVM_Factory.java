// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.views.advancesettings.questionaries;

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
public final class QuestionariesVM_Factory implements Factory<QuestionariesVM> {
  private final Provider<DataStoreUtil> dataStoreUtilProvider;

  private final Provider<PreferenceFile> prefProvider;

  private final Provider<Repository> repositoryProvider;

  public QuestionariesVM_Factory(Provider<DataStoreUtil> dataStoreUtilProvider,
      Provider<PreferenceFile> prefProvider, Provider<Repository> repositoryProvider) {
    this.dataStoreUtilProvider = dataStoreUtilProvider;
    this.prefProvider = prefProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public QuestionariesVM get() {
    return newInstance(dataStoreUtilProvider.get(), prefProvider.get(), repositoryProvider.get());
  }

  public static QuestionariesVM_Factory create(Provider<DataStoreUtil> dataStoreUtilProvider,
      Provider<PreferenceFile> prefProvider, Provider<Repository> repositoryProvider) {
    return new QuestionariesVM_Factory(dataStoreUtilProvider, prefProvider, repositoryProvider);
  }

  public static QuestionariesVM newInstance(DataStoreUtil dataStoreUtil, PreferenceFile pref,
      Repository repository) {
    return new QuestionariesVM(dataStoreUtil, pref, repository);
  }
}