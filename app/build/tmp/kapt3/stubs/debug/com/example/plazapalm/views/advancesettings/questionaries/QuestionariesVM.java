package com.example.plazapalm.views.advancesettings.questionaries;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/questionaries/QuestionariesVM;", "Landroidx/lifecycle/ViewModel;", "()V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "questionDataList", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/QuestionsModel;", "getQuestionDataList", "()Ljava/util/ArrayList;", "setQuestionDataList", "(Ljava/util/ArrayList;)V", "questionsAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "getQuestionsAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "questionsAdapter$delegate", "Lkotlin/Lazy;", "onClicks", "", "view", "Landroid/view/View;", "app_debug"})
public final class QuestionariesVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.QuestionsModel> questionDataList;
    private int position = -1;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy questionsAdapter$delegate = null;
    
    @javax.inject.Inject()
    public QuestionariesVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.QuestionsModel> getQuestionDataList() {
        return null;
    }
    
    public final void setQuestionDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.QuestionsModel> p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.QuestionsModel> getQuestionsAdapter() {
        return null;
    }
}