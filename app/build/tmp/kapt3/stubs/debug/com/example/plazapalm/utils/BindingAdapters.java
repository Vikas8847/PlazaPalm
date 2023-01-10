package com.example.plazapalm.utils;

import java.lang.System;

/**
 * Binding Adapters
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bH\u0007J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u001a\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u001a\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\'2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u001a\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u000100H\u0007J\u001c\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u00102\u001a\u0006\u0012\u0002\b\u000303H\u0007J.\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u0002062\b\u00102\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0007J \u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u0002062\u0006\u00102\u001a\u0002072\u0006\u0010>\u001a\u00020;H\u0007\u00a8\u0006?"}, d2 = {"Lcom/example/plazapalm/utils/BindingAdapters;", "", "()V", "addScrollListener", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "listener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "addTextWatcher", "view", "Landroid/widget/EditText;", "Landroid/text/TextWatcher;", "bottomNavigationListener", "bottomNavigationView", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "onCheckChange", "compoundButton", "Landroid/widget/CompoundButton;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "radioGroupListener", "Landroid/widget/RadioGroup;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "setBackground", "Landroid/view/View;", "drawable", "", "setCircleImage", "circleImage", "Lde/hdodenhof/circleimageview/CircleImageView;", "imageUrl", "", "setColorOfText", "textView", "Landroid/widget/TextView;", "color", "setDrawable", "imageView", "Landroid/widget/ImageView;", "setHeartImage", "heartImage", "Landroidx/appcompat/widget/AppCompatImageView;", "setImage", "shapeableImageView", "setProfilePicture", "circleImageView", "imgUrl", "Lcom/example/plazapalm/models/GetProfileData;", "setRecyclerAdapter", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setViewPager", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "Landroidx/viewpager/widget/PagerAdapter;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "indicator", "Lme/relex/circleindicator/CircleIndicator;", "setViewPagerAdapter", "vp", "circleDotIndicator", "app_debug"})
public final class BindingAdapters {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.plazapalm.utils.BindingAdapters INSTANCE = null;
    
    private BindingAdapters() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setRecyclerAdapter"}, requireAll = false)
    public static final void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setProfilePicture"}, requireAll = false)
    public static final void setProfilePicture(@org.jetbrains.annotations.NotNull()
    de.hdodenhof.circleimageview.CircleImageView circleImageView, @org.jetbrains.annotations.Nullable()
    com.example.plazapalm.models.GetProfileData imgUrl) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setViewPagerAdapter", "setDots"}, requireAll = false)
    public static final void setViewPagerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager vp, @org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.PagerAdapter adapter, @org.jetbrains.annotations.NotNull()
    me.relex.circleindicator.CircleIndicator circleDotIndicator) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"addScrollListener"}, requireAll = false)
    public static final void addScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.OnScrollListener listener) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bottomNavigationListener"}, requireAll = false)
    public static final void bottomNavigationListener(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener listener) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setColorOfText"}, requireAll = false)
    public static final void setColorOfText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, int color) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"onCheckChange"}, requireAll = false)
    public static final void onCheckChange(@org.jetbrains.annotations.NotNull()
    android.widget.CompoundButton compoundButton, @org.jetbrains.annotations.NotNull()
    android.widget.CompoundButton.OnCheckedChangeListener listener) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setCircleImage"}, requireAll = false)
    public static final void setCircleImage(@org.jetbrains.annotations.NotNull()
    de.hdodenhof.circleimageview.CircleImageView circleImage, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setDrawable"}, requireAll = false)
    public static final void setDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, int drawable) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setBackground"}, requireAll = false)
    public static final void setBackground(@org.jetbrains.annotations.NotNull()
    android.view.View view, int drawable) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"radioGroupListener"}, requireAll = false)
    public static final void radioGroupListener(@org.jetbrains.annotations.NotNull()
    android.widget.RadioGroup view, @org.jetbrains.annotations.NotNull()
    android.widget.RadioGroup.OnCheckedChangeListener listener) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"addTextWatcher"}, requireAll = false)
    public static final void addTextWatcher(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.NotNull()
    android.text.TextWatcher listener) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setImage"}, requireAll = false)
    public static final void setImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView shapeableImageView, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setHeartImage"}, requireAll = false)
    public static final void setHeartImage(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView heartImage, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"setViewPager", "addTabLayout", "setIndicator"}, requireAll = false)
    public static final void setViewPager(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager viewPager, @org.jetbrains.annotations.Nullable()
    androidx.viewpager.widget.PagerAdapter adapter, @org.jetbrains.annotations.Nullable()
    com.google.android.material.tabs.TabLayout tabLayout, @org.jetbrains.annotations.Nullable()
    me.relex.circleindicator.CircleIndicator indicator) {
    }
}