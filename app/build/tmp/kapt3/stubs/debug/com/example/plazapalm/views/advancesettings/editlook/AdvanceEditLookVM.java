package com.example.plazapalm.views.advancesettings.editlook;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJA\u0010\u009c\u0001\u001a\u00030\u009d\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u00132\u0007\u0010\u009f\u0001\u001a\u00020*2\t\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u00132\u0007\u0010\u00a1\u0001\u001a\u00020\u00132\t\u0010\u00a2\u0001\u001a\u0004\u0018\u00010*H\u0017\u00a2\u0006\u0003\u0010\u00a3\u0001J\b\u0010\u00a4\u0001\u001a\u00030\u009d\u0001J\u0014\u0010\u00a5\u0001\u001a\u00030\u009d\u00012\b\u0010\u00a6\u0001\u001a\u00030\u00a7\u0001H\u0007J\n\u0010\u00a8\u0001\u001a\u00030\u00a9\u0001H\u0002J%\u0010\u00aa\u0001\u001a\u00030\u009d\u00012\u0007\u0010\u00ab\u0001\u001a\u00020?2\u0007\u0010\u00ac\u0001\u001a\u0002062\u0007\u0010\u00a2\u0001\u001a\u00020*H\u0003J\n\u0010\u00ad\u0001\u001a\u00030\u009d\u0001H\u0007J\u0013\u0010\u00ae\u0001\u001a\u00030\u009d\u00012\u0007\u0010\u00af\u0001\u001a\u00020\u0013H\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R(\u0010!\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R(\u0010$\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00102\"\u0004\b=\u00104R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010J\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0016\"\u0004\bL\u0010\u0018R \u0010M\u001a\b\u0012\u0004\u0012\u00020\f0NX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR(\u0010S\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0016\"\u0004\bU\u0010\u0018R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010 R\u001a\u0010X\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010,\"\u0004\bZ\u0010.R\u001a\u0010[\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u00102\"\u0004\b]\u00104R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010^\u001a\u0004\u0018\u00010_X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010d\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0016\"\u0004\bf\u0010\u0018R\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010 R\u001a\u0010i\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010,\"\u0004\bk\u0010.R(\u0010l\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0016\"\u0004\bn\u0010\u0018R\u001a\u0010o\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u00102\"\u0004\bq\u00104R\u001c\u0010r\u001a\u0004\u0018\u00010EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010G\"\u0004\bt\u0010IR\u001a\u0010u\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u00102\"\u0004\bw\u00104R\u001c\u0010x\u001a\u0004\u0018\u00010yX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001d\u0010~\u001a\u0004\u0018\u00010EX\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010G\"\u0005\b\u0080\u0001\u0010IR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0087\u0001\u001a\u00020*X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010,\"\u0005\b\u0089\u0001\u0010.R\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010EX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010G\"\u0005\b\u008c\u0001\u0010IR\"\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\"\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008e\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0090\u0001\"\u0006\b\u0095\u0001\u0010\u0092\u0001R\u001f\u0010\u0096\u0001\u001a\u0004\u0018\u00010EX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010G\"\u0005\b\u0098\u0001\u0010IR+\u0010\u0099\u0001\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0016\"\u0005\b\u009b\u0001\u0010\u0018\u00a8\u0006\u00b0\u0001"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/editlook/AdvanceEditLookVM;", "Landroidx/lifecycle/ViewModel;", "Lcom/example/plazapalm/interfaces/clickItem;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "preferenceFile", "Lcom/example/plazapalm/pref/PreferenceFile;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "(Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/pref/PreferenceFile;Lcom/example/plazapalm/networkcalls/Repository;)V", "ChooseColorAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/ChooseColor;", "getChooseColorAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "ChooseColorAdapter$delegate", "Lkotlin/Lazy;", "SelectedDialog", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getSelectedDialog", "()Landroidx/databinding/ObservableField;", "setSelectedDialog", "(Landroidx/databinding/ObservableField;)V", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "backgroundColorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getBackgroundColorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "backgroundType", "getBackgroundType", "setBackgroundType", "borderColor", "getBorderColor", "setBorderColor", "borderColorLD", "getBorderColorLD", "borderColorLiveData", "", "getBorderColorLiveData", "()I", "setBorderColorLiveData", "(I)V", "borderOpacity", "Landroidx/databinding/ObservableFloat;", "getBorderOpacity", "()Landroidx/databinding/ObservableFloat;", "setBorderOpacity", "(Landroidx/databinding/ObservableFloat;)V", "borderSlideValue", "", "getBorderSlideValue", "()F", "setBorderSlideValue", "(F)V", "borderWidth", "getBorderWidth", "setBorderWidth", "cardLayoutColrs", "Landroidx/cardview/widget/CardView;", "getCardLayoutColrs", "()Landroidx/cardview/widget/CardView;", "setCardLayoutColrs", "(Landroidx/cardview/widget/CardView;)V", "changeColor", "Landroid/widget/TextView;", "getChangeColor", "()Landroid/widget/TextView;", "setChangeColor", "(Landroid/widget/TextView;)V", "checkColor", "getCheckColor", "setCheckColor", "colorList", "Ljava/util/ArrayList;", "getColorList", "()Ljava/util/ArrayList;", "setColorList", "(Ljava/util/ArrayList;)V", "columnColor", "getColumnColor", "setColumnColor", "columnColorLD", "getColumnColorLD", "columnColorLiveData", "getColumnColorLiveData", "setColumnColorLiveData", "columnOpacity", "getColumnOpacity", "setColumnOpacity", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "fontColor", "getFontColor", "setFontColor", "fontColorLD", "getFontColorLD", "fontColorLiveData", "getFontColorLiveData", "setFontColorLiveData", "fontName", "getFontName", "setFontName", "fontOpacity", "getFontOpacity", "setFontOpacity", "fontSample", "getFontSample", "setFontSample", "fontSize", "getFontSize", "setFontSize", "layoutColrs", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutColrs", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setLayoutColrs", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "opacity_tv", "getOpacity_tv", "setOpacity_tv", "recyclerChoosecolor", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerChoosecolor", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerChoosecolor", "(Landroidx/recyclerview/widget/RecyclerView;)V", "selectedbackgrouncolor", "getSelectedbackgrouncolor", "setSelectedbackgrouncolor", "size_tv", "getSize_tv", "setSize_tv", "sliderOpacitty", "Lcom/google/android/material/slider/Slider;", "getSliderOpacitty", "()Lcom/google/android/material/slider/Slider;", "setSliderOpacitty", "(Lcom/google/android/material/slider/Slider;)V", "slider_size", "getSlider_size", "setSlider_size", "title", "getTitle", "setTitle", "titlename", "getTitlename", "setTitlename", "click", "", "categoryName", "position", "_id", "s", "color", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getEditLookColor", "onClicks", "view", "Landroid/view/View;", "postColorsAPI", "Lkotlinx/coroutines/Job;", "setBorderBackground", "layout", "value", "showBottomDialog", "showColorDialog", "From", "app_debug"})
public final class AdvanceEditLookVM extends androidx.lifecycle.ViewModel implements com.example.plazapalm.interfaces.clickItem {
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    private com.example.plazapalm.pref.PreferenceFile preferenceFile;
    private com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.ChooseColor> colorList;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.RecyclerView recyclerChoosecolor;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog dialog;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> titlename;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> SelectedDialog;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> checkColor;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> backgroundColor;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> backgroundType;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> columnColor;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableFloat columnOpacity;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableFloat borderOpacity;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableFloat borderWidth;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> borderColor;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> fontName;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> fontColor;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableFloat fontSize;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableFloat fontOpacity;
    private int selectedbackgrouncolor = -65536;
    private float borderSlideValue = 0.0F;
    private int columnColorLiveData = 0;
    private int borderColorLiveData = 0;
    private int fontColorLiveData = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> backgroundColorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> columnColorLD = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> fontColorLD = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> borderColorLD = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView title;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView fontSample;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.slider.Slider sliderOpacitty;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.slider.Slider slider_size;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView opacity_tv;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView size_tv;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView changeColor;
    @org.jetbrains.annotations.Nullable()
    private androidx.constraintlayout.widget.ConstraintLayout layoutColrs;
    @org.jetbrains.annotations.Nullable()
    private androidx.cardview.widget.CardView cardLayoutColrs;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy ChooseColorAdapter$delegate = null;
    
    @javax.inject.Inject()
    public AdvanceEditLookVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile preferenceFile, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.ChooseColor> getColorList() {
        return null;
    }
    
    public final void setColorList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.ChooseColor> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerChoosecolor() {
        return null;
    }
    
    public final void setRecyclerChoosecolor(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTitlename() {
        return null;
    }
    
    public final void setTitlename(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getSelectedDialog() {
        return null;
    }
    
    public final void setSelectedDialog(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getCheckColor() {
        return null;
    }
    
    public final void setCheckColor(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getBackgroundColor() {
        return null;
    }
    
    public final void setBackgroundColor(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getBackgroundType() {
        return null;
    }
    
    public final void setBackgroundType(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getColumnColor() {
        return null;
    }
    
    public final void setColumnColor(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableFloat getColumnOpacity() {
        return null;
    }
    
    public final void setColumnOpacity(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableFloat p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableFloat getBorderOpacity() {
        return null;
    }
    
    public final void setBorderOpacity(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableFloat p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableFloat getBorderWidth() {
        return null;
    }
    
    public final void setBorderWidth(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableFloat p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getBorderColor() {
        return null;
    }
    
    public final void setBorderColor(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getFontName() {
        return null;
    }
    
    public final void setFontName(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getFontColor() {
        return null;
    }
    
    public final void setFontColor(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableFloat getFontSize() {
        return null;
    }
    
    public final void setFontSize(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableFloat p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableFloat getFontOpacity() {
        return null;
    }
    
    public final void setFontOpacity(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableFloat p0) {
    }
    
    public final int getSelectedbackgrouncolor() {
        return 0;
    }
    
    public final void setSelectedbackgrouncolor(int p0) {
    }
    
    public final float getBorderSlideValue() {
        return 0.0F;
    }
    
    public final void setBorderSlideValue(float p0) {
    }
    
    public final int getColumnColorLiveData() {
        return 0;
    }
    
    public final void setColumnColorLiveData(int p0) {
    }
    
    public final int getBorderColorLiveData() {
        return 0;
    }
    
    public final void setBorderColorLiveData(int p0) {
    }
    
    public final int getFontColorLiveData() {
        return 0;
    }
    
    public final void setFontColorLiveData(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getBackgroundColorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getColumnColorLD() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getFontColorLD() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getBorderColorLD() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getFontSample() {
        return null;
    }
    
    public final void setFontSample(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.slider.Slider getSliderOpacitty() {
        return null;
    }
    
    public final void setSliderOpacitty(@org.jetbrains.annotations.Nullable()
    com.google.android.material.slider.Slider p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.slider.Slider getSlider_size() {
        return null;
    }
    
    public final void setSlider_size(@org.jetbrains.annotations.Nullable()
    com.google.android.material.slider.Slider p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getOpacity_tv() {
        return null;
    }
    
    public final void setOpacity_tv(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getSize_tv() {
        return null;
    }
    
    public final void setSize_tv(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getChangeColor() {
        return null;
    }
    
    public final void setChangeColor(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.constraintlayout.widget.ConstraintLayout getLayoutColrs() {
        return null;
    }
    
    public final void setLayoutColrs(@org.jetbrains.annotations.Nullable()
    androidx.constraintlayout.widget.ConstraintLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.cardview.widget.CardView getCardLayoutColrs() {
        return null;
    }
    
    public final void setCardLayoutColrs(@org.jetbrains.annotations.Nullable()
    androidx.cardview.widget.CardView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.ChooseColor> getChooseColorAdapter() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final kotlinx.coroutines.Job postColorsAPI() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged", "ResourceAsColor", "CutPasteId"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void showColorDialog(java.lang.String From) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void setBorderBackground(androidx.cardview.widget.CardView layout, float value, int color) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void click(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, int position, @org.jetbrains.annotations.Nullable()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String s, @org.jetbrains.annotations.Nullable()
    java.lang.Integer color) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void showBottomDialog() {
    }
    
    public final void getEditLookColor() {
    }
}