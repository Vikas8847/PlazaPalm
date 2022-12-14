// Generated by Dagger (https://dagger.dev).
package com.example.plazapalm.pref;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PrefModule_GetEditorFactory implements Factory<SharedPreferences.Editor> {
  private final PrefModule module;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public PrefModule_GetEditorFactory(PrefModule module,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.module = module;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SharedPreferences.Editor get() {
    return getEditor(module, sharedPreferencesProvider.get());
  }

  public static PrefModule_GetEditorFactory create(PrefModule module,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new PrefModule_GetEditorFactory(module, sharedPreferencesProvider);
  }

  public static SharedPreferences.Editor getEditor(PrefModule instance,
      SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNullFromProvides(instance.getEditor(sharedPreferences));
  }
}
